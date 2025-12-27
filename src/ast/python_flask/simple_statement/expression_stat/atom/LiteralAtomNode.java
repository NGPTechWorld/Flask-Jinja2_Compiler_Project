package ast.python_flask.simple_statement.expression_stat.atom;

import ast.python_flask.literal.LiteralNode;

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