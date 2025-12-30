package ast.python_flask.expressions_roles.literal;


public class StringLiteralExpression extends LiteralNode {

    public String value;

    public StringLiteralExpression(int line, String value) {
        super("StringLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent)+"\"" + value + "\"";
    }
}