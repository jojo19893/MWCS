package javacc;
/* Generated By:JJTree: Do not edit this line. ASTBooleanType.java */

public class ASTBooleanType extends SimpleNode {
  public ASTBooleanType(int id) {
    super(id);
  }

  public ASTBooleanType(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
