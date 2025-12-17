package ast.python_flask.literal;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class FStringLiteralExpression extends ExpressionNode {

    public String rawText;

    public FStringLiteralExpression(int line, String rawText) {
        super("FStringLiteral", line);
        this.rawText = rawText;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent)+rawText;
    }
}