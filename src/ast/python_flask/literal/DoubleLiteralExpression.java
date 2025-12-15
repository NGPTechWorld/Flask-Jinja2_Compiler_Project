package ast.python_flask.literal;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class DoubleLiteralExpression extends ExpressionNode {

    public double value;

    public DoubleLiteralExpression(int line, double value) {
        super("DoubleLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return String.valueOf(value);
    }
}