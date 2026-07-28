package ast.html_css_jinja2.css.stylesheet.nestedStatements.media.mediaQueryList;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.helper_abstract.CssNode;

public class MediaQueryNode extends CssNode {

    int line;
    String modifier; // "only" or "not"
    String mediaType; // "screen", "print", etc.
    List<MediaExpressionNode> expressions = new ArrayList<>();

    public MediaQueryNode(int line) {
        super("MediaQueryNode", line);
        this.line = line;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public void addExpression(MediaExpressionNode expression) {
        this.expressions.add(expression);
    }

    

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        if (modifier != null) {
            sb.append(modifier).append(" ");
        }
        if (mediaType != null) {
            sb.append(mediaType);
        }
        if (!expressions.isEmpty()) {
            if (mediaType != null)
                sb.append(" and ");
            for (int i = 0; i < expressions.size(); i++) {
                sb.append(expressions.get(i).toString(0));
                if (i < expressions.size() - 1) {
                    sb.append(" and ");
                }
            }
        }
        return sb.toString();
    }

}
