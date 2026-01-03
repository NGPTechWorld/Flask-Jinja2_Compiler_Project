package ast.html_css_jinja2;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;
import ast.html_css_jinja2.helper_abstract.HtmlElementsJinjaBlockTemplate;

public class HtmlDocumentRuleNode extends BaseNode {
    // it was public List<BaseNode> children = new ArrayList<>();
    public List<HtmlElementsJinjaBlockTemplate> children = new ArrayList<>();

    public HtmlDocumentRuleNode(int line) {
        super("HtmlDocument", line);
    }

    public void addChild(HtmlElementsJinjaBlockTemplate node) {
        children.add(node);
    }

    // @Override
    // public String toString(int indent) {
    //     StringBuilder sb = new StringBuilder(super.toString(indent));
    //     for (BaseNode child : children) {
    //         sb.append("\n").append(child.toString(indent + 2));
    //     }
    //     return sb.toString();
    // }
}
