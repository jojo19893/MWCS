package javacc;
/* Generated By:JJTree: Do not edit this line. ASTSymbolsFromModule.java */

public class ASTSymbolsFromModule extends SimpleNode {
  public ASTSymbolsFromModule(int id) {
    super(id);
  }

  public ASTSymbolsFromModule(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
