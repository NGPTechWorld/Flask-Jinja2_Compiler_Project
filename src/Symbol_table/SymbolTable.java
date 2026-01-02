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

    public Symbol resolve(String name) {
        for (Scope scope : draft_scopes) {
            Symbol s = scope.resolve(name);
            if (s != null) return s;
        }
        return null;
    }

    public void printTable() {
        List<Scope> reversedScopes = new ArrayList<>(scopes);
        Collections.reverse(reversedScopes);
        
        for (Scope scope : reversedScopes) {
            scope.printSymbols();
        }
    }
}

