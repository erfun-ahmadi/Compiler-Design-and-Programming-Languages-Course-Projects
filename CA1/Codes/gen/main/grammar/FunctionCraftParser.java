// Generated from E:/Semester 6/Design Compiler And Programming Languages/CA/1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LPAR=2, RPAR=3, LBRACKET=4, RBRACKET=5, LBRACE=6, RBRACE=7, DQUATE=8, 
		ARROW=9, COLON=10, SEMICOLON=11, COMMA=12, DEF=13, END=14, MAIN=15, RETURN=16, 
		IF=17, ELSE=18, ELSEIF=19, TRUE=20, FALSE=21, CHOP=22, CHOMP=23, PUSH=24, 
		PUTS=25, METHOD=26, LEN=27, PATTERN=28, MATCH=29, NEXT_IF=30, BREAK_IF=31, 
		NEXT=32, BREAK=33, LOOP=34, DO=35, FOR=36, IN=37, PLUS=38, MINUS=39, MULTIPLY=40, 
		DIVIDE=41, REMAINDER=42, DECREMENT=43, INCREMENT=44, ASSIGN=45, GREATER_THAN=46, 
		LESS_THAN=47, LESS_EQUAL=48, GREATER_EQUAL=49, AND=50, OR=51, NOT=52, 
		SINGLE_DOT=53, DOUBLE_DOT=54, APPEND=55, PLUS_ASSIGN=56, MINUS_ASSIGN=57, 
		MULTIPLY_ASSIGN=58, DIVIDE_ASSIGN=59, REMAINDER_ASSIGN=60, EQUAL=61, NOT_EQUAL=62, 
		IDENTIFIER=63, FLOAT=64, INTEGER=65, STRING=66, MULTILINE_COMMENT=67, 
		SINGLELINE_COMMENT=68, WS=69;
	public static final int
		RULE_program = 0, RULE_tab_or = 1, RULE_comment = 2, RULE_number = 3, 
		RULE_bool = 4, RULE_function_pointer = 5, RULE_inc_dec_operator = 6, RULE_plus_minus_operator = 7, 
		RULE_assign_operator = 8, RULE_assignment = 9, RULE_append = 10, RULE_append_prime = 11, 
		RULE_or = 12, RULE_or_prime = 13, RULE_and = 14, RULE_and_prime = 15, 
		RULE_equality = 16, RULE_equality_prime = 17, RULE_comparison = 18, RULE_comparison_prime = 19, 
		RULE_add_sub = 20, RULE_add_sub_prime = 21, RULE_mul_div_mod = 22, RULE_mul_div_mod_prime = 23, 
		RULE_not_neg = 24, RULE_inc_dec = 25, RULE_bracket = 26, RULE_parentheses = 27, 
		RULE_value = 28, RULE_list = 29, RULE_elements = 30, RULE_indexing = 31, 
		RULE_range = 32, RULE_puts = 33, RULE_push = 34, RULE_len = 35, RULE_chop = 36, 
		RULE_chomp = 37, RULE_do_loop = 38, RULE_for = 39, RULE_break_next = 40, 
		RULE_if = 41, RULE_if_in_loop = 42, RULE_statement = 43, RULE_pattern = 44, 
		RULE_match = 45, RULE_function = 46, RULE_lambda_function = 47, RULE_main = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "tab_or", "comment", "number", "bool", "function_pointer", 
			"inc_dec_operator", "plus_minus_operator", "assign_operator", "assignment", 
			"append", "append_prime", "or", "or_prime", "and", "and_prime", "equality", 
			"equality_prime", "comparison", "comparison_prime", "add_sub", "add_sub_prime", 
			"mul_div_mod", "mul_div_mod_prime", "not_neg", "inc_dec", "bracket", 
			"parentheses", "value", "list", "elements", "indexing", "range", "puts", 
			"push", "len", "chop", "chomp", "do_loop", "for", "break_next", "if", 
			"if_in_loop", "statement", "pattern", "match", "function", "lambda_function", 
			"main"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'    |'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\"'", "'->'", 
			"':'", "';'", "','", "'def'", "'end'", "'main'", "'return'", "'if'", 
			"'else'", "'elseif'", "'true'", "'false'", "'chop'", "'chomp'", "'push'", 
			"'puts'", "'method'", "'len'", "'pattern'", "'match'", "'next if'", "'break if'", 
			"'next'", "'break'", "'loop'", "'do'", "'for'", "'in'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'--'", "'++'", "'='", "'>'", "'<'", "'<='", "'>='", 
			"'&&'", "'||'", "'!'", "'.'", "'..'", "'<<'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LPAR", "RPAR", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", 
			"DQUATE", "ARROW", "COLON", "SEMICOLON", "COMMA", "DEF", "END", "MAIN", 
			"RETURN", "IF", "ELSE", "ELSEIF", "TRUE", "FALSE", "CHOP", "CHOMP", "PUSH", 
			"PUTS", "METHOD", "LEN", "PATTERN", "MATCH", "NEXT_IF", "BREAK_IF", "NEXT", 
			"BREAK", "LOOP", "DO", "FOR", "IN", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"REMAINDER", "DECREMENT", "INCREMENT", "ASSIGN", "GREATER_THAN", "LESS_THAN", 
			"LESS_EQUAL", "GREATER_EQUAL", "AND", "OR", "NOT", "SINGLE_DOT", "DOUBLE_DOT", 
			"APPEND", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULTIPLY_ASSIGN", "DIVIDE_ASSIGN", 
			"REMAINDER_ASSIGN", "EQUAL", "NOT_EQUAL", "IDENTIFIER", "FLOAT", "INTEGER", 
			"STRING", "MULTILINE_COMMENT", "SINGLELINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(101);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
						{
						setState(98);
						function();
						}
						break;
					case PATTERN:
						{
						setState(99);
						pattern();
						}
						break;
					case MULTILINE_COMMENT:
					case SINGLELINE_COMMENT:
						{
						setState(100);
						comment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(106);
			main();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTILINE_COMMENT || _la==SINGLELINE_COMMENT) {
				{
				{
				setState(107);
				comment();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tab_orContext extends ParserRuleContext {
		public Tab_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterTab_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitTab_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitTab_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tab_orContext tab_or() throws RecognitionException {
		Tab_orContext _localctx = new Tab_orContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tab_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SINGLELINE_COMMENT() { return getToken(FunctionCraftParser.SINGLELINE_COMMENT, 0); }
		public TerminalNode MULTILINE_COMMENT() { return getToken(FunctionCraftParser.MULTILINE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==MULTILINE_COMMENT || _la==SINGLELINE_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(FunctionCraftParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(FunctionCraftParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==INTEGER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(FunctionCraftParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_pointerContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Function_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_pointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_pointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_pointerContext function_pointer() throws RecognitionException {
		Function_pointerContext _localctx = new Function_pointerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(METHOD);
			setState(122);
			match(LPAR);
			setState(123);
			match(COLON);
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inc_dec_operatorContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(FunctionCraftParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(FunctionCraftParser.DECREMENT, 0); }
		public Inc_dec_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterInc_dec_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitInc_dec_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitInc_dec_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_dec_operatorContext inc_dec_operator() throws RecognitionException {
		Inc_dec_operatorContext _localctx = new Inc_dec_operatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inc_dec_operator);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(INCREMENT);
				System.out.println("Operator: ++");
				}
				break;
			case DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(DECREMENT);
				System.out.println("Operator: --");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Plus_minus_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Plus_minus_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus_minus_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPlus_minus_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPlus_minus_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPlus_minus_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plus_minus_operatorContext plus_minus_operator() throws RecognitionException {
		Plus_minus_operatorContext _localctx = new Plus_minus_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_plus_minus_operator);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(PLUS);
				System.out.println("Operator: +");
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(MINUS);
				System.out.println("Operator: -");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(FunctionCraftParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(FunctionCraftParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULTIPLY_ASSIGN() { return getToken(FunctionCraftParser.MULTIPLY_ASSIGN, 0); }
		public TerminalNode DIVIDE_ASSIGN() { return getToken(FunctionCraftParser.DIVIDE_ASSIGN, 0); }
		public TerminalNode REMAINDER_ASSIGN() { return getToken(FunctionCraftParser.REMAINDER_ASSIGN, 0); }
		public Assign_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssign_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssign_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssign_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_operatorContext assign_operator() throws RecognitionException {
		Assign_operatorContext _localctx = new Assign_operatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2233820599547854848L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Token name;
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				((AssignmentContext)_localctx).name = match(IDENTIFIER);
				System.out.println("Assignment: " + (((AssignmentContext)_localctx).name!=null?((AssignmentContext)_localctx).name.getText():null));
				setState(143);
				assign_operator();
				setState(144);
				append();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				append();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppendContext extends ParserRuleContext {
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public List<Append_primeContext> append_prime() {
			return getRuleContexts(Append_primeContext.class);
		}
		public Append_primeContext append_prime(int i) {
			return getRuleContext(Append_primeContext.class,i);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_append);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				or();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==APPEND) {
					{
					{
					setState(150);
					append_prime();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				equality();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==APPEND) {
					{
					{
					setState(157);
					append_prime();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Append_primeContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(FunctionCraftParser.APPEND, 0); }
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public Append_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppend_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppend_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppend_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Append_primeContext append_prime() throws RecognitionException {
		Append_primeContext _localctx = new Append_primeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_append_prime);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(APPEND);
				setState(166);
				or();
				System.out.println("Operator: <<");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(APPEND);
				setState(170);
				equality();
				System.out.println("Operator: <<");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public List<Or_primeContext> or_prime() {
			return getRuleContexts(Or_primeContext.class);
		}
		public Or_primeContext or_prime(int i) {
			return getRuleContext(Or_primeContext.class,i);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			and();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(176);
				or_prime();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Or_primeContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public Or_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterOr_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitOr_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitOr_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_primeContext or_prime() throws RecognitionException {
		Or_primeContext _localctx = new Or_primeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_or_prime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(OR);
			setState(183);
			and();
			System.out.println("Operator: ||");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ParserRuleContext {
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public List<And_primeContext> and_prime() {
			return getRuleContexts(And_primeContext.class);
		}
		public And_primeContext and_prime(int i) {
			return getRuleContext(And_primeContext.class,i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			parentheses();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(187);
				and_prime();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class And_primeContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public And_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAnd_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAnd_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAnd_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_primeContext and_prime() throws RecognitionException {
		And_primeContext _localctx = new And_primeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_and_prime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(AND);
			setState(194);
			parentheses();
			System.out.println("Operator: &&");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<Equality_primeContext> equality_prime() {
			return getRuleContexts(Equality_primeContext.class);
		}
		public Equality_primeContext equality_prime(int i) {
			return getRuleContext(Equality_primeContext.class,i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			comparison();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOT_EQUAL) {
				{
				{
				setState(198);
				equality_prime();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Equality_primeContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(FunctionCraftParser.EQUAL, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(FunctionCraftParser.NOT_EQUAL, 0); }
		public Equality_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterEquality_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitEquality_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitEquality_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_primeContext equality_prime() throws RecognitionException {
		Equality_primeContext _localctx = new Equality_primeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equality_prime);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(EQUAL);
				setState(205);
				comparison();
				System.out.println("Operator: ==");
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(NOT_EQUAL);
				setState(209);
				comparison();
				System.out.println("Operator: !=");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
		}
		public List<Comparison_primeContext> comparison_prime() {
			return getRuleContexts(Comparison_primeContext.class);
		}
		public Comparison_primeContext comparison_prime(int i) {
			return getRuleContext(Comparison_primeContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			add_sub();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) {
				{
				{
				setState(215);
				comparison_prime();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comparison_primeContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(FunctionCraftParser.LESS_THAN, 0); }
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
		}
		public TerminalNode LESS_EQUAL() { return getToken(FunctionCraftParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(FunctionCraftParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(FunctionCraftParser.GREATER_EQUAL, 0); }
		public Comparison_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterComparison_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitComparison_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitComparison_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_primeContext comparison_prime() throws RecognitionException {
		Comparison_primeContext _localctx = new Comparison_primeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparison_prime);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS_THAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(LESS_THAN);
				setState(222);
				add_sub();
				System.out.println("Operator: <");
				}
				break;
			case LESS_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(LESS_EQUAL);
				setState(226);
				add_sub();
				System.out.println("Operator: <=");
				}
				break;
			case GREATER_THAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(GREATER_THAN);
				setState(230);
				add_sub();
				System.out.println("Operator: >");
				}
				break;
			case GREATER_EQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(GREATER_EQUAL);
				setState(234);
				add_sub();
				System.out.println("Operator: >=");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Add_subContext extends ParserRuleContext {
		public Mul_div_modContext mul_div_mod() {
			return getRuleContext(Mul_div_modContext.class,0);
		}
		public List<Add_sub_primeContext> add_sub_prime() {
			return getRuleContexts(Add_sub_primeContext.class);
		}
		public Add_sub_primeContext add_sub_prime(int i) {
			return getRuleContext(Add_sub_primeContext.class,i);
		}
		public Add_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAdd_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAdd_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAdd_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_subContext add_sub() throws RecognitionException {
		Add_subContext _localctx = new Add_subContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			mul_div_mod();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(240);
				add_sub_prime();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Add_sub_primeContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public Mul_div_modContext mul_div_mod() {
			return getRuleContext(Mul_div_modContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Add_sub_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAdd_sub_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAdd_sub_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAdd_sub_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_sub_primeContext add_sub_prime() throws RecognitionException {
		Add_sub_primeContext _localctx = new Add_sub_primeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_add_sub_prime);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(PLUS);
				setState(247);
				mul_div_mod();
				System.out.println("Operator: +");
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(MINUS);
				setState(251);
				mul_div_mod();
				System.out.println("Operator: -");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mul_div_modContext extends ParserRuleContext {
		public Not_negContext not_neg() {
			return getRuleContext(Not_negContext.class,0);
		}
		public List<Mul_div_mod_primeContext> mul_div_mod_prime() {
			return getRuleContexts(Mul_div_mod_primeContext.class);
		}
		public Mul_div_mod_primeContext mul_div_mod_prime(int i) {
			return getRuleContext(Mul_div_mod_primeContext.class,i);
		}
		public Mul_div_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_div_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMul_div_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMul_div_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMul_div_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_div_modContext mul_div_mod() throws RecognitionException {
		Mul_div_modContext _localctx = new Mul_div_modContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mul_div_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			not_neg();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394432L) != 0)) {
				{
				{
				setState(257);
				mul_div_mod_prime();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mul_div_mod_primeContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(FunctionCraftParser.MULTIPLY, 0); }
		public Not_negContext not_neg() {
			return getRuleContext(Not_negContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(FunctionCraftParser.DIVIDE, 0); }
		public TerminalNode REMAINDER() { return getToken(FunctionCraftParser.REMAINDER, 0); }
		public Mul_div_mod_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_div_mod_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMul_div_mod_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMul_div_mod_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMul_div_mod_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_div_mod_primeContext mul_div_mod_prime() throws RecognitionException {
		Mul_div_mod_primeContext _localctx = new Mul_div_mod_primeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mul_div_mod_prime);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(MULTIPLY);
				setState(264);
				not_neg();
				System.out.println("Operator: *");
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(DIVIDE);
				setState(268);
				not_neg();
				System.out.println("Operator: /");
				}
				break;
			case REMAINDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(REMAINDER);
				setState(272);
				not_neg();
				System.out.println("Operator: %");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Not_negContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Not_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNot_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNot_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNot_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_negContext not_neg() throws RecognitionException {
		Not_negContext _localctx = new Not_negContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_not_neg);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(NOT);
				setState(278);
				inc_dec();
				System.out.println("Operator: !");
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(MINUS);
				setState(282);
				inc_dec();
				System.out.println("Operator: -");
				}
				break;
			case LPAR:
			case LBRACKET:
			case ARROW:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case METHOD:
			case LEN:
			case IDENTIFIER:
			case FLOAT:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				inc_dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inc_decContext extends ParserRuleContext {
		public BracketContext bracket() {
			return getRuleContext(BracketContext.class,0);
		}
		public Inc_dec_operatorContext inc_dec_operator() {
			return getRuleContext(Inc_dec_operatorContext.class,0);
		}
		public Inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitInc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitInc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_inc_dec);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				bracket();
				setState(289);
				inc_dec_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				bracket();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BracketContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketContext bracket() throws RecognitionException {
		BracketContext _localctx = new BracketContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bracket);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				list();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				parentheses();
				}
				break;
			case ARROW:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case METHOD:
			case LEN:
			case IDENTIFIER:
			case FLOAT:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesContext extends ParserRuleContext {
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public ParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesesContext parentheses() throws RecognitionException {
		ParenthesesContext _localctx = new ParenthesesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(LPAR);
			setState(300);
			append();
			setState(301);
			match(RPAR);
			setState(302);
			match(LPAR);
			setState(303);
			equality();
			setState(304);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(FunctionCraftParser.STRING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public IndexingContext indexing() {
			return getRuleContext(IndexingContext.class,0);
		}
		public Function_pointerContext function_pointer() {
			return getRuleContext(Function_pointerContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public ChopContext chop() {
			return getRuleContext(ChopContext.class,0);
		}
		public ChompContext chomp() {
			return getRuleContext(ChompContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_value);
		int _la;
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				bool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(IDENTIFIER);
				setState(310);
				indexing();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				function_pointer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				match(IDENTIFIER);
				setState(313);
				match(LPAR);
				System.out.println("Function Call");
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9218867887254535660L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					setState(315);
					elements();
					}
				}

				setState(318);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(319);
				match();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(320);
				len();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(321);
				chop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(322);
				chomp();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(323);
				lambda_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_list);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(LBRACKET);
				setState(327);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(LBRACKET);
				setState(329);
				elements();
				setState(330);
				match(RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementsContext extends ParserRuleContext {
		public List<AppendContext> append() {
			return getRuleContexts(AppendContext.class);
		}
		public AppendContext append(int i) {
			return getRuleContext(AppendContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elements);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				append();
				setState(339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
				case PLUS_ASSIGN:
				case MINUS_ASSIGN:
				case MULTIPLY_ASSIGN:
				case DIVIDE_ASSIGN:
				case REMAINDER_ASSIGN:
					{
					setState(335);
					assign_operator();
					setState(336);
					append();
					}
					break;
				case COMMA:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(341);
				match(COMMA);
				setState(342);
				elements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				append();
				setState(349);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
				case PLUS_ASSIGN:
				case MINUS_ASSIGN:
				case MULTIPLY_ASSIGN:
				case DIVIDE_ASSIGN:
				case REMAINDER_ASSIGN:
					{
					setState(345);
					assign_operator();
					setState(346);
					append();
					}
					break;
				case RPAR:
				case RBRACKET:
				case SEMICOLON:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexingContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public IndexingContext indexing() {
			return getRuleContext(IndexingContext.class,0);
		}
		public IndexingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIndexing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingContext indexing() throws RecognitionException {
		IndexingContext _localctx = new IndexingContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_indexing);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(LBRACKET);
				setState(354);
				assignment();
				setState(355);
				match(RBRACKET);
				setState(356);
				indexing();
				}
				break;
			case T__0:
			case RPAR:
			case RBRACKET:
			case SEMICOLON:
			case COMMA:
			case PLUS:
			case MINUS:
			case MULTIPLY:
			case DIVIDE:
			case REMAINDER:
			case DECREMENT:
			case INCREMENT:
			case ASSIGN:
			case GREATER_THAN:
			case LESS_THAN:
			case LESS_EQUAL:
			case GREATER_EQUAL:
			case APPEND:
			case PLUS_ASSIGN:
			case MINUS_ASSIGN:
			case MULTIPLY_ASSIGN:
			case DIVIDE_ASSIGN:
			case REMAINDER_ASSIGN:
			case EQUAL:
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode DOUBLE_DOT() { return getToken(FunctionCraftParser.DOUBLE_DOT, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_range);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(LPAR);
				setState(362);
				number();
				setState(363);
				match(DOUBLE_DOT);
				setState(364);
				number();
				setState(365);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(LPAR);
				setState(368);
				number();
				setState(369);
				match(DOUBLE_DOT);
				setState(370);
				match(IDENTIFIER);
				setState(371);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(LPAR);
				setState(374);
				match(IDENTIFIER);
				setState(375);
				match(DOUBLE_DOT);
				setState(376);
				number();
				setState(377);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				match(LPAR);
				setState(380);
				match(IDENTIFIER);
				setState(381);
				match(DOUBLE_DOT);
				setState(382);
				match(IDENTIFIER);
				setState(383);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PutsContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public PutsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPuts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPuts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPuts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutsContext puts() throws RecognitionException {
		PutsContext _localctx = new PutsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(PUTS);
			System.out.println("Built-In: PUTS");
			setState(388);
			match(LPAR);
			setState(389);
			assignment();
			setState(390);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(FunctionCraftParser.STRING, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(PUSH);
			System.out.println("Built-In: PUSH");
			setState(394);
			match(LPAR);
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(395);
				match(IDENTIFIER);
				}
				break;
			case LBRACKET:
				{
				setState(396);
				list();
				}
				break;
			case STRING:
				{
				setState(397);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(400);
			match(COMMA);
			setState(401);
			assignment();
			setState(402);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(FunctionCraftParser.STRING, 0); }
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(LEN);
			System.out.println("Built-In: LEN");
			setState(406);
			match(LPAR);
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				{
				setState(407);
				list();
				}
				break;
			case IDENTIFIER:
				{
				setState(408);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				{
				setState(409);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(412);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChopContext extends ParserRuleContext {
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode STRING() { return getToken(FunctionCraftParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ChopContext chop() {
			return getRuleContext(ChopContext.class,0);
		}
		public ChopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChopContext chop() throws RecognitionException {
		ChopContext _localctx = new ChopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_chop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(CHOP);
			System.out.println("Built-In: CHOP");
			setState(416);
			match(LPAR);
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(417);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				setState(418);
				match(IDENTIFIER);
				}
				break;
			case CHOP:
				{
				setState(419);
				chop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(422);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChompContext extends ParserRuleContext {
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode STRING() { return getToken(FunctionCraftParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ChompContext chomp() {
			return getRuleContext(ChompContext.class,0);
		}
		public ChompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChompContext chomp() throws RecognitionException {
		ChompContext _localctx = new ChompContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_chomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(CHOMP);
			System.out.println("Built-In: CHOMP");
			setState(426);
			match(LPAR);
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(427);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				setState(428);
				match(IDENTIFIER);
				}
				break;
			case CHOMP:
				{
				setState(429);
				chomp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(432);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_loopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<If_in_loopContext> if_in_loop() {
			return getRuleContexts(If_in_loopContext.class);
		}
		public If_in_loopContext if_in_loop(int i) {
			return getRuleContext(If_in_loopContext.class,i);
		}
		public List<Break_nextContext> break_next() {
			return getRuleContexts(Break_nextContext.class);
		}
		public Break_nextContext break_next(int i) {
			return getRuleContext(Break_nextContext.class,i);
		}
		public Do_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterDo_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitDo_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitDo_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_loopContext do_loop() throws RecognitionException {
		Do_loopContext _localctx = new Do_loopContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_do_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(LOOP);
			setState(435);
			match(DO);
			System.out.println("Loop: DO");
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9218867853918076396L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
				{
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(437);
					statement();
					}
					break;
				case 2:
					{
					setState(438);
					if_in_loop();
					}
					break;
				case 3:
					{
					setState(439);
					break_next();
					}
					break;
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(445);
				match(RETURN);
				System.out.println("RETURN");
				setState(447);
				elements();
				setState(448);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(450);
				match(RETURN);
				System.out.println("RETURN");
				setState(452);
				match(LPAR);
				setState(453);
				elements();
				setState(454);
				match(RPAR);
				setState(455);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(460);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<If_in_loopContext> if_in_loop() {
			return getRuleContexts(If_in_loopContext.class);
		}
		public If_in_loopContext if_in_loop(int i) {
			return getRuleContext(If_in_loopContext.class,i);
		}
		public List<Break_nextContext> break_next() {
			return getRuleContexts(Break_nextContext.class);
		}
		public Break_nextContext break_next(int i) {
			return getRuleContext(Break_nextContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(FOR);
			System.out.println("Loop: FOR");
			setState(464);
			match(IDENTIFIER);
			setState(465);
			match(IN);
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(466);
				match(IDENTIFIER);
				}
				break;
			case LBRACKET:
				{
				setState(467);
				list();
				}
				break;
			case LPAR:
				{
				setState(468);
				range();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9218867853918076396L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
				{
				setState(474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(471);
					statement();
					}
					break;
				case 2:
					{
					setState(472);
					if_in_loop();
					}
					break;
				case 3:
					{
					setState(473);
					break_next();
					}
					break;
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(479);
				match(RETURN);
				System.out.println("RETURN");
				setState(481);
				elements();
				setState(482);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(484);
				match(RETURN);
				System.out.println("RETURN");
				setState(486);
				match(LPAR);
				setState(487);
				elements();
				setState(488);
				match(RPAR);
				setState(489);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(494);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_nextContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode NEXT_IF() { return getToken(FunctionCraftParser.NEXT_IF, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode BREAK_IF() { return getToken(FunctionCraftParser.BREAK_IF, 0); }
		public Break_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak_next(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_nextContext break_next() throws RecognitionException {
		Break_nextContext _localctx = new Break_nextContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_break_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
				{
				setState(496);
				match(NEXT);
				System.out.println("Control: NEXT");
				}
				break;
			case BREAK:
				{
				setState(498);
				match(BREAK);
				System.out.println("Control: BREAK");
				}
				break;
			case NEXT_IF:
				{
				setState(500);
				match(NEXT_IF);
				System.out.println("Control: NEXT");
				setState(502);
				match(LPAR);
				setState(503);
				assignment();
				setState(504);
				match(RPAR);
				}
				break;
			case BREAK_IF:
				{
				setState(506);
				match(BREAK_IF);
				System.out.println("Control: BREAK");
				setState(508);
				match(LPAR);
				setState(509);
				assignment();
				setState(510);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(514);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<TerminalNode> RETURN() { return getTokens(FunctionCraftParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(FunctionCraftParser.RETURN, i);
		}
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FunctionCraftParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FunctionCraftParser.SEMICOLON, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(FunctionCraftParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(FunctionCraftParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(IF);
			System.out.println("Decision: IF");
			setState(518);
			match(LPAR);
			setState(519);
			assignment();
			setState(520);
			match(RPAR);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9218867870024203756L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
				{
				{
				setState(521);
				statement();
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(527);
				match(RETURN);
				System.out.println("RETURN");
				setState(529);
				elements();
				setState(530);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(532);
				match(RETURN);
				System.out.println("RETURN");
				setState(534);
				match(LPAR);
				setState(535);
				elements();
				setState(536);
				match(RPAR);
				setState(537);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(542);
				match(ELSEIF);
				System.out.println("Decision: ELSE IF");
				setState(544);
				match(LPAR);
				setState(545);
				assignment();
				setState(546);
				match(RPAR);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9218867870024203756L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
					{
					{
					setState(547);
					statement();
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(553);
					match(RETURN);
					System.out.println("RETURN");
					setState(555);
					elements();
					setState(556);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(558);
					match(RETURN);
					System.out.println("RETURN");
					setState(560);
					match(LPAR);
					setState(561);
					elements();
					setState(562);
					match(RPAR);
					setState(563);
					match(SEMICOLON);
					}
					break;
				case 3:
					{
					}
					break;
				}
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(573);
				match(ELSE);
				System.out.println("Decision: ELSE");
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9218867870024203756L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
					{
					{
					setState(575);
					statement();
					}
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(581);
					match(RETURN);
					System.out.println("RETURN");
					setState(583);
					elements();
					setState(584);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(586);
					match(RETURN);
					System.out.println("RETURN");
					setState(588);
					match(LPAR);
					setState(589);
					elements();
					setState(590);
					match(RPAR);
					setState(591);
					match(SEMICOLON);
					}
					break;
				case 3:
					{
					}
					break;
				}
				}
			}

			setState(598);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_in_loopContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<TerminalNode> RETURN() { return getTokens(FunctionCraftParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(FunctionCraftParser.RETURN, i);
		}
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FunctionCraftParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FunctionCraftParser.SEMICOLON, i);
		}
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Break_nextContext> break_next() {
			return getRuleContexts(Break_nextContext.class);
		}
		public Break_nextContext break_next(int i) {
			return getRuleContext(Break_nextContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(FunctionCraftParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(FunctionCraftParser.ELSEIF, i);
		}
		public If_in_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_in_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf_in_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf_in_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf_in_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_in_loopContext if_in_loop() throws RecognitionException {
		If_in_loopContext _localctx = new If_in_loopContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_if_in_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(IF);
			System.out.println("Decision: IF");
			setState(602);
			match(LPAR);
			setState(603);
			assignment();
			setState(604);
			match(RPAR);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9218867853918076396L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
				{
				setState(607);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
				case LBRACKET:
				case ARROW:
				case IF:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case LOOP:
				case MINUS:
				case NOT:
				case IDENTIFIER:
				case FLOAT:
				case INTEGER:
				case STRING:
				case MULTILINE_COMMENT:
				case SINGLELINE_COMMENT:
					{
					setState(605);
					statement();
					}
					break;
				case NEXT_IF:
				case BREAK_IF:
				case NEXT:
				case BREAK:
					{
					setState(606);
					break_next();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(612);
				match(RETURN);
				System.out.println("RETURN");
				setState(614);
				elements();
				setState(615);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(617);
				match(RETURN);
				System.out.println("RETURN");
				setState(619);
				match(LPAR);
				setState(620);
				elements();
				setState(621);
				match(RPAR);
				setState(622);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(627);
				match(ELSEIF);
				System.out.println("Decision: ELSE IF");
				setState(629);
				match(LPAR);
				setState(630);
				assignment();
				setState(631);
				match(RPAR);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9218867853918076396L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
					{
					setState(634);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
					case LBRACKET:
					case ARROW:
					case IF:
					case TRUE:
					case FALSE:
					case CHOP:
					case CHOMP:
					case PUSH:
					case PUTS:
					case METHOD:
					case LEN:
					case LOOP:
					case MINUS:
					case NOT:
					case IDENTIFIER:
					case FLOAT:
					case INTEGER:
					case STRING:
					case MULTILINE_COMMENT:
					case SINGLELINE_COMMENT:
						{
						setState(632);
						statement();
						}
						break;
					case NEXT_IF:
					case BREAK_IF:
					case NEXT:
					case BREAK:
						{
						setState(633);
						break_next();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(639);
					match(RETURN);
					System.out.println("RETURN");
					setState(641);
					elements();
					setState(642);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(644);
					match(RETURN);
					System.out.println("RETURN");
					setState(646);
					match(LPAR);
					setState(647);
					elements();
					setState(648);
					match(RPAR);
					setState(649);
					match(SEMICOLON);
					}
					break;
				case 3:
					{
					}
					break;
				}
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(659);
			match(ELSE);
			System.out.println("Decision: ELSE");
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9218867853918076396L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
				{
				setState(663);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
				case LBRACKET:
				case ARROW:
				case IF:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case LOOP:
				case MINUS:
				case NOT:
				case IDENTIFIER:
				case FLOAT:
				case INTEGER:
				case STRING:
				case MULTILINE_COMMENT:
				case SINGLELINE_COMMENT:
					{
					setState(661);
					statement();
					}
					break;
				case NEXT_IF:
				case BREAK_IF:
				case NEXT:
				case BREAK:
					{
					setState(662);
					break_next();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(668);
				match(RETURN);
				System.out.println("RETURN");
				setState(670);
				elements();
				setState(671);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(673);
				match(RETURN);
				System.out.println("RETURN");
				setState(675);
				match(LPAR);
				setState(676);
				elements();
				setState(677);
				match(RPAR);
				setState(678);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				}
				break;
			}
			}
			setState(683);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PutsContext puts() {
			return getRuleContext(PutsContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Do_loopContext do_loop() {
			return getRuleContext(Do_loopContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_statement);
		try {
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case LBRACKET:
			case ARROW:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LEN:
			case MINUS:
			case NOT:
			case IDENTIFIER:
			case FLOAT:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
				case LBRACKET:
				case ARROW:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case METHOD:
				case LEN:
				case MINUS:
				case NOT:
				case IDENTIFIER:
				case FLOAT:
				case INTEGER:
				case STRING:
					{
					setState(685);
					assignment();
					}
					break;
				case PUTS:
					{
					setState(686);
					puts();
					}
					break;
				case PUSH:
					{
					setState(687);
					push();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(690);
				match(SEMICOLON);
				}
				break;
			case MULTILINE_COMMENT:
			case SINGLELINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				comment();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				do_loop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(694);
				if_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(PATTERN);
			setState(698);
			((PatternContext)_localctx).name = match(IDENTIFIER);
			System.out.println("PatternDec: " + (((PatternContext)_localctx).name!=null?((PatternContext)_localctx).name.getText():null));
			setState(700);
			match(LPAR);
			setState(701);
			elements();
			setState(702);
			match(RPAR);
			setState(710); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(703);
				match(T__0);
				setState(704);
				match(LPAR);
				setState(705);
				assignment();
				setState(706);
				match(RPAR);
				setState(707);
				match(ASSIGN);
				setState(708);
				assignment();
				}
				}
				setState(712); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(714);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode SINGLE_DOT() { return getToken(FunctionCraftParser.SINGLE_DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(IDENTIFIER);
			setState(717);
			match(SINGLE_DOT);
			setState(718);
			match(MATCH);
			System.out.println("Built-In: MATCH");
			setState(720);
			match(LPAR);
			setState(721);
			assignment();
			setState(722);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(DEF);
			setState(725);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
			System.out.println("FuncDec: " + (((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null));
			setState(727);
			match(LPAR);
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case LBRACKET:
			case ARROW:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case METHOD:
			case LEN:
			case MINUS:
			case NOT:
			case IDENTIFIER:
			case FLOAT:
			case INTEGER:
			case STRING:
				{
				setState(728);
				elements();
				}
				break;
			case RPAR:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(732);
			match(RPAR);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9218867870024203756L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
				{
				{
				setState(733);
				statement();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(739);
				match(RETURN);
				System.out.println("RETURN");
				setState(741);
				elements();
				setState(742);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(744);
				match(RETURN);
				System.out.println("RETURN");
				setState(746);
				match(LPAR);
				setState(747);
				elements();
				setState(748);
				match(RPAR);
				setState(749);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(754);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_functionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(FunctionCraftParser.ARROW, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public TerminalNode LBRACE() { return getToken(FunctionCraftParser.LBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(FunctionCraftParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FunctionCraftParser.SEMICOLON, i);
		}
		public TerminalNode RBRACE() { return getToken(FunctionCraftParser.RBRACE, 0); }
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public Lambda_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambda_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambda_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambda_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_functionContext lambda_function() throws RecognitionException {
		Lambda_functionContext _localctx = new Lambda_functionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lambda_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(ARROW);
			System.out.println("Structure: LAMBDA");
			setState(758);
			match(LPAR);
			setState(759);
			elements();
			setState(760);
			match(RPAR);
			setState(761);
			match(LBRACE);
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(762);
				match(RETURN);
				System.out.println("RETURN");
				setState(764);
				elements();
				}
				break;
			case 2:
				{
				setState(765);
				match(RETURN);
				System.out.println("RETURN");
				setState(767);
				match(LPAR);
				setState(768);
				elements();
				setState(769);
				match(RPAR);
				}
				break;
			}
			setState(773);
			match(SEMICOLON);
			setState(774);
			match(RBRACE);
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(775);
				match(LPAR);
				setState(776);
				elements();
				setState(777);
				match(RPAR);
				setState(778);
				match(SEMICOLON);
				}
				break;
			case T__0:
			case RPAR:
			case RBRACKET:
			case SEMICOLON:
			case COMMA:
			case PLUS:
			case MINUS:
			case MULTIPLY:
			case DIVIDE:
			case REMAINDER:
			case DECREMENT:
			case INCREMENT:
			case ASSIGN:
			case GREATER_THAN:
			case LESS_THAN:
			case LESS_EQUAL:
			case GREATER_EQUAL:
			case APPEND:
			case PLUS_ASSIGN:
			case MINUS_ASSIGN:
			case MULTIPLY_ASSIGN:
			case DIVIDE_ASSIGN:
			case REMAINDER_ASSIGN:
			case EQUAL:
			case NOT_EQUAL:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(DEF);
			setState(784);
			match(MAIN);
			setState(785);
			match(LPAR);
			setState(786);
			match(RPAR);
			System.out.println("MAIN");
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9218867870024203756L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
				{
				{
				setState(788);
				statement();
				}
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(794);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001E\u031d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000f\b\u0000\n\u0000\f\u0000i\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000m\b\u0000\n\u0000\f\u0000p\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0084\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u008a\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u0094\b\t\u0001\n\u0001\n\u0005\n\u0098\b\n\n\n\f\n\u009b"+
		"\t\n\u0001\n\u0001\n\u0005\n\u009f\b\n\n\n\f\n\u00a2\t\n\u0003\n\u00a4"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ae\b\u000b\u0001\f\u0001"+
		"\f\u0005\f\u00b2\b\f\n\f\f\f\u00b5\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00bd\b\u000e\n\u000e\f\u000e\u00c0"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00c8\b\u0010\n\u0010\f\u0010\u00cb\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00d5\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00d9\b\u0012\n\u0012\f\u0012\u00dc\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00ee\b\u0013\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00f2\b\u0014\n\u0014\f\u0014\u00f5\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00ff\b\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u0103\b"+
		"\u0016\n\u0016\f\u0016\u0106\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0114\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u011f\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0125\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u012a\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u013d\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0145\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u014d\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0154\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u015e\b\u001e\u0003\u001e\u0160\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0168\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u0181\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u018f\b\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u019b\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u01a5\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u01af\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005"+
		"&\u01b9\b&\n&\f&\u01bc\t&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u01cb\b&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01d6"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0005\'\u01db\b\'\n\'\f\'\u01de\t\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u01ed\b\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u0201\b(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0005)\u020b\b)\n)\f)\u020e\t)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u021d\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u0225\b)\n)\f)\u0228\t)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0237\b)\u0005)\u0239"+
		"\b)\n)\f)\u023c\t)\u0001)\u0001)\u0001)\u0005)\u0241\b)\n)\f)\u0244\t"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u0253\b)\u0003)\u0255\b)\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u0260\b*\n*\f*\u0263"+
		"\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u0272\b*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0005*\u027b\b*\n*\f*\u027e\t*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u028d\b*\u0005*\u028f\b*\n*\f*\u0292\t*\u0001*\u0001*\u0001*\u0001*"+
		"\u0005*\u0298\b*\n*\f*\u029b\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02aa\b*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0003+\u02b1\b+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u02b8\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0004,\u02c7\b,\u000b,\f,"+
		"\u02c8\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-"+
		"\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02db\b.\u0001"+
		".\u0001.\u0005.\u02df\b.\n.\f.\u02e2\t.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02f1"+
		"\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0304\b/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u030e\b/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00050\u0316\b0\n0\f0\u0319\t0\u0001"+
		"0\u00010\u00010\u0000\u00001\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`\u0000\u0004\u0001\u0000CD\u0001\u0000@A\u0001\u0000\u0014\u0015"+
		"\u0002\u0000--8<\u0357\u0000g\u0001\u0000\u0000\u0000\u0002q\u0001\u0000"+
		"\u0000\u0000\u0004s\u0001\u0000\u0000\u0000\u0006u\u0001\u0000\u0000\u0000"+
		"\bw\u0001\u0000\u0000\u0000\ny\u0001\u0000\u0000\u0000\f\u0083\u0001\u0000"+
		"\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000"+
		"\u0000\u0000\u0012\u0093\u0001\u0000\u0000\u0000\u0014\u00a3\u0001\u0000"+
		"\u0000\u0000\u0016\u00ad\u0001\u0000\u0000\u0000\u0018\u00af\u0001\u0000"+
		"\u0000\u0000\u001a\u00b6\u0001\u0000\u0000\u0000\u001c\u00ba\u0001\u0000"+
		"\u0000\u0000\u001e\u00c1\u0001\u0000\u0000\u0000 \u00c5\u0001\u0000\u0000"+
		"\u0000\"\u00d4\u0001\u0000\u0000\u0000$\u00d6\u0001\u0000\u0000\u0000"+
		"&\u00ed\u0001\u0000\u0000\u0000(\u00ef\u0001\u0000\u0000\u0000*\u00fe"+
		"\u0001\u0000\u0000\u0000,\u0100\u0001\u0000\u0000\u0000.\u0113\u0001\u0000"+
		"\u0000\u00000\u011e\u0001\u0000\u0000\u00002\u0124\u0001\u0000\u0000\u0000"+
		"4\u0129\u0001\u0000\u0000\u00006\u012b\u0001\u0000\u0000\u00008\u0144"+
		"\u0001\u0000\u0000\u0000:\u014c\u0001\u0000\u0000\u0000<\u015f\u0001\u0000"+
		"\u0000\u0000>\u0167\u0001\u0000\u0000\u0000@\u0180\u0001\u0000\u0000\u0000"+
		"B\u0182\u0001\u0000\u0000\u0000D\u0188\u0001\u0000\u0000\u0000F\u0194"+
		"\u0001\u0000\u0000\u0000H\u019e\u0001\u0000\u0000\u0000J\u01a8\u0001\u0000"+
		"\u0000\u0000L\u01b2\u0001\u0000\u0000\u0000N\u01ce\u0001\u0000\u0000\u0000"+
		"P\u0200\u0001\u0000\u0000\u0000R\u0204\u0001\u0000\u0000\u0000T\u0258"+
		"\u0001\u0000\u0000\u0000V\u02b7\u0001\u0000\u0000\u0000X\u02b9\u0001\u0000"+
		"\u0000\u0000Z\u02cc\u0001\u0000\u0000\u0000\\\u02d4\u0001\u0000\u0000"+
		"\u0000^\u02f4\u0001\u0000\u0000\u0000`\u030f\u0001\u0000\u0000\u0000b"+
		"f\u0003\\.\u0000cf\u0003X,\u0000df\u0003\u0004\u0002\u0000eb\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jn\u0003`0\u0000k"+
		"m\u0003\u0004\u0002\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0001\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\u0001\u0000\u0000"+
		"r\u0003\u0001\u0000\u0000\u0000st\u0007\u0000\u0000\u0000t\u0005\u0001"+
		"\u0000\u0000\u0000uv\u0007\u0001\u0000\u0000v\u0007\u0001\u0000\u0000"+
		"\u0000wx\u0007\u0002\u0000\u0000x\t\u0001\u0000\u0000\u0000yz\u0005\u001a"+
		"\u0000\u0000z{\u0005\u0002\u0000\u0000{|\u0005\n\u0000\u0000|}\u0005?"+
		"\u0000\u0000}~\u0005\u0003\u0000\u0000~\u000b\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005,\u0000\u0000\u0080\u0084\u0006\u0006\uffff\uffff\u0000"+
		"\u0081\u0082\u0005+\u0000\u0000\u0082\u0084\u0006\u0006\uffff\uffff\u0000"+
		"\u0083\u007f\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\r\u0001\u0000\u0000\u0000\u0085\u0086\u0005&\u0000\u0000\u0086"+
		"\u008a\u0006\u0007\uffff\uffff\u0000\u0087\u0088\u0005\'\u0000\u0000\u0088"+
		"\u008a\u0006\u0007\uffff\uffff\u0000\u0089\u0085\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u000f\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0007\u0003\u0000\u0000\u008c\u0011\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005?\u0000\u0000\u008e\u008f\u0006\t\uffff\uffff\u0000"+
		"\u008f\u0090\u0003\u0010\b\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091"+
		"\u0094\u0001\u0000\u0000\u0000\u0092\u0094\u0003\u0014\n\u0000\u0093\u008d"+
		"\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0013"+
		"\u0001\u0000\u0000\u0000\u0095\u0099\u0003\u0018\f\u0000\u0096\u0098\u0003"+
		"\u0016\u000b\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u00a4\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009c\u00a0\u0003 \u0010\u0000\u009d\u009f\u0003\u0016"+
		"\u000b\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a3\u0095\u0001\u0000\u0000\u0000\u00a3\u009c\u0001\u0000"+
		"\u0000\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5\u00a6\u00057\u0000"+
		"\u0000\u00a6\u00a7\u0003\u0018\f\u0000\u00a7\u00a8\u0006\u000b\uffff\uffff"+
		"\u0000\u00a8\u00ae\u0001\u0000\u0000\u0000\u00a9\u00aa\u00057\u0000\u0000"+
		"\u00aa\u00ab\u0003 \u0010\u0000\u00ab\u00ac\u0006\u000b\uffff\uffff\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000\u0000"+
		"\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ae\u0017\u0001\u0000\u0000\u0000"+
		"\u00af\u00b3\u0003\u001c\u000e\u0000\u00b0\u00b2\u0003\u001a\r\u0000\u00b1"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u0019\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u00053\u0000\u0000\u00b7\u00b8\u0003\u001c\u000e\u0000\u00b8\u00b9"+
		"\u0006\r\uffff\uffff\u0000\u00b9\u001b\u0001\u0000\u0000\u0000\u00ba\u00be"+
		"\u00036\u001b\u0000\u00bb\u00bd\u0003\u001e\u000f\u0000\u00bc\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u001d\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005"+
		"2\u0000\u0000\u00c2\u00c3\u00036\u001b\u0000\u00c3\u00c4\u0006\u000f\uffff"+
		"\uffff\u0000\u00c4\u001f\u0001\u0000\u0000\u0000\u00c5\u00c9\u0003$\u0012"+
		"\u0000\u00c6\u00c8\u0003\"\u0011\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca!\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005=\u0000\u0000\u00cd\u00ce"+
		"\u0003$\u0012\u0000\u00ce\u00cf\u0006\u0011\uffff\uffff\u0000\u00cf\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005>\u0000\u0000\u00d1\u00d2\u0003"+
		"$\u0012\u0000\u00d2\u00d3\u0006\u0011\uffff\uffff\u0000\u00d3\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d5#\u0001\u0000\u0000\u0000\u00d6\u00da\u0003(\u0014"+
		"\u0000\u00d7\u00d9\u0003&\u0013\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0001\u0000\u0000\u0000\u00db%\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005/\u0000\u0000\u00de\u00df"+
		"\u0003(\u0014\u0000\u00df\u00e0\u0006\u0013\uffff\uffff\u0000\u00e0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u00050\u0000\u0000\u00e2\u00e3\u0003"+
		"(\u0014\u0000\u00e3\u00e4\u0006\u0013\uffff\uffff\u0000\u00e4\u00ee\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005.\u0000\u0000\u00e6\u00e7\u0003(\u0014"+
		"\u0000\u00e7\u00e8\u0006\u0013\uffff\uffff\u0000\u00e8\u00ee\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u00051\u0000\u0000\u00ea\u00eb\u0003(\u0014\u0000"+
		"\u00eb\u00ec\u0006\u0013\uffff\uffff\u0000\u00ec\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ed\u00dd\u0001\u0000\u0000\u0000\u00ed\u00e1\u0001\u0000\u0000"+
		"\u0000\u00ed\u00e5\u0001\u0000\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ee\'\u0001\u0000\u0000\u0000\u00ef\u00f3\u0003,\u0016\u0000"+
		"\u00f0\u00f2\u0003*\u0015\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f4)\u0001\u0000\u0000\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005&\u0000\u0000\u00f7\u00f8\u0003"+
		",\u0016\u0000\u00f8\u00f9\u0006\u0015\uffff\uffff\u0000\u00f9\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005\'\u0000\u0000\u00fb\u00fc\u0003,"+
		"\u0016\u0000\u00fc\u00fd\u0006\u0015\uffff\uffff\u0000\u00fd\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fe\u00f6\u0001\u0000\u0000\u0000\u00fe\u00fa\u0001"+
		"\u0000\u0000\u0000\u00ff+\u0001\u0000\u0000\u0000\u0100\u0104\u00030\u0018"+
		"\u0000\u0101\u0103\u0003.\u0017\u0000\u0102\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105-\u0001\u0000\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005(\u0000\u0000\u0108\u0109"+
		"\u00030\u0018\u0000\u0109\u010a\u0006\u0017\uffff\uffff\u0000\u010a\u0114"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0005)\u0000\u0000\u010c\u010d\u0003"+
		"0\u0018\u0000\u010d\u010e\u0006\u0017\uffff\uffff\u0000\u010e\u0114\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005*\u0000\u0000\u0110\u0111\u00030\u0018"+
		"\u0000\u0111\u0112\u0006\u0017\uffff\uffff\u0000\u0112\u0114\u0001\u0000"+
		"\u0000\u0000\u0113\u0107\u0001\u0000\u0000\u0000\u0113\u010b\u0001\u0000"+
		"\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0114/\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u00054\u0000\u0000\u0116\u0117\u00032\u0019\u0000\u0117"+
		"\u0118\u0006\u0018\uffff\uffff\u0000\u0118\u011f\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005\'\u0000\u0000\u011a\u011b\u00032\u0019\u0000\u011b"+
		"\u011c\u0006\u0018\uffff\uffff\u0000\u011c\u011f\u0001\u0000\u0000\u0000"+
		"\u011d\u011f\u00032\u0019\u0000\u011e\u0115\u0001\u0000\u0000\u0000\u011e"+
		"\u0119\u0001\u0000\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f"+
		"1\u0001\u0000\u0000\u0000\u0120\u0121\u00034\u001a\u0000\u0121\u0122\u0003"+
		"\f\u0006\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0125\u00034"+
		"\u001a\u0000\u0124\u0120\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000"+
		"\u0000\u0000\u01253\u0001\u0000\u0000\u0000\u0126\u012a\u0003:\u001d\u0000"+
		"\u0127\u012a\u00036\u001b\u0000\u0128\u012a\u00038\u001c\u0000\u0129\u0126"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u0128"+
		"\u0001\u0000\u0000\u0000\u012a5\u0001\u0000\u0000\u0000\u012b\u012c\u0005"+
		"\u0002\u0000\u0000\u012c\u012d\u0003\u0014\n\u0000\u012d\u012e\u0005\u0003"+
		"\u0000\u0000\u012e\u012f\u0005\u0002\u0000\u0000\u012f\u0130\u0003 \u0010"+
		"\u0000\u0130\u0131\u0005\u0003\u0000\u0000\u01317\u0001\u0000\u0000\u0000"+
		"\u0132\u0145\u0003\u0006\u0003\u0000\u0133\u0145\u0005B\u0000\u0000\u0134"+
		"\u0145\u0003\b\u0004\u0000\u0135\u0136\u0005?\u0000\u0000\u0136\u0145"+
		"\u0003>\u001f\u0000\u0137\u0145\u0003\n\u0005\u0000\u0138\u0139\u0005"+
		"?\u0000\u0000\u0139\u013a\u0005\u0002\u0000\u0000\u013a\u013c\u0006\u001c"+
		"\uffff\uffff\u0000\u013b\u013d\u0003<\u001e\u0000\u013c\u013b\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000"+
		"\u0000\u0000\u013e\u0145\u0005\u0003\u0000\u0000\u013f\u0145\u0003Z-\u0000"+
		"\u0140\u0145\u0003F#\u0000\u0141\u0145\u0003H$\u0000\u0142\u0145\u0003"+
		"J%\u0000\u0143\u0145\u0003^/\u0000\u0144\u0132\u0001\u0000\u0000\u0000"+
		"\u0144\u0133\u0001\u0000\u0000\u0000\u0144\u0134\u0001\u0000\u0000\u0000"+
		"\u0144\u0135\u0001\u0000\u0000\u0000\u0144\u0137\u0001\u0000\u0000\u0000"+
		"\u0144\u0138\u0001\u0000\u0000\u0000\u0144\u013f\u0001\u0000\u0000\u0000"+
		"\u0144\u0140\u0001\u0000\u0000\u0000\u0144\u0141\u0001\u0000\u0000\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000"+
		"\u01459\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u0004\u0000\u0000\u0147"+
		"\u014d\u0005\u0005\u0000\u0000\u0148\u0149\u0005\u0004\u0000\u0000\u0149"+
		"\u014a\u0003<\u001e\u0000\u014a\u014b\u0005\u0005\u0000\u0000\u014b\u014d"+
		"\u0001\u0000\u0000\u0000\u014c\u0146\u0001\u0000\u0000\u0000\u014c\u0148"+
		"\u0001\u0000\u0000\u0000\u014d;\u0001\u0000\u0000\u0000\u014e\u0153\u0003"+
		"\u0014\n\u0000\u014f\u0150\u0003\u0010\b\u0000\u0150\u0151\u0003\u0014"+
		"\n\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0154\u0001\u0000\u0000"+
		"\u0000\u0153\u014f\u0001\u0000\u0000\u0000\u0153\u0152\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0005\f\u0000\u0000"+
		"\u0156\u0157\u0003<\u001e\u0000\u0157\u0160\u0001\u0000\u0000\u0000\u0158"+
		"\u015d\u0003\u0014\n\u0000\u0159\u015a\u0003\u0010\b\u0000\u015a\u015b"+
		"\u0003\u0014\n\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015e\u0001"+
		"\u0000\u0000\u0000\u015d\u0159\u0001\u0000\u0000\u0000\u015d\u015c\u0001"+
		"\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u014e\u0001"+
		"\u0000\u0000\u0000\u015f\u0158\u0001\u0000\u0000\u0000\u0160=\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0005\u0004\u0000\u0000\u0162\u0163\u0003\u0012"+
		"\t\u0000\u0163\u0164\u0005\u0005\u0000\u0000\u0164\u0165\u0003>\u001f"+
		"\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0168\u0001\u0000\u0000"+
		"\u0000\u0167\u0161\u0001\u0000\u0000\u0000\u0167\u0166\u0001\u0000\u0000"+
		"\u0000\u0168?\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u0002\u0000\u0000"+
		"\u016a\u016b\u0003\u0006\u0003\u0000\u016b\u016c\u00056\u0000\u0000\u016c"+
		"\u016d\u0003\u0006\u0003\u0000\u016d\u016e\u0005\u0003\u0000\u0000\u016e"+
		"\u0181\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u0002\u0000\u0000\u0170"+
		"\u0171\u0003\u0006\u0003\u0000\u0171\u0172\u00056\u0000\u0000\u0172\u0173"+
		"\u0005?\u0000\u0000\u0173\u0174\u0005\u0003\u0000\u0000\u0174\u0181\u0001"+
		"\u0000\u0000\u0000\u0175\u0176\u0005\u0002\u0000\u0000\u0176\u0177\u0005"+
		"?\u0000\u0000\u0177\u0178\u00056\u0000\u0000\u0178\u0179\u0003\u0006\u0003"+
		"\u0000\u0179\u017a\u0005\u0003\u0000\u0000\u017a\u0181\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0005\u0002\u0000\u0000\u017c\u017d\u0005?\u0000\u0000"+
		"\u017d\u017e\u00056\u0000\u0000\u017e\u017f\u0005?\u0000\u0000\u017f\u0181"+
		"\u0005\u0003\u0000\u0000\u0180\u0169\u0001\u0000\u0000\u0000\u0180\u016f"+
		"\u0001\u0000\u0000\u0000\u0180\u0175\u0001\u0000\u0000\u0000\u0180\u017b"+
		"\u0001\u0000\u0000\u0000\u0181A\u0001\u0000\u0000\u0000\u0182\u0183\u0005"+
		"\u0019\u0000\u0000\u0183\u0184\u0006!\uffff\uffff\u0000\u0184\u0185\u0005"+
		"\u0002\u0000\u0000\u0185\u0186\u0003\u0012\t\u0000\u0186\u0187\u0005\u0003"+
		"\u0000\u0000\u0187C\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u0018\u0000"+
		"\u0000\u0189\u018a\u0006\"\uffff\uffff\u0000\u018a\u018e\u0005\u0002\u0000"+
		"\u0000\u018b\u018f\u0005?\u0000\u0000\u018c\u018f\u0003:\u001d\u0000\u018d"+
		"\u018f\u0005B\u0000\u0000\u018e\u018b\u0001\u0000\u0000\u0000\u018e\u018c"+
		"\u0001\u0000\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u0005\f\u0000\u0000\u0191\u0192\u0003"+
		"\u0012\t\u0000\u0192\u0193\u0005\u0003\u0000\u0000\u0193E\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0005\u001b\u0000\u0000\u0195\u0196\u0006#\uffff"+
		"\uffff\u0000\u0196\u019a\u0005\u0002\u0000\u0000\u0197\u019b\u0003:\u001d"+
		"\u0000\u0198\u019b\u0005?\u0000\u0000\u0199\u019b\u0005B\u0000\u0000\u019a"+
		"\u0197\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a"+
		"\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0005\u0003\u0000\u0000\u019dG\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0005\u0016\u0000\u0000\u019f\u01a0\u0006$\uffff\uffff\u0000\u01a0\u01a4"+
		"\u0005\u0002\u0000\u0000\u01a1\u01a5\u0005B\u0000\u0000\u01a2\u01a5\u0005"+
		"?\u0000\u0000\u01a3\u01a5\u0003H$\u0000\u01a4\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005\u0003\u0000"+
		"\u0000\u01a7I\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005\u0017\u0000\u0000"+
		"\u01a9\u01aa\u0006%\uffff\uffff\u0000\u01aa\u01ae\u0005\u0002\u0000\u0000"+
		"\u01ab\u01af\u0005B\u0000\u0000\u01ac\u01af\u0005?\u0000\u0000\u01ad\u01af"+
		"\u0003J%\u0000\u01ae\u01ab\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0005\u0003\u0000\u0000\u01b1K\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0005\"\u0000\u0000\u01b3\u01b4\u0005#\u0000\u0000"+
		"\u01b4\u01ba\u0006&\uffff\uffff\u0000\u01b5\u01b9\u0003V+\u0000\u01b6"+
		"\u01b9\u0003T*\u0000\u01b7\u01b9\u0003P(\u0000\u01b8\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01ca\u0001\u0000"+
		"\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\u0010"+
		"\u0000\u0000\u01be\u01bf\u0006&\uffff\uffff\u0000\u01bf\u01c0\u0003<\u001e"+
		"\u0000\u01c0\u01c1\u0005\u000b\u0000\u0000\u01c1\u01cb\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0005\u0010\u0000\u0000\u01c3\u01c4\u0006&\uffff\uffff"+
		"\u0000\u01c4\u01c5\u0005\u0002\u0000\u0000\u01c5\u01c6\u0003<\u001e\u0000"+
		"\u01c6\u01c7\u0005\u0003\u0000\u0000\u01c7\u01c8\u0005\u000b\u0000\u0000"+
		"\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000"+
		"\u01ca\u01bd\u0001\u0000\u0000\u0000\u01ca\u01c2\u0001\u0000\u0000\u0000"+
		"\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0005\u000e\u0000\u0000\u01cdM\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0005$\u0000\u0000\u01cf\u01d0\u0006\'\uffff\uffff\u0000\u01d0"+
		"\u01d1\u0005?\u0000\u0000\u01d1\u01d5\u0005%\u0000\u0000\u01d2\u01d6\u0005"+
		"?\u0000\u0000\u01d3\u01d6\u0003:\u001d\u0000\u01d4\u01d6\u0003@ \u0000"+
		"\u01d5\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6\u01dc\u0001\u0000\u0000\u0000"+
		"\u01d7\u01db\u0003V+\u0000\u01d8\u01db\u0003T*\u0000\u01d9\u01db\u0003"+
		"P(\u0000\u01da\u01d7\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000"+
		"\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000"+
		"\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000"+
		"\u0000\u01dd\u01ec\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000"+
		"\u0000\u01df\u01e0\u0005\u0010\u0000\u0000\u01e0\u01e1\u0006\'\uffff\uffff"+
		"\u0000\u01e1\u01e2\u0003<\u001e\u0000\u01e2\u01e3\u0005\u000b\u0000\u0000"+
		"\u01e3\u01ed\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u0010\u0000\u0000"+
		"\u01e5\u01e6\u0006\'\uffff\uffff\u0000\u01e6\u01e7\u0005\u0002\u0000\u0000"+
		"\u01e7\u01e8\u0003<\u001e\u0000\u01e8\u01e9\u0005\u0003\u0000\u0000\u01e9"+
		"\u01ea\u0005\u000b\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ec\u01df\u0001\u0000\u0000\u0000\u01ec"+
		"\u01e4\u0001\u0000\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005\u000e\u0000\u0000\u01ef"+
		"O\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005 \u0000\u0000\u01f1\u0201\u0006"+
		"(\uffff\uffff\u0000\u01f2\u01f3\u0005!\u0000\u0000\u01f3\u0201\u0006("+
		"\uffff\uffff\u0000\u01f4\u01f5\u0005\u001e\u0000\u0000\u01f5\u01f6\u0006"+
		"(\uffff\uffff\u0000\u01f6\u01f7\u0005\u0002\u0000\u0000\u01f7\u01f8\u0003"+
		"\u0012\t\u0000\u01f8\u01f9\u0005\u0003\u0000\u0000\u01f9\u0201\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0005\u001f\u0000\u0000\u01fb\u01fc\u0006(\uffff"+
		"\uffff\u0000\u01fc\u01fd\u0005\u0002\u0000\u0000\u01fd\u01fe\u0003\u0012"+
		"\t\u0000\u01fe\u01ff\u0005\u0003\u0000\u0000\u01ff\u0201\u0001\u0000\u0000"+
		"\u0000\u0200\u01f0\u0001\u0000\u0000\u0000\u0200\u01f2\u0001\u0000\u0000"+
		"\u0000\u0200\u01f4\u0001\u0000\u0000\u0000\u0200\u01fa\u0001\u0000\u0000"+
		"\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0005\u000b\u0000"+
		"\u0000\u0203Q\u0001\u0000\u0000\u0000\u0204\u0205\u0005\u0011\u0000\u0000"+
		"\u0205\u0206\u0006)\uffff\uffff\u0000\u0206\u0207\u0005\u0002\u0000\u0000"+
		"\u0207\u0208\u0003\u0012\t\u0000\u0208\u020c\u0005\u0003\u0000\u0000\u0209"+
		"\u020b\u0003V+\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020b\u020e\u0001"+
		"\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001"+
		"\u0000\u0000\u0000\u020d\u021c\u0001\u0000\u0000\u0000\u020e\u020c\u0001"+
		"\u0000\u0000\u0000\u020f\u0210\u0005\u0010\u0000\u0000\u0210\u0211\u0006"+
		")\uffff\uffff\u0000\u0211\u0212\u0003<\u001e\u0000\u0212\u0213\u0005\u000b"+
		"\u0000\u0000\u0213\u021d\u0001\u0000\u0000\u0000\u0214\u0215\u0005\u0010"+
		"\u0000\u0000\u0215\u0216\u0006)\uffff\uffff\u0000\u0216\u0217\u0005\u0002"+
		"\u0000\u0000\u0217\u0218\u0003<\u001e\u0000\u0218\u0219\u0005\u0003\u0000"+
		"\u0000\u0219\u021a\u0005\u000b\u0000\u0000\u021a\u021d\u0001\u0000\u0000"+
		"\u0000\u021b\u021d\u0001\u0000\u0000\u0000\u021c\u020f\u0001\u0000\u0000"+
		"\u0000\u021c\u0214\u0001\u0000\u0000\u0000\u021c\u021b\u0001\u0000\u0000"+
		"\u0000\u021d\u023a\u0001\u0000\u0000\u0000\u021e\u021f\u0005\u0013\u0000"+
		"\u0000\u021f\u0220\u0006)\uffff\uffff\u0000\u0220\u0221\u0005\u0002\u0000"+
		"\u0000\u0221\u0222\u0003\u0012\t\u0000\u0222\u0226\u0005\u0003\u0000\u0000"+
		"\u0223\u0225\u0003V+\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225\u0228"+
		"\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227"+
		"\u0001\u0000\u0000\u0000\u0227\u0236\u0001\u0000\u0000\u0000\u0228\u0226"+
		"\u0001\u0000\u0000\u0000\u0229\u022a\u0005\u0010\u0000\u0000\u022a\u022b"+
		"\u0006)\uffff\uffff\u0000\u022b\u022c\u0003<\u001e\u0000\u022c\u022d\u0005"+
		"\u000b\u0000\u0000\u022d\u0237\u0001\u0000\u0000\u0000\u022e\u022f\u0005"+
		"\u0010\u0000\u0000\u022f\u0230\u0006)\uffff\uffff\u0000\u0230\u0231\u0005"+
		"\u0002\u0000\u0000\u0231\u0232\u0003<\u001e\u0000\u0232\u0233\u0005\u0003"+
		"\u0000\u0000\u0233\u0234\u0005\u000b\u0000\u0000\u0234\u0237\u0001\u0000"+
		"\u0000\u0000\u0235\u0237\u0001\u0000\u0000\u0000\u0236\u0229\u0001\u0000"+
		"\u0000\u0000\u0236\u022e\u0001\u0000\u0000\u0000\u0236\u0235\u0001\u0000"+
		"\u0000\u0000\u0237\u0239\u0001\u0000\u0000\u0000\u0238\u021e\u0001\u0000"+
		"\u0000\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u0254\u0001\u0000"+
		"\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u023e\u0005\u0012"+
		"\u0000\u0000\u023e\u0242\u0006)\uffff\uffff\u0000\u023f\u0241\u0003V+"+
		"\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000"+
		"\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000"+
		"\u0000\u0243\u0252\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000"+
		"\u0000\u0245\u0246\u0005\u0010\u0000\u0000\u0246\u0247\u0006)\uffff\uffff"+
		"\u0000\u0247\u0248\u0003<\u001e\u0000\u0248\u0249\u0005\u000b\u0000\u0000"+
		"\u0249\u0253\u0001\u0000\u0000\u0000\u024a\u024b\u0005\u0010\u0000\u0000"+
		"\u024b\u024c\u0006)\uffff\uffff\u0000\u024c\u024d\u0005\u0002\u0000\u0000"+
		"\u024d\u024e\u0003<\u001e\u0000\u024e\u024f\u0005\u0003\u0000\u0000\u024f"+
		"\u0250\u0005\u000b\u0000\u0000\u0250\u0253\u0001\u0000\u0000\u0000\u0251"+
		"\u0253\u0001\u0000\u0000\u0000\u0252\u0245\u0001\u0000\u0000\u0000\u0252"+
		"\u024a\u0001\u0000\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0253"+
		"\u0255\u0001\u0000\u0000\u0000\u0254\u023d\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0005\u000e\u0000\u0000\u0257S\u0001\u0000\u0000\u0000\u0258\u0259"+
		"\u0005\u0011\u0000\u0000\u0259\u025a\u0006*\uffff\uffff\u0000\u025a\u025b"+
		"\u0005\u0002\u0000\u0000\u025b\u025c\u0003\u0012\t\u0000\u025c\u0261\u0005"+
		"\u0003\u0000\u0000\u025d\u0260\u0003V+\u0000\u025e\u0260\u0003P(\u0000"+
		"\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u025e\u0001\u0000\u0000\u0000"+
		"\u0260\u0263\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0271\u0001\u0000\u0000\u0000"+
		"\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u0265\u0005\u0010\u0000\u0000"+
		"\u0265\u0266\u0006*\uffff\uffff\u0000\u0266\u0267\u0003<\u001e\u0000\u0267"+
		"\u0268\u0005\u000b\u0000\u0000\u0268\u0272\u0001\u0000\u0000\u0000\u0269"+
		"\u026a\u0005\u0010\u0000\u0000\u026a\u026b\u0006*\uffff\uffff\u0000\u026b"+
		"\u026c\u0005\u0002\u0000\u0000\u026c\u026d\u0003<\u001e\u0000\u026d\u026e"+
		"\u0005\u0003\u0000\u0000\u026e\u026f\u0005\u000b\u0000\u0000\u026f\u0272"+
		"\u0001\u0000\u0000\u0000\u0270\u0272\u0001\u0000\u0000\u0000\u0271\u0264"+
		"\u0001\u0000\u0000\u0000\u0271\u0269\u0001\u0000\u0000\u0000\u0271\u0270"+
		"\u0001\u0000\u0000\u0000\u0272\u0290\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0005\u0013\u0000\u0000\u0274\u0275\u0006*\uffff\uffff\u0000\u0275\u0276"+
		"\u0005\u0002\u0000\u0000\u0276\u0277\u0003\u0012\t\u0000\u0277\u027c\u0005"+
		"\u0003\u0000\u0000\u0278\u027b\u0003V+\u0000\u0279\u027b\u0003P(\u0000"+
		"\u027a\u0278\u0001\u0000\u0000\u0000\u027a\u0279\u0001\u0000\u0000\u0000"+
		"\u027b\u027e\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000"+
		"\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u028c\u0001\u0000\u0000\u0000"+
		"\u027e\u027c\u0001\u0000\u0000\u0000\u027f\u0280\u0005\u0010\u0000\u0000"+
		"\u0280\u0281\u0006*\uffff\uffff\u0000\u0281\u0282\u0003<\u001e\u0000\u0282"+
		"\u0283\u0005\u000b\u0000\u0000\u0283\u028d\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0005\u0010\u0000\u0000\u0285\u0286\u0006*\uffff\uffff\u0000\u0286"+
		"\u0287\u0005\u0002\u0000\u0000\u0287\u0288\u0003<\u001e\u0000\u0288\u0289"+
		"\u0005\u0003\u0000\u0000\u0289\u028a\u0005\u000b\u0000\u0000\u028a\u028d"+
		"\u0001\u0000\u0000\u0000\u028b\u028d\u0001\u0000\u0000\u0000\u028c\u027f"+
		"\u0001\u0000\u0000\u0000\u028c\u0284\u0001\u0000\u0000\u0000\u028c\u028b"+
		"\u0001\u0000\u0000\u0000\u028d\u028f\u0001\u0000\u0000\u0000\u028e\u0273"+
		"\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000\u0000\u0290\u028e"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0293"+
		"\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0293\u0294"+
		"\u0005\u0012\u0000\u0000\u0294\u0299\u0006*\uffff\uffff\u0000\u0295\u0298"+
		"\u0003V+\u0000\u0296\u0298\u0003P(\u0000\u0297\u0295\u0001\u0000\u0000"+
		"\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0298\u029b\u0001\u0000\u0000"+
		"\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000"+
		"\u0000\u029a\u02a9\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000"+
		"\u0000\u029c\u029d\u0005\u0010\u0000\u0000\u029d\u029e\u0006*\uffff\uffff"+
		"\u0000\u029e\u029f\u0003<\u001e\u0000\u029f\u02a0\u0005\u000b\u0000\u0000"+
		"\u02a0\u02aa\u0001\u0000\u0000\u0000\u02a1\u02a2\u0005\u0010\u0000\u0000"+
		"\u02a2\u02a3\u0006*\uffff\uffff\u0000\u02a3\u02a4\u0005\u0002\u0000\u0000"+
		"\u02a4\u02a5\u0003<\u001e\u0000\u02a5\u02a6\u0005\u0003\u0000\u0000\u02a6"+
		"\u02a7\u0005\u000b\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8"+
		"\u02aa\u0001\u0000\u0000\u0000\u02a9\u029c\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac\u0005\u000e\u0000\u0000\u02ac"+
		"U\u0001\u0000\u0000\u0000\u02ad\u02b1\u0003\u0012\t\u0000\u02ae\u02b1"+
		"\u0003B!\u0000\u02af\u02b1\u0003D\"\u0000\u02b0\u02ad\u0001\u0000\u0000"+
		"\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02af\u0001\u0000\u0000"+
		"\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005\u000b\u0000"+
		"\u0000\u02b3\u02b8\u0001\u0000\u0000\u0000\u02b4\u02b8\u0003\u0004\u0002"+
		"\u0000\u02b5\u02b8\u0003L&\u0000\u02b6\u02b8\u0003R)\u0000\u02b7\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b7\u02b4\u0001\u0000\u0000\u0000\u02b7\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b8W\u0001"+
		"\u0000\u0000\u0000\u02b9\u02ba\u0005\u001c\u0000\u0000\u02ba\u02bb\u0005"+
		"?\u0000\u0000\u02bb\u02bc\u0006,\uffff\uffff\u0000\u02bc\u02bd\u0005\u0002"+
		"\u0000\u0000\u02bd\u02be\u0003<\u001e\u0000\u02be\u02c6\u0005\u0003\u0000"+
		"\u0000\u02bf\u02c0\u0005\u0001\u0000\u0000\u02c0\u02c1\u0005\u0002\u0000"+
		"\u0000\u02c1\u02c2\u0003\u0012\t\u0000\u02c2\u02c3\u0005\u0003\u0000\u0000"+
		"\u02c3\u02c4\u0005-\u0000\u0000\u02c4\u02c5\u0003\u0012\t\u0000\u02c5"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c6\u02bf\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c8\u0001\u0000\u0000\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cb\u0005\u000b\u0000\u0000\u02cbY\u0001\u0000\u0000\u0000\u02cc\u02cd"+
		"\u0005?\u0000\u0000\u02cd\u02ce\u00055\u0000\u0000\u02ce\u02cf\u0005\u001d"+
		"\u0000\u0000\u02cf\u02d0\u0006-\uffff\uffff\u0000\u02d0\u02d1\u0005\u0002"+
		"\u0000\u0000\u02d1\u02d2\u0003\u0012\t\u0000\u02d2\u02d3\u0005\u0003\u0000"+
		"\u0000\u02d3[\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005\r\u0000\u0000"+
		"\u02d5\u02d6\u0005?\u0000\u0000\u02d6\u02d7\u0006.\uffff\uffff\u0000\u02d7"+
		"\u02da\u0005\u0002\u0000\u0000\u02d8\u02db\u0003<\u001e\u0000\u02d9\u02db"+
		"\u0001\u0000\u0000\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02da\u02d9"+
		"\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000\u0000\u02dc\u02e0"+
		"\u0005\u0003\u0000\u0000\u02dd\u02df\u0003V+\u0000\u02de\u02dd\u0001\u0000"+
		"\u0000\u0000\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000"+
		"\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02f0\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005\u0010"+
		"\u0000\u0000\u02e4\u02e5\u0006.\uffff\uffff\u0000\u02e5\u02e6\u0003<\u001e"+
		"\u0000\u02e6\u02e7\u0005\u000b\u0000\u0000\u02e7\u02f1\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e9\u0005\u0010\u0000\u0000\u02e9\u02ea\u0006.\uffff\uffff"+
		"\u0000\u02ea\u02eb\u0005\u0002\u0000\u0000\u02eb\u02ec\u0003<\u001e\u0000"+
		"\u02ec\u02ed\u0005\u0003\u0000\u0000\u02ed\u02ee\u0005\u000b\u0000\u0000"+
		"\u02ee\u02f1\u0001\u0000\u0000\u0000\u02ef\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f0\u02e3\u0001\u0000\u0000\u0000\u02f0\u02e8\u0001\u0000\u0000\u0000"+
		"\u02f0\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f3\u0005\u000e\u0000\u0000\u02f3]\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f5\u0005\t\u0000\u0000\u02f5\u02f6\u0006/\uffff\uffff\u0000\u02f6"+
		"\u02f7\u0005\u0002\u0000\u0000\u02f7\u02f8\u0003<\u001e\u0000\u02f8\u02f9"+
		"\u0005\u0003\u0000\u0000\u02f9\u0303\u0005\u0006\u0000\u0000\u02fa\u02fb"+
		"\u0005\u0010\u0000\u0000\u02fb\u02fc\u0006/\uffff\uffff\u0000\u02fc\u0304"+
		"\u0003<\u001e\u0000\u02fd\u02fe\u0005\u0010\u0000\u0000\u02fe\u02ff\u0006"+
		"/\uffff\uffff\u0000\u02ff\u0300\u0005\u0002\u0000\u0000\u0300\u0301\u0003"+
		"<\u001e\u0000\u0301\u0302\u0005\u0003\u0000\u0000\u0302\u0304\u0001\u0000"+
		"\u0000\u0000\u0303\u02fa\u0001\u0000\u0000\u0000\u0303\u02fd\u0001\u0000"+
		"\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0306\u0005\u000b"+
		"\u0000\u0000\u0306\u030d\u0005\u0007\u0000\u0000\u0307\u0308\u0005\u0002"+
		"\u0000\u0000\u0308\u0309\u0003<\u001e\u0000\u0309\u030a\u0005\u0003\u0000"+
		"\u0000\u030a\u030b\u0005\u000b\u0000\u0000\u030b\u030e\u0001\u0000\u0000"+
		"\u0000\u030c\u030e\u0001\u0000\u0000\u0000\u030d\u0307\u0001\u0000\u0000"+
		"\u0000\u030d\u030c\u0001\u0000\u0000\u0000\u030e_\u0001\u0000\u0000\u0000"+
		"\u030f\u0310\u0005\r\u0000\u0000\u0310\u0311\u0005\u000f\u0000\u0000\u0311"+
		"\u0312\u0005\u0002\u0000\u0000\u0312\u0313\u0005\u0003\u0000\u0000\u0313"+
		"\u0317\u00060\uffff\uffff\u0000\u0314\u0316\u0003V+\u0000\u0315\u0314"+
		"\u0001\u0000\u0000\u0000\u0316\u0319\u0001\u0000\u0000\u0000\u0317\u0315"+
		"\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u031a"+
		"\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000\u0000\u031a\u031b"+
		"\u0005\u000e\u0000\u0000\u031ba\u0001\u0000\u0000\u0000Fegn\u0083\u0089"+
		"\u0093\u0099\u00a0\u00a3\u00ad\u00b3\u00be\u00c9\u00d4\u00da\u00ed\u00f3"+
		"\u00fe\u0104\u0113\u011e\u0124\u0129\u013c\u0144\u014c\u0153\u015d\u015f"+
		"\u0167\u0180\u018e\u019a\u01a4\u01ae\u01b8\u01ba\u01ca\u01d5\u01da\u01dc"+
		"\u01ec\u0200\u020c\u021c\u0226\u0236\u023a\u0242\u0252\u0254\u025f\u0261"+
		"\u0271\u027a\u027c\u028c\u0290\u0297\u0299\u02a9\u02b0\u02b7\u02c8\u02da"+
		"\u02e0\u02f0\u0303\u030d\u0317";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}