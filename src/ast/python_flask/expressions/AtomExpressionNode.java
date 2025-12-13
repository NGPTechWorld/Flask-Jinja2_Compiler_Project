package ast.python_flask.expressions;

import ast.BaseNode;
import ast.python_flask.ExpressionNode;

public class AtomExpressionNode extends ExpressionNode {

    public BaseNode atom;

    public AtomExpressionNode(BaseNode atom, int line) {
        super("AtomExpression", line);
        this.atom = atom;
    }

    @Override
    public String toString() {
        return atom.toString();
    }
}
