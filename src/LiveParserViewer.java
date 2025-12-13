import antlr.python_flask.generated.PythonLexer;
import antlr.python_flask.generated.PythonParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class LiveParserViewer extends JFrame {

    private final JTextArea codeArea = new JTextArea();
    private final JPanel treePanel = new JPanel(new BorderLayout());
    private final JScrollPane treeScroll = new JScrollPane();

    private Timer debounceTimer = new Timer(true);

    public LiveParserViewer() {
        setTitle("Live Python Parser Viewer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(450);

        // ---- Code editor ----
        codeArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        JScrollPane codeScroll = new JScrollPane(codeArea);

        // ---- Tree panel ----
        treeScroll.setViewportView(treePanel);

        splitPane.setLeftComponent(codeScroll);
        splitPane.setRightComponent(treeScroll);

        add(splitPane);

        // ---- Listener with debounce ----
        codeArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override public void insertUpdate(DocumentEvent e) { scheduleParse(); }
            @Override public void removeUpdate(DocumentEvent e) { scheduleParse(); }
            @Override public void changedUpdate(DocumentEvent e) {}
        });
    }

    private void scheduleParse() {
        debounceTimer.cancel();
        debounceTimer = new Timer(true);

        debounceTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                parseInBackground();
            }
        }, 300); // ⏱️ 300ms debounce
    }

    private void parseInBackground() {
        String code = codeArea.getText();

        SwingWorker<TreeViewer, Void> worker = new SwingWorker<>() {
            @Override
            protected TreeViewer doInBackground() {
                try {
                    CharStream input = CharStreams.fromString(code);
                    PythonLexer lexer = new PythonLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    PythonParser parser = new PythonParser(tokens);

                    parser.removeErrorListeners();
                    lexer.removeErrorListeners();

                    ParseTree tree = parser.program();
                    return new TreeViewer(
                            Arrays.asList(parser.getRuleNames()),
                            tree
                    );
                } catch (Exception e) {
                    return null;
                }
            }

            @Override
            protected void done() {
                try {
                    TreeViewer viewer = get();
                    treePanel.removeAll();

                    if (viewer != null) {
                        viewer.setScale(1.0);
                        treePanel.add(viewer, BorderLayout.CENTER);
                    }

                    treePanel.revalidate();
                    treePanel.repaint();
                } catch (Exception ignored) {}
            }
        };

        worker.execute();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LiveParserViewer viewer = new LiveParserViewer();
            viewer.setVisible(true);
        });
    }
}
