package ast.python_flask.literal;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class StringLiteralExpression extends ExpressionNode {

    public String value;

    public StringLiteralExpression(int line, String value) {
        super("StringLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return "\"" + value + "\"";
    }
}