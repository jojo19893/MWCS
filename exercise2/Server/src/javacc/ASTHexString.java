package javacc;
/* Generated By:JJTree: Do not edit this line. ASTHexString.java */

public class ASTHexString extends SimpleNode {
  public ASTHexString(int id) {
    super(id);
  }

  public ASTHexString(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
