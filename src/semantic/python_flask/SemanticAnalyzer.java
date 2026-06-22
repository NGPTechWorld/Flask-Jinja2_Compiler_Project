package semantic.python_flask;

import java.util.*;

import org.antlr.v4.runtime.misc.Pair;

import Symbol_table.Symbol;
import Symbol_table.SymbolTable;
import semantic.SemanticError;

import ast.python_flask.BodyNode;
import ast.python_flask.ProgramNode;
import ast.python_flask.StatementNode;
import ast.python_flask.compound_statement.ClassDefintionNode;
import ast.python_flask.compound_statement.ForStatementNode;
import ast.python_flask.compound_statement.IfStatementNode;
import ast.python_flask.compound_statement.WhileStatementNode;
import ast.python_flask.compound_statement.function_defintion.FunctionDefNode;
import ast.python_flask.compound_statement.function_defintion.param.KwVarArgParamNode;
import ast.python_flask.compound_statement.function_defintion.param.NormalParamNode;
import ast.python_flask.compound_statement.function_defintion.param.ParamNode;
import ast.python_flask.compound_statement.function_defintion.param.VarArgParamNode;
import ast.python_flask.expressions_roles.ArgumentNode;
import ast.python_flask.expressions_roles.AtomExpressionNode;
import ast.python_flask.expressions_roles.BinaryExpressionNode;
import ast.python_flask.expressions_roles.ExpressionNode;
import ast.python_flask.expressions_roles.UnaryExpressionNode;
import ast.python_flask.expressions_roles.atom.DictAtomNode;
import ast.python_flask.expressions_roles.atom.ListAtomNode;
import ast.python_flask.expressions_roles.atom.LiteralAtomNode;
import ast.python_flask.expressions_roles.atom.ParenAtomNode;
import ast.python_flask.expressions_roles.literal.DoubleLiteralExpression;
import ast.python_flask.expressions_roles.literal.IdentifierExpression;
import ast.python_flask.expressions_roles.literal.IntLiteralExpression;
import ast.python_flask.expressions_roles.operators.MulDivModExpressionNode;
import ast.python_flask.expressions_roles.target.AttributeTargetNode;
import ast.python_flask.expressions_roles.target.SubscriptTargetNode;
import ast.python_flask.expressions_roles.target.TargetNode;
import ast.python_flask.expressions_roles.target.VarTargetNode;
import ast.python_flask.expressions_roles.trailer.CallTrailerNode;
import ast.python_flask.expressions_roles.trailer.SubscriptTrailerNode;
import ast.python_flask.expressions_roles.trailer.TrailerNode;
import ast.python_flask.simple_statement.BreakStatementNode;
import ast.python_flask.simple_statement.ContinueStatementNode;
import ast.python_flask.simple_statement.ExpressionStatementNode;
import ast.python_flask.simple_statement.GlobalStatementNode;
import ast.python_flask.simple_statement.ReturnStatementNode;
import ast.python_flask.simple_statement.assignment_stat.AssignmentStatementNode;
import ast.python_flask.simple_statement.import_stat.ImportItem;
import ast.python_flask.simple_statement.import_stat.ImportStatementNode;

/**
 * Semantic Analysis phase for the Python/Flask AST.
 *
 * Runs as a SEPARATE pass over the already-built {@link ProgramNode} tree. It
 * owns its own scope-aware symbol table (built while walking) so that name
 * resolution is independent from the AST-building phase.
 *
 * Each scope is processed in two steps:
 *   1. hoist()  -> register every name declared in the scope (Python treats a
 *                  name assigned anywhere in a function as local everywhere),
 *   2. check()  -> validate every use against the visible scopes.
 *
 * Detected semantic errors:
 *   1. Use of an undefined / undeclared variable.
 *   2. 'break'    used outside any loop.
 *   3. 'continue' used outside any loop.
 *   4. 'return'   used outside any function.
 *   5. Division (or modulo) by a constant zero.
 *   6. Duplicate parameter name in a function definition.
 */
public class SemanticAnalyzer {

    private final SymbolTable table = new SymbolTable();
    private final List<SemanticError> errors = new ArrayList<>();

    private int loopDepth = 0;
    private int functionDepth = 0;

    /** Names that are always available without being declared. */
    private static final Set<String> BUILTINS = new HashSet<>(Arrays.asList(
            "print", "len", "range", "str", "int", "float", "bool", "list", "dict",
            "set", "tuple", "input", "open", "type", "isinstance", "enumerate", "zip",
            "map", "filter", "sorted", "sum", "min", "max", "abs", "round", "super",
            "object", "self", "cls", "None", "True", "False", "Exception", "format",
            "__name__", "__main__",
            // common Flask names so the reference app does not explode with noise
            "Flask", "render_template", "request", "redirect", "url_for", "jsonify",
            "secure_filename", "os", "app"));

    public List<SemanticError> analyze(ProgramNode program) {
        if (program == null) {
            return errors;
        }
        table.pushScope("global");
        hoist(program.statements);
        for (StatementNode stmt : program.statements) {
            checkStatement(stmt);
        }
        table.popScope();
        return errors;
    }

    public List<SemanticError> getErrors() {
        return errors;
    }

    public SymbolTable getSymbolTable() {
        return table;
    }

    // ============================================================
    // Hoisting: collect declarations of the CURRENT scope.
    // Recurses through for/if/while bodies (same scope) but stops at the
    // boundary of a nested function/class (those open their own scope).
    // ============================================================
    private void hoist(List<StatementNode> stmts) {
        if (stmts == null) {
            return;
        }
        for (StatementNode s : stmts) {
            if (s instanceof AssignmentStatementNode a) {
                for (TargetNode t : a.targets) {
                    hoistTarget(t);
                }
            } else if (s instanceof FunctionDefNode f) {
                if (f.nameFun != null) {
                    define(f.nameFun.name, "function", f.line);
                }
            } else if (s instanceof ClassDefintionNode c) {
                if (c.nameClass != null) {
                    define(c.nameClass.name, "class", c.line);
                }
            } else if (s instanceof ImportStatementNode imp) {
                for (ImportItem it : imp.items) {
                    String n = it.idRight != null ? it.idRight : it.idLeft;
                    define(n, "module", it.line);
                }
            } else if (s instanceof ForStatementNode fr) {
                for (TargetNode t : fr.targets) {
                    hoistTarget(t);
                }
                hoist(fr.body != null ? fr.body.statements : null);
            } else if (s instanceof WhileStatementNode w) {
                hoist(w.body != null ? w.body.statements : null);
            } else if (s instanceof IfStatementNode i) {
                hoist(i.bodyIf != null ? i.bodyIf.statements : null);
                for (Pair<ExpressionNode, BodyNode> p : i.elseIfStat) {
                    hoist(p.b != null ? p.b.statements : null);
                }
                hoist(i.bodyElse != null ? i.bodyElse.statements : null);
            } else if (s instanceof GlobalStatementNode g) {
                for (String n : g.names) {
                    defineGlobal(n, g.line);
                }
            }
        }
    }

    private void hoistTarget(TargetNode t) {
        if (t instanceof VarTargetNode v && v.attribute != null) {
            define(v.attribute.name, "variable", v.line);
        }
        // attribute / subscript targets mutate an existing object: nothing to declare
    }

    // ============================================================
    // Statement checking
    // ============================================================
    private void checkStatement(StatementNode s) {
        if (s == null) {
            return;
        }

        if (s instanceof AssignmentStatementNode a) {
            for (ExpressionNode v : a.values) {
                checkExpr(v);
            }
            for (TargetNode t : a.targets) {
                if (!(t instanceof VarTargetNode)) {
                    checkTargetRead(t); // obj.attr = ... / obj[i] = ... reads 'obj'
                }
            }
        } else if (s instanceof ExpressionStatementNode e) {
            if (e.expressions != null) {
                for (ExpressionNode ex : e.expressions) {
                    checkExpr(ex);
                }
            }
        } else if (s instanceof ReturnStatementNode r) {
            if (functionDepth == 0) {
                errors.add(SemanticError.error("Python", "'return' used outside of a function", r.line));
            }
            if (r.expressions != null) {
                for (ExpressionNode ex : r.expressions) {
                    checkExpr(ex);
                }
            }
        } else if (s instanceof BreakStatementNode b) {
            if (loopDepth == 0) {
                errors.add(SemanticError.error("Python", "'break' used outside of a loop", b.line));
            }
        } else if (s instanceof ContinueStatementNode c) {
            if (loopDepth == 0) {
                errors.add(SemanticError.error("Python", "'continue' used outside of a loop", c.line));
            }
        } else if (s instanceof FunctionDefNode f) {
            checkFunctionDef(f);
        } else if (s instanceof ClassDefintionNode c) {
            table.pushScope("class " + (c.nameClass != null ? c.nameClass.name : "?"));
            hoist(c.body != null ? c.body.statements : null);
            checkBody(c.body);
            table.popScope();
        } else if (s instanceof ForStatementNode fr) {
            if (fr.iterables != null) {
                for (ExpressionNode it : fr.iterables) {
                    checkExpr(it);
                }
            }
            loopDepth++;
            checkBody(fr.body);
            loopDepth--;
        } else if (s instanceof WhileStatementNode w) {
            checkExpr(w.iterable);
            loopDepth++;
            checkBody(w.body);
            loopDepth--;
        } else if (s instanceof IfStatementNode i) {
            checkExpr(i.ifCondition);
            checkBody(i.bodyIf);
            for (Pair<ExpressionNode, BodyNode> p : i.elseIfStat) {
                checkExpr(p.a);
                checkBody(p.b);
            }
            checkBody(i.bodyElse);
        }
        // import / global / pass: no use-checks
    }

    private void checkFunctionDef(FunctionDefNode f) {
        table.pushScope("function " + (f.nameFun != null ? f.nameFun.name : "?"));

        Set<String> seenParams = new HashSet<>();
        for (ParamNode p : f.parameters) {
            String pname = paramName(p);
            if (pname == null) {
                continue;
            }
            if (!seenParams.add(pname)) {
                errors.add(SemanticError.error("Python", "Duplicate parameter '" + pname + "'", p.line));
            }
            define(pname, "parameter", p.line);
        }
        for (ParamNode p : f.parameters) {
            if (p instanceof NormalParamNode np && np.defaultValue != null) {
                checkExpr(np.defaultValue);
            }
        }

        hoist(f.body != null ? f.body.statements : null);
        functionDepth++;
        checkBody(f.body);
        functionDepth--;

        table.popScope();
    }

    private void checkBody(BodyNode body) {
        if (body == null || body.statements == null) {
            return;
        }
        for (StatementNode stmt : body.statements) {
            checkStatement(stmt);
        }
    }

    private void checkTargetRead(TargetNode t) {
        if (t instanceof VarTargetNode v && v.attribute != null) {
            checkName(v.attribute.name, v.line);
        } else if (t instanceof AttributeTargetNode at) {
            checkTargetRead(at.targetNode);
        } else if (t instanceof SubscriptTargetNode st) {
            checkTargetRead(st.targetNode);
            checkExpr(st.exp);
        }
    }

    // ============================================================
    // Expression checking (drives the undefined-variable check)
    // ============================================================
    private void checkExpr(ExpressionNode expr) {
        if (expr == null) {
            return;
        }

        if (expr instanceof LiteralAtomNode lit) {
            if (lit.literal instanceof IdentifierExpression id) {
                checkName(id.name, id.line);
            }
            return;
        }

        if (expr instanceof AtomExpressionNode ae) {
            if (ae.identifier != null) {
                checkName(ae.identifier.name, ae.line);
            } else if (ae.atom != null) {
                checkExpr(ae.atom);
            }
            if (ae.trailers != null) {
                for (TrailerNode tr : ae.trailers) {
                    if (tr instanceof SubscriptTrailerNode st) {
                        checkExpr(st.exp);
                    } else if (tr instanceof CallTrailerNode ct) {
                        for (ExpressionNode arg : ct.arguments) {
                            checkExpr(arg);
                        }
                    }
                    // AttributeTrailerNode: the attribute name is not a variable
                }
            }
            return;
        }

        // Mul/Div/Mod first (subclass of BinaryExpressionNode) for the /0 check
        if (expr instanceof MulDivModExpressionNode m) {
            checkExpr(m.left);
            checkExpr(m.right);
            if ("/".equals(m.operator) || "%".equals(m.operator)) {
                Double r = foldNumber(m.right);
                if (r != null && r == 0.0) {
                    errors.add(SemanticError.error("Python", "Division by zero", m.line));
                }
            }
            return;
        }

        if (expr instanceof BinaryExpressionNode bin) {
            checkExpr(bin.left);
            checkExpr(bin.right);
            return;
        }

        if (expr instanceof UnaryExpressionNode un) {
            checkExpr(un.expr);
            return;
        }

        if (expr instanceof ParenAtomNode par) {
            for (ExpressionNode e : par.expressions) {
                checkExpr(e);
            }
            return;
        }

        if (expr instanceof ListAtomNode la) {
            for (ExpressionNode e : la.elements) {
                checkExpr(e);
            }
            return;
        }

        if (expr instanceof DictAtomNode da) {
            for (Pair<ExpressionNode, ExpressionNode> entry : da.entries) {
                checkExpr(entry.a);
                checkExpr(entry.b);
            }
            return;
        }

        if (expr instanceof ArgumentNode arg) {
            checkExpr(arg.value);
        }
    }

    private void checkName(String name, int line) {
        if (name == null || BUILTINS.contains(name)) {
            return;
        }
        if (table.resolve(name) == null) {
            errors.add(SemanticError.error("Python", "Use of undefined variable '" + name + "'", line));
        }
    }

    /** Minimal constant folding, only what the /0 check needs. */
    private Double foldNumber(ExpressionNode expr) {
        if (expr instanceof LiteralAtomNode lit) {
            if (lit.literal instanceof IntLiteralExpression i) {
                return (double) i.value;
            }
            if (lit.literal instanceof DoubleLiteralExpression d) {
                return d.value;
            }
            if (lit.literal instanceof IdentifierExpression id) {
                Symbol s = table.resolve(id.name);
                if (s != null && s.getValue() instanceof Number n) {
                    return n.doubleValue();
                }
            }
        }
        if (expr instanceof ParenAtomNode p && !p.expressions.isEmpty()) {
            return foldNumber(p.expressions.get(0));
        }
        return null;
    }

    // ============================================================
    // Helpers
    // ============================================================
    private String paramName(ParamNode p) {
        if (p instanceof NormalParamNode np && np.name != null) {
            return np.name.name;
        }
        if (p instanceof VarArgParamNode vp && vp.name != null) {
            return vp.name.name;
        }
        if (p instanceof KwVarArgParamNode kp && kp.name != null) {
            return kp.name.name;
        }
        return null;
    }

    private void define(String name, String type, int line) {
        if (name != null) {
            table.define(new Symbol(name, type, line));
        }
    }

    private void defineGlobal(String name, int line) {
        if (name != null) {
            table.define_global(new Symbol(name, "global_variable", line));
        }
    }
}
