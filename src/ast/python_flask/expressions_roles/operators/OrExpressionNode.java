package ast.python_flask.expressions_roles.operators;

import ast.python_flask.expressions_roles.BinaryExpressionNode;
import ast.python_flask.expressions_roles.ExpressionNode;

public class OrExpressionNode extends BinaryExpressionNode {
    public OrExpressionNode(int line, ExpressionNode l, ExpressionNode r) {
        super("OrExpression", line, l, "or", r);
    }
}