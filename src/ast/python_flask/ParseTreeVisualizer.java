package ast.python_flask;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import antlr.python_flask.generated.PythonLexer;
import antlr.python_flask.generated.PythonParser;

import javax.swing.*;

public class ParseTreeVisualizer {

    public static void run() throws Exception {

        // مثال: تقدر تغير السطر ليقرأ من ملف أو من TextField GUI
        String code = """
            if 1:
                x = 10
                y = 20
                if 5:
                    z = 30
        """;

        PythonLexer lexer = new PythonLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);

        // start rule
        ParseTree tree = parser.program();

        // عرض الشجرة كنافذة Swing
        JFrame frame = new JFrame("Parse Tree");
        JPanel panel = new JPanel();
        panel.add(new JLabel(tree.toStringTree(parser)));

        frame.add(panel);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
