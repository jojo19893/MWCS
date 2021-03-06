package callback.Server_Handler;


/**
* callback/Server_Handler/Server_RegisterPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from callback.idl
* Sonntag, 25. Mai 2014 13:25 Uhr MESZ
*/

public abstract class Server_RegisterPOA extends org.omg.PortableServer.Servant
 implements callback.Server_Handler.Server_RegisterOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("register_stock", new java.lang.Integer (0));
    _methods.put ("unregister_stock", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // callback/Server_Handler/Server_Register/register_stock
       {
         try {
           callback.Client_Handler.Serverpush client = callback.Client_Handler.ServerpushHelper.read (in);
           String stockname = in.read_string ();
           this.register_stock (client, stockname);
           out = $rh.createReply();
         } catch (callback.NoSuchStock $ex) {
           out = $rh.createExceptionReply ();
           callback.NoSuchStockHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // callback/Server_Handler/Server_Register/unregister_stock
       {
         try {
           callback.Client_Handler.Serverpush client = callback.Client_Handler.ServerpushHelper.read (in);
           String stockname = in.read_string ();
           this.unregister_stock (client, stockname);
           out = $rh.createReply();
         } catch (callback.NoSuchStock $ex) {
           out = $rh.createExceptionReply ();
           callback.NoSuchStockHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:callback/Server_Handler/Server_Register:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Server_Register _this() 
  {
    return Server_RegisterHelper.narrow(
    super._this_object());
  }

  public Server_Register _this(org.omg.CORBA.ORB orb) 
  {
    return Server_RegisterHelper.narrow(
    super._this_object(orb));
  }


} // class Server_RegisterPOA
