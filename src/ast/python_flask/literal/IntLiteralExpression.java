package ast.python_flask.literal;

public class IntLiteralExpression extends LiteralNode {

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
