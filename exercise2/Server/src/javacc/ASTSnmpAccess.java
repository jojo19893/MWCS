package javacc;
/* Generated By:JJTree: Do not edit this line. ASTSnmpAccess.java */

public class ASTSnmpAccess extends SimpleNode {
  public ASTSnmpAccess(int id) {
    super(id);
  }

  public ASTSnmpAccess(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
