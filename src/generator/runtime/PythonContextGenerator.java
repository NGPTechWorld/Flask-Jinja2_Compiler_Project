package generator.runtime;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.Pair;

import ast.python_flask.BodyNode;
import ast.python_flask.ProgramNode;
import ast.python_flask.StatementNode;
import ast.python_flask.compound_statement.ClassDefintionNode;
import ast.python_flask.compound_statement.ForStatementNode;
import ast.python_flask.compound_statement.IfStatementNode;
import ast.python_flask.compound_statement.WhileStatementNode;
import ast.python_flask.compound_statement.function_defintion.DecoratorNode;
import ast.python_flask.compound_statement.function_defintion.FunctionDefNode;
import ast.python_flask.expressions_roles.ArgumentNode;
import ast.python_flask.expressions_roles.AtomExpressionNode;
import ast.python_flask.expressions_roles.BinaryExpressionNode;
import ast.python_flask.expressions_roles.ExpressionNode;
import ast.python_flask.expressions_roles.UnaryExpressionNode;
import ast.python_flask.expressions_roles.atom.DictAtomNode;
import ast.python_flask.expressions_roles.atom.ListAtomNode;
import ast.python_flask.expressions_roles.atom.LiteralAtomNode;
import ast.python_flask.expressions_roles.atom.ParenAtomNode;
import ast.python_flask.expressions_roles.literal.BooleanLiteralExpression;
import ast.python_flask.expressions_roles.literal.DoubleLiteralExpression;
import ast.python_flask.expressions_roles.literal.IdentifierExpression;
import ast.python_flask.expressions_roles.literal.IntLiteralExpression;
import ast.python_flask.expressions_roles.literal.NullLiteralExpression;
import ast.python_flask.expressions_roles.literal.StringLiteralExpression;
import ast.python_flask.expressions_roles.target.TargetNode;
import ast.python_flask.expressions_roles.target.VarTargetNode;
import ast.python_flask.expressions_roles.trailer.AttributeTrailerNode;
import ast.python_flask.expressions_roles.trailer.CallTrailerNode;
import ast.python_flask.expressions_roles.trailer.SubscriptTrailerNode;
import ast.python_flask.expressions_roles.trailer.TrailerNode;
import ast.python_flask.simple_statement.BreakStatementNode;
import ast.python_flask.simple_statement.ContinueStatementNode;
import ast.python_flask.simple_statement.ExpressionStatementNode;
import ast.python_flask.simple_statement.PassStatementNode;
import ast.python_flask.simple_statement.ReturnStatementNode;
import ast.python_flask.simple_statement.assignment_stat.AssignmentStatementNode;

/**
 * Code-generation phase, Python side.
 *
 * Produces, for every page the application can serve, the data that page is
 * rendered with. It works in three layers:
 *
 *   1. an expression evaluator  - turns an expression node into a Java value
 *   2. a statement executor     - runs a route function body (if / for / return)
 *   3. a route enumerator       - reads @app.route and unrolls its URL parameters
 *
 * Layer 2 is what makes function-local variables work. A route such as
 *
 *     @app.route('/product/&lt;int:product_id&gt;')
 *     def product_details(product_id):
 *         product = None
 *         for p in products: ...
 *         return render_template('product_details.html', product=product)
 *
 * has no single answer: `product` depends on the URL. So the function is
 * executed once per possible product_id, and each execution yields one
 * {@link RenderCall} - that is, one generated page.
 *
 * The symbol table is deliberately unused: it stores types, and generation
 * needs values.
 */
public class PythonContextGenerator {

    public static final class RenderCall {
        public final String templateName;
        public final Map<String, Object> context;
        public final Map<String, Object> arguments;
        public final int line;

        /** The @app.route pattern this page came from; null for a bare call. */
        public String routePattern;

        RenderCall(String templateName, Map<String, Object> context,
                   Map<String, Object> arguments, int line) {
            this.templateName = templateName;
            this.context = context;
            this.arguments = arguments;
            this.line = line;
        }

        /** Wraps the context in the Scope the HTML generator consumes. */
        public Scope toScope() {
            Scope scope = new Scope();
            context.forEach(scope::set);
            return scope;
        }

        @Override
        public String toString() {
            return templateName + " (line " + line + ") args=" + arguments + " ctx=" + context.keySet();
        }
    }

    /** How a statement finished: normally, or by jumping out of its block. */
    private enum Flow { NORMAL, BREAK, CONTINUE, RETURN }

    /** A statement's outcome; RETURN carries the expression being returned. */
    private record Signal(Flow flow, ExpressionNode returned) {

        static final Signal NORMAL = new Signal(Flow.NORMAL, null);
        static final Signal BREAK = new Signal(Flow.BREAK, null);
        static final Signal CONTINUE = new Signal(Flow.CONTINUE, null);

        static Signal returning(ExpressionNode expression) {
            return new Signal(Flow.RETURN, expression);
        }
    }

    /** Stops a runaway while-loop from hanging the compiler. */
    private static final int LOOP_LIMIT = 10_000;

    private final List<String> logLines = new ArrayList<>();

    // ============================================================
    // Logging
    // ============================================================

    /** Records one line for compiler_output/generation_log.txt. */
    private void log(String message) {
        logLines.add(message);
    }

    /** Exposes the log so the driver can merge it with the Jinja side. */
    public List<String> getLog() {
        return logLines;
    }

    /** Writes the collected log to disk, creating the folder if needed. */
    public void flushLog(Path path) throws IOException {
        if (path.getParent() != null) {
            Files.createDirectories(path.getParent());
        }
        Files.write(path, logLines);
    }

    // ============================================================
    // 1) Module-level context
    // ============================================================

    /** Evaluates every top-level assignment in app.py into name -> value. */
    public Map<String, Object> buildGlobalContext(ProgramNode program) {
        Map<String, Object> globals = new LinkedHashMap<>();
        log("[GEN] building the module context from the Python AST");

        for (StatementNode statement : program.statements) {
            if (statement instanceof AssignmentStatementNode assignment) {
                evaluateAssignment(assignment, globals);
            }
        }

        log("[GEN] module context ready: " + globals.keySet());
        return globals;
    }

    /** Binds each simple target of one assignment to its evaluated value. */
    private void evaluateAssignment(AssignmentStatementNode assignment, Map<String, Object> scope) {
        for (int i = 0; i < assignment.targets.size(); i++) {
            TargetNode target = assignment.targets.get(i);
            // Attribute and subscript targets mutate an existing object; the
            // static evaluator does not model that.
            if (!(target instanceof VarTargetNode variable)) {
                continue;
            }
            scope.put(variable.attribute.name, evaluate(valueFor(assignment, i), scope));
        }
    }

    /** Picks the right-hand expression that belongs to target number {@code i}. */
    private ExpressionNode valueFor(AssignmentStatementNode assignment, int i) {
        if (assignment.targets.size() == assignment.values.size()) {
            return assignment.values.get(i);          // a, b = 1, 2
        }
        if (assignment.values.size() == 1) {
            return assignment.values.get(0);          // a = b = 1
        }
        return null;
    }

    // ============================================================
    // 2) Expression evaluator
    // ============================================================

    /** Turns any Python expression node into a real Java value. */
    public Object evaluate(ExpressionNode expression, Map<String, Object> scope) {
        if (expression == null) {
            return null;
        }
        if (expression instanceof LiteralAtomNode literal) {
            return evaluateLiteral(literal, scope);
        }
        if (expression instanceof ListAtomNode list) {
            return evaluateList(list, scope);
        }
        if (expression instanceof DictAtomNode dict) {
            return evaluateDict(dict, scope);
        }
        if (expression instanceof ParenAtomNode paren) {
            return evaluateParen(paren, scope);
        }
        if (expression instanceof AtomExpressionNode atom) {
            return evaluateAtom(atom, scope);
        }
        // Every operator node shares left/operator/right, so one branch covers
        // arithmetic, comparison, logic and identity alike.
        if (expression instanceof BinaryExpressionNode binary) {
            return evaluateBinary(binary, scope);
        }
        if (expression instanceof UnaryExpressionNode unary) {
            return evaluateUnary(unary, scope);
        }
        log("[GEN][WARN] unsupported expression " + expression.getClass().getSimpleName());
        return null;
    }

    /** Resolves a literal, or looks a bare identifier up in the scope. */
    private Object evaluateLiteral(LiteralAtomNode node, Map<String, Object> scope) {
        if (node.literal instanceof IdentifierExpression id) {
            return scope.get(id.name);
        }
        if (node.literal instanceof IntLiteralExpression i) {
            return i.value;
        }
        if (node.literal instanceof DoubleLiteralExpression d) {
            return d.value;
        }
        if (node.literal instanceof StringLiteralExpression s) {
            return s.value;
        }
        if (node.literal instanceof BooleanLiteralExpression b) {
            return b.value;
        }
        if (node.literal instanceof NullLiteralExpression) {
            return null;
        }
        return null;
    }

    /** Builds a Java List from a Python list literal. */
    private List<Object> evaluateList(ListAtomNode node, Map<String, Object> scope) {
        List<Object> values = new ArrayList<>();
        for (ExpressionNode element : node.elements) {
            values.add(evaluate(element, scope));
        }
        return values;
    }

    /** Builds a Java Map from a Python dict literal, preserving key order. */
    private Map<Object, Object> evaluateDict(DictAtomNode node, Map<String, Object> scope) {
        Map<Object, Object> entries = new LinkedHashMap<>();
        for (Pair<ExpressionNode, ExpressionNode> entry : node.entries) {
            entries.put(evaluate(entry.a, scope), evaluate(entry.b, scope));
        }
        return entries;
    }

    /** Unwraps (expr), or turns (a, b, c) into a list. */
    private Object evaluateParen(ParenAtomNode node, Map<String, Object> scope) {
        if (node.expressions.isEmpty()) {
            return null;
        }
        if (node.expressions.size() == 1) {
            return evaluate(node.expressions.get(0), scope);
        }
        List<Object> tuple = new ArrayList<>();
        for (ExpressionNode element : node.expressions) {
            tuple.add(evaluate(element, scope));
        }
        return tuple;
    }

    /** Walks identifier + trailers: products, product.name, products[0], f(). */
    private Object evaluateAtom(AtomExpressionNode node, Map<String, Object> scope) {
        if (node.atom != null) {
            return evaluate(node.atom, scope);
        }
        Object current = scope.get(node.identifier.name);

        for (TrailerNode trailer : node.trailers) {
            if (trailer instanceof AttributeTrailerNode attribute) {
                current = (current instanceof Map<?, ?> map)
                        ? map.get(attribute.attribute.name)
                        : null;
            } else if (trailer instanceof SubscriptTrailerNode subscript) {
                current = subscriptOf(current, evaluate(subscript.exp, scope));
            } else if (trailer instanceof CallTrailerNode) {
                // Calling a function would mean executing it; not modelled here.
                current = null;
            }
        }
        return current;
    }

    /** Applies one [index] step to a list or a dict. */
    private Object subscriptOf(Object base, Object index) {
        if (base instanceof List<?> list && index instanceof Integer i) {
            return (i >= 0 && i < list.size()) ? list.get(i) : null;
        }
        if (base instanceof Map<?, ?> map) {
            return map.get(index);
        }
        return null;
    }

    /** Evaluates every binary operator; they all share left/operator/right. */
    private Object evaluateBinary(BinaryExpressionNode node, Map<String, Object> scope) {
        String operator = node.operator == null ? "" : node.operator.trim();

        // Short-circuit before touching the right-hand side, like Python.
        if (operator.equals("and")) {
            Object left = evaluate(node.left, scope);
            return truthy(left) ? evaluate(node.right, scope) : left;
        }
        if (operator.equals("or")) {
            Object left = evaluate(node.left, scope);
            return truthy(left) ? left : evaluate(node.right, scope);
        }

        Object left = evaluate(node.left, scope);
        Object right = evaluate(node.right, scope);

        switch (operator) {
            case "==": case "is":     return equalValues(left, right);
            case "!=": case "is not": return !equalValues(left, right);
            case "<":  return compare(left, right) < 0;
            case "<=": return compare(left, right) <= 0;
            case ">":  return compare(left, right) > 0;
            case ">=": return compare(left, right) >= 0;
            case "in":     return contains(right, left);
            case "not in": return !contains(right, left);
            default:       return arithmetic(left, operator, right);
        }
    }

    /** Evaluates not x, -x and +x. */
    private Object evaluateUnary(UnaryExpressionNode node, Map<String, Object> scope) {
        Object value = evaluate(node.expr, scope);
        String operator = node.operator == null ? "" : node.operator.trim();

        if (operator.equals("not")) {
            return !truthy(value);
        }
        if (operator.equals("-")) {
            Double number = toNumber(value);
            return number == null ? null : narrow(-number, value instanceof Integer);
        }
        return value;
    }

    /** Evaluates +, -, *, /, % and ** on two numbers, plus string +. */
    private Object arithmetic(Object left, String operator, Object right) {
        if (operator.equals("+") && (left instanceof String || right instanceof String)) {
            return String.valueOf(left) + String.valueOf(right);
        }
        Double a = toNumber(left);
        Double b = toNumber(right);
        if (a == null || b == null) {
            return null;
        }
        boolean bothInt = left instanceof Integer && right instanceof Integer;

        switch (operator) {
            case "+":  return narrow(a + b, bothInt);
            case "-":  return narrow(a - b, bothInt);
            case "*":  return narrow(a * b, bothInt);
            case "%":  return b == 0 ? null : narrow(a % b, bothInt);
            case "**": return narrow(Math.pow(a, b), bothInt);
            case "/":  return b == 0 ? null : a / b;   // Python's '/' is always a float
            default:   return null;
        }
    }

    /** Orders two numbers, or two strings; anything else compares as equal. */
    private int compare(Object left, Object right) {
        Double a = toNumber(left);
        Double b = toNumber(right);
        if (a != null && b != null) {
            return Double.compare(a, b);
        }
        if (left instanceof String x && right instanceof String y) {
            return x.compareTo(y);
        }
        return 0;
    }

    /** Equality that treats 1 and 1.0 as equal, like Python. */
    private boolean equalValues(Object left, Object right) {
        if (left == null || right == null) {
            return left == right;
        }
        Double a = toNumber(left);
        Double b = toNumber(right);
        if (a != null && b != null) {
            return a.doubleValue() == b.doubleValue();
        }
        return left.equals(right);
    }

    /** Implements the `in` operator over lists, dicts and strings. */
    private boolean contains(Object container, Object needle) {
        if (container instanceof List<?> list) {
            for (Object item : list) {
                if (equalValues(item, needle)) {
                    return true;
                }
            }
            return false;
        }
        if (container instanceof Map<?, ?> map) {
            return map.containsKey(needle);
        }
        if (container instanceof String text) {
            return text.contains(String.valueOf(needle));
        }
        return false;
    }

    /** Python truthiness: None, zero and empty containers are false. */
    private boolean truthy(Object value) {
        if (value == null)                return false;
        if (value instanceof Boolean b)   return b;
        if (value instanceof Number n)    return n.doubleValue() != 0;
        if (value instanceof String s)    return !s.isEmpty();
        if (value instanceof List<?> l)   return !l.isEmpty();
        if (value instanceof Map<?, ?> m) return !m.isEmpty();
        return true;
    }

    /** Reads any value as a number, or null when it is not numeric. */
    private Double toNumber(Object value) {
        if (value instanceof Number n)  return n.doubleValue();
        if (value instanceof Boolean b) return b ? 1.0 : 0.0;
        return null;
    }

    /** Keeps integer maths integral so a price prints as 450, not 450.0. */
    private Object narrow(double result, boolean preferInteger) {
        if (preferInteger && result == Math.floor(result) && !Double.isInfinite(result)) {
            return (int) result;
        }
        return result;
    }

    // ============================================================
    // 3) Statement executor
    // ============================================================

    /** Runs a block, stopping as soon as a statement jumps out of it. */
    private Signal execute(BodyNode body, Map<String, Object> scope) {
        if (body == null) {
            return Signal.NORMAL;
        }
        for (StatementNode statement : body.statements) {
            Signal signal = execute(statement, scope);
            if (signal.flow() != Flow.NORMAL) {
                return signal;                  // propagate break/continue/return upwards
            }
        }
        return Signal.NORMAL;
    }

    /** Runs one statement against the local scope. */
    private Signal execute(StatementNode statement, Map<String, Object> scope) {
        if (statement instanceof AssignmentStatementNode assignment) {
            evaluateAssignment(assignment, scope);
            return Signal.NORMAL;
        }
        if (statement instanceof IfStatementNode branch) {
            return executeIf(branch, scope);
        }
        if (statement instanceof ForStatementNode loop) {
            return executeFor(loop, scope);
        }
        if (statement instanceof WhileStatementNode loop) {
            return executeWhile(loop, scope);
        }
        if (statement instanceof ReturnStatementNode returned) {
            return Signal.returning(returned.expressions.isEmpty()
                    ? null
                    : returned.expressions.get(0));
        }
        if (statement instanceof BreakStatementNode) {
            return Signal.BREAK;
        }
        if (statement instanceof ContinueStatementNode) {
            return Signal.CONTINUE;
        }
        // pass, imports, global, and calls made only for their side effects
        if (statement instanceof PassStatementNode || statement instanceof ExpressionStatementNode) {
            return Signal.NORMAL;
        }
        return Signal.NORMAL;
    }

    /** Runs the first branch whose condition holds, else the else-branch. */
    private Signal executeIf(IfStatementNode branch, Map<String, Object> scope) {
        if (truthy(evaluate(branch.ifCondition, scope))) {
            return execute(branch.bodyIf, scope);
        }
        for (Pair<ExpressionNode, BodyNode> elseIf : branch.elseIfStat) {
            if (truthy(evaluate(elseIf.a, scope))) {
                return execute(elseIf.b, scope);
            }
        }
        return execute(branch.bodyElse, scope);
    }

    /** Runs `for x in items`, honouring break, continue and return. */
    private Signal executeFor(ForStatementNode loop, Map<String, Object> scope) {
        if (loop.iterables.isEmpty() || loop.targets.isEmpty()) {
            return Signal.NORMAL;
        }
        if (!(evaluate(loop.iterables.get(0), scope) instanceof List<?> items)) {
            return Signal.NORMAL;
        }
        if (!(loop.targets.get(0) instanceof VarTargetNode target)) {
            return Signal.NORMAL;
        }
        for (Object item : items) {
            // Python leaves the loop variable behind after the loop; so do we.
            scope.put(target.attribute.name, item);
            Signal signal = execute(loop.body, scope);
            if (signal.flow() == Flow.BREAK) {
                break;
            }
            if (signal.flow() == Flow.RETURN) {
                return signal;
            }
        }
        return Signal.NORMAL;
    }

    /** Runs a while-loop under a hard iteration cap so generation cannot hang. */
    private Signal executeWhile(WhileStatementNode loop, Map<String, Object> scope) {
        int rounds = 0;
        while (truthy(evaluate(loop.iterable, scope))) {
            if (++rounds > LOOP_LIMIT) {
                log("[GEN][WARN] line " + loop.line + ": while loop cut off after "
                        + LOOP_LIMIT + " iterations");
                break;
            }
            Signal signal = execute(loop.body, scope);
            if (signal.flow() == Flow.BREAK) {
                break;
            }
            if (signal.flow() == Flow.RETURN) {
                return signal;
            }
        }
        return Signal.NORMAL;
    }

    // ============================================================
    // 4) Routes: reading @app.route and unrolling its parameters
    // ============================================================

    /** How a route that carries URL parameters turns into generated files. */
    public enum PageMode {
        /** One file per reachable URL: /product/1 becomes product_1.html. */
        PAGE_PER_URL,
        /**
         * One file for the whole route, carrying the entire collection. The
         * page selects its record at run time from the query string, so the
         * number of generated files does not grow with the data.
         */
        ONE_PAGE_WITH_COLLECTION
    }

    /** Every URL parameter name used by any @app.route in the program. */
    public List<String> routeParameterNames(ProgramNode program) {
        List<String> names = new ArrayList<>();
        for (StatementNode statement : program.statements) {
            if (!(statement instanceof FunctionDefNode function)) {
                continue;
            }
            String pattern = routePatternOf(function);
            if (pattern == null) {
                continue;
            }
            for (String parameter : routeParameters(pattern)) {
                if (!names.contains(parameter)) {
                    names.add(parameter);
                }
            }
        }
        return names;
    }

    /** Produces one RenderCall per page, unrolling parameterised routes. */
    public List<RenderCall> generateRenderCalls(ProgramNode program,
                                                Map<String, Object> globals,
                                                Map<String, List<Object>> parameterValues) {
        return generateRenderCalls(program, globals, parameterValues, Map.of(), PageMode.PAGE_PER_URL);
    }

    /**
     * Produces the pages the application can serve.
     *
     * {@code parameterValues} supplies the values a URL parameter can take, and
     * {@code parameterCollections} names the collection those values came from,
     * which is what a collection page is handed instead of a single record.
     */
    public List<RenderCall> generateRenderCalls(ProgramNode program,
                                                Map<String, Object> globals,
                                                Map<String, List<Object>> parameterValues,
                                                Map<String, String> parameterCollections,
                                                PageMode mode) {
        List<RenderCall> calls = new ArrayList<>();

        for (StatementNode statement : program.statements) {
            if (!(statement instanceof FunctionDefNode function)) {
                continue;
            }
            String pattern = routePatternOf(function);
            if (pattern == null) {
                continue;                       // a plain helper, not a route
            }
            List<String> parameters = routeParameters(pattern);
            log("[GEN] route " + pattern + " -> " + function.nameFun.name
                    + (parameters.isEmpty() ? "" : " " + parameters));

            if (!parameters.isEmpty() && mode == PageMode.ONE_PAGE_WITH_COLLECTION) {
                RenderCall call = collectionPage(function, pattern, parameters.get(0),
                        parameterValues, parameterCollections, globals);
                if (call != null) {
                    calls.add(call);
                    log("[GEN]   " + call);
                }
                continue;
            }

            for (Map<String, Object> arguments : argumentCombinations(parameters, parameterValues)) {
                RenderCall call = callRoute(function, arguments, globals);
                if (call != null) {
                    call.routePattern = pattern;
                    calls.add(call);
                    log("[GEN]   " + call);
                }
            }
        }
        log("[GEN] " + calls.size() + " page(s) to render");
        return calls;
    }

    /**
     * Builds the single page that stands for a whole parameterised route.
     *
     * The route is executed once, only to learn which template it renders; the
     * page is then handed the entire collection rather than one record, and the
     * record is chosen in the browser from the query string.
     */
    private RenderCall collectionPage(FunctionDefNode function, String pattern, String parameter,
                                      Map<String, List<Object>> parameterValues,
                                      Map<String, String> parameterCollections,
                                      Map<String, Object> globals) {
        List<Object> values = parameterValues.get(parameter);
        if (values == null || values.isEmpty()) {
            log("[GEN][WARN] no values for URL parameter '" + parameter
                    + "', route " + pattern + " produces no page");
            return null;
        }
        RenderCall probe = callRoute(function, Map.of(parameter, values.get(0)), globals);
        if (probe == null) {
            return null;                        // a redirect, not a rendered page
        }

        Map<String, Object> context = new LinkedHashMap<>();
        String collection = parameterCollections.get(parameter);
        if (collection != null && globals.containsKey(collection)) {
            context.put(collection, globals.get(collection));
        } else {
            log("[GEN][WARN] no collection is known for '" + parameter
                    + "', the page is generated without data");
        }

        RenderCall call = new RenderCall(probe.templateName, context, Map.of(), probe.line);
        call.routePattern = pattern;
        return call;
    }

    /** Executes one route function with given arguments and returns its render call. */
    public RenderCall callRoute(FunctionDefNode function,
                                Map<String, Object> arguments,
                                Map<String, Object> globals) {
        // Module variables are visible inside the function, then the URL
        // arguments shadow them. Writes stay local, which is enough here
        // because generation only reads.
        Map<String, Object> local = new LinkedHashMap<>(globals);
        local.putAll(arguments);

        Signal signal = execute(function.body, local);
        if (signal.flow() != Flow.RETURN || signal.returned() == null) {
            return null;                        // a redirect, or no return at all
        }
        // The context is read from the LOCAL scope, which is what makes
        // function-local variables such as `product` resolve.
        return renderCallOf(signal.returned(), local, arguments);
    }

    /** Reads @app.route('/product/&lt;int:product_id&gt;') and returns the URL pattern. */
    private String routePatternOf(FunctionDefNode function) {
        for (DecoratorNode decorator : function.decorators) {
            if (decorator.path.isEmpty() || decorator.arguments == null) {
                continue;
            }
            String name = decorator.path.get(decorator.path.size() - 1).name;
            if (!name.equals("route")) {
                continue;
            }
            for (ArgumentNode argument : decorator.arguments) {
                if (argument.nameArg == null
                        && evaluate(argument.value, Map.of()) instanceof String pattern) {
                    return pattern;
                }
            }
        }
        return null;
    }

    /** Extracts parameter names from a pattern: /product/&lt;int:product_id&gt; -> [product_id]. */
    private List<String> routeParameters(String pattern) {
        List<String> names = new ArrayList<>();
        int i = 0;
        while (true) {
            int open = pattern.indexOf('<', i);
            if (open < 0) {
                return names;
            }
            int close = pattern.indexOf('>', open);
            if (close < 0) {
                return names;
            }
            String token = pattern.substring(open + 1, close);
            int colon = token.indexOf(':');                 // drop the converter
            names.add(colon >= 0 ? token.substring(colon + 1) : token);
            i = close + 1;
        }
    }

    /** Expands the parameter space into one argument map per reachable URL. */
    private List<Map<String, Object>> argumentCombinations(List<String> parameters,
                                                           Map<String, List<Object>> parameterValues) {
        List<Map<String, Object>> combinations = new ArrayList<>();
        combinations.add(new LinkedHashMap<>());            // the no-parameter route

        for (String parameter : parameters) {
            List<Object> values = parameterValues.get(parameter);
            if (values == null || values.isEmpty()) {
                log("[GEN][WARN] no values supplied for URL parameter '" + parameter
                        + "', its pages are skipped");
                return List.of();
            }
            List<Map<String, Object>> expanded = new ArrayList<>();
            for (Map<String, Object> base : combinations) {
                for (Object value : values) {
                    Map<String, Object> next = new LinkedHashMap<>(base);
                    next.put(parameter, value);
                    expanded.add(next);
                }
            }
            combinations = expanded;
        }
        return combinations;
    }

    // ============================================================
    // 5) Recognising render_template(...)
    // ============================================================

    /** Collects every render_template(...) reachable without executing routes. */
    public List<RenderCall> findRenderTemplateCalls(ProgramNode program, Map<String, Object> globals) {
        List<RenderCall> calls = new ArrayList<>();
        for (StatementNode statement : program.statements) {
            walkStatement(statement, globals, calls);
        }
        return calls;
    }

    /** Descends into any statement that can hold a render_template call. */
    private void walkStatement(StatementNode statement, Map<String, Object> globals, List<RenderCall> calls) {
        if (statement instanceof FunctionDefNode function) {
            walkBody(function.body, globals, calls);
        } else if (statement instanceof IfStatementNode branch) {
            walkBody(branch.bodyIf, globals, calls);
            for (Pair<ExpressionNode, BodyNode> elseIf : branch.elseIfStat) {
                walkBody(elseIf.b, globals, calls);
            }
            walkBody(branch.bodyElse, globals, calls);
        } else if (statement instanceof ForStatementNode loop) {
            walkBody(loop.body, globals, calls);
        } else if (statement instanceof WhileStatementNode loop) {
            walkBody(loop.body, globals, calls);
        } else if (statement instanceof ClassDefintionNode definition) {
            walkBody(definition.body, globals, calls);
        } else if (statement instanceof ExpressionStatementNode expressions) {
            for (ExpressionNode expression : expressions.expressions) {
                addIfRenderCall(expression, globals, calls);
            }
        } else if (statement instanceof ReturnStatementNode returned) {
            for (ExpressionNode expression : returned.expressions) {
                addIfRenderCall(expression, globals, calls);
            }
        }
    }

    /** Walks every statement of a nested body. */
    private void walkBody(BodyNode body, Map<String, Object> globals, List<RenderCall> calls) {
        if (body == null) {
            return;
        }
        for (StatementNode statement : body.statements) {
            walkStatement(statement, globals, calls);
        }
    }

    /** Appends the expression's render call to the list, when it is one. */
    private void addIfRenderCall(ExpressionNode expression, Map<String, Object> scope, List<RenderCall> calls) {
        RenderCall call = renderCallOf(expression, scope, Map.of());
        if (call != null) {
            calls.add(call);
        }
    }

    /** Turns render_template(name, key=value, ...) into a RenderCall, or null. */
    private RenderCall renderCallOf(ExpressionNode expression,
                                    Map<String, Object> scope,
                                    Map<String, Object> arguments) {
        if (!(expression instanceof AtomExpressionNode atom)
                || atom.identifier == null
                || !"render_template".equals(atom.identifier.name)) {
            return null;
        }

        for (TrailerNode trailer : atom.trailers) {
            if (!(trailer instanceof CallTrailerNode call)) {
                continue;
            }
            String templateName = null;
            Map<String, Object> context = new LinkedHashMap<>();
            boolean first = true;

            for (ExpressionNode argumentNode : call.arguments) {
                if (!(argumentNode instanceof ArgumentNode argument)) {
                    continue;
                }
                if (first && argument.nameArg == null) {
                    // The first positional argument is the template name.
                    if (evaluate(argument.value, scope) instanceof String name) {
                        templateName = name;
                    }
                } else if (argument.nameArg != null) {
                    // products=products becomes one context entry.
                    Object value = evaluate(argument.value, scope);
                    context.put(argument.nameArg.name, value);
                    if (value == null) {
                        log("[GEN][WARN] line " + atom.line + ": context entry '"
                                + argument.nameArg.name + "' evaluated to null");
                    }
                }
                first = false;
            }

            if (templateName != null) {
                return new RenderCall(templateName, context, arguments, atom.line);
            }
        }
        return null;
    }

    // ============================================================
    // Helper for the driver
    // ============================================================

    /**
     * Collects one field from every item of a list, e.g. the ids of products.
     * Used to fill the URL parameter space handed to
     * {@link #generateRenderCalls}.
     */
    public static List<Object> fieldValues(Object collection, String field) {
        List<Object> values = new ArrayList<>();
        if (collection instanceof List<?> items) {
            for (Object item : items) {
                if (item instanceof Map<?, ?> map && map.containsKey(field)) {
                    values.add(map.get(field));
                }
            }
        }
        return values;
    }
}
