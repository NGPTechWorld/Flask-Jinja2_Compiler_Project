
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import antlr.html_css_jinja2.generated.HtmlCssJinja2Lexer;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser;
import antlr.python_flask.generated.PythonLexer;
import antlr.python_flask.generated.PythonParser;
import ast.html_css_jinja2.HtmlDocumentRuleNode;
import ast.python_flask.ProgramNode;
import visitor.html_css_jinja2.ASTBuilderVisitor2;
import visitor.html_css_jinja2.ASTPrinter2;
import visitor.python_flask.ASTBuilderVisitor;
import visitor.python_flask.ASTPrinter;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import javax.swing.SwingUtilities;

public class MainTest {
    public static void main(String[] args) throws Exception {
        // SwingUtilities.invokeLater(() -> {
        // new LiveParserViewer().setVisible(true);
        // });
        // runPythonAndFlask();
        // runANTLR_HTML_CSS_JINJA2();
        // runPythonAndFlaskAST();
        runANTLR_HTML_CSS_JINJA2_AST();
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

        javax.swing.SwingUtilities.invokeLater(() -> {
            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewer.open();
        });

        System.out.println(tree.toStringTree(parser));
        printPrettyTreePython(tree, parser, 0);
    }

    public static void runANTLR_HTML_CSS_JINJA2() throws Exception {
        String code = Files.readString(Paths.get("src/code.txt"));

        HtmlCssJinja2Lexer lexer = new HtmlCssJinja2Lexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();

        System.out.println("=== TOKENS ===");
        for (Token t : tokens.getTokens()) {
            System.out.println(t.getText() + " -> " + HtmlCssJinja2Lexer.VOCABULARY.getSymbolicName(t.getType()));
        }

        HtmlCssJinja2Parser parser = new HtmlCssJinja2Parser(tokens);

        System.out.println("\n=== PARSE TREE ===");
        parser.setBuildParseTree(true);
        ParseTree tree = parser.htmlDocument();
        System.out.println(tree.toStringTree(parser));

        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.open();

        System.out.println(tree.toStringTree(parser));
        printPrettyTreeHTML(tree, parser, 0);
    }

    public static void printPrettyTreePython(ParseTree tree, PythonParser parser, int indent) {
        String indentStr = " ".repeat(indent);
        if (tree.getChildCount() == 0) {
            System.out.println(indentStr + tree.getText());
            return;
        }

        System.out.println(indentStr + parser.getRuleNames()[((RuleContext) tree).getRuleIndex()]);
        for (int i = 0; i < tree.getChildCount(); i++) {
            printPrettyTreePython(tree.getChild(i), parser, indent + 2);
        }
    }

    public static void printPrettyTreeHTML(ParseTree tree, HtmlCssJinja2Parser parser, int indent) {
        String indentStr = " ".repeat(indent);
        if (tree.getChildCount() == 0) {
            System.out.println(indentStr + tree.getText());
            return;
        }

        System.out.println(indentStr + parser.getRuleNames()[((RuleContext) tree).getRuleIndex()]);
        for (int i = 0; i < tree.getChildCount(); i++) {
            printPrettyTreeHTML(tree.getChild(i), parser, indent + 2);
        }
    }

    public static void runPythonAndFlaskAST() throws Exception {
        String code = Files.readString(Paths.get("src/code.txt"));

        PythonLexer lexer = new PythonLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);

        ParseTree tree = parser.program();

        ASTBuilderVisitor visitor = new ASTBuilderVisitor();
        ProgramNode ast = (ProgramNode) visitor.visit(tree);
        System.out.println("=== AST (JSON STYLE) ===");
        ASTPrinter.print(ast, 0);
    }

    public static void runANTLR_HTML_CSS_JINJA2_AST() throws Exception {
        String code = Files.readString(Paths.get("src/code.txt"));

        HtmlCssJinja2Lexer lexer = new HtmlCssJinja2Lexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HtmlCssJinja2Parser parser = new HtmlCssJinja2Parser(tokens);

        ParseTree tree = parser.htmlDocument();
        ASTBuilderVisitor2 visitor = new ASTBuilderVisitor2();
        HtmlDocumentRuleNode ast = (HtmlDocumentRuleNode) visitor.visit(tree);
        System.out.println(" === AST === ");
        ASTPrinter2.print(ast, 0);
    }

}
