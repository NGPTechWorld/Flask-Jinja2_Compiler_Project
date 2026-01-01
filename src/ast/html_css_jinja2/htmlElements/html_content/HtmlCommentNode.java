package ast.html_css_jinja2.htmlElements.html_content;

import ast.html_css_jinja2.htmlElements.helper_abstract.HtmlNode;

public class HtmlCommentNode extends HtmlNode {
    public String content;

    public HtmlCommentNode(int line, String content) {
        super("HtmlComment", line);
        this.content = content;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + content;
    }

}
