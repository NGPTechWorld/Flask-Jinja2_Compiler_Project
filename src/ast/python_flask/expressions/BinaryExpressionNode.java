package ast.python_flask.expressions;

import ast.python_flask.ExpressionNode;

public class BinaryExpressionNode extends ExpressionNode {

    public String operator;
    public ExpressionNode left;
    public ExpressionNode right;

    public BinaryExpressionNode(String operator, ExpressionNode left, ExpressionNode right, int line) {
        super("BinaryExpression", line);
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + " " + operator + " " + right + ")";
    }
}
