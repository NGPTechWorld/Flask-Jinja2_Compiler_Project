package ast.python_flask.expressions_roles.literal;

public class DoubleLiteralExpression extends LiteralNode {

    public double value;

    public DoubleLiteralExpression(int line, double value) {
        super("DoubleLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent)+String.valueOf(value);
    }
}