package ast.python_flask.simple_statement.expression_stat.trailer;

import ast.python_flask.literal.IdentifierExpression;

public class AttributeTrailerNode extends TrailerNode {
    public IdentifierExpression attribute;

    public AttributeTrailerNode(int line, IdentifierExpression attribute) {
        super("AttributeTrailer", line);
        this.attribute = attribute;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent)+".\n");
        sb.append(attribute.toString(indent+2));
        return sb.toString();
    }
}
