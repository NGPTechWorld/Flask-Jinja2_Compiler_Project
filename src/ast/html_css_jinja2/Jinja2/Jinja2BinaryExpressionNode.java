package ast.html_css_jinja2.Jinja2;

public class Jinja2BinaryExpressionNode extends Jinja2Node {
    public Jinja2Node left;
    public String operator;
    public Jinja2Node right;

    public Jinja2BinaryExpressionNode(int line, Jinja2Node left, String operator, Jinja2Node right) {
        super("Jinja2BinaryExpression", line);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + "\n" +
                left.toString(indent + 2) + "\n" +
                " ".repeat(indent + 2) + operator + "\n" +
                right.toString(indent + 2);
    }

}
