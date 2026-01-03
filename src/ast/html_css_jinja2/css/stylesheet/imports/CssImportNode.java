package ast.html_css_jinja2.css.stylesheet.imports;

import ast.html_css_jinja2.css.helper_abstract.CssNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.media.MediaQueryListNode;

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

    // TODO indent
    @Override
    public String toString() {
        return "CssImportNode{" +
                "importPath='" + importPath + '\'' +
                ", mediaQueryList=" + mediaQueryList +
                '}';
    }

}
