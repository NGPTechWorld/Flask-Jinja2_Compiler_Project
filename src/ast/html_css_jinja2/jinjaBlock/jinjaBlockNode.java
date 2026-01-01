package ast.html_css_jinja2.jinjaBlock;

import ast.html_css_jinja2.helper_abstract.HtmlElementsJinjaBlockTemplate;

public abstract class JinjaBlockNode extends HtmlElementsJinjaBlockTemplate {
    public JinjaBlockNode(String name, int line) {
        super(name, line);
    }
}
