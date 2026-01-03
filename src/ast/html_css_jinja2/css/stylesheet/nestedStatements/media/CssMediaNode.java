package ast.html_css_jinja2.css.stylesheet.nestedStatements.media;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.helper_abstract.CssNestedStatement;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.media.groupRuleBody.GroupRuleBodyNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.media.mediaQueryList.MediaQueryListNode;

public class CssMediaNode extends CssNestedStatement {
    int line;
    MediaQueryListNode mediaQueryList;
    GroupRuleBodyNode body;

    public CssMediaNode(String name, int line, MediaQueryListNode mediaQueryList, GroupRuleBodyNode body) {
        super(name, line);
        this.line = line;
        this.mediaQueryList = mediaQueryList;
        this.body = body;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append(" ").append(mediaQueryList.toString(0));
        sb.append("\n").append(body.toString(indent + 2));
        return sb.toString();
    }
}
