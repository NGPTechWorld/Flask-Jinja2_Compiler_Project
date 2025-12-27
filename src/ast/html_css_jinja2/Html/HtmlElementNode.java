package ast.html_css_jinja2.Html;

import java.util.ArrayList;
import java.util.List;

public class HtmlElementNode extends HtmlNode {
    public String tagName;
    public List<HtmlAttributeNode> attributes = new ArrayList<>();
    public List<HtmlNode> children = new ArrayList<>();
    public boolean isSelfClosing;

    public HtmlElementNode(String name, int line) {
        super("HtmlElement", line);
        //! @Osama_Zerkawi why here we write this? 
        this.tagName = tagName;
        this.isSelfClosing = isSelfClosing;
    }

    public void addAttribute(HtmlAttributeNode attribute) {
        this.attributes.add(attribute);
    }

    public void addChild(HtmlNode node) {
        this.children.add(node);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent) + "<" + tagName + ">");
        if (!attributes.isEmpty()) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Attributes:");
            for (HtmlAttributeNode attr : attributes) {
                sb.append("\n").append(attr.toString(indent + 4));
            }
        }
        if (!children.isEmpty()) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Children:");
            for (HtmlNode child : children) {
                sb.append("\n").append(child.toString(indent + 4));
            }
        }
        return sb.toString();
    }

}
