package javacc;
/* Generated By:JJTree: Do not edit this line. ASTValue.java */

public class ASTValue extends SimpleNode {
  public ASTValue(int id) {
    super(id);
  }

  public ASTValue(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
