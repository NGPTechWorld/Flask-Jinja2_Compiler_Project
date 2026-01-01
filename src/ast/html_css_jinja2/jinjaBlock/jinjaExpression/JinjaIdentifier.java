package ast.html_css_jinja2.jinjaBlock.jinjaExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;

public class JinjaIdentifier extends JinjaExpression {
    public String name;

    public JinjaIdentifier(int line, String name) {
        super("JinjaIdentifier", line);
        this.name = name;
    }

    @Override
    public String toString(int indent) {
        return " ".repeat(indent) + "(line " + line + ") Jinja Identifier: " + name;
    }
}
