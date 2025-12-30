package ast.python_flask.expressions_roles.operators;

import ast.python_flask.expressions_roles.BinaryExpressionNode;
import ast.python_flask.expressions_roles.ExpressionNode;

public class IsNotExpressionNode extends BinaryExpressionNode {
    public IsNotExpressionNode(int line, ExpressionNode l, ExpressionNode r) {
        super("IsNotExpression", line, l, "is not", r);
    }
}