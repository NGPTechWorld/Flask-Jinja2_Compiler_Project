package ast.python_flask.literal;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class NullLiteralExpression extends ExpressionNode {

    public NullLiteralExpression(int line) {
        super("NullLiteral", line);
    }

    @Override
    public String toString(int indent) {
        return "null";
    }
}