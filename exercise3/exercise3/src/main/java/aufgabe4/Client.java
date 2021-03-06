package aufgabe4;

import java.util.Properties;

import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.*;

import asynCallback.AMI_ServerReplyHandler;
import asynCallback.ServerReply;
import asynCallback.ServerReplyHelper;
import asynCallback._ServerReplyStub;

public class Client {
	
	private static String stockname;

	public static void main(String[] args) {
		try {
			Properties props = System.getProperties();
			props.put("org.omg.CORBA.ORBInitialPort", args[0]);
			props.put("org.omg.CORBA.ORBInitialHost", args[1]);
			org.omg.CORBA.ORB orb = org.jacorb.orb.ORB.init(args, props);

			POA poa = POAHelper.narrow(orb
					.resolve_initial_references("RootPOA"));
			poa.the_POAManager().activate();
			org.omg.CORBA.Object objRef = orb
					.resolve_initial_references("NameService");

			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			String name = "Async Server";

			ServerReply server = ServerReplyHelper.narrow(ncRef
					.resolve_str(name));

			AMI_ServerReplyHandler hdl = new ServerReplyHandlerImpl()
					._this(orb);
			
			((_ServerReplyStub)server).sendc_updateStock(hdl, stockname);
			
			Thread.currentThread().sleep(10000);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
