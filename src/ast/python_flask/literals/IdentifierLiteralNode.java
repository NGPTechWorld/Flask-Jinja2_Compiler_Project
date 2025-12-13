package ast.python_flask.literals;

import ast.python_flask.LiteralNode;

public class IdentifierLiteralNode extends LiteralNode  {
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