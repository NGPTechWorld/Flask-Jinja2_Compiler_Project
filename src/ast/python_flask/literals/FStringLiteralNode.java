package ast.python_flask.literals;

import ast.BaseNode;

public class FStringLiteralNode extends BaseNode{
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
