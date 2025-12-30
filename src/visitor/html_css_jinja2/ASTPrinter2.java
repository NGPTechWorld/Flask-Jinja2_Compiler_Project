package visitor.html_css_jinja2;

import ast.BaseNode;
import ast.html_css_jinja2.HtmlDocumentRuleNode;
import ast.html_css_jinja2.htmlElements.HtmlAttributeNode;
import ast.html_css_jinja2.htmlElements.HtmlElementNode;

public class ASTPrinter2 {

    public static void print(BaseNode node, int indent) {
        if (node == null)
            return;

        System.out.println(node.toString(indent));

        if (node instanceof HtmlDocumentRuleNode p) {
            for (BaseNode child : p.children) {
                print(child, indent + 2);
            }
        }

        else if (node instanceof HtmlElementNode e) {

            for (HtmlAttributeNode attr : e.attributes) {
                print(attr, indent + 2);
            }

            for (BaseNode child : e.children) {
                print(child, indent + 2);
            }
        }

    }

}
