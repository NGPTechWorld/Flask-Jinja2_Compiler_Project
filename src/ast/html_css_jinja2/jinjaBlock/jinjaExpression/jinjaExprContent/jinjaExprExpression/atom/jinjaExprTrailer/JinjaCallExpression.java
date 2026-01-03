package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaExprTrailer;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
public class JinjaCallExpression extends JinjaExpression {

    public JinjaExpression callee;
    public List<JinjaExpression> arguments = new ArrayList<>();

    public JinjaCallExpression(int line, JinjaExpression callee) {
        super("JinjaCall", line);
        this.callee = callee;
    }
}