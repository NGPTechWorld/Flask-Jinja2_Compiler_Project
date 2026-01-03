package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.helper_abstract.JinjaLiteral;

public class JinjaNullLiteralExpression extends JinjaLiteral {

    public JinjaNullLiteralExpression(int line) {
        super("NullLiteral", line);
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + "null";
    }
}