package javacc;
/* Generated By:JJTree: Do not edit this line. ASTMacroBody.java */

public class ASTMacroBody extends SimpleNode {
  public ASTMacroBody(int id) {
    super(id);
  }

  public ASTMacroBody(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
