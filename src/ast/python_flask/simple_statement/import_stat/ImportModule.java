package ast.python_flask.simple_statement.import_stat;

import ast.BaseNode;

public class ImportModule extends BaseNode{
    public String idLeft,idRight;

    public ImportModule( int line, String idLeft,String idRight) {
        super("ImportItem", line);
        this.idLeft=idLeft;
        this.idRight=idRight;
    }
     public ImportModule( int line, String idLeft) {
        super("ImportItem", line);
        this.idLeft=idLeft;
        this.idRight=null;
    }
    //  @Override
    //  public String toString() {
    //     return "(line "+line+") "+name+" "+idLeft+ idRight != null?"."+idRight:"";
    //  }
    
}
