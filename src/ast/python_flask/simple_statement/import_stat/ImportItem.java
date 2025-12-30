package ast.python_flask.simple_statement.import_stat;

import ast.BaseNode;

public class ImportItem extends BaseNode {
    public String idLeft,idRight;

    public ImportItem( int line, String idLeft,String idRight) {
        super("ImportItem", line);
        this.idLeft=idLeft;
        this.idRight=idRight;
    }
     public ImportItem( int line, String idLeft) {
        super("ImportItem", line);
        this.idLeft=idLeft;
        this.idRight=null;
    }
    
     public String toString(int indent) {
        StringBuilder sb = new StringBuilder("\n"+super.toString(indent+2));
        sb.append(idLeft);
        if(idRight !=null){
        sb.append(" as ").append(idRight);
        }
        return sb.toString() ;
     }
    
}

