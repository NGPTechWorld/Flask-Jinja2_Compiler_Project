package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.helper_abstract.JinjaLiteral;

public class JinjaIntLiteralExpression extends JinjaLiteral {

    public int value;

    public JinjaIntLiteralExpression(int line, int value) {
        super("IntLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + String.valueOf(value);
    }

}
