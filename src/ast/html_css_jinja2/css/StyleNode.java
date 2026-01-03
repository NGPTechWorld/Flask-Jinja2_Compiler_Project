package ast.html_css_jinja2.css;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;
import ast.html_css_jinja2.css.helper_abstract.CssNode;

public class StyleNode extends CssNode {
    public List<BaseNode> children = new ArrayList<>();

    public StyleNode(int line) {
        super("StyleElement", line);
    }

    public void addChild(BaseNode node) {
        children.add(node);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(" ".repeat(indent));
        sb.append("(line ").append(line).append(") <style>");

        for (var child : children) {
            sb.append("\n").append(child.toString(indent + 2));
        }
        return sb.toString();
    }

}
