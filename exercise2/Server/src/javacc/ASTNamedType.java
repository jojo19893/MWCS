package javacc;
/* Generated By:JJTree: Do not edit this line. ASTNamedType.java */

public class ASTNamedType extends SimpleNode {
  public ASTNamedType(int id) {
    super(id);
  }

  public ASTNamedType(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
