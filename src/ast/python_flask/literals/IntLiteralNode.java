package ast.python_flask.literals;

import ast.BaseNode;

public class IntLiteralNode extends BaseNode{
    public int value;
    
    public IntLiteralNode(int value, int line) {
        super("IntLiteral", line);
        this.value=value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
