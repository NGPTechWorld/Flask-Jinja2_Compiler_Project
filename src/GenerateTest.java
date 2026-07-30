import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.html_css_jinja2.generated.HtmlCssJinja2Lexer;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser;
import ast.html_css_jinja2.HtmlDocumentRuleNode;
import generator.HtmlGenerator;
import generator.runtime.DemoContext;
import generator.runtime.Scope;
import visitor.html_css_jinja2.ASTBuilderVisitor2;

public class GenerateTest {

    private static final String OUTPUT_DIR = "output";
    private static final String ASSETS_DIR = "src/testing/my_store/static";
    private static final String TEMPLATES_DIR = "src/testing/my_store/templates";

    public static void main(String[] args) throws Exception {
        // template name -> the context Flask hands it
        Map<String, Scope> renderPlan = new LinkedHashMap<>();
        renderPlan.put("products.html", DemoContext.forProducts());
        renderPlan.put("product_details.html", DemoContext.forProductDetails());
        renderPlan.put("add_product.html", DemoContext.empty());

        for (Map.Entry<String, Scope> entry : renderPlan.entrySet()) {
            generateOne(entry.getKey(), entry.getValue());
        }

        int assets = copyAssets(Paths.get(ASSETS_DIR), Paths.get(OUTPUT_DIR, "static"));
        System.out.println("\ncopied " + assets + " companion file(s) into output/static");
    }

    private static void generateOne(String templateName, Scope context) throws Exception {
        Path templatePath = Paths.get(TEMPLATES_DIR, templateName);
        System.out.println("\n=== " + templateName + " ===");

        String source = Files.readString(templatePath);
        HtmlCssJinja2Lexer lexer = new HtmlCssJinja2Lexer(CharStreams.fromString(source));
        HtmlCssJinja2Parser parser = new HtmlCssJinja2Parser(new CommonTokenStream(lexer));
        ParseTree tree = parser.htmlDocument();

        ASTBuilderVisitor2 builder = new ASTBuilderVisitor2();
        HtmlDocumentRuleNode ast = (HtmlDocumentRuleNode) builder.visit(tree);

        HtmlGenerator generator = new HtmlGenerator();
        String html = generator.generate(ast, context);

        Path outFile = Paths.get(OUTPUT_DIR, templateName);
        Files.createDirectories(outFile.getParent());
        Files.writeString(outFile, html);

        System.out.println("  -> " + outFile + "  (" + html.length() + " chars)");
        report("  log", generator.getLog());
        report("  warnings", generator.getWarnings());
    }


    private static void report(String title, List<String> lines) {
        System.out.println("\n--- " + title + " (" + lines.size() + ") ---");
        for (String line : lines) {
            System.out.println("   " + line);
        }
    }

    private static int copyAssets(Path from, Path to) throws IOException {
        if (!Files.isDirectory(from)) {
            System.out.println("    (no assets folder at " + from + ")");
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

}
