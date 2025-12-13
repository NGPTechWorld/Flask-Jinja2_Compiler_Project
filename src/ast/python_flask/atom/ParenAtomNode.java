package ast.python_flask.atom;

import ast.BaseNode;

public class ParenAtomNode extends BaseNode {
    public BaseNode inner;

    public ParenAtomNode(BaseNode inner, int line) {
        super("ParenAtom", line);
        this.inner = inner;
    }

    @Override
    public String toString() {
        return "(" + (inner == null ? "" : inner.toString()) + ")";
    }
}
