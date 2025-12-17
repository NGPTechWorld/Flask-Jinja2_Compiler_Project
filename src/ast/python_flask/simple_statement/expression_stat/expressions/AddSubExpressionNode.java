package ast.python_flask.simple_statement.expression_stat.expressions;

import ast.python_flask.simple_statement.expression_stat.BinaryExpressionNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class AddSubExpressionNode extends BinaryExpressionNode {

    public AddSubExpressionNode(int line, ExpressionNode left, String op, ExpressionNode right) {
        super("AddSubExpression", line, left, op, right);
    }

}
