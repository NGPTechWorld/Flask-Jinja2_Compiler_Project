package ast.html_css_jinja2.jinjaBlock.jinjaExpression;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;

public class JinjaListLiteral extends JinjaExpression {
    public List<JinjaExpression> elements = new ArrayList<>();

    public JinjaListLiteral(int line) {
        super("JinjaListLiteral", line);
    }

}
