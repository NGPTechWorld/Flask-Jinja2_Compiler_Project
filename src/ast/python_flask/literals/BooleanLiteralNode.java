package ast.python_flask.literals;

import ast.python_flask.LiteralNode;

public class BooleanLiteralNode extends LiteralNode {
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
