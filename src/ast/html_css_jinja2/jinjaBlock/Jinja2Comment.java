package ast.html_css_jinja2.jinjaBlock;

import ast.html_css_jinja2.jinjaBlock.helper_abstract.jinjaBlock;

public class Jinja2Comment extends jinjaBlock {

    public String comment;

    public Jinja2Comment(int line, String comment) {
        super("Jinja2Comment", line);
        this.comment = comment;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + comment;
    }
}
