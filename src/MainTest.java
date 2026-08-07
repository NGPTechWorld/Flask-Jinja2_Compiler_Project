import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;
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
import generator.PreviewServer;
import generator.RouteMap;
import generator.runtime.PythonContextGenerator;
import generator.runtime.PythonContextGenerator.RenderCall;
import semantic.SemanticError;
import visitor.html_css_jinja2.ASTBuilderVisitor2;
import visitor.python_flask.ASTBuilderVisitor;

public class MainTest {

    private static final String PYTHON_INPUT   = "src/testing/my_store/app.py";
    /**
     * Flask keeps templates/ and static/ beside the application file, so both
     * are derived from whichever app.py is being compiled rather than fixed to
     * one project.
     */
    private static String templatesDir = "src/testing/my_store/templates";
    private static String assetsDir    = "src/testing/my_store/static";

    /** Points the compiler at the project folder that owns this app.py. */
    private static void locateProject(String pythonInput) {
        Path home = Paths.get(pythonInput).toAbsolutePath().getParent();
        templatesDir = home.resolve("templates").toString();
        assetsDir = home.resolve("static").toString();
    }
    private static final String OUTPUT_DIR     = "output";
    private static final String REPORTS_DIR    = "compiler_output";

    private static final boolean PRINT_AST = false;

    private static final PythonContextGenerator.PageMode PAGE_MODE =
            PythonContextGenerator.PageMode.ONE_PAGE_WITH_COLLECTION;

    private static final List<SemanticError> semanticErrors = new ArrayList<>();
    private static final List<String> generationLog = new ArrayList<>();
    private static final List<String> symbolReport = new ArrayList<>();

    private static class SourceError extends Exception {
        SourceError(String message) {
            super(message);
        }
    }

    private static Map<String, Object> liveData;
    private static boolean serveMode;
    private static RouteMap currentRoutes = new RouteMap();

    public static void main(String[] args) throws Exception {
        String pythonInput = PYTHON_INPUT;
        boolean watch = false;
        int port = 0;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--watch": case "-w":
                    watch = true;
                    break;
                case "--serve": case "-s":
                    port = 8080;
                    if (i + 1 < args.length && args[i + 1].matches("\\d+")) {
                        port = Integer.parseInt(args[++i]);
                    }
                    break;
                default:
                    pythonInput = args[i];
            }
        }
        serveMode = port > 0;
        locateProject(pythonInput);

        try {
            build(pythonInput, "initial build");
        } catch (SourceError broken) {
            System.out.println();
            System.out.println("!!! " + broken.getMessage() + "; nothing was generated");
        }

        if (serveMode) {
            serve(pythonInput, port);
        }
        if (watch) {
            watch(pythonInput);
        } else if (serveMode) {
            Thread.currentThread().join();      // the server threads keep running
        }
    }

    private static void build(String pythonInput, String reason) throws Exception {
        long started = System.currentTimeMillis();
        semanticErrors.clear();
        generationLog.clear();
        symbolReport.clear();

        // Python
        ProgramNode pythonAst = runPythonFrontEnd(pythonInput);
        PythonContextGenerator pythonGenerator = new PythonContextGenerator();
        // Edits made through the generated forms live in liveData; without them
        // the data is read fresh out of app.py.
        Map<String, Object> globals = liveData != null
                ? liveData
                : pythonGenerator.buildGlobalContext(pythonAst);
        liveData = globals;
        List<RenderCall> renderPlan = buildRenderPlan(pythonGenerator, pythonAst, globals);
        generationLog.addAll(pythonGenerator.getLog());

        reportDataLink(pythonAst);

        // Jinja
        Map<String, HtmlDocumentRuleNode> templateAsts = runJinjaFrontEnd(renderPlan);
        generatePages(renderPlan, templateAsts);
        copyCompanionFiles(pythonInput);
        writeReports(pythonAst, templateAsts);
        System.out.println();
        System.out.println(">>> " + reason + " finished in "
                + (System.currentTimeMillis() - started) + " ms");
    }

    // ============================================================
    // Serve mode: the generated forms, made to work
    // ============================================================

    /**
     * Serves the generated site and applies what its forms submit.
     *
     * Adding or deleting a product changes the data this process holds, the
     * site is regenerated on the spot, and the browser is sent back to a page
     * the compiler has just rewritten. No second framework is involved.
     */
    private static void serve(String pythonInput, int port) throws IOException {
        banner("PREVIEW SERVER");
        new PreviewServer(Paths.get(OUTPUT_DIR), port, new PreviewServer.Actions() {

            @Override
            public void add(Map<String, String> fields) {
                addProduct(fields);
            }

            @Override
            public void delete(String id) {
                deleteProduct(id);
            }

            @Override
            public void rebuild(String reason) throws Exception {
                build(pythonInput, reason);
            }

            @Override
            public String fileFor(String url) {
                return currentRoutes.rewriteNavigation(url);
            }

            @Override
            public Path imageFolder() {
                return Paths.get(assetsDir, "images");
            }

            @Override
            public String imageLink(String fileName) {
                return "static/images/" + fileName;
            }
        }).start();
        System.out.println("   open http://localhost:" + port + " and use the site normally");
    }

    /**
     * Appends one product, giving it the next free id.
     * The keys and their order match what the Python evaluator produces, so the
     * templates cannot tell a submitted product from a declared one.
     */
    @SuppressWarnings("unchecked")
    private static void addProduct(Map<String, String> fields) {
        List<Object> products = (List<Object>) liveData.get("products");
        if (products == null) {
            return;
        }
        Map<String, Object> product = new LinkedHashMap<>();
        product.put("id", nextId(products));
        product.put("name", fields.getOrDefault("name", "Unnamed product"));
        product.put("price", asNumber(fields.get("price")));
        product.put("image", fields.getOrDefault("image", "static/images/image1.jpg"));
        product.put("description", fields.getOrDefault("description", ""));
        products.add(product);
    }

    /** Removes the product carrying this id, if it is still there. */
    @SuppressWarnings("unchecked")
    private static void deleteProduct(String id) {
        List<Object> products = (List<Object>) liveData.get("products");
        if (products != null) {
            products.removeIf(item -> item instanceof Map<?, ?> product
                    && String.valueOf(product.get("id")).equals(id));
        }
    }

    /** One past the largest id in use. */
    private static int nextId(List<Object> products) {
        int highest = 0;
        for (Object item : products) {
            if (item instanceof Map<?, ?> product && product.get("id") instanceof Number id) {
                highest = Math.max(highest, id.intValue());
            }
        }
        return highest + 1;
    }

    /** Prices arrive as text; keep whole numbers whole so they print as 450. */
    private static Object asNumber(String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }
        try {
            double value = Double.parseDouble(text.trim());
            return value == Math.floor(value) ? (int) value : value;
        } catch (NumberFormatException notANumber) {
            return 0;
        }
    }

    // ============================================================
    // Watch mode
    // ============================================================

    /** Source files whose change is worth a rebuild; anything else is editor noise. */
    private static final Set<String> WATCHED_SUFFIXES = Set.of(".py", ".html", ".css", ".js");

    /**
     * Rebuilds the site whenever a source file is saved.
     *
     * Adding or deleting a product means editing the products list in app.py;
     * this loop notices the save and regenerates, so the output never drifts
     * away from the data. The compiler is the listener, not the application.
     */
    private static void watch(String pythonInput) throws Exception {
        WatchService watcher = FileSystems.getDefault().newWatchService();
        for (Path directory : watchedDirectories(pythonInput)) {
            directory.register(watcher,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.ENTRY_DELETE);
            System.out.println("   watching " + directory);
        }
        banner("WATCHING FOR CHANGES  (Ctrl+C to stop)");

        while (true) {
            Set<String> changed = awaitChanges(watcher);
            if (changed.isEmpty()) {
                continue;                     // only editor temp files moved
            }
            try {
                // A saved source file is the newer truth, so it replaces
                // whatever the generated forms had changed.
                if (changed.stream().anyMatch(file -> file.endsWith(".py"))) {
                    liveData = null;
                }
                build(pythonInput, String.join(", ", changed) + " changed");
            } catch (Exception failure) {
                // A half-saved file must not kill the watcher: report, leave the
                // previous output in place, and wait for the next save.
                System.out.println();
                System.out.println("!!! rebuild skipped: "
                        + (failure instanceof SourceError ? failure.getMessage() : failure));
                System.out.println("    previous output kept, waiting for the next change ...");
            }
        }
    }

    /** The source folders a rebuild depends on. */
    private static List<Path> watchedDirectories(String pythonInput) {
        List<Path> directories = new ArrayList<>();
        directories.add(Paths.get(pythonInput).toAbsolutePath().getParent());
        for (String folder : List.of(templatesDir, assetsDir)) {
            Path path = Paths.get(folder).toAbsolutePath();
            if (Files.isDirectory(path)) {
                directories.add(path);
            }
        }
        return directories;
    }

    /**
     * Blocks until something changes, then drains the burst that follows.
     * One save fires several events, so the events are collected for a short
     * window and turned into a single rebuild.
     */
    private static Set<String> awaitChanges(WatchService watcher) throws InterruptedException {
        Set<String> changed = new LinkedHashSet<>();
        WatchKey key = watcher.take();                    // blocks until the first event
        do {
            for (WatchEvent<?> event : key.pollEvents()) {
                String file = event.context().toString();
                if (isSourceFile(file)) {
                    changed.add(file);
                }
            }
            key.reset();
            key = watcher.poll(250, TimeUnit.MILLISECONDS);
        } while (key != null);
        return changed;
    }

    /** Filters out swap files, backups and the half-written files editors leave behind. */
    private static boolean isSourceFile(String file) {
        if (file.startsWith(".") || file.endsWith("~") || file.endsWith(".swp")) {
            return false;
        }
        for (String suffix : WATCHED_SUFFIXES) {
            if (file.endsWith(suffix)) {
                return true;
            }
        }
        return false;
    }

    // ============================================================
    // 1 Python front-end
    // ============================================================
    private static ProgramNode runPythonFrontEnd(String path) throws Exception {
        banner("1- PYTHON / FLASK FRONT-END  (" + path + ")");

        String code = Files.readString(Paths.get(path));
        PythonLexer lexer = new PythonLexer(CharStreams.fromString(code));
        PythonParser parser = new PythonParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        int syntaxErrors = parser.getNumberOfSyntaxErrors();
        System.out.println("   parse errors : " + syntaxErrors);

        if (syntaxErrors > 0) {
            throw new SourceError(path + " has " + syntaxErrors + " syntax error(s)");
        }

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
    // 2 Python generation
    // ============================================================

    // Turns every @app.route into the pages it can serve
    private static List<RenderCall> buildRenderPlan(PythonContextGenerator generator,
                                                    ProgramNode pythonAst,
                                                    Map<String, Object> globals) {
        banner("2- CODE GENERATION - PYTHON SIDE");
        System.out.println("   module variables : " + globals.keySet());

        Map<String, List<Object>> parameterValues = new LinkedHashMap<>();
        Map<String, String> parameterCollections = new LinkedHashMap<>();
        for (String parameter : generator.routeParameterNames(pythonAst)) {
            ParameterSpace space = inferParameterSpace(parameter, globals);
            parameterValues.put(parameter, space.values());
            if (space.collection() != null) {
                parameterCollections.put(parameter, space.collection());
            }
            System.out.println("   URL parameter    : " + parameter
                    + " <- " + space.collection() + " " + space.values());
        }

        List<RenderCall> plan = generator.generateRenderCalls(
                pythonAst, globals, parameterValues, parameterCollections, PAGE_MODE);

        System.out.println("   render plan      : " + plan.size() + " page(s)");
        for (RenderCall call : plan) {
            System.out.println("      " + call.routePattern + "  ->  " + outputNameFor(call)
                    + "  context=" + call.context.keySet());
        }
        return plan;
    }

    /** Where a URL parameter's values come from: the collection, and the values. */
    private record ParameterSpace(String collection, List<Object> values) {}

    /**
     * Works out the values a URL parameter can take without naming any variable.
     * For &lt;int:product_id&gt; it takes the field after the last underscore ("id")
     * and looks for a module-level list whose items carry it, so the very same
     * code handles /user/&lt;int:user_id&gt; in a different application.
     */
    private static ParameterSpace inferParameterSpace(String parameter, Map<String, Object> globals) {
        String field = parameter.contains("_")
                ? parameter.substring(parameter.lastIndexOf('_') + 1)
                : parameter;
        for (Map.Entry<String, Object> entry : globals.entrySet()) {
            List<Object> values = PythonContextGenerator.fieldValues(entry.getValue(), field);
            if (!values.isEmpty()) {
                return new ParameterSpace(entry.getKey(), values);
            }
        }
        return new ParameterSpace(null, List.of());
    }

    /** Builds the URL rewriting rules from the plan, so links match the files emitted. */
    private static RouteMap buildRouteMap(List<RenderCall> plan) {
        RouteMap routes = new RouteMap();
        routes.setServerMode(serveMode);
        for (RenderCall call : plan) {
            // A collection page keeps its <parameters> so links become a query
            // string; a per-URL page registers the concrete URL it stands for.
            routes.register(concreteRoute(call), outputNameFor(call));
        }
        currentRoutes = routes;
        return routes;
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
    // 3 Jinja front-end
    // ============================================================

    private static Map<String, HtmlDocumentRuleNode> runJinjaFrontEnd(List<RenderCall> plan)
            throws Exception {
        banner("3- HTML / CSS / JINJA2 FRONT-END");

        Map<String, Set<String>> contextNames = new LinkedHashMap<>();
        for (RenderCall call : plan) {
            contextNames.computeIfAbsent(call.templateName, t -> new LinkedHashSet<>())
                    .addAll(call.context.keySet());
        }

        Map<String, HtmlDocumentRuleNode> asts = new LinkedHashMap<>();
        for (Map.Entry<String, Set<String>> entry : contextNames.entrySet()) {
            String templateName = entry.getKey();
            Path path = Paths.get(templatesDir, templateName);
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
            int syntaxErrors = parser.getNumberOfSyntaxErrors();
            System.out.println("   " + templateName + "  context=" + entry.getValue()
                    + "  parse errors=" + syntaxErrors);
            if (syntaxErrors > 0) {
                throw new SourceError(templateName + " has " + syntaxErrors + " syntax error(s)");
            }

            HtmlDocumentRuleNode ast = (HtmlDocumentRuleNode) builder.visit(tree);
            asts.put(templateName, ast);
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
    // 4 Jinja generation
    // ============================================================

    /** Renders every entry of the plan into output/, clearing stale pages first. */
    private static void generatePages(List<RenderCall> plan,
                                      Map<String, HtmlDocumentRuleNode> templateAsts)
            throws IOException {
        banner("4- CODE GENERATION - JINJA SIDE");
        cleanGeneratedPages(Paths.get(OUTPUT_DIR));
        RouteMap routes = buildRouteMap(plan);

        for (RenderCall call : plan) {
            HtmlDocumentRuleNode ast = templateAsts.get(call.templateName);
            if (ast == null) {
                continue;
            }
            HtmlGenerator generator = new HtmlGenerator(routes);
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
     * Chooses the output file for one render call.
     *
     * A collection page carries no arguments and keeps the template's own name.
     * Under PAGE_PER_URL the arguments are appended, so /product/1 lands in
     * product_details_1.html without any file name being hard-coded.
     */
    private static String outputNameFor(RenderCall call) {
        if (call.arguments.isEmpty()) {
            return call.templateName;
        }
        StringBuilder name = new StringBuilder(call.templateName.replaceFirst("\\.html?$", ""));
        for (Object value : call.arguments.values()) {
            name.append('_').append(value);
        }
        return name.append(".html").toString();
    }

    /** Fills a call's arguments into its route pattern: /product/&lt;int:id&gt; -> /product/1. */
    private static String concreteRoute(RenderCall call) {
        String pattern = call.routePattern;
        if (pattern == null) {
            return null;
        }
        for (Map.Entry<String, Object> argument : call.arguments.entrySet()) {
            pattern = pattern.replaceAll("<[^>]*\\b" + argument.getKey() + ">",
                    String.valueOf(argument.getValue()));
        }
        return pattern;
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
    // 5 Companion files
    // ============================================================

    /** Copies static/ and app.py into the output untouched, as the spec requires. */
    private static void copyCompanionFiles(String pythonInput) throws IOException {
        banner("5- COMPANION FILES");

        int assets = copyTree(Paths.get(assetsDir), Paths.get(OUTPUT_DIR, "static"));
        System.out.println("   static/ : " + assets + " file(s)");

        Path appSource = Paths.get(pythonInput);
        if (Files.exists(appSource)) {
            Path appTarget = Paths.get(OUTPUT_DIR, appSource.getFileName().toString());
            Files.createDirectories(appTarget.getParent());
            Files.copy(appSource, appTarget, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("   " + appTarget);
        }
    }

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
    //  Compiler reports
    // ============================================================

    private static void writeReports(ProgramNode pythonAst,
                                     Map<String, HtmlDocumentRuleNode> templateAsts)
            throws IOException {
        banner("6- COMPILER OUTPUT");
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

   
    private static void banner(String title) {
        System.out.println();
        System.out.println("============================================================");
        System.out.println("  " + title);
        System.out.println("============================================================");
    }
}
