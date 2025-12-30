package ast.python_flask.expressions_roles.literal;

import ast.python_flask.expressions_roles.ExpressionNode;

public abstract class LiteralNode extends ExpressionNode {

    public LiteralNode(String name, int line) {
        super(name, line);
    }
}
