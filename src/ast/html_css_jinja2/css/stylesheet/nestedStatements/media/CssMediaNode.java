package ast.html_css_jinja2.css.stylesheet.nestedStatements.media;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.helper_abstract.CssNestedStatement;

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

    // TODO
    @Override
    public String toString() {
        return "CssMediaNode{" +
                "mediaQueryList=" + mediaQueryList +
                ", body=" + body +
                '}';
    }
}
