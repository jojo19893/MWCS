package javacc;
/* Generated By:JJTree: Do not edit this line. ASTExportSymbolList.java */

public class ASTExportSymbolList extends SimpleNode {
  public ASTExportSymbolList(int id) {
    super(id);
  }

  public ASTExportSymbolList(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
