package ast.html_css_jinja2.jinjaBlock.Jinja2_comment;

import ast.html_css_jinja2.jinjaBlock.JinjaBlockNode;

public class Jinja2CommentNode extends JinjaBlockNode {

    public String comment;

    public Jinja2CommentNode(int line, String comment) {
        super("Jinja2Comment", line);
        this.comment = comment;
    }

    @Override
    public String toString(int indent) {
        return " ".repeat(indent) + "(line " + line + ") JinjaComment: " + comment;
    }
}
