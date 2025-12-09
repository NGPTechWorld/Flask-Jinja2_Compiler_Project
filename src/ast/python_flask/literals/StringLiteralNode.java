package ast.python_flask.literals;

import ast.BaseNode;

public class StringLiteralNode extends BaseNode{
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
