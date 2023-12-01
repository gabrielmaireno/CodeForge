// Generated from Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(ExprParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(ExprParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(ExprParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(ExprParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#whileBloco}.
	 * @param ctx the parse tree
	 */
	void enterWhileBloco(ExprParser.WhileBlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#whileBloco}.
	 * @param ctx the parse tree
	 */
	void exitWhileBloco(ExprParser.WhileBlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ifBloco}.
	 * @param ctx the parse tree
	 */
	void enterIfBloco(ExprParser.IfBlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifBloco}.
	 * @param ctx the parse tree
	 */
	void exitIfBloco(ExprParser.IfBlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ExprParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ExprParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(ExprParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(ExprParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multiplicaoOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicaoOp(ExprParser.MultiplicaoOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multiplicaoOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicaoOp(ExprParser.MultiplicaoOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#adicaoOp}.
	 * @param ctx the parse tree
	 */
	void enterAdicaoOp(ExprParser.AdicaoOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#adicaoOp}.
	 * @param ctx the parse tree
	 */
	void exitAdicaoOp(ExprParser.AdicaoOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#comparacaoOp}.
	 * @param ctx the parse tree
	 */
	void enterComparacaoOp(ExprParser.ComparacaoOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#comparacaoOp}.
	 * @param ctx the parse tree
	 */
	void exitComparacaoOp(ExprParser.ComparacaoOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleanOp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOp(ExprParser.BooleanOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleanOp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOp(ExprParser.BooleanOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(ExprParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(ExprParser.ConstContext ctx);
}