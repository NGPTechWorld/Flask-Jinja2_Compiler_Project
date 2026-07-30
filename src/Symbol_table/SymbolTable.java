package Symbol_table;
import java.util.*;


public class SymbolTable {
    private Deque<Scope> draft_scopes = new ArrayDeque<>();
    private Deque<Scope> scopes = new ArrayDeque<>();

    public void pushScope(String name) {
        draft_scopes.push(new Scope(name));
     }

    public void popScope() { 
        scopes.push(draft_scopes.pop());
    }

    public void define(Symbol symbol) { 
        draft_scopes.peek().define(symbol); 
    }

    public void define_global(Symbol symbol) {
        for (Scope scope : draft_scopes) {
            if("global".equals(scope.get_name())) {
                scope.define(symbol);
                return;
            }
        }
    }

    public Symbol resolve(String name) {
        for (Scope scope : draft_scopes) {
            Symbol s = scope.resolve(name);
            if (s != null) return s;
        }
        return null;
    }

    public boolean existsInCurrentScope(String name) {
        Scope top = draft_scopes.peek();
        return top != null && top.resolve(name) != null;
    }

    /** Every closed scope rendered as text, outermost first. */
    public List<String> toLines() {
        List<Scope> reversedScopes = new ArrayList<>(scopes);
        Collections.reverse(reversedScopes);

        List<String> lines = new ArrayList<>();
        for (Scope scope : reversedScopes) {
            lines.addAll(scope.toLines());
        }
        return lines;
    }

    public void printTable() {
        for (String line : toLines()) {
            System.out.println(line);
        }
    }
}

