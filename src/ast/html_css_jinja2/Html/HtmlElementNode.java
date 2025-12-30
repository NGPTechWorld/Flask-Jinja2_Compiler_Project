package ast.html_css_jinja2.Html;

// import java.util.ArrayList;
// import java.util.List;

// public class HtmlElementNode extends HtmlNode {
//     public String tagName;
//     public List<HtmlAttributeNode> attributes = new ArrayList<>();
//     public List<HtmlNode> children = new ArrayList<>();
//     public boolean isSelfClosing;

//     public HtmlElementNode(String name, int line) {
//         super("HtmlElement", line);
//         //! @Osama_Zerkawi why here we write this? 
//         this.tagName = tagName;
//         this.isSelfClosing = isSelfClosing;
//     }

//     public void addAttribute(HtmlAttributeNode attribute) {
//         this.attributes.add(attribute);
//     }

//     public void addChild(HtmlNode node) {
//         this.children.add(node);
//     }

//     @Override
//     public String toString(int indent) {
//         StringBuilder sb = new StringBuilder(super.toString(indent) + "<" + tagName + ">");
//         if (!attributes.isEmpty()) {
//             sb.append("\n").append(" ".repeat(indent + 2)).append("Attributes:");
//             for (HtmlAttributeNode attr : attributes) {
//                 sb.append("\n").append(attr.toString(indent + 4));
//             }
//         }
//         if (!children.isEmpty()) {
//             sb.append("\n").append(" ".repeat(indent + 2)).append("Children:");
//             for (HtmlNode child : children) {
//                 sb.append("\n").append(child.toString(indent + 4));
//             }
//         }
//         return sb.toString();
//     }

// }

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

    // ! Temp comment
    // @Override
    // public String toString(int indent) {
    // StringBuilder sb = new StringBuilder(
    // " ".repeat(indent) + "HtmlElement <" + tagName + ">");
    // for (BaseNode child : children) {
    // sb.append("\n").append(child.toString(indent + 2));
    // }
    // return sb.toString();
    // }

}