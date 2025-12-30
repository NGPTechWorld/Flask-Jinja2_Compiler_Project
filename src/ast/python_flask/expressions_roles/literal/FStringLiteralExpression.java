package ast.python_flask.expressions_roles.literal;

public class FStringLiteralExpression extends LiteralNode {

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