package ast.python_flask.simple_statement.expression_stat.trailer;

public class AttributeTrailerNode extends TrailerNode {
    public String attribute;

    public AttributeTrailerNode(int line, String attribute) {
        super("AttributeTrailer", line);
        this.attribute = attribute;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append("not ").append(attribute);
        return sb.toString();
    }
}
