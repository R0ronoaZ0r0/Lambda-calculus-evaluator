/* Generated By:JJTree: Do not edit this line. ASTMyID.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTMyID extends SimpleNode {
	private String name;
  public ASTMyID(int id) {
    super(id);
  }

  public ASTMyID(Prog3 p, int id) {
    super(p, id);
  }
  

public void setName(String n) {
	name = n;
    }

public String toString() {
	return name;
    }
	
	public ASTMyID clone(int id){
      ASTMyID t = new ASTMyID(id);
      t.setName(name);
      return t;
    
    }


}
/* JavaCC - OriginalChecksum=5468918bad2ca4c9098a07e583b18693 (do not edit this line) */
