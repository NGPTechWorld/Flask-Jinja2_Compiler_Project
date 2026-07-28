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


    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < queries.size(); i++) {
            sb.append(queries.get(i).toString(0));
            if (i < queries.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
