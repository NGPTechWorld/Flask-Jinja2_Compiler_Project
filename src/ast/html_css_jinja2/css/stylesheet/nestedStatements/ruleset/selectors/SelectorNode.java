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

    public int getLine() {
        return line;
    }

    public SimpleSelectorSequenceNode getFirstSequence() {
        return firstSequence;
    }

    public List<CombinatorAndSequence> getRest() {
        return rest;
    }

    /**
     * Adds a combinator and the following simple selector sequence to this
     * selector.
     * This method was missing and caused the compilation error.
     * 
     * @param combinator The combinator string (e.g., ">", "+", "~", or " ").
     * @param sequence   The following SimpleSelectorSequenceNode.
     */
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
            return "'" + combinator + "' " + sequence;
        }
    }

    // TODO indent
    @Override
    public String toString() {
        return "SelectorNode{" +
                "firstSequence=" + firstSequence +
                ", rest=" + rest +
                '}';
    }
}