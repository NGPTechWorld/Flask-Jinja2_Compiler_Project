package ast.python_flask.literals;

import ast.BaseNode;

public class BooleanLiteralNode extends BaseNode{
    public Boolean value;
    
    public BooleanLiteralNode(Boolean value, int line) {
        super("IntLiteral", line);
        this.value=value;
    }

    @Override
    public String toString() {
         return value ? "True" : "False";
    }
}
