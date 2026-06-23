
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import antlr.html_css_jinja2.generated.HtmlCssJinja2Lexer;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser;
import antlr.python_flask.generated.PythonLexer;
import antlr.python_flask.generated.PythonParser;
import ast.html_css_jinja2.HtmlDocumentRuleNode;
import ast.python_flask.ProgramNode;
import generator.DataLinkExtractor;
import semantic.SemanticError;
import semantic.python_flask.SemanticAnalyzer;
import visitor.html_css_jinja2.ASTBuilderVisitor2;
import visitor.html_css_jinja2.ASTPrinter2;
import visitor.python_flask.ASTBuilderVisitor;
import visitor.python_flask.ASTPrinter;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Compiler driver.
 *
 * Both languages go through the full front-end, and the Python results feed the
 * Jinja side through the Generator data-link step:
 *
 *   Python : [1] Lex -> [2] Parse -> [3] AST -> [4] Symbols -> [5] Semantic
 *   Link   : render_template(...) context  ->  Jinja backend data
 *   Jinja  : [1] Lex -> [2] Parse -> [3] AST -> [4] Symbols -> [5] Semantic
 */
public class MainTest {

    private static final String PYTHON_INPUT = "src/testing/my_store/app.py";
    private static final String HTML_INPUT   = "src/testing/my_store/templates/products.html";

    public static void main(String[] args) throws Exception {
        String pythonInput = args.length > 0 ? args[0] : PYTHON_INPUT;
        String htmlInput   = args.length > 1 ? args[1] : HTML_INPUT;

        ProgramNode pythonAst = runPythonPipeline(pythonInput);

        // ---- Generator: link the data exported by Python into the Jinja tree ----
        System.out.println();
        DataLinkExtractor linker = new DataLinkExtractor();
        Map<String, Set<String>> dataLink = linker.extract(pythonAst);
        Set<String> templateContext = linker.contextFor(htmlInput);
        printDataLink(dataLink, htmlInput, templateContext);

        System.out.println();
        runHtmlPipeline(htmlInput, templateContext);
    }

    // ============================================================
    // Python / Flask pipeline
    // ============================================================
    public static ProgramNode runPythonPipeline(String path) throws Exception {
        banner("PYTHON / FLASK PIPELINE  (" + path + ")");
        String code = Files.readString(Paths.get(path));

        System.out.println("[1] Lexical analysis ...");
        PythonLexer lexer = new PythonLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        System.out.println("[2] Parsing ...");
        PythonParser parser = new PythonParser(tokens);
        ParseTree tree = parser.program();

        System.out.println("[3] Building AST ...\n");
        ASTBuilderVisitor builder = new ASTBuilderVisitor();
        ProgramNode ast = (ProgramNode) builder.visit(tree);
        ASTPrinter.print(ast, 0);

        System.out.println("\n[4] Symbol table:");
        builder.printSymbols();

        System.out.println("\n[5] Semantic analysis:");
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        List<SemanticError> errors = analyzer.analyze(ast);
        reportSemantic(errors);

        return ast;
    }

    // ============================================================
    // HTML / CSS / Jinja2 pipeline
    // ============================================================
    public static void runHtmlPipeline(String path, Set<String> backendData) throws Exception {
        banner("HTML / CSS / JINJA2 PIPELINE  (" + path + ")");
        String code = Files.readString(Paths.get(path));

        System.out.println("[1] Lexical analysis ...");
        HtmlCssJinja2Lexer lexer = new HtmlCssJinja2Lexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        System.out.println("[2] Parsing ...");
        HtmlCssJinja2Parser parser = new HtmlCssJinja2Parser(tokens);
        ParseTree tree = parser.htmlDocument();

        System.out.println("[3] Building AST ...\n");
        ASTBuilderVisitor2 builder = new ASTBuilderVisitor2();
        // Backend context handed to this template by Flask's render() call,
        // extracted from the Python AST (requirement #2 data link).
        builder.setDataFromBackEndForJinja(backendData);
        HtmlDocumentRuleNode ast = (HtmlDocumentRuleNode) builder.visit(tree);
        ASTPrinter2.print(ast, 0);

        System.out.println("\n[4] Symbol tables:");
        builder.printSymbols();

        System.out.println("\n[5] Semantic analysis:");
        semantic.html_css_jinja2.SemanticAnalyzer analyzer = new semantic.html_css_jinja2.SemanticAnalyzer();
        List<SemanticError> errors = analyzer.analyze(
                ast,
                builder.getDefinedCssClasses(),
                builder.getDataFromBackEndForJinja());
        reportSemantic(errors);
    }

    // ============================================================
    // Reporting helpers
    // ============================================================
    private static void printDataLink(Map<String, Set<String>> dataLink, String htmlInput, Set<String> context) {
        banner("DATA LINK  (Python  ->  Jinja2 templates)");
        if (dataLink.isEmpty()) {
            System.out.println("   No render_template(...) calls found.");
        } else {
            for (Map.Entry<String, Set<String>> e : dataLink.entrySet()) {
                System.out.println("   " + e.getKey() + "  ->  " + e.getValue());
            }
        }
        System.out.println("   ----------------------------------------");
        System.out.println("   Context injected into '" + baseName(htmlInput) + "': " + context);
    }

    private static void reportSemantic(List<SemanticError> errors) {
        if (errors == null || errors.isEmpty()) {
            System.out.println("   No semantic errors found.");
            return;
        }
        long errs = errors.stream()
                .filter(e -> e.severity == SemanticError.Severity.ERROR)
                .count();
        long warns = errors.size() - errs;
        System.out.println("   " + errs + " error(s), " + warns + " warning(s):");
        for (SemanticError e : errors) {
            System.out.println(e);
        }
    }

    private static String baseName(String path) {
        String p = path.replace('\\', '/');
        int slash = p.lastIndexOf('/');
        return slash >= 0 ? p.substring(slash + 1) : p;
    }

    private static void banner(String title) {
        System.out.println("============================================================");
        System.out.println("  " + title);
        System.out.println("============================================================");
    }
}
