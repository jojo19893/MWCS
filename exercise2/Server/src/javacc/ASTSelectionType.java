package javacc;
/* Generated By:JJTree: Do not edit this line. ASTSelectionType.java */

public class ASTSelectionType extends SimpleNode {
  public ASTSelectionType(int id) {
    super(id);
  }

  public ASTSelectionType(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
