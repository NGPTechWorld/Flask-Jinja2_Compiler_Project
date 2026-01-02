package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.helper_abstract.JinjaLiteral;

public class JinjaBooleanLiteralExpression extends JinjaLiteral {

    public boolean value;

    public JinjaBooleanLiteralExpression(int line, boolean value) {
        super("BooleanLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + String.valueOf(value);
    }
}