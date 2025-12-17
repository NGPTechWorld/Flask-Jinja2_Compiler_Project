package ast.python_flask.simple_statement.expression_stat.atom;

public class LiteralAtomNode extends AtomNode {

    public String value;

    public LiteralAtomNode(int line, String value) {
        super("LiteralAtom", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + value;
    }
}