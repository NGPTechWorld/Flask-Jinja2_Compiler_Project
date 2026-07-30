import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.html_css_jinja2.generated.HtmlCssJinja2Lexer;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser;
import antlr.python_flask.generated.PythonLexer;
import antlr.python_flask.generated.PythonParser;
import ast.html_css_jinja2.HtmlDocumentRuleNode;
import ast.python_flask.ProgramNode;
import generator.AstJsonWriter;
import generator.DataLinkExtractor;
import generator.HtmlGenerator;
import generator.RouteMap;
import generator.runtime.PythonContextGenerator;
import generator.runtime.PythonContextGenerator.RenderCall;
import semantic.SemanticError;
import visitor.html_css_jinja2.ASTBuilderVisitor2;
import visitor.python_flask.ASTBuilderVisitor;

/**
 * Compiler driver: app.py + templates/ in, a runnable static site out.
 *
 *   [1] Python front-end   lex -> parse -> AST -> symbols -> semantic
 *   [2] Python generation  evaluate globals, unroll routes -> render plan
 *   [3] Jinja front-end    parse each template once -> AST -> semantic
 *   [4] Jinja generation   one HTML file per entry of the render plan
 *   [5] Companion files    static/ and app.py copied verbatim
 *   [6] Compiler reports   compiler_output/*.json and *.txt
 *
 * Nothing here is hard-coded from the templates: the pages that get generated
 * are exactly the pages app.py can serve, given the data app.py declares.
 */
public class MainTest {

    private static final String PYTHON_INPUT   = "src/testing/my_store/app.py";
    private static final String TEMPLATES_DIR  = "src/testing/my_store/templates";
    private static final String ASSETS_DIR     = "src/testing/my_store/static";
    private static final String OUTPUT_DIR     = "output";
    private static final String REPORTS_DIR    = "compiler_output";

    /** The full trees live in compiler_output/ast_*.json; printing them is opt-in. */
    private static final boolean PRINT_AST = false;

    /**
     * URL parameter space. Values cannot be derived from the code, so they are
     * stated here from the data: /product/&lt;int:product_id&gt; is unrolled over
     * the ids of the products app.py declares.
     */
    private static final Map<String, String> PARAMETER_SOURCE = Map.of(
            "product_id", "products.id");

    private static final List<SemanticError> semanticErrors = new ArrayList<>();
    private static final List<String> generationLog = new ArrayList<>();
    private static final List<String> symbolReport = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        String pythonInput = args.length > 0 ? args[0] : PYTHON_INPUT;

        // ---------- [1] Python front-end ----------
        ProgramNode pythonAst = runPythonFrontEnd(pythonInput);

        // ---------- [2] Python generation ----------
        PythonContextGenerator pythonGenerator = new PythonContextGenerator();
        Map<String, Object> globals = pythonGenerator.buildGlobalContext(pythonAst);
        List<RenderCall> renderPlan = buildRenderPlan(pythonGenerator, pythonAst, globals);
        generationLog.addAll(pythonGenerator.getLog());

        reportDataLink(pythonAst);

        // ---------- [3] Jinja front-end ----------
        Map<String, HtmlDocumentRuleNode> templateAsts = runJinjaFrontEnd(renderPlan);

        // ---------- [4] Jinja generation ----------
        generatePages(renderPlan, templateAsts);

        // ---------- [5] Companion files ----------
        copyCompanionFiles(pythonInput);

        // ---------- [6] Compiler reports ----------
        writeReports(pythonAst, templateAsts);
    }

    // ============================================================
    // [1] Python front-end
    // ============================================================

    /** Runs lexing, parsing, AST building and semantic analysis over app.py. */
    private static ProgramNode runPythonFrontEnd(String path) throws Exception {
        banner("[1] PYTHON / FLASK FRONT-END  (" + path + ")");

        String code = Files.readString(Paths.get(path));
        PythonLexer lexer = new PythonLexer(CharStreams.fromString(code));
        PythonParser parser = new PythonParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        System.out.println("   parse errors : " + parser.getNumberOfSyntaxErrors());

        ASTBuilderVisitor builder = new ASTBuilderVisitor();
        ProgramNode ast = (ProgramNode) builder.visit(tree);
        System.out.println("   top-level statements : " + ast.statements.size());
        if (PRINT_AST) {
            visitor.python_flask.ASTPrinter.print(ast, 0);
        }

        collectSymbols("app.py", "Python", builder.getSymbolTable());

        List<SemanticError> errors =
                new semantic.python_flask.SemanticAnalyzer().analyze(ast);
        collectSemantic("app.py", errors);
        return ast;
    }

    // ============================================================
    // [2] Python generation
    // ============================================================

    /** Unrolls every @app.route into one render call per reachable URL. */
    private static List<RenderCall> buildRenderPlan(PythonContextGenerator generator,
                                                    ProgramNode pythonAst,
                                                    Map<String, Object> globals) {
        banner("[2] CODE GENERATION - PYTHON SIDE");
        System.out.println("   module variables : " + globals.keySet());

        Map<String, List<Object>> parameterValues = resolveParameterValues(globals);
        System.out.println("   URL parameters   : " + parameterValues);

        List<RenderCall> plan = generator.generateRenderCalls(pythonAst, globals, parameterValues);
        System.out.println("   render plan      : " + plan.size() + " page(s)");
        for (RenderCall call : plan) {
            System.out.println("      " + call.templateName + "  " + call.arguments
                    + "  ->  " + outputNameFor(call));
        }
        return plan;
    }

    /** Turns "products.id" into the actual list of ids found in the data. */
    private static Map<String, List<Object>> resolveParameterValues(Map<String, Object> globals) {
        Map<String, List<Object>> values = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : PARAMETER_SOURCE.entrySet()) {
            String[] parts = entry.getValue().split("\\.", 2);
            Object collection = globals.get(parts[0]);
            values.put(entry.getKey(),
                    PythonContextGenerator.fieldValues(collection, parts.length > 1 ? parts[1] : "id"));
        }
        return values;
    }

    /** Prints the older name-level data link, which the semantic phase uses. */
    private static void reportDataLink(ProgramNode pythonAst) {
        Map<String, Set<String>> dataLink = new DataLinkExtractor().extract(pythonAst);
        System.out.println("   data link (names only, for semantic checking):");
        for (Map.Entry<String, Set<String>> entry : dataLink.entrySet()) {
            System.out.println("      " + entry.getKey() + "  ->  " + entry.getValue());
        }
    }

    // ============================================================
    // [3] Jinja front-end
    // ============================================================

    /**
     * Parses each template exactly once and runs semantic analysis on it.
     * A template used by several pages is parsed once and reused, so the tree
     * is built as many times as there are templates, not as there are pages.
     */
    private static Map<String, HtmlDocumentRuleNode> runJinjaFrontEnd(List<RenderCall> plan)
            throws Exception {
        banner("[3] HTML / CSS / JINJA2 FRONT-END");

        // Every context name any page passes to a given template.
        Map<String, Set<String>> contextNames = new LinkedHashMap<>();
        for (RenderCall call : plan) {
            contextNames.computeIfAbsent(call.templateName, t -> new LinkedHashSet<>())
                    .addAll(call.context.keySet());
        }

        Map<String, HtmlDocumentRuleNode> asts = new LinkedHashMap<>();
        for (Map.Entry<String, Set<String>> entry : contextNames.entrySet()) {
            String templateName = entry.getKey();
            Path path = Paths.get(TEMPLATES_DIR, templateName);
            if (!Files.exists(path)) {
                System.out.println("   MISSING template: " + path);
                continue;
            }

            String source = Files.readString(path);
            HtmlCssJinja2Lexer lexer = new HtmlCssJinja2Lexer(CharStreams.fromString(source));
            HtmlCssJinja2Parser parser = new HtmlCssJinja2Parser(new CommonTokenStream(lexer));
            ParseTree tree = parser.htmlDocument();

            ASTBuilderVisitor2 builder = new ASTBuilderVisitor2();
            // The names Flask actually hands this template, taken from the
            // render plan rather than guessed.
            builder.setDataFromBackEndForJinja(entry.getValue());
            HtmlDocumentRuleNode ast = (HtmlDocumentRuleNode) builder.visit(tree);
            asts.put(templateName, ast);

            System.out.println("   " + templateName + "  context=" + entry.getValue()
                    + "  parse errors=" + parser.getNumberOfSyntaxErrors());
            if (PRINT_AST) {
                visitor.html_css_jinja2.ASTPrinter2.print(ast, 0);
            }

            collectSymbols(templateName, "HTML", builder.getHtmlTable());
            collectSymbols(templateName, "CSS", builder.getCssTable());
            collectSymbols(templateName, "Jinja", builder.getJinjaTable());

            List<SemanticError> errors = new semantic.html_css_jinja2.SemanticAnalyzer().analyze(
                    ast, builder.getDefinedCssClasses(), builder.getDataFromBackEndForJinja());
            collectSemantic(templateName, errors);
        }
        return asts;
    }

    // ============================================================
    // [4] Jinja generation
    // ============================================================

    /** Renders every entry of the plan into output/, clearing stale pages first. */
    private static void generatePages(List<RenderCall> plan,
                                      Map<String, HtmlDocumentRuleNode> templateAsts)
            throws IOException {
        banner("[4] CODE GENERATION - JINJA SIDE");
        cleanGeneratedPages(Paths.get(OUTPUT_DIR));

        for (RenderCall call : plan) {
            HtmlDocumentRuleNode ast = templateAsts.get(call.templateName);
            if (ast == null) {
                continue;
            }
            HtmlGenerator generator = new HtmlGenerator();
            String html = generator.generate(ast, call.toScope());

            Path outFile = Paths.get(OUTPUT_DIR, outputNameFor(call));
            Files.createDirectories(outFile.getParent());
            Files.writeString(outFile, html);

            System.out.println("   " + outFile + "  (" + html.length() + " chars, "
                    + generator.getWarnings().size() + " warning(s))");

            generationLog.add("[HTML] " + outFile);
            for (String line : generator.getLog()) {
                generationLog.add("[HTML]    " + line);
            }
            for (String warning : generator.getWarnings()) {
                generationLog.add("[HTML][WARN] " + warning);
            }
        }
    }

    /**
     * Chooses the output file for one render call, matching the links RouteMap
     * writes. A route with no URL parameter keeps the template's own name; a
     * parameterised route gets one file per URL.
     */
    private static String outputNameFor(RenderCall call) {
        if (call.arguments.isEmpty()) {
            return call.templateName;
        }
        return RouteMap.detailsPage(call.arguments.values().iterator().next());
    }

    /** Deletes previously generated pages so a removed item leaves no orphan. */
    private static void cleanGeneratedPages(Path dir) throws IOException {
        if (!Files.isDirectory(dir)) {
            return;
        }
        try (Stream<Path> paths = Files.list(dir)) {
            for (Path file : paths.toList()) {
                if (file.toString().endsWith(".html")) {
                    Files.delete(file);
                }
            }
        }
    }

    // ============================================================
    // [5] Companion files
    // ============================================================

    /** Copies static/ and app.py into the output untouched, as the spec requires. */
    private static void copyCompanionFiles(String pythonInput) throws IOException {
        banner("[5] COMPANION FILES");

        int assets = copyTree(Paths.get(ASSETS_DIR), Paths.get(OUTPUT_DIR, "static"));
        System.out.println("   static/ : " + assets + " file(s)");

        Path appSource = Paths.get(pythonInput);
        if (Files.exists(appSource)) {
            Path appTarget = Paths.get(OUTPUT_DIR, appSource.getFileName().toString());
            Files.createDirectories(appTarget.getParent());
            Files.copy(appSource, appTarget, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("   " + appTarget);
        }
    }

    /** Copies a folder recursively, replacing whatever is already there. */
    private static int copyTree(Path from, Path to) throws IOException {
        if (!Files.isDirectory(from)) {
            return 0;
        }
        int copied = 0;
        try (Stream<Path> paths = Files.walk(from)) {
            for (Path source : paths.toList()) {
                Path target = to.resolve(from.relativize(source).toString());
                if (Files.isDirectory(source)) {
                    Files.createDirectories(target);
                } else {
                    Files.createDirectories(target.getParent());
                    Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
                    copied++;
                }
            }
        }
        return copied;
    }

    // ============================================================
    // [6] Compiler reports
    // ============================================================

    /** Writes the four artefacts the specification asks for. */
    private static void writeReports(ProgramNode pythonAst,
                                     Map<String, HtmlDocumentRuleNode> templateAsts)
            throws IOException {
        banner("[6] COMPILER OUTPUT");
        Path reports = Paths.get(REPORTS_DIR);
        Files.createDirectories(reports);

        Files.writeString(reports.resolve("ast_python.json"), AstJsonWriter.toJson(pythonAst));
        Files.writeString(reports.resolve("ast_jinja.json"), AstJsonWriter.toJson(templateAsts));
        Files.write(reports.resolve("semantic_report.txt"), semanticReport());
        Files.write(reports.resolve("generation_log.txt"), generationLog);
        Files.write(reports.resolve("symbol_table.txt"), symbolTableReport());

        for (String file : List.of("ast_python.json", "ast_jinja.json",
                                   "semantic_report.txt", "generation_log.txt",
                                   "symbol_table.txt")) {
            Path path = reports.resolve(file);
            System.out.println("   " + path + "  (" + Files.size(path) + " bytes)");
        }
    }

    /** Builds the symbol-table report with a header and a column legend. */
    private static List<String> symbolTableReport() {
        List<String> lines = new ArrayList<>();
        lines.add("Symbol table");
        lines.add("============");
        lines.add("Produced by the front-end (semantic phase). Code generation");
        lines.add("does not consult it: it stores types, generation needs values.");
        lines.add("");
        lines.add(String.format("| %-25s | %-10s | %-5s | %-20s |",
                "name", "kind", "line", "extra"));
        lines.addAll(symbolReport);
        return lines;
    }

    /** Formats every semantic finding, grouped by the file it came from. */
    private static List<String> semanticReport() {
        List<String> lines = new ArrayList<>();
        long errors = semanticErrors.stream()
                .filter(e -> e.severity == SemanticError.Severity.ERROR)
                .count();
        lines.add("Semantic report");
        lines.add("===============");
        lines.add("errors   : " + errors);
        lines.add("warnings : " + (semanticErrors.size() - errors));
        lines.add("");
        for (SemanticError error : semanticErrors) {
            lines.add(error.toString());
        }
        return lines;
    }

    /**
     * Stores one symbol table under its own heading.
     * The table is a front-end artefact: it records what was declared and where,
     * and code generation deliberately does not read it.
     */
    private static void collectSymbols(String file, String language, Symbol_table.SymbolTable table) {
        List<String> lines = table.toLines();
        symbolReport.add("");
        symbolReport.add("---------------------------------------------");
        symbolReport.add(language + " symbols - " + file);
        symbolReport.add("---------------------------------------------");
        if (lines.isEmpty()) {
            symbolReport.add("   (no scopes recorded)");
            return;
        }
        symbolReport.addAll(lines);
    }

    /** Stores one file's semantic findings and prints a one-line summary. */
    private static void collectSemantic(String file, List<SemanticError> errors) {
        if (errors == null || errors.isEmpty()) {
            System.out.println("      semantic: clean");
            return;
        }
        long count = errors.stream()
                .filter(e -> e.severity == SemanticError.Severity.ERROR)
                .count();
        semanticErrors.addAll(errors);
        System.out.println("      semantic: " + count + " error(s), "
                + (errors.size() - count) + " warning(s) in " + file);
    }

    /** Prints a section header. */
    private static void banner(String title) {
        System.out.println();
        System.out.println("============================================================");
        System.out.println("  " + title);
        System.out.println("============================================================");
    }
}
