package ast.python_flask.expressions_roles.operators;

import ast.python_flask.expressions_roles.BinaryExpressionNode;
import ast.python_flask.expressions_roles.ExpressionNode;

public class AddSubExpressionNode extends BinaryExpressionNode {

    public AddSubExpressionNode(int line, ExpressionNode left, String op, ExpressionNode right) {
        super("AddSubExpression", line, left, op, right);
    }

}
