package visitor.python_flask;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.misc.Pair;

import Symbol_table.Symbol;
import Symbol_table.SymbolTable;
import antlr.python_flask.generated.*;
import antlr.python_flask.generated.PythonParser.*;
import ast.BaseNode;
import ast.python_flask.*;
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
import ast.python_flask.expressions_roles.*;
import ast.python_flask.expressions_roles.atom.*;
import ast.python_flask.expressions_roles.literal.*;
import ast.python_flask.expressions_roles.operators.*;
import ast.python_flask.expressions_roles.target.AttributeTargetNode;
import ast.python_flask.expressions_roles.target.SubscriptTargetNode;
import ast.python_flask.expressions_roles.target.TargetNode;
import ast.python_flask.expressions_roles.target.VarTargetNode;
import ast.python_flask.expressions_roles.trailer.AttributeTrailerNode;
import ast.python_flask.expressions_roles.trailer.CallTrailerNode;
import ast.python_flask.expressions_roles.trailer.SubscriptTrailerNode;
import ast.python_flask.expressions_roles.trailer.TrailerNode;
import ast.python_flask.simple_statement.*;
import ast.python_flask.simple_statement.assignment_stat.AssignmentOperator;
import ast.python_flask.simple_statement.assignment_stat.AssignmentStatementNode;
import ast.python_flask.simple_statement.import_stat.*;

public class ASTBuilderVisitor extends PythonParserBaseVisitor<BaseNode> {

    // Integrated states from SymbolVisitor
    private final SymbolTable table = new SymbolTable();
    private final ArrayList<String> globalVars = new ArrayList<>();

    // Helper method to retrieve table out if needed
    public SymbolTable getSymbolTable() {
        return this.table;
    }

    public void printSymbols() {
        table.printTable();
    }

    // ============================================================
    // Program
    // ============================================================
    @Override
    public BaseNode visitProgram(PythonParser.ProgramContext ctx) {
        table.pushScope("global"); // Symbol logic opened
        
        ProgramNode program = new ProgramNode(1);
        for (var stmt : ctx.statement()) {
            BaseNode node = visit(stmt);
            if (node != null) {
                program.addStatement((StatementNode) node);
            }
        }
        
        table.popScope(); // Symbol logic closed
        return program;
    }

    // ============================================================
    // Compound Statement
    // ============================================================
    @Override
    public BaseNode visitCompoundStatement(CompoundStatementContext ctx) {
        return visitChildren(ctx);
    }

    // ============================================================
    // Class Definition
    // ============================================================
    @Override
    public BaseNode visitClassDef(ClassDefContext ctx) {
        int line = ctx.getStart().getLine();
        String className = ctx.IDENTIFIER().getText();
        
        // Symbol registration: Global reference of the class
        table.define(new Symbol(className, "class", line));
        
        IdentifierExpression nameClass = new IdentifierExpression(ctx.IDENTIFIER().getSymbol().getLine(), className);
        List<ExpressionNode> arguments = new ArrayList<>();
        if (ctx.arglist() != null) {
            for (var argCtx : ctx.arglist().argument()) {
                arguments.add((ArgumentNode) visit(argCtx));
            }
        }
        
        // Symbol logic: Class body has its own scope
        table.pushScope("class " + className);
        BodyNode bodyNode = (BodyNode) visit(ctx.body());
        table.popScope();
        
        return new ClassDefintionNode(line, nameClass, arguments, bodyNode);
    }

    @Override
    public BaseNode visitBody(BodyContext ctx) {
        int line = ctx.getStart().getLine();
        List<StatementNode> statements = new ArrayList<>();
        for (var stmt : ctx.statement()) {
            BaseNode node = visit(stmt);
            if (node != null) {
                statements.add((StatementNode) node);
            }
        }
        return new BodyNode(line, statements);
    }

    // ============================================================
    // If Statement
    // ============================================================
    @Override
    public BaseNode visitIfStatement(IfStatementContext ctx) {
        int line = ctx.getStart().getLine();
        ExpressionNode ifCondition = (ExpressionNode) visit(ctx.expression(0));
        
        // Symbol Static Condition Evaluation Engine
        boolean condEvaluated = checkCondition(ifCondition);
        BodyNode bodyIf = null;
        
        if (condEvaluated) {
            bodyIf = (BodyNode) visit(ctx.body(0));
        } else {
            // Evaluates as false or unresolvable -> process elements safely
            bodyIf = (BodyNode) visit(ctx.body(0));
        }

        List<Pair<ExpressionNode, BodyNode>> elseIfStat = new ArrayList<>();
        int elifCount = ctx.ELIF().size();
        for (int i = 0; i < elifCount; i++) {
            ExpressionNode cond = (ExpressionNode) visit(ctx.expression(i + 1));
            BodyNode body = (BodyNode) visit(ctx.body(i + 1));
            elseIfStat.add(new Pair<>(cond, body));
        }

        BodyNode bodyElse = null;
        if (ctx.ELSE() != null) {
            bodyElse = (BodyNode) visit(ctx.body(ctx.body().size() - 1));
        }

        return new IfStatementNode(line, ifCondition, bodyIf, elseIfStat, bodyElse);
    }

    // ============================================================
    // For loop Statement
    // ============================================================
    @Override
    public BaseNode visitForStatement(PythonParser.ForStatementContext ctx) {
        int line = ctx.getStart().getLine();
        List<TargetNode> targets = new ArrayList<>();
        
        // Gather targets & register iterative variables to Symbol table instantly
        for (var t : ctx.targetList().target()) {
            TargetNode targetNode = (TargetNode) visit(t);
            targets.add(targetNode);
            registerTargetToSymbolTable(targetNode);
        }
        
        List<ExpressionNode> iterables = new ArrayList<>();
        for (var e : ctx.expressionList().expression()) {
            iterables.add((ExpressionNode) visit(e));
        }
        BodyNode body = (BodyNode) visit(ctx.body());

        return new ForStatementNode(line, targets, iterables, body);
    }

    // ============================================================
    // While loop Statement
    // ============================================================
    @Override
    public BaseNode visitWhileStatement(WhileStatementContext ctx) {
        int line = ctx.getStart().getLine();
        ExpressionNode iterable = (ExpressionNode) visit(ctx.expression());
        BodyNode body = (BodyNode) visit(ctx.body());

        return new WhileStatementNode(line, iterable, body);
    }

    // ============================================================
    // Function Definition
    // ============================================================
    @Override
    public BaseNode visitFuncdef(FuncdefContext ctx) {
        int line = ctx.getStart().getLine();
        String funcName = ctx.IDENTIFIER().getText();
        
        // Parse return type safely first to allocate to outer function context definition
        ExpressionNode returnTypeNode = null;
        Object extractedReturnType = null;
        if (ctx.expression() != null) {
            returnTypeNode = (ExpressionNode) visit(ctx.expression());
            extractedReturnType = extractReturnType(returnTypeNode);
        }

        // Register function to current symbol scope
        table.define(new Symbol(funcName, "function", line, extractedReturnType));

        FunctionDefNode node = new FunctionDefNode(line);
        node.returnType = returnTypeNode;
        node.name = new IdentifierExpression(ctx.IDENTIFIER().getSymbol().getLine(), funcName);

        if (ctx.decorators() != null) {
            for (var dec : ctx.decorators().decorator()) {
                DecoratorNode dNode = (DecoratorNode) visit(dec);
                node.decorators.add(dNode);
                // Resolve references inside decorator pathing inside functional level scope 
                for (IdentifierExpression id : dNode.path) {
                    table.resolve(id.name);
                }
                if (dNode.arguments != null) {
                    for (ArgumentNode arg : dNode.arguments) {
                        if (arg.nameArg != null) table.resolve(arg.nameArg.name);
                    }
                }
            }
        }

        // Switch scope into local block setup
        table.pushScope("function " + funcName);

        if (ctx.parameters() != null) {
            // Emulates backwards lookup check found in your custom SymbolVisitor block
            int totalParams = ctx.parameters().param().size();
            boolean can_set_dv = true;
            
            for (int i = totalParams - 1; i >= 0; i--) {
                ParamNode p = (ParamNode) visit(ctx.parameters().param(i));
                node.parameters.add(0, p); // Add to head to maintain correct visual ordering

                if (p instanceof NormalParamNode np) {
                    if (np.defaultValue != null && can_set_dv) {
                        table.define(new Symbol(np.name.name, "parameter", np.line, extractLiteralValue(np.defaultValue)));
                    } else {
                        table.define(new Symbol(np.name.name, "parameter", np.line));
                        can_set_dv = false;
                    }
                } else if (p instanceof VarArgParamNode vp) {
                    table.define(new Symbol(vp.name.name, "vararg", vp.line));
                } else if (p instanceof KwVarArgParamNode kp) {
                    table.define(new Symbol(kp.name.name, "kwvararg", kp.line));
                }
            }
        }

        node.body = (BodyNode) visit(ctx.body());
        
        // Clean dynamic block track configurations safely
        globalVars.clear();
        table.popScope();
        
        return node;
    }

    @Override
    public BaseNode visitDecorator(DecoratorContext ctx) {
        DecoratorNode node = new DecoratorNode(ctx.getStart().getLine());
        for (var id : ctx.dottedName().IDENTIFIER()) {
            node.path.add(new IdentifierExpression(id.getSymbol().getLine(), id.getText()));
        }
        if (ctx.arglist() != null) {
            node.arguments = new ArrayList<>();
            for (var a : ctx.arglist().argument()) {
                node.arguments.add((ArgumentNode) visit(a));
            }
        }
        return node;
    }

    // Params
    @Override
    public BaseNode visitNormalParam(PythonParser.NormalParamContext ctx) {
        IdentifierExpression id = new IdentifierExpression(ctx.start.getLine(), ctx.IDENTIFIER().getText());
        ExpressionNode defaultValue = null;
        if (ctx.expression() != null) {
            defaultValue = (ExpressionNode) visit(ctx.expression());
        }
        return new NormalParamNode(ctx.start.getLine(), id, defaultValue);
    }

    @Override
    public BaseNode visitVarArgParam(PythonParser.VarArgParamContext ctx) {
        return new VarArgParamNode(ctx.start.getLine(), new IdentifierExpression(ctx.start.getLine(), ctx.IDENTIFIER().getText()));
    }

    @Override
    public BaseNode visitKwVarArgParam(PythonParser.KwVarArgParamContext ctx) {
        return new KwVarArgParamNode(ctx.start.getLine(), new IdentifierExpression(ctx.start.getLine(), ctx.IDENTIFIER().getText()));
    }

    // ============================================================
    // Simple Statement
    // ============================================================
    @Override
    public BaseNode visitSimpleStatement(PythonParser.SimpleStatementContext ctx) {
        if (ctx.expressionList() != null) {
            List<ExpressionNode> expressions = new ArrayList<>();
            for (var e : ctx.expressionList().expression()) {
                expressions.add((ExpressionNode) visit(e));
            }
            return new ExpressionStatementNode(ctx.getStart().getLine(), expressions);
        }
        return super.visitSimpleStatement(ctx);
    }

    // ============================================================
    // Pass Statement
    // ============================================================
    @Override
    public BaseNode visitPassStatement(PythonParser.PassStatementContext ctx) {
        return new PassStatementNode(ctx.PASS().getSymbol().getLine());
    }

    // ============================================================
    // Continue Statement
    // ============================================================
    @Override
    public BaseNode visitContinueStatement(PythonParser.ContinueStatementContext ctx) {
        return new ContinueStatementNode(ctx.CONTINUE().getSymbol().getLine());
    }

    // ============================================================
    // Break Statement
    // ============================================================
    @Override
    public BaseNode visitBreakStatement(PythonParser.BreakStatementContext ctx) {
        return new BreakStatementNode(ctx.BREAK().getSymbol().getLine());
    }

    // ============================================================
    // Global Statement
    // ============================================================
    @Override
    public BaseNode visitGlobalStatement(PythonParser.GlobalStatementContext ctx) {
        int line = ctx.GLOBAL().getSymbol().getLine();
        var names = ctx.IDENTIFIER().stream().map(t -> t.getText()).toList();

        // Symbol logic hook: Add tracked strings directly to scope modifier rule array
        for (String name : names) {
            globalVars.add(name);
        }

        return new GlobalStatementNode(line, names);
    }

    // ============================================================
    // Return Statement
    // ============================================================
    @Override
    public BaseNode visitReturnStatement(ReturnStatementContext ctx) {
        int line = ctx.getStart().getLine();
        List<ExpressionNode> values = new ArrayList<>();
        if (ctx.expressionList() != null)
            for (var e : ctx.expressionList().expression()) {
                values.add((ExpressionNode) visit(e));
            }
        return new ReturnStatementNode(line, values);
    }

    // ============================================================
    // Import Statement
    // ============================================================
    @Override
    public BaseNode visitImportStatement(PythonParser.ImportStatementContext ctx) {
        ImportStatementNode node = new ImportStatementNode(ctx.getStart().getLine());
        
        if (ctx.importModule() != null) {
            List<String> parts = ctx.importModule().IDENTIFIER().stream().map(t -> t.getText()).toList();
            node.fromModule = new ImportModule(ctx.importModule().getStart().getLine(), parts);
            
            // Symbol trace execution:
            for (String part : parts) {
                table.resolve(part);
            }
        }
        
        for (var i : ctx.importItem()) {
            String leftId = i.IDENTIFIER(0).getText();
            String rightId = i.IDENTIFIER().size() > 1 ? i.IDENTIFIER(1).getText() : null;
            
            node.addImportItem(new ImportItem(i.getStart().getLine(), leftId, rightId));

            // Symbol tracking registration logic
            String symbolAliasName = (rightId == null) ? leftId : rightId;
            String typeContext = (node.fromModule == null) ? "module" : "import";
            table.define(new Symbol(symbolAliasName, typeContext, i.getStart().getLine()));
        }

        return node;
    }

    // ============================================================
    // Assignment Statement
    // ============================================================
    @Override
    public BaseNode visitAssignmentStatement(PythonParser.AssignmentStatementContext ctx) {
        int line = ctx.getStart().getLine();
        List<TargetNode> targets = new ArrayList<>();
        for (var t : ctx.targetList().target()) {
            targets.add((TargetNode) visit(t));
        }
        
        AssignmentOperator operator;
        String rawOpText = "=";
        if (ctx.augmentedAssignment() != null) {
            rawOpText = ctx.augmentedAssignment().getText();
            operator = switch (rawOpText) {
                case "+=" -> AssignmentOperator.ADD_ASSIGN;
                case "-=" -> AssignmentOperator.SUB_ASSIGN;
                case "*=" -> AssignmentOperator.MUL_ASSIGN;
                case "/=" -> AssignmentOperator.DIV_ASSIGN;
                case "%=" -> AssignmentOperator.MOD_ASSIGN;
                default -> throw new RuntimeException("Unknown augmented assignment");
            };
        } else {
            operator = AssignmentOperator.ASSIGN;
        }
        
        List<ExpressionNode> values = new ArrayList<>();
        for (var e : ctx.expressionList().expression()) {
            values.add((ExpressionNode) visit(e));
        }

        // --- INTEGRATED SYMBOL ASSIGNMENT ENGINE ---
        executeSymbolAssignmentLogic(targets, values, rawOpText, line);

        return new AssignmentStatementNode(line, targets, operator, values);
    }

    private void executeSymbolAssignmentLogic(List<TargetNode> targets, List<ExpressionNode> values, String op, int line) {
        int count = 0;
        for (TargetNode t : targets) {
            if (op.equals("=")) {
                Object literalValue = (targets.size() == values.size()) ? extractLiteralValue(values.get(count++)) : null;
                if (t instanceof VarTargetNode v) {
                    define_var(new Symbol(v.attribute.name, "variable", v.line, literalValue));
                } else {
                    registerTargetToSymbolTable(t);
                }
            } else {
                // Compound assignment modifications (+=, -=, *=, /=, %=)
                if (t instanceof VarTargetNode v) {
                    Symbol old = table.resolve(v.attribute.name);
                    Object oldVal = old != null ? old.getValue() : null;
                    Object newVal = !values.isEmpty() ? extractLiteralValue(values.get(0)) : null;

                    if (oldVal != null && newVal != null) {
                        Object result = calculateCompoundValue(oldVal, newVal, op);
                        if (result != null) {
                            define_var(new Symbol(v.attribute.name, "variable", v.line, result));
                        }
                    }
                }
            }
        }
    }

    private Object calculateCompoundValue(Object oldVal, Object newVal, String op) {
        if (op.equals("+=") && oldVal instanceof String && newVal instanceof String) {
            return (String) oldVal + (String) newVal;
        }
        if (oldVal instanceof Number && newVal instanceof Number) {
            double leftNum = ((Number) oldVal).doubleValue();
            double rightNum = ((Number) newVal).doubleValue();
            double res = 0;
            
            switch (op) {
                case "+=" -> res = leftNum + rightNum;
                case "-=" -> res = leftNum - rightNum;
                case "*=" -> res = leftNum * rightNum;
                case "/=" -> { if (rightNum == 0) return null; res = leftNum / rightNum; }
                case "%=" -> { if (rightNum == 0) return null; res = leftNum % rightNum; }
                case "**=" -> res = Math.pow(leftNum, rightNum);
                default -> { return null; }
            }
            
            if (oldVal instanceof Integer && newVal instanceof Integer && !op.equals("/=")) {
                return (int) Math.round(res);
            }
            return res;
        }
        return null;
    }

    private void registerTargetToSymbolTable(TargetNode t) {
        if (t instanceof VarTargetNode v) {
            define_var(new Symbol(v.attribute.name, "variable", v.line));
        } else if (t instanceof AttributeTargetNode attr) {
            registerTargetToSymbolTable(attr.targetNode);
            table.resolve(attr.attribute.name);
        } else if (t instanceof SubscriptTargetNode sub) {
            registerTargetToSymbolTable(sub.targetNode);
        }
    }

    // Target
    @Override
    public BaseNode visitSubscriptTarget(PythonParser.SubscriptTargetContext ctx) {
        int line = ctx.getStart().getLine();
        TargetNode base = (TargetNode) visit(ctx.target());
        ExpressionNode index = (ExpressionNode) visit(ctx.expression());
        return new SubscriptTargetNode(line, index, base);
    }

    @Override
    public BaseNode visitAttributeTarget(PythonParser.AttributeTargetContext ctx) {
        int line = ctx.getStart().getLine();
        TargetNode base = (TargetNode) visit(ctx.target());
        IdentifierExpression attr = new IdentifierExpression(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getText());
        return new AttributeTargetNode(line, attr, base);
    }

    @Override
    public BaseNode visitVarTarget(PythonParser.VarTargetContext ctx) {
        int line = ctx.getStart().getLine();
        return new VarTargetNode(line, new IdentifierExpression(line, ctx.IDENTIFIER().getText()));
    }

    // ============================================================
    // Atom Expression
    // ============================================================
    @Override
    public BaseNode visitAtomExpressionAt(PythonParser.AtomExpressionAtContext ctx) {
        return visit(ctx.atomExpression());
    }

    @Override
    public BaseNode visitAtomExpression(AtomExpressionContext ctx) {
        ExpressionNode atomExpressionNode;
        int line = ctx.getStart().getLine();
        if (ctx.atom() != null) {
            atomExpressionNode = (ExpressionNode) visit(ctx.atom());
        } else {
            List<TrailerNode> trailerNodes = new ArrayList<>();
            for (var i : ctx.trailer()) {
                trailerNodes.add((TrailerNode) visit(i));
            }
            IdentifierExpression identifierExpression = new IdentifierExpression(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getText());
            atomExpressionNode = new AtomExpressionNode(line, identifierExpression, trailerNodes);
        }
        return atomExpressionNode;
    }

    @Override
    public BaseNode visitParenAtom(ParenAtomContext ctx) {
        int line = ctx.getStart().getLine();
        ParenAtomNode node = new ParenAtomNode(line, new ArrayList<>());
        if (ctx.expressionList() != null) {
            for (var exp : ctx.expressionList().expression()) {
                node.expressions.add((ExpressionNode) visit(exp));
            }
        }
        return node;
    }

    @Override
    public BaseNode visitListAtom(ListAtomContext ctx) {
        int line = ctx.getStart().getLine();
        ListAtomNode node = new ListAtomNode(line, new ArrayList<>());
        if (ctx.expressionList() != null) {
            for (var exp : ctx.expressionList().expression()) {
                node.elements.add((ExpressionNode) visit(exp));
            }
        }
        return node;
    }

    @Override
    public BaseNode visitDictAtom(DictAtomContext ctx) {
        int line = ctx.getStart().getLine();
        DictAtomNode node = new DictAtomNode(line);

        if (ctx.keyValueList() != null) {
            for (var kv : ctx.keyValueList().keyValue()) {
                ExpressionNode key = (ExpressionNode) visit(kv.expression(0));
                ExpressionNode value = (ExpressionNode) visit(kv.expression(1));
                node.entries.add(new Pair<>(key, value));
            }
        }
        return node;
    }

    @Override
    public BaseNode visitLiteralAtom(LiteralAtomContext ctx) {
         int line = ctx.getStart().getLine();
         LiteralNode literal = (LiteralNode) visit(ctx.literal());
        return new LiteralAtomNode(line, literal);
    }
    
    // Trailer
    @Override
    public BaseNode visitAttributeTrailer(AttributeTrailerContext ctx) {
        int line = ctx.getStart().getLine();
        IdentifierExpression identifierExpression = new IdentifierExpression(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getText());
        return new AttributeTrailerNode(line, identifierExpression);
    }

    @Override
    public BaseNode visitSubscriptTrailer(SubscriptTrailerContext ctx) {
        int line = ctx.getStart().getLine();
        return new SubscriptTrailerNode(line, (ExpressionNode) visit(ctx.expression()));
    }

    @Override
    public BaseNode visitCallTrailer(CallTrailerContext ctx) {
        int line = ctx.getStart().getLine();
        List<ExpressionNode> arguments = new ArrayList<>();
        if (ctx.arglist() != null) {
            for (var argCtx : ctx.arglist().argument()) {
                arguments.add((ArgumentNode) visit(argCtx));
            }
        }
        return new CallTrailerNode(line, arguments);
    }

    @Override
    public BaseNode visitArgument(PythonParser.ArgumentContext ctx) {
        int line = ctx.getStart().getLine();
        if (ctx.POWER() != null) {
            return new ArgumentNode(line, (ExpressionNode) visit(ctx.expression()));
        }
        IdentifierExpression identifierExpression = null;
        if (ctx.IDENTIFIER() != null) {
            identifierExpression = new IdentifierExpression(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getText());
        }
        return new ArgumentNode(line, identifierExpression, (ExpressionNode) visit(ctx.expression()));
    }

    // ============================================================
    // Expressions
    // ============================================================
    @Override
    public BaseNode visitPowerExpression(PythonParser.PowerExpressionContext ctx) {
        return new PowerExpressionNode(ctx.getStart().getLine(), (ExpressionNode) visit(ctx.expression(0)), (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitMulDivModExpression(PythonParser.MulDivModExpressionContext ctx) {
        return new MulDivModExpressionNode(ctx.getStart().getLine(), (ExpressionNode) visit(ctx.expression(0)), ctx.getChild(1).getText(), (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitAddSubExpression(PythonParser.AddSubExpressionContext ctx) {
        return new AddSubExpressionNode(ctx.getStart().getLine(), (ExpressionNode) visit(ctx.expression(0)), ctx.getChild(1).getText(), (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitComparisonExpression(PythonParser.ComparisonExpressionContext ctx) {
        return new ComparisonExpressionNode(ctx.getStart().getLine(), (ExpressionNode) visit(ctx.expression(0)), ctx.getChild(1).getText(), (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitIsExpression(PythonParser.IsExpressionContext ctx) {
        return new IsExpressionNode(ctx.getStart().getLine(), (ExpressionNode) visit(ctx.expression(0)), (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitIsNotExpression(PythonParser.IsNotExpressionContext ctx) {
        return new IsNotExpressionNode(ctx.getStart().getLine(), (ExpressionNode) visit(ctx.expression(0)), (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitNotExpression(PythonParser.NotExpressionContext ctx) {
        return new NotExpressionNode(ctx.getStart().getLine(), (ExpressionNode) visit(ctx.expression()));
    }

    @Override
    public BaseNode visitAndExpression(PythonParser.AndExpressionContext ctx) {
        return new AndExpressionNode(ctx.getStart().getLine(), (ExpressionNode) visit(ctx.expression(0)), (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitOrExpression(PythonParser.OrExpressionContext ctx) {
        return new OrExpressionNode(ctx.getStart().getLine(), (ExpressionNode) visit(ctx.expression(0)), (ExpressionNode) visit(ctx.expression(1)));
    }

    // ============================================================
    // Literal Evaluation Extractors (From SymbolVisitor)
    // ============================================================
    private Object extractLiteralValue(ExpressionNode expr) {
        if (expr == null) return null;

        if (expr instanceof AddSubExpressionNode add) {
            Object L = extractLiteralValue(add.left);
            Object R = extractLiteralValue(add.right);
            if (L != null && R != null) {
                if (L instanceof String && R instanceof String && add.operator.equals("+")) {
                    return (String) L + (String) R;
                }
                if (L instanceof Number && R instanceof Number) {
                    double leftNum = ((Number) L).doubleValue();
                    double rightNum = ((Number) R).doubleValue();
                    double result = add.operator.equals("+") ? leftNum + rightNum : leftNum - rightNum;
                    if (L instanceof Integer && R instanceof Integer) return (int) Math.round(result);
                    return result;
                }
            }
            return null;
        }

        if (expr instanceof MulDivModExpressionNode mul) {
            Object L = extractLiteralValue(mul.left);
            Object R = extractLiteralValue(mul.right);
            if (L != null && R != null && L instanceof Number && R instanceof Number) {
                double left = ((Number) L).doubleValue();
                double right = ((Number) R).doubleValue();
                if ((mul.operator.equals("/") || mul.operator.equals("%")) && right == 0.0) return null;
                
                switch (mul.operator) {
                    case "*" -> { return (L instanceof Integer && R instanceof Integer) ? (int) Math.round(left * right) : left * right; }
                    case "%" -> { return (L instanceof Integer && R instanceof Integer) ? (int) Math.round(left % right) : left % right; }
                    case "/" -> { return left / right; }
                }
            }
            return null;
        }

        if (expr instanceof PowerExpressionNode pow) {
            Object L = extractLiteralValue(pow.left);
            Object R = extractLiteralValue(pow.right);
            if (L instanceof Integer && R instanceof Integer) {
                return (int) Math.pow(((Integer) L).intValue(), ((Integer) R).intValue());
            }
            return null;
        }

        if (expr instanceof LiteralAtomNode lit) {
            if (lit.literal instanceof IdentifierExpression id) {
                Symbol symbol = table.resolve(id.name);
                if (symbol != null) return symbol.getValue();
            }
            if (lit.literal instanceof IntLiteralExpression i) return i.value;
            if (lit.literal instanceof DoubleLiteralExpression d) return d.value;
            if (lit.literal instanceof StringLiteralExpression s) return s.value;
            if (lit.literal instanceof BooleanLiteralExpression b) return b.value;
            if (lit.literal instanceof NullLiteralExpression) return null;
        }

        if (expr instanceof ParenAtomNode par && !par.expressions.isEmpty()) {
            return extractLiteralValue(par.expressions.get(0));
        }
        return null;
    }

    private boolean checkCondition(ExpressionNode expr) {
        if (expr instanceof ComparisonExpressionNode cmp) {
            Object L = extractLiteralValue(cmp.left);
            Object R = extractLiteralValue(cmp.right);
            if (L == null || R == null) return false;

            if (isNumber(L) && isNumber(R)) {
                double left = toDouble(L);
                double right = toDouble(R);
                return switch (cmp.operator) {
                    case ">" -> left > right;
                    case "<" -> left < right;
                    case ">=" -> left >= right;
                    case "<=" -> left <= right;
                    case "==" -> left == right;
                    case "!=" -> left != right;
                    default -> false;
                };
            }
            if (L instanceof String && R instanceof String) {
                String left = (String) L;
                String right = (String) R;
                return switch (cmp.operator) {
                    case "==" -> left.equals(right);
                    case "!=" -> !left.equals(right);
                    default -> false;
                };
            }
        }
        return false;
    }

    private boolean isNumber(Object o) {
        if (o instanceof Integer || o instanceof Double) return true;
        if (o instanceof String s) {
            try { Double.parseDouble(s); return true; } catch (NumberFormatException e) { return false; }
        }
        return false;
    }

    private double toDouble(Object o) {
        if (o instanceof Integer i) return i.doubleValue();
        if (o instanceof Double d) return d;
        if (o instanceof String s) return Double.parseDouble(s);
        throw new RuntimeException("Not a number: " + o);
    }

    private Object extractReturnType(ExpressionNode expr) {
        if (expr instanceof LiteralAtomNode lit && lit.literal instanceof IdentifierExpression id) {
            return id.name;
        }
        return null;
    }

    private void define_var(Symbol symbol) {
        if (globalVars.contains(symbol.getName())) {
            table.define_global(symbol);
        } else {
            table.define(symbol);
        }
    }

    // ============================================================
    // Literal Core Direct Bindings
    // ============================================================
    @Override
    public BaseNode visitIntLiteral(IntLiteralContext ctx) {
        return new IntLiteralExpression(ctx.getStart().getLine(), Integer.parseInt(ctx.INT().getText()));
    }

    @Override
    public BaseNode visitDoubleLiteral(DoubleLiteralContext ctx) {
        return new DoubleLiteralExpression(ctx.getStart().getLine(), Double.parseDouble(ctx.DOUBLE().getText()));
    }

    @Override
    public BaseNode visitStringLiteral(StringLiteralContext ctx) {
        String raw = ctx.STRING().getText();
        return new StringLiteralExpression(ctx.getStart().getLine(), raw.substring(1, raw.length() - 1));
    }

    @Override
    public BaseNode visitFStringLiteral(FStringLiteralContext ctx) {
        String raw = ctx.FSTRING().getText();
        return new FStringLiteralExpression(ctx.getStart().getLine(), raw.substring(1, raw.length() - 1));
    }

    @Override
    public BaseNode visitBooleanLiteral(BooleanLiteralContext ctx) {
        return new BooleanLiteralExpression(ctx.getStart().getLine(), ctx.TRUE() != null);
    }

    @Override
    public BaseNode visitIdentifierLiteral(IdentifierLiteralContext ctx) {
        return new IdentifierExpression(ctx.getStart().getLine(), ctx.IDENTIFIER().getText());
    }

    @Override
    public BaseNode visitNullLiteral(NullLiteralContext ctx) {
        return new NullLiteralExpression(ctx.getStart().getLine());
    }
}