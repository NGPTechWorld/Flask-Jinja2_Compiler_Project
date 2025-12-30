package ast.html_css_jinja2.Html;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;
import ast.html_css_jinja2.helper_abstract.HtmlElementsJinjaBlockTemplate;

public class HtmlElementNode extends HtmlElementsJinjaBlockTemplate {
    public String tagName;
    public boolean selfClosing;
    public List<BaseNode> children = new ArrayList<>();
    public List<HtmlAttributeNode> attributes = new ArrayList<>();

    public HtmlElementNode(String tagName, boolean selfClosing, int line) {
        super("HtmlElement: " + tagName, line);
        this.tagName = tagName;
        this.selfClosing = selfClosing;
    }

    public void addAttribute(HtmlAttributeNode attr) {
        attributes.add(attr);
    }

    @Override
    public String toString(int indent) {
        String closing = selfClosing ? " /" : "";
        return " ".repeat(indent)
                + "(line " + line + (selfClosing ? ") Self Closing <" : ") HtmlElement <")
                + tagName + closing + ">";
    }

}