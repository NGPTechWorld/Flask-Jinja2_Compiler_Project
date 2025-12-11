package ast.python_flask.atom;

import ast.BaseNode;
import ast.python_flask.LiteralNode;

public class LiteralAtomNode extends BaseNode {
    public LiteralNode literal;

    public LiteralAtomNode(LiteralNode literal, int line) {
        super("LiteralAtom", line);
        this.literal = literal;
    }

    @Override
    public String toString() {
        return literal == null ? "null" : literal.toString();
    }
}
