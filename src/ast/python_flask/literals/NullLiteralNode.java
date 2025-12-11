package ast.python_flask.literals;

import ast.python_flask.LiteralNode;

public class NullLiteralNode extends LiteralNode  {
    public NullLiteralNode(int line) {
        super("NullLiteral", line);
    }

    @Override
    public String toString() {
        return "None";
    }
}