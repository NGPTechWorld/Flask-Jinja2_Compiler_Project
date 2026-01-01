package ast.html_css_jinja2.jinjaBlock.jinjaExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;

public class JinjaLiteral extends JinjaExpression {
    public String value;

    public JinjaLiteral(int line, String value) {
        super("JinjaLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return " ".repeat(indent) + "(line " + line + ") Literal: " + value;
    }
}
