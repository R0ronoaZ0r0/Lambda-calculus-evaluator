/* Generated By:JJTree: Do not edit this line. ASTInteger.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTInteger extends SimpleNode {
	private String value;
  public ASTInteger(int id) {
    super(id);
  }

  public ASTInteger(Prog3 p, int id) {
    super(p, id);
  }
  
  

public void setValue(String n){
	value = n;
  }
  public String toString() {
	return value;
  }
  
  public ASTInteger clone(int id){
      ASTInteger t = new ASTInteger(id);
      t.setValue(value);
      return t;
    }

}
/* JavaCC - OriginalChecksum=2c0d91211781c200aea7e84a0ba39f73 (do not edit this line) */