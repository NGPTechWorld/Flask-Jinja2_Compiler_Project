package ast.python_flask.literals;

import ast.python_flask.LiteralNode;

public class DoubleLiteralNode extends LiteralNode {
    public double value;
    
    public DoubleLiteralNode(double value, int line) {
        super("DoubleLiteral", line);
        this.value=value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
