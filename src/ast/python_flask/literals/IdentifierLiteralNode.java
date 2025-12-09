package ast.python_flask.literals;

import ast.BaseNode;

public class IdentifierLiteralNode extends BaseNode {
    public String name;

    public IdentifierLiteralNode(String name, int line) {
        super("Identifier", line);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}