
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import antlr.python_flask.generated.PythonLexer;
import antlr.python_flask.generated.PythonParser;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) throws Exception {
        runPythonAndFlask();
    }

    public static void runPythonAndFlask() throws Exception {
        String code = Files.readString(Paths.get("src/code.txt"));

        PythonLexer lexer = new PythonLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();

        System.out.println("=== TOKENS ===");
        for (Token t : tokens.getTokens()) {
            System.out.println(t.getText() + " -> " + PythonLexer.VOCABULARY.getSymbolicName(t.getType()));
        }

        PythonParser parser = new PythonParser(tokens);

        System.out.println("\n=== PARSE TREE ===");
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));

        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.open();

        System.out.println(tree.toStringTree(parser));
        printPrettyTree(tree, parser, 0);
    }

    public static void printPrettyTree(ParseTree tree, PythonParser parser, int indent) {
        String indentStr = " ".repeat(indent);
        if (tree.getChildCount() == 0) {
            System.out.println(indentStr + tree.getText());
            return;
        }

        System.out.println(indentStr + parser.getRuleNames()[((RuleContext) tree).getRuleIndex()]);
        for (int i = 0; i < tree.getChildCount(); i++) {
            printPrettyTree(tree.getChild(i), parser, indent + 2);
        }
    }

}
