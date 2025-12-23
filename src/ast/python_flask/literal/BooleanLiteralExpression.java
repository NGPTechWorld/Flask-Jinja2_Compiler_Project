package ast.python_flask.literal;

public class BooleanLiteralExpression extends LiteralNode {

    public boolean value;

    public BooleanLiteralExpression(int line, boolean value) {
        super("BooleanLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + (value ? "True" : "False");
    }
}