// Generated from E:/Semester 6/Design Compiler And Programming Languages/CA/1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#tab_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTab_or(FunctionCraftParser.Tab_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(FunctionCraftParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(FunctionCraftParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(FunctionCraftParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_pointer(FunctionCraftParser.Function_pointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#inc_dec_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec_operator(FunctionCraftParser.Inc_dec_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#plus_minus_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_minus_operator(FunctionCraftParser.Plus_minus_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assign_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_operator(FunctionCraftParser.Assign_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#append}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend(FunctionCraftParser.AppendContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#append_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend_prime(FunctionCraftParser.Append_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(FunctionCraftParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#or_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_prime(FunctionCraftParser.Or_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(FunctionCraftParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#and_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_prime(FunctionCraftParser.And_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(FunctionCraftParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#equality_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_prime(FunctionCraftParser.Equality_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(FunctionCraftParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#comparison_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_prime(FunctionCraftParser.Comparison_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#add_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub(FunctionCraftParser.Add_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#add_sub_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub_prime(FunctionCraftParser.Add_sub_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#mul_div_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div_mod(FunctionCraftParser.Mul_div_modContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#mul_div_mod_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div_mod_prime(FunctionCraftParser.Mul_div_mod_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#not_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_neg(FunctionCraftParser.Not_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#inc_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec(FunctionCraftParser.Inc_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket(FunctionCraftParser.BracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#parentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(FunctionCraftParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(FunctionCraftParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#indexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexing(FunctionCraftParser.IndexingContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#do_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_loop(FunctionCraftParser.Do_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(FunctionCraftParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_next(FunctionCraftParser.Break_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if_in_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_in_loop(FunctionCraftParser.If_in_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
}