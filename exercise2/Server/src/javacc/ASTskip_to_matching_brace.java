package javacc;
/* Generated By:JJTree: Do not edit this line. ASTskip_to_matching_brace.java */

public class ASTskip_to_matching_brace extends SimpleNode {
  public ASTskip_to_matching_brace(int id) {
    super(id);
  }

  public ASTskip_to_matching_brace(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
