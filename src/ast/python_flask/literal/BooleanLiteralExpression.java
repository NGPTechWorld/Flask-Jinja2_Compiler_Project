package ast.python_flask.literal;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class BooleanLiteralExpression extends ExpressionNode {

    public boolean value;

    public BooleanLiteralExpression(int line, boolean value) {
        super("BooleanLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return value ? "True" : "False";
    }
}