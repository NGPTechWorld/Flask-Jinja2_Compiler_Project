// Generated from ./src/antlr/python_flask/PythonParser.g4 by ANTLR 4.13.2

package antlr.python_flask.generated;

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
	 * Visit a parse tree produced by {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(PythonParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItem(PythonParser.ImportItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#importModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModule(PythonParser.ImportModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#globalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStatement(PythonParser.GlobalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#passStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassStatement(PythonParser.PassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(PythonParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PythonParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(PythonParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PythonParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(PythonParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PythonParser.AssignmentStatementContext ctx);
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
	 * Visit a parse tree produced by {@link PythonParser#augmentedAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugmentedAssignment(PythonParser.AugmentedAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(PythonParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(PythonParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(PythonParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotExpression(PythonParser.IsNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(PythonParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpression(PythonParser.IsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(PythonParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomExpressionAt}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpressionAt(PythonParser.AtomExpressionAtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivModExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModExpression(PythonParser.MulDivModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpression(PythonParser.AtomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallTrailer(PythonParser.CallTrailerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubscriptTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptTrailer(PythonParser.SubscriptTrailerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeTrailer(PythonParser.AttributeTrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PythonParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#keyValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValueList(PythonParser.KeyValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(PythonParser.KeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PythonParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(PythonParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PythonParser.ArgumentContext ctx);
}