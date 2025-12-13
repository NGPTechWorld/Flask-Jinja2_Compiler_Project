package ast.python_flask.literals;

import ast.python_flask.LiteralNode;

public class FStringLiteralNode extends LiteralNode {
    public String value;
    
    public FStringLiteralNode(String value, int line) {
        super("FStringLiteral", line);
        this.value=value;
    }

    @Override
    public String toString() {
        return  value;
    }
}
