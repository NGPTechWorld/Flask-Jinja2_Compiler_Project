package ast.python_flask.expressions_roles.operators;

import ast.python_flask.expressions_roles.BinaryExpressionNode;
import ast.python_flask.expressions_roles.ExpressionNode;

public class ComparisonExpressionNode extends BinaryExpressionNode {

    public ComparisonExpressionNode (int line, ExpressionNode left, String op, ExpressionNode right) {
        super("ComparisonExpression", line, left, op, right);
    }

}
