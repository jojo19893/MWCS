package Specfication;

/**
* Specfication/quoterHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Specfication.idl
* Donnerstag, 22. Mai 2014 11:46 Uhr MESZ
*/

public final class QuoterHolder implements org.omg.CORBA.portable.Streamable
{
  public Specfication.Quoter value = null;

  public QuoterHolder ()
  {
  }

  public QuoterHolder (Specfication.Quoter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Specfication.QuoterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Specfication.QuoterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Specfication.QuoterHelper.type ();
  }

}
