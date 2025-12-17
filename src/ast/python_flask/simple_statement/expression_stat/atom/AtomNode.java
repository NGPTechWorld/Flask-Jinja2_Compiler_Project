package ast.python_flask.simple_statement.expression_stat.atom;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public abstract class AtomNode extends ExpressionNode {

    public AtomNode(String name, int line) {
        super(name, line);
    }
}
