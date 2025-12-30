package ast.html_css_jinja2.Html;

import ast.html_css_jinja2.Html.helper_abstract.HtmlNode;

public class HtmlTextNode extends HtmlNode {

    public String text;

    public HtmlTextNode(String text, int line) {
        super("HtmlText:", line);
        this.text = text.trim();
    }

    @Override
    public String toString(int indent) {
        return " ".repeat(indent) + "(line " + line + ") Text: " + text;
    }
}