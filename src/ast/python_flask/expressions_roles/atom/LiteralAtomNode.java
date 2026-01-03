package ast.python_flask.expressions_roles.atom;

import ast.python_flask.expressions_roles.literal.LiteralNode;

public class LiteralAtomNode extends AtomNode {

    public LiteralNode literal;

    public LiteralAtomNode(int line, LiteralNode literal) {
        super("LiteralAtom", line);
        this.literal = literal;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + "\n"+literal.toString(indent+2);
    }
}