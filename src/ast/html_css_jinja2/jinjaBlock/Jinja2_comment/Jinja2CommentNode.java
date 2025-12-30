package ast.html_css_jinja2.jinjaBlock.Jinja2_comment;

import ast.html_css_jinja2.jinjaBlock.jinjaBlockNode;

public class Jinja2CommentNode extends jinjaBlockNode {

    public String comment;

    public Jinja2CommentNode(int line, String comment) {
        super("Jinja2Comment", line);
        this.comment = comment;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + comment;
    }
}
