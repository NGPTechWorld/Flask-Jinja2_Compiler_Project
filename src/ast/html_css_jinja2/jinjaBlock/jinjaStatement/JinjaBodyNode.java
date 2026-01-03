package ast.html_css_jinja2.jinjaBlock.jinjaStatement;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;

public class JinjaBodyNode extends BaseNode {

    public List<BaseNode> children = new ArrayList<>();

    public JinjaBodyNode(int line) {
        super("JinjaBody", line);
    }

    public void add(BaseNode node) {
        children.add(node);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));

        sb.append("\n").append(" ".repeat(indent + 2)).append("Start Body");
        for (BaseNode child : children) {
            sb.append("\n").append(child.toString(indent + 4));
        }
        sb.append("\n").append(" ".repeat(indent + 2)).append("End Body");

        return sb.toString();
    }
}
