package javacc;
/* Generated By:JJTree: Do not edit this line. ASTCharString.java */

public class ASTCharString extends SimpleNode {
  public ASTCharString(int id) {
    super(id);
  }

  public ASTCharString(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
