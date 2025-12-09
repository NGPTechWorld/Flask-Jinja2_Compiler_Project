package ast.python_flask.literals;

import ast.BaseNode;

public class DoubleLiteralNode extends BaseNode{
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
