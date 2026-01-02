package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.helper_abstract.JinjaLiteral;

public class JinjaDoubleLiteralExpression extends JinjaLiteral {

    public double value;

    public JinjaDoubleLiteralExpression(int line, double value) {
        super("DoubleLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + String.valueOf(value);
    }
}