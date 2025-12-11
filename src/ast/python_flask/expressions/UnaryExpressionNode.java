package ast.python_flask.expressions;

import ast.python_flask.ExpressionNode;

public class UnaryExpressionNode extends ExpressionNode {

    public String operator;
    public ExpressionNode expression;

    public UnaryExpressionNode(String operator, ExpressionNode expression, int line) {
        super("UnaryExpression", line);
        this.operator = operator;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "(" + operator + " " + expression + ")";
    }
}
