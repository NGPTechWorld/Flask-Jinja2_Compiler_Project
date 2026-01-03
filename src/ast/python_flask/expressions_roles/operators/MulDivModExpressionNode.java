package ast.python_flask.expressions_roles.operators;

import ast.python_flask.expressions_roles.BinaryExpressionNode;
import ast.python_flask.expressions_roles.ExpressionNode;

public class MulDivModExpressionNode extends BinaryExpressionNode {

    public MulDivModExpressionNode(int line, ExpressionNode left, String op, ExpressionNode right) {
        super("MulDivModExpression", line, left, op, right);
    }

}
