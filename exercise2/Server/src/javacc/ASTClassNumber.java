package javacc;
/* Generated By:JJTree: Do not edit this line. ASTClassNumber.java */

public class ASTClassNumber extends SimpleNode {
	int tagNumber = -1;

	public void
	setTagNumber(int x)
	{
		tagNumber = x;
	}

	public int
	getTagNumber()
	{
		return tagNumber;
	}

  public ASTClassNumber(int id) {
    super(id);
  }

  public ASTClassNumber(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
