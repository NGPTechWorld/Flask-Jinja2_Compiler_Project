package ast.python_flask.literal;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class IntLiteralExpression extends ExpressionNode {

    public int value;

    public IntLiteralExpression(int line, int value) {
        super("IntLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent)+String.valueOf(value);
    }
}
