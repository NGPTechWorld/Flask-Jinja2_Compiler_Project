package ast.html_css_jinja2.htmlElements.html_content;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;
import ast.html_css_jinja2.helper_abstract.HtmlElementsJinjaBlockTemplate;
import ast.html_css_jinja2.htmlElements.HtmlAttributeNode;

public class HtmlElementNode extends HtmlElementsJinjaBlockTemplate {
    public String tagName;
    public String endTagName;
    public boolean selfClosing;
    public List<BaseNode> children = new ArrayList<>();
    public List<HtmlAttributeNode> attributes = new ArrayList<>();

    public HtmlElementNode(String tagName, String endTagName, boolean selfClosing, int line) {
        super("HtmlElement: " + tagName, line);
        this.tagName = tagName;
        this.endTagName = endTagName;
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
                + tagName + closing + ">" + " </" + endTagName + ">";
    }

}