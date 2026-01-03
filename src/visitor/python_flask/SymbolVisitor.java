package visitor.python_flask;

import java.util.ArrayList;

import javax.management.OperationsException;

import org.antlr.v4.runtime.atn.ATN;

import Symbol_table.Symbol;
import Symbol_table.SymbolTable;
import Symbol_table.Scope;
import antlr.python_flask.generated.PythonParserBaseVisitor;
import antlr.python_flask.generated.PythonParser.DoubleLiteralContext;
import ast.BaseNode;
import ast.python_flask.BodyNode;
import ast.python_flask.ProgramNode;
import ast.python_flask.StatementNode;
import ast.python_flask.expressions_roles.*;
import ast.python_flask.expressions_roles.atom.*;
import ast.python_flask.expressions_roles.trailer.*;
import ast.python_flask.compound_statement.ClassDefintionNode;
import ast.python_flask.compound_statement.ForStatementNode;
import ast.python_flask.compound_statement.IfStatementNode;
import ast.python_flask.compound_statement.WhileStatementNode;
import ast.python_flask.compound_statement.function_defintion.DecoratorNode;
import ast.python_flask.compound_statement.function_defintion.FunctionDefNode;
import ast.python_flask.compound_statement.function_defintion.param.KwVarArgParamNode;
import ast.python_flask.compound_statement.function_defintion.param.NormalParamNode;
import ast.python_flask.compound_statement.function_defintion.param.ParamNode;
import ast.python_flask.compound_statement.function_defintion.param.VarArgParamNode;
import ast.python_flask.expressions_roles.literal.*;
import ast.python_flask.simple_statement.BreakStatementNode;
import ast.python_flask.simple_statement.ContinueStatementNode;
import ast.python_flask.simple_statement.ExpressionStatementNode;
import ast.python_flask.simple_statement.GlobalStatementNode;
import ast.python_flask.simple_statement.PassStatementNode;
import ast.python_flask.simple_statement.ReturnStatementNode;
import ast.python_flask.simple_statement.assignment_stat.AssignmentOperator;
import ast.python_flask.simple_statement.assignment_stat.AssignmentStatementNode;
import ast.python_flask.expressions_roles.operators.*;
import ast.python_flask.expressions_roles.target.*;
import ast.python_flask.simple_statement.import_stat.ImportItem;
import ast.python_flask.simple_statement.import_stat.ImportStatementNode;

public class SymbolVisitor extends PythonParserBaseVisitor<BaseNode> {
    private SymbolTable table = new SymbolTable();
    private ArrayList<String> globalVars = new ArrayList<>();

    // ============================================================
    // Program
    // ============================================================
    public void visitProgram(ProgramNode program) {
        table.pushScope("global");
        for (StatementNode stmt : program.statements) {
            this.visitStatement(stmt);
        }
        table.popScope();
    }

    // ============================================================
    // Statement
    // ============================================================
    private void visitStatement(StatementNode stmt) {
        if (stmt instanceof AssignmentStatementNode a) {
            visitAssignment(a);
        }

        else if (stmt instanceof ClassDefintionNode c) {
            visitClassDef(c);
        }

        else if (stmt instanceof FunctionDefNode f) {
            visitFunctionDef(f);
        }

        else if (stmt instanceof ForStatementNode f) {
            visitFor(f);
        }
         else if (stmt instanceof WhileStatementNode w) {
            visitWhile(w);
        }
         else if (stmt instanceof IfStatementNode i) {
            visitIf(i);
        }
        else if (stmt instanceof GlobalStatementNode g) {
            visitGlobal(g);
        }
        else if (stmt instanceof ImportStatementNode imp) {
            visitImport(imp);
        }
    }

    // ============================================================
    // Assignment
    // ============================================================
    private void visitAssignment(AssignmentStatementNode a) {
        switch (a.operator.getOp()) {
            case "=":
                handleAssing(a);
                break;
            case "+=":
                handleAddAssign(a);
                break;
            case "-=":
                handleSubAssign(a);
                break;
            case "*=":
                handleMulAssign(a);
                break;
            case "/=":
                handleDevAssign(a);
                break;
            case "%=":
                handleModAssign(a);
                break;
            case "**=":
                handlePowAssign(a);
                break;
        }
    }

    private void handleAssing(AssignmentStatementNode a) {

        Object literalValue = null;
        int count = 0;

        for (TargetNode t : a.targets) {

            if (a.targets.size() == a.values.size()) {
                literalValue = extractLiteralValue(a.values.get(count++));
                
            } else {
                literalValue = null;
            }

            if (t instanceof VarTargetNode v) {
                define_var(new Symbol(v.attribute.name, "variable", v.line, literalValue));
            }

            else if (t instanceof AttributeTargetNode attr) {
                visitTarget(attr.targetNode);
            }

            else if (t instanceof SubscriptTargetNode sub) {
                visitTarget(sub.targetNode);
            }
        }
    }

    private void handleAddAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    // String + String
                    if (oldVal instanceof String && newVal instanceof String) {
                        result = (String) oldVal + (String) newVal;
                    }
                    // Number + Number
                    else if (oldVal instanceof Number && newVal instanceof Number) {
                        double leftNum = ((Number) oldVal).doubleValue();
                        double rightNum = ((Number) newVal).doubleValue();
                        double sum = leftNum + rightNum;

                        if (oldVal instanceof Integer && newVal instanceof Integer) {
                            result = (int) Math.round(sum);
                        } else if (oldVal instanceof Double || newVal instanceof Double) {
                            result = sum;
                        } else if (oldVal instanceof Float || newVal instanceof Float) {
                            result = (float) sum;
                        } else if (oldVal instanceof Long || newVal instanceof Long) {
                            result = (long) sum;
                        } else {
                            result = sum;
                        }
                    }

                    if (result != null) {
                        define_var(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private void handleSubAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    // Number - Number
                    if (oldVal instanceof Number && newVal instanceof Number) {
                        double leftNum = ((Number) oldVal).doubleValue();
                        double rightNum = ((Number) newVal).doubleValue();
                        double sub = leftNum - rightNum;

                        if (oldVal instanceof Integer && newVal instanceof Integer) {
                            result = (int) Math.round(sub);
                        } else if (oldVal instanceof Double || newVal instanceof Double) {
                            result = sub;
                        } else if (oldVal instanceof Float || newVal instanceof Float) {
                            result = (float) sub;
                        } else if (oldVal instanceof Long || newVal instanceof Long) {
                            result = (long) sub;
                        } else {
                            result = sub;
                        }
                    }

                    if (result != null) {
                        define_var(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private void handleMulAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    // Number * Number
                    if (oldVal instanceof Number && newVal instanceof Number) {
                        double leftNum = ((Number) oldVal).doubleValue();
                        double rightNum = ((Number) newVal).doubleValue();
                        double mul = leftNum * rightNum;

                        if (oldVal instanceof Integer && newVal instanceof Integer) {
                            result = (int) Math.round(mul);
                        } else if (oldVal instanceof Double || newVal instanceof Double) {
                            result = mul;
                        } else if (oldVal instanceof Float || newVal instanceof Float) {
                            result = (float) mul;
                        } else if (oldVal instanceof Long || newVal instanceof Long) {
                            result = (long) mul;
                        } else {
                            result = mul;
                        }
                    }

                    if (result != null) {
                        define_var(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private void handleDevAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    // Number / Number
                    if (oldVal instanceof Number && newVal instanceof Number) {
                        double leftNum = ((Number) oldVal).doubleValue();
                        double rightNum = ((Number) newVal).doubleValue();
                        double dev = leftNum / rightNum;
                        result = dev;
                    }

                    if (result != null) {
                        define_var(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private void handleModAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    // Number % Number
                    if (oldVal instanceof Number && newVal instanceof Number) {
                        double leftNum = ((Number) oldVal).doubleValue();
                        double rightNum = ((Number) newVal).doubleValue();
                        double mod = leftNum % rightNum;

                        if (oldVal instanceof Integer && newVal instanceof Integer) {
                            result = (int) Math.round(mod);
                        } else if (oldVal instanceof Double || newVal instanceof Double) {
                            result = mod;
                        } else if (oldVal instanceof Float || newVal instanceof Float) {
                            result = (float) mod;
                        } else if (oldVal instanceof Long || newVal instanceof Long) {
                            result = (long) mod;
                        } else {
                            result = mod;
                        }
                    }

                    if (result != null) {
                        define_var(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private void handlePowAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    if (oldVal instanceof Integer && newVal instanceof Integer) {
                        int base = ((Integer) oldVal).intValue();
                        int exponent = ((Integer) newVal).intValue();

                        if (base == 0 && exponent < 0) {
                            result = null;
                        } else if (base == 0 && exponent == 0) {
                            result = null;
                        } else {
                            int powResult = (int) Math.pow(base, exponent);
                            result = powResult;
                        }
                    }

                    if (result != null) {
                        define_var(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private Object extractLiteralValue(ExpressionNode expr) {

        // -------------------------
        // Add / Sub
        // -------------------------
        if (expr instanceof AddSubExpressionNode add) {
            Object L = extractLiteralValue(add.left);
            Object R = extractLiteralValue(add.right);

            if (L != null && R != null) {
                // String + String
                if (L instanceof String && R instanceof String) {
                    if (add.operator.equals("+")) {
                        return (String) L + (String) R;
                    }
                }

                // Number + Number
                if (L instanceof Number && R instanceof Number) {
                    double leftNum = ((Number) L).doubleValue();
                    double rightNum = ((Number) R).doubleValue();

                    double result = add.operator.equals("+")
                            ? leftNum + rightNum
                            : leftNum - rightNum;
                    if (L instanceof Integer && R instanceof Integer) {
                        return (int) Math.round(result);
                    } else if (L instanceof Double || R instanceof Double) {
                        return result;
                    } else if (L instanceof Float || R instanceof Float) {
                        return (float) result;
                    } else if (L instanceof Long || R instanceof Long) {
                        return (long) result;
                    }
                    return result;
                }
            }
            return null;
        }

        // -------------------------
        // Mul / Div / Mod
        // -------------------------
        if (expr instanceof MulDivModExpressionNode mul) {
            Object L = extractLiteralValue(mul.left);
            Object R = extractLiteralValue(mul.right);

            if (L != null && R != null) {
                if (L instanceof Number && R instanceof Number) {
                    double left = ((Number) L).doubleValue();
                    double right = ((Number) R).doubleValue();

                    // /0
                    if ((mul.operator.equals("/") || mul.operator.equals("%")) && right == 0.0) {
                        return null;
                    }

                    double result = 0;

                    switch (mul.operator) {
                        case "*":
                            result = left * right;
                            if (L instanceof Integer && R instanceof Integer) {
                                return (int) Math.round(result);
                            } else if (L instanceof Float || R instanceof Float) {
                                return (float) result;
                            } else if (L instanceof Long || R instanceof Long) {
                                return (long) result;
                            }
                            break;
                        case "%":
                            result = left % right;
                            if (L instanceof Integer && R instanceof Integer) {
                                return (int) Math.round(result);
                            } else if (L instanceof Float || R instanceof Float) {
                                return (float) result;
                            } else if (L instanceof Long || R instanceof Long) {
                                return (long) result;
                            }
                            break;
                        case "/":
                            result = left / right;
                            break;
                    }
                    

                    return result;
                }
            }
            return null;
        }

        // -------------------------
        // Power (**)
        // -------------------------
        if (expr instanceof PowerExpressionNode pow) {

            Object L = extractLiteralValue(pow.left);
            Object R = extractLiteralValue(pow.right);

            if (L instanceof Integer && R instanceof Integer) {
                int result = (int) Math.pow(((Integer) L).intValue(), ((Integer) R).intValue());
                return result;
            }
            return null;
        }

        // -------------------------
        // LiteralAtomNode
        // -------------------------
        if (expr instanceof LiteralAtomNode lit) {
            // Identifier literal
            if (lit.literal instanceof IdentifierExpression id) {
                Symbol symbol = table.resolve(id.name);
                if (symbol != null && symbol.getValue() != null) {
                    return symbol.getValue();
                }
            }

            // Int
            if (lit.literal instanceof IntLiteralExpression i) {
                return i.value;
            }

            // Double
            if (lit.literal instanceof DoubleLiteralExpression d) {
                return d.value;
            }

            // String
            if (lit.literal instanceof StringLiteralExpression s) {
                return s.value;
            }

            // Boolean
            if (lit.literal instanceof BooleanLiteralExpression b) {
                return b.value;
            }

            // Null
            if (lit.literal instanceof NullLiteralExpression n) {
                return null;
            }
        }

        if (expr instanceof ParenAtomNode par) {
            if (par.expressions.size() != 0) {
                return extractLiteralValue(par.expressions.get(0));
            }
        }

        return null;
    }

    private void visitTarget(TargetNode t) {

        if (t instanceof VarTargetNode v) {
            define_var(new Symbol(
                    v.attribute.name,
                    "variable",
                    v.line));
        }

        else if (t instanceof AttributeTargetNode attr) {
            visitTarget(attr.targetNode);
            table.resolve(attr.attribute.name);
        }

        else if (t instanceof SubscriptTargetNode sub) {
            visitTarget(sub.targetNode);
        }
    }

    // ============================================================
    // Class
    // ============================================================
    private void visitClassDef(ClassDefintionNode c) {
        table.define(new Symbol(
                c.nameClass.name,
                "class",
                c.line));

        table.pushScope("class " + c.nameClass.name);
        visitBody(c.body);
        table.popScope();
    }

    private void visitBody(BodyNode body) {
        if (body == null)
            return;

        for (StatementNode stmt : body.statements) {
            visitStatement(stmt);
        }
    }

    // ============================================================
    // Function
    // ============================================================
    private void visitFunctionDef(FunctionDefNode f) {

        table.define(new Symbol(
                f.nameFun.name,
                "function",
                f.line,
                extractReturnType(f.returnType)));
        for (DecoratorNode d : f.decorators) {
            visitDecorator(d);
        }

        table.pushScope("function " + f.nameFun.name);

        boolean can_set_dv = true;
        for (int i = f.parameters.size() - 1; i >= 0; i--) {
            ParamNode p = f.parameters.get(i);
            // Normal parameter
            if (p instanceof NormalParamNode np) {
                if (np.defaultValue != null && can_set_dv) {
                    table.define(new Symbol(
                            np.name.name,
                            "parameter",
                            np.line,
                            extractLiteralValue(np.defaultValue)));
                } else {
                    table.define(new Symbol(
                            np.name.name,
                            "parameter",
                            np.line));
                    can_set_dv = false;
                }
            }

            // *args
            else if (p instanceof VarArgParamNode vp) {
                table.define(new Symbol(
                        vp.name.name,
                        "vararg",
                        vp.line));
            }

            // **kwargs
            else if (p instanceof KwVarArgParamNode kp) {
                table.define(new Symbol(
                        kp.name.name,
                        "kwvararg",
                        kp.line));
            }
        }

        visitBody(f.body);
        globalVars.clear();
        table.popScope();
    }

    private Object extractReturnType(ExpressionNode expr) {
        if (expr instanceof LiteralAtomNode lit) {
            if (lit.literal instanceof IdentifierExpression id) {
                return id.name;
            }
        }
        return null;
    }

    private void visitDecorator(DecoratorNode d) {

        for (IdentifierExpression id : d.path) {
            table.resolve(id.name);
        }

        if (d.arguments != null) {
            for (ArgumentNode arg : d.arguments) {
                visitArgument(arg);
            }
        }
    }

    private void visitArgument(ArgumentNode arg) {

        if (arg.nameArg != null) {
            table.resolve(arg.nameArg.name);
        }
    }

    // ============================================================
    // For
    // ============================================================
    private void visitFor(ForStatementNode f) {

        for (TargetNode t : f.targets) {

            if (t instanceof VarTargetNode v) {
                table.define(new Symbol(
                        v.attribute.name,
                        "variable",
                        v.line));
            }

            else if (t instanceof AttributeTargetNode attr) {
                visitTarget(attr.targetNode);
            }

            else if (t instanceof SubscriptTargetNode sub) {
                visitTarget(sub.targetNode);
            }
        }

        visitBody(f.body);
    }

    // ============================================================
    // While
    // ============================================================
    private void visitWhile(WhileStatementNode w) {
        visitBody(w.body);
    }

    // ============================================================
    // If
    // ============================================================
    private void visitIf(IfStatementNode i) {

        if (checkCondition(i.ifCondition)) {
            visitBody(i.bodyIf);
            return;
        }
        else {
            for (var pair : i.elseIfStat) {
                ExpressionNode cond = pair.a;
                BodyNode body = pair.b;

                if (checkCondition(cond)){
                    visitBody(body);
                    return;
                } 
            }
        }

        if (i.bodyElse != null) {
            visitBody(i.bodyElse);
        }
    }

    private boolean checkCondition(ExpressionNode expr) {

        if (expr instanceof ComparisonExpressionNode cmp) {
    
            Object L = extractLiteralValue(cmp.left);
            Object R = extractLiteralValue(cmp.right);
    
            if (L == null || R == null)
                return false;
    
            if (isNumber(L) && isNumber(R)) {
    
                double left = toDouble(L);
                double right = toDouble(R);
    
                return switch (cmp.operator) {
                    case ">"  -> left > right;
                    case "<"  -> left < right;
                    case ">=" -> left >= right;
                    case "<=" -> left <= right;
                    case "==" -> left == right;
                    case "!=" -> left != right;
                    default   -> false;
                };
            }
    
            if (L instanceof String && R instanceof String) {
    
                String left = (String) L;
                String right = (String) R;
    
                return switch (cmp.operator) {
                    case "==" -> left.equals(right);
                    case "!=" -> !left.equals(right);
                    default   -> false; 
                };
            }
    
            return false;
        }
    
        return false;
    }

    private boolean isNumber(Object o) {
        if (o instanceof Integer || o instanceof Double)
            return true;
    
        if (o instanceof String s) {
            try {
                Double.parseDouble(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    
        return false;
    }
    

    private double toDouble(Object o) {
        if (o instanceof Integer i)
            return i.doubleValue();
    
        if (o instanceof Double d)
            return d;
    
        if (o instanceof String s)
            return Double.parseDouble(s);
    
        throw new RuntimeException("Not a number: " + o);
    }

    // ============================================================
    // Import
    // ============================================================
    private void visitImport(ImportStatementNode imp) {

        if (imp.fromModule == null) {

            for (ImportItem item : imp.items) {

                if (item.idRight == null) {
                    table.define(new Symbol(
                            item.idLeft,
                            "module",
                            item.line));
                }

                else {
                    table.define(new Symbol(
                            item.idRight, 
                            "module",
                            item.line));
                }
            }
        }

        else {

            for (String part : imp.fromModule.parts) {
                table.resolve(part);
            }

            for (ImportItem item : imp.items) {

                if (item.idRight == null) {
                    table.define(new Symbol(
                            item.idLeft,
                            "import",
                            item.line));
                }

                else {
                    table.define(new Symbol(
                            item.idRight, 
                            "import",
                            item.line));
                }
            }
        }
    }
    
    // ============================================================
    // Global Statement
    // ============================================================
    private void visitGlobal(GlobalStatementNode g) {
        for (String name : g.names) {
            globalVars.add(name);
        }
    }

    private void define_var(Symbol symbol) {
        if (globalVars.contains(symbol.getName())) {
            table.define_global(symbol);
        } else {
        table.define(symbol);
        }
    }

    // ============================================================
    // Print Table
    // ============================================================
    public void printSymbols() {
        table.printTable();
    }

}