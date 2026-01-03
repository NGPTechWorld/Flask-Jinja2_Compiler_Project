package ast.html_css_jinja2.css.stylesheet.nestedStatements.media;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.CssRuleNode;

public class MediaQueryNode extends CssRuleNode {

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

    // TODO indent
    @Override
    public String toString() {
        return "MediaQueryNode{" +
                "modifier='" + modifier + '\'' +
                ", mediaType='" + mediaType + '\'' +
                ", expressions=" + expressions +
                '}';
    }

    // @Override
    // public String toString(int indent) {
    // StringBuilder sb = new StringBuilder(" ".repeat(indent));
    // sb.append("(line ").append(line)
    // .append(") CssMedia @media ").append(query);

    // for (var rule : rules) {
    // sb.append("\n").append(rule.toString(indent + 2));
    // }
    // return sb.toString();
    // }

}
