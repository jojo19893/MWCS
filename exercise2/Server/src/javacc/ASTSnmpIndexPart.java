package javacc;
/* Generated By:JJTree: Do not edit this line. ASTSnmpIndexPart.java */

public class ASTSnmpIndexPart extends SimpleNode {
  public ASTSnmpIndexPart(int id) {
    super(id);
  }

  public ASTSnmpIndexPart(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
