package ast.python_flask.literals;

import ast.python_flask.LiteralNode;

public class IntLiteralNode extends LiteralNode {
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
