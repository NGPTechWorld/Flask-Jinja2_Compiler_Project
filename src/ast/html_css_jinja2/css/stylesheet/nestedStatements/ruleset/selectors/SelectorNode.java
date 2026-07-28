package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.helper_abstract.CssNode;

public class SelectorNode extends CssNode {

    int line;
    SimpleSelectorSequenceNode firstSequence;
    List<CombinatorAndSequence> rest = new ArrayList<>();

    public SelectorNode(int line, SimpleSelectorSequenceNode firstSequence) {
        super("SelectorNode", line);
        this.line = line;
        this.firstSequence = firstSequence;
    }

    public int getLine() { return line; }

    public SimpleSelectorSequenceNode getFirstSequence() { return firstSequence; }

    public List<CombinatorAndSequence> getRest() { return rest; }

    public void addCombinatorAndSequence(String combinator, SimpleSelectorSequenceNode sequence) {
        this.rest.add(new CombinatorAndSequence(combinator, sequence));
    }

    public static class CombinatorAndSequence {
        public final String combinator;
        public final SimpleSelectorSequenceNode sequence;

        public CombinatorAndSequence(String combinator, SimpleSelectorSequenceNode sequence) {
            this.combinator = combinator;
            this.sequence = sequence;
        }

        @Override
        public String toString() {
            // FIX: handle descendant combinator separately
            if (combinator.equals(" ")) {
                return " " + sequence.toString(0);
            } else {
                return " " + combinator + " " + sequence.toString(0);
            }
        }
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        if (firstSequence != null) {
            sb.append(firstSequence.toString(0));
        }
        // FIX: do NOT add an extra space before cas.toString()
        for (CombinatorAndSequence cas : rest) {
            sb.append(cas.toString());
        }
        return sb.toString();
    }
}