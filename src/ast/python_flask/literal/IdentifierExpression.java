package ast.python_flask.literal;

public class IdentifierExpression extends LiteralNode {

    public String name;

    public IdentifierExpression(int line, String name) {
        super("Identifier", line);
        this.name = name;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent)+ name;
    }
}
