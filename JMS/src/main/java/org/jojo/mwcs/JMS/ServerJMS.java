package org.jojo.mwcs.JMS;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.naming.*;
import javax.jms.*;

import lombok.AllArgsConstructor;
import lombok.Getter;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.TransportConnector;
import org.joda.time.DateTime;

public class ServerJMS {

	private static List<Stock> stocks;
	@Getter
	private final String SERVERNAME = "LOCAL SERVER";

	final static String[] names = { "addidas", "Deutsche Bank", "SAP" };
	@Getter
	private static final String[] isns = { "t354", "DAB45", "SAPGER" };
	@Getter
	private final static String ISNCON = "ISN";
	@Getter
	private final static String PRICECON = "PRICE";
	@Getter
	private final static String TIMECON = "TIME";
	@Getter
	private final static String NAMECON = "NAME";

	static Context ctx;
	private static BrokerService broker;

	public static void main(String[] args) throws URISyntaxException, Exception {

		// BrokerService broker = new BrokerService();
		// TransportConnector connector = new TransportConnector();
		// connector.setUri(new URI("tcp://localhost:61616"));
		// broker.addConnector(connector);
		// broker.start();
		//
		// BrokerService broker = new BrokerService();
		// broker.setPersistent(false);
		// broker.setUseShutdownHook(false);
		// // configure the broker
		// broker.addConnector("tcp://localhost:61616");
		// broker.addConnector("vm://localhost");
		// broker.start();

		ExecutorService exe = Executors.newCachedThreadPool();
		setUpStocks();
		for (Stock s : stocks) {
			Topic topic;

			Runnable r = new StockRunner(s);
			exe.execute(r);
		}
		SendSingle t=new SendSingle();
		t.setStocks(stocks);
		exe.execute(t);
	}

	private static void setUpStocks() {
		if (names.length != isns.length) {
			return;
		}
		stocks = new ArrayList<Stock>();
		int i = 0;
		Random r = new Random();
		for (String name : names) {
			Stock t = new Stock(name, isns[i], r.nextInt(10000), DateTime.now());
			i++;
			stocks.add(t);
		}
	}

	@AllArgsConstructor
	private static class StockRunner implements Runnable {
		private Stock stock;

		public void run() {
			while (true) {
				try {

					ActiveMQConnectionFactory mqfac = new ActiveMQConnectionFactory(
							"admin", "admin",
							ActiveMQConnectionFactory.DEFAULT_BROKER_URL);
					TopicConnection connect = mqfac.createTopicConnection(
							"admin", "admin");
					connect.start();

					TopicSession session = connect.createTopicSession(false,
							Session.AUTO_ACKNOWLEDGE);
					Topic topic = session.createTopic(stock.getIsn());
					stock = refreshStock(stock);

					TopicPublisher publisher = session.createPublisher(topic);

					MapMessage msg = session.createMapMessage();
					msg.setStringProperty(ISNCON, stock.getIsn());
					msg.setStringProperty(NAMECON, stock.getName());
					msg.setDoubleProperty(PRICECON, stock.getPrice());
					msg.setStringProperty(TIMECON, stock.getTime().toString());

					publisher.publish(topic, msg);
					addToQue(msg);
					session.close();
					connect.close();
					Long timeout = (long) (5000 + Math.rint(10000 * Math
							.random()));
					try {
						Thread.sleep(timeout.longValue());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
		}

		private Stock refreshStock(Stock s) {
			s.setPrice((-0.2 + Math.random() * 0.4) * s.getPrice());
			s.setTime(DateTime.now());
			return s;
		}

		public void addToQue(MapMessage p) throws JMSException {
			ActiveMQConnectionFactory mqfac = new ActiveMQConnectionFactory(
					"admin", "admin",
					ActiveMQConnectionFactory.DEFAULT_BROKER_URL);
			Connection con = mqfac.createQueueConnection("admin", "admin");
			Session tp = con.createSession(false, Session.AUTO_ACKNOWLEDGE);

			Destination destination = tp.createQueue(stock.getName());

			// Create a MessageProducer from the Session to the Topic or Queue
			MessageProducer producer = tp.createProducer(destination);
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			producer.send(p);
			tp.close();
			con.close();
		}
	}

}
