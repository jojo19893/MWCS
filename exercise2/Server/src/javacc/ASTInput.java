package javacc;
/* Generated By:JJTree: Do not edit this line. ASTInput.java */

public class ASTInput extends SimpleNode {
  public ASTInput(int id) {
    super(id);
  }

  public ASTInput(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
