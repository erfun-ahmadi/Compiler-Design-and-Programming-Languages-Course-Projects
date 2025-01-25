// Generated from E:/Semester 6/Design Compiler And Programming Languages/CA/1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#tab_or}.
	 * @param ctx the parse tree
	 */
	void enterTab_or(FunctionCraftParser.Tab_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#tab_or}.
	 * @param ctx the parse tree
	 */
	void exitTab_or(FunctionCraftParser.Tab_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(FunctionCraftParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(FunctionCraftParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(FunctionCraftParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(FunctionCraftParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(FunctionCraftParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(FunctionCraftParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_pointer}.
	 * @param ctx the parse tree
	 */
	void enterFunction_pointer(FunctionCraftParser.Function_pointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_pointer}.
	 * @param ctx the parse tree
	 */
	void exitFunction_pointer(FunctionCraftParser.Function_pointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#inc_dec_operator}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec_operator(FunctionCraftParser.Inc_dec_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#inc_dec_operator}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec_operator(FunctionCraftParser.Inc_dec_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#plus_minus_operator}.
	 * @param ctx the parse tree
	 */
	void enterPlus_minus_operator(FunctionCraftParser.Plus_minus_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#plus_minus_operator}.
	 * @param ctx the parse tree
	 */
	void exitPlus_minus_operator(FunctionCraftParser.Plus_minus_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assign_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssign_operator(FunctionCraftParser.Assign_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assign_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssign_operator(FunctionCraftParser.Assign_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#append}.
	 * @param ctx the parse tree
	 */
	void enterAppend(FunctionCraftParser.AppendContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#append}.
	 * @param ctx the parse tree
	 */
	void exitAppend(FunctionCraftParser.AppendContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#append_prime}.
	 * @param ctx the parse tree
	 */
	void enterAppend_prime(FunctionCraftParser.Append_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#append_prime}.
	 * @param ctx the parse tree
	 */
	void exitAppend_prime(FunctionCraftParser.Append_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(FunctionCraftParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(FunctionCraftParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#or_prime}.
	 * @param ctx the parse tree
	 */
	void enterOr_prime(FunctionCraftParser.Or_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#or_prime}.
	 * @param ctx the parse tree
	 */
	void exitOr_prime(FunctionCraftParser.Or_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(FunctionCraftParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(FunctionCraftParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#and_prime}.
	 * @param ctx the parse tree
	 */
	void enterAnd_prime(FunctionCraftParser.And_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#and_prime}.
	 * @param ctx the parse tree
	 */
	void exitAnd_prime(FunctionCraftParser.And_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(FunctionCraftParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(FunctionCraftParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#equality_prime}.
	 * @param ctx the parse tree
	 */
	void enterEquality_prime(FunctionCraftParser.Equality_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#equality_prime}.
	 * @param ctx the parse tree
	 */
	void exitEquality_prime(FunctionCraftParser.Equality_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(FunctionCraftParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(FunctionCraftParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#comparison_prime}.
	 * @param ctx the parse tree
	 */
	void enterComparison_prime(FunctionCraftParser.Comparison_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#comparison_prime}.
	 * @param ctx the parse tree
	 */
	void exitComparison_prime(FunctionCraftParser.Comparison_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub(FunctionCraftParser.Add_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub(FunctionCraftParser.Add_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#add_sub_prime}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub_prime(FunctionCraftParser.Add_sub_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#add_sub_prime}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub_prime(FunctionCraftParser.Add_sub_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#mul_div_mod}.
	 * @param ctx the parse tree
	 */
	void enterMul_div_mod(FunctionCraftParser.Mul_div_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#mul_div_mod}.
	 * @param ctx the parse tree
	 */
	void exitMul_div_mod(FunctionCraftParser.Mul_div_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#mul_div_mod_prime}.
	 * @param ctx the parse tree
	 */
	void enterMul_div_mod_prime(FunctionCraftParser.Mul_div_mod_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#mul_div_mod_prime}.
	 * @param ctx the parse tree
	 */
	void exitMul_div_mod_prime(FunctionCraftParser.Mul_div_mod_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#not_neg}.
	 * @param ctx the parse tree
	 */
	void enterNot_neg(FunctionCraftParser.Not_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#not_neg}.
	 * @param ctx the parse tree
	 */
	void exitNot_neg(FunctionCraftParser.Not_negContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec(FunctionCraftParser.Inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec(FunctionCraftParser.Inc_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#bracket}.
	 * @param ctx the parse tree
	 */
	void enterBracket(FunctionCraftParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#bracket}.
	 * @param ctx the parse tree
	 */
	void exitBracket(FunctionCraftParser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(FunctionCraftParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(FunctionCraftParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FunctionCraftParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(FunctionCraftParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(FunctionCraftParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#indexing}.
	 * @param ctx the parse tree
	 */
	void enterIndexing(FunctionCraftParser.IndexingContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#indexing}.
	 * @param ctx the parse tree
	 */
	void exitIndexing(FunctionCraftParser.IndexingContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void enterPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void exitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void enterChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void exitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void enterChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void exitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#do_loop}.
	 * @param ctx the parse tree
	 */
	void enterDo_loop(FunctionCraftParser.Do_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#do_loop}.
	 * @param ctx the parse tree
	 */
	void exitDo_loop(FunctionCraftParser.Do_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(FunctionCraftParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(FunctionCraftParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break_next}.
	 * @param ctx the parse tree
	 */
	void enterBreak_next(FunctionCraftParser.Break_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break_next}.
	 * @param ctx the parse tree
	 */
	void exitBreak_next(FunctionCraftParser.Break_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if_in_loop}.
	 * @param ctx the parse tree
	 */
	void enterIf_in_loop(FunctionCraftParser.If_in_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if_in_loop}.
	 * @param ctx the parse tree
	 */
	void exitIf_in_loop(FunctionCraftParser.If_in_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void enterLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void exitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
}