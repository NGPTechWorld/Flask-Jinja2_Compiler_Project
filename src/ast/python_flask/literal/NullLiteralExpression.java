package ast.python_flask.literal;

public class NullLiteralExpression extends LiteralNode {

    public NullLiteralExpression(int line) {
        super("NullLiteral", line);
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent)+"null";
    }
}