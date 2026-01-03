package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.helper_abstract.JinjaLiteral;

public class JinjaStringLiteralExpression extends JinjaLiteral {

    public String value;

    public JinjaStringLiteralExpression(int line, String value) {
        super("StringLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + value;
    }
}