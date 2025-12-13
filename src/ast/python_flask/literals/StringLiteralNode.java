package ast.python_flask.literals;

import ast.python_flask.LiteralNode;

public class StringLiteralNode extends LiteralNode {
    public String value;
    
    public StringLiteralNode(String value, int line) {
        super("StringLiteral", line);
        this.value=value;
    }

    @Override
    public String toString() {
        return  value;
    }
}
