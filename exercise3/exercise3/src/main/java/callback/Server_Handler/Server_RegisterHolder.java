package callback.Server_Handler;

/**
* callback/Server_Handler/Server_RegisterHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from callback.idl
* Sonntag, 25. Mai 2014 13:25 Uhr MESZ
*/

public final class Server_RegisterHolder implements org.omg.CORBA.portable.Streamable
{
  public callback.Server_Handler.Server_Register value = null;

  public Server_RegisterHolder ()
  {
  }

  public Server_RegisterHolder (callback.Server_Handler.Server_Register initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callback.Server_Handler.Server_RegisterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callback.Server_Handler.Server_RegisterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callback.Server_Handler.Server_RegisterHelper.type ();
  }

}
