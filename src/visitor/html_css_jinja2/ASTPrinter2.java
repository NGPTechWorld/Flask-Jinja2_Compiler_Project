package visitor.html_css_jinja2;

import ast.BaseNode;
import ast.html_css_jinja2.TemplateProgramNode;
import ast.html_css_jinja2.Html.HtmlElementNode;

public class ASTPrinter2 {

    public static void print(BaseNode node, int indent) {
        if (node == null)
            return;

        System.out.println(node.toString(indent));

        if (node instanceof TemplateProgramNode p) {
            for (BaseNode child : p.children) {
                print(child, indent + 2);
            }
        }

        else if (node instanceof HtmlElementNode e) {
            for (BaseNode child : e.children) {
                print(child, indent + 2);
            }
        }

    }

}
