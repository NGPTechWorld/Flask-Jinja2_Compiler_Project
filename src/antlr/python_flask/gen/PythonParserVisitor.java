// Generated from D:/Projects/Java/Antlr/Compiler1Project/src/antlr/python_flask/PythonParser.g4 by ANTLR 4.13.2
package antlr.python_flask.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PythonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable(PythonParser.IterableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(PythonParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(PythonParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStatement(PythonParser.ElifStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(PythonParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PythonParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#compOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOperator(PythonParser.CompOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PythonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PythonParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(PythonParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(PythonParser.KeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PythonParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(PythonParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(PythonParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PythonParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(PythonParser.ObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(PythonParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(PythonParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(PythonParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#targetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetList(PythonParser.TargetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(PythonParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(PythonParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PythonParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PythonParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#augmentedAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugmentedAssignment(PythonParser.AugmentedAssignmentContext ctx);
}