package ast.html_css_jinja2.css.stylesheet.nestedStatements.media.mediaQueryList;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.helper_abstract.CssNode;

public class MediaQueryListNode extends CssNode {
    int line;
    List<MediaQueryNode> queries = new ArrayList<>();

    public MediaQueryListNode(String name, int line) {
        super(name, line);
    }

    public void addQuery(MediaQueryNode query) {
        this.queries.add(query);
    }

    // TODO indent
    @Override
    public String toString() {
        return "MediaQueryListNode{" + "queries=" + queries + '}';
    }

}
