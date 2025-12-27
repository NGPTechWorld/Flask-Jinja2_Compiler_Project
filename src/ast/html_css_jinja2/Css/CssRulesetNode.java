package ast.html_css_jinja2.Css;

import java.util.ArrayList;
import java.util.List;

// ! @Osama_Zerkawi this important to understand
public class CssRulesetNode extends CssNode {

    public List<String> selectors = new ArrayList<>();
    public List<CssDeclarationNode> declarations = new ArrayList<>();

    public CssRulesetNode(int line) {
        super("CssRuleset", line);
    }

    public void addSelector(String selector) {
        this.selectors.add(selector);
    }

    public void addDeclaration(CssDeclarationNode declaration) {
        this.declarations.add(declaration);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append("\n").append(" ".repeat(indent + 2)).append("Selectors: ").append(String.join(", ", selectors));
        for (CssDeclarationNode decl : declarations) {
            sb.append("\n").append(decl.toString(indent + 2));
        }
        return sb.toString();
    }

}
