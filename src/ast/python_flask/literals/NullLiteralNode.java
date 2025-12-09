package ast.python_flask.literals;

import ast.BaseNode;

public class NullLiteralNode extends BaseNode {
    public NullLiteralNode(int line) {
        super("NullLiteral", line);
    }

    @Override
    public String toString() {
        return "None";
    }
}