package ast.python_flask.expressions_roles.operators;

import ast.python_flask.expressions_roles.BinaryExpressionNode;
import ast.python_flask.expressions_roles.ExpressionNode;

public class IsExpressionNode extends BinaryExpressionNode {
    public IsExpressionNode(int line, ExpressionNode l, ExpressionNode r) {
        super("IsExpression", line, l, "is", r);
    }
}