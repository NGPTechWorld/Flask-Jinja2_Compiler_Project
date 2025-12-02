package antlr.python_flask;

import org.antlr.v4.runtime.*;

import antlr.python_flask.gen.PythonLexer;

import java.util.*;

public class IndentationHelper {

    private final Stack<Integer> indents = new Stack<>();
    private final LinkedList<Token> pending = new LinkedList<>();

    public IndentationHelper() {
        indents.push(0); // base indentation
    }

    public LinkedList<Token> getPendingTokens() {
        return pending;
    }

    // Create a synthetic token
    private CommonToken t(Lexer lexer, int type, String text) {
        CommonToken token = new CommonToken(type, text);
        token.setLine(lexer.getLine());
        token.setCharPositionInLine(lexer.getCharPositionInLine());
        return token;
    }

    // Called when NEWLINE rule matches
    public void handleNewline(PythonLexer lexer) {
        pending.add(t(lexer, PythonLexer.NEWLINE, "NEWLINE"));

        int spaces = 0;
        int i = 1;

        // Lookahead to count indentation
        while (true) {
            int c = lexer._input.LA(i);

            if (c == ' ')
                spaces++;
            else if (c == '\t')
                spaces += 4;
            else if (c == '\n' || c == '\r') {
                i++;
                continue;
            }
            else if (c == '#') {
                spaces = 0;
                break;
            }
            else
                break;

            i++;
        }

        int previous = indents.peek();
        int current = spaces;

        if (current > previous) {
            indents.push(current);
            pending.add(t(lexer, PythonLexer.INDENT, "INDENT"));
        }
        else if (current < previous) {
            while (current < indents.peek()) {
                indents.pop();
                pending.add(t(lexer, PythonLexer.DEDENT, "DEDENT"));
            }
        }
    }

    // Fill missing DEDENTs at EOF
    public Token handleEOF(CommonToken eof, PythonLexer lexer) {
        while (indents.peek() > 0) {
            indents.pop();
            pending.add(t(lexer, PythonLexer.DEDENT, "DEDENT"));
        }
        pending.add(eof);
        return pending.poll();
    }
}
