package ast.html_css_jinja2.css.stylesheet.imports;

import ast.html_css_jinja2.css.helper_abstract.CssNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.media.mediaQueryList.MediaQueryListNode;

public class CssImportNode extends CssNode {

    int line;
    String importPath; // The URL or string
    MediaQueryListNode mediaQueryList; // Can be null

    public CssImportNode(int line, String name, String importPath, MediaQueryListNode mediaQueryList) {
        super(name, line);
        this.line = line;
        this.importPath = importPath;
        this.mediaQueryList = mediaQueryList;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append(" url(\"").append(importPath).append("\")");
        if (mediaQueryList != null) {
            sb.append(" ").append(mediaQueryList.toString(0)); // Print media list on same line
        }
        sb.append(";");
        return sb.toString();
    }

}
