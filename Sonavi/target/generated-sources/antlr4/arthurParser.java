// Generated from arthur.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class arthurParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, STOP=4, NUMBER=5, WHITESPACE=6, PLUS=7, MINUS=8, 
		DIVIDE=9, TIMES=10, POW=11, MOD=12, LPAR=13, RPAR=14, SCOLON=15, PRINT=16, 
		EQUALS=17, DEQS=18, CLEFT=19, CRIGHT=20, QUOTES=21, NAME=22;
	public static final int
		RULE_codeBlock = 0, RULE_start = 1, RULE_stop = 2, RULE_setVar = 3, RULE_func = 4, 
		RULE_expression = 5, RULE_print = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"codeBlock", "start", "stop", "setVar", "func", "expression", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.run'", "'.repeat'", "'.if'", "'!END'", null, null, "'+'", "'-'", 
			"'/'", "'*'", "'^'", "'%'", "'('", "')'", "';'", "'print'", "'='", "'=='", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "STOP", "NUMBER", "WHITESPACE", "PLUS", "MINUS", 
			"DIVIDE", "TIMES", "POW", "MOD", "LPAR", "RPAR", "SCOLON", "PRINT", "EQUALS", 
			"DEQS", "CLEFT", "CRIGHT", "QUOTES", "NAME"
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
	public String getGrammarFileName() { return "arthur.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public arthurParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public StartContext exp;
		public TerminalNode CLEFT() { return getToken(arthurParser.CLEFT, 0); }
		public TerminalNode CRIGHT() { return getToken(arthurParser.CRIGHT, 0); }
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(CLEFT);
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				((CodeBlockContext)_localctx).exp = start();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STOP) | (1L << NUMBER) | (1L << LPAR) | (1L << PRINT) | (1L << CLEFT) | (1L << QUOTES) | (1L << NAME))) != 0) );
			setState(20);
			match(CRIGHT);
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

	public static class StartContext extends ParserRuleContext {
		public StopContext stop() {
			return getRuleContext(StopContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public SetVarContext setVar() {
			return getRuleContext(SetVarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				stop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				codeBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				setVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(27);
				func();
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

	public static class StopContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(arthurParser.STOP, 0); }
		public StopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitStop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitStop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopContext stop() throws RecognitionException {
		StopContext _localctx = new StopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(STOP);
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

	public static class SetVarContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext exp;
		public TerminalNode EQUALS() { return getToken(arthurParser.EQUALS, 0); }
		public TerminalNode SCOLON() { return getToken(arthurParser.SCOLON, 0); }
		public TerminalNode NAME() { return getToken(arthurParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterSetVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitSetVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitSetVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetVarContext setVar() throws RecognitionException {
		SetVarContext _localctx = new SetVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((SetVarContext)_localctx).name = match(NAME);
			setState(33);
			match(EQUALS);
			setState(34);
			((SetVarContext)_localctx).exp = expression(0);
			setState(35);
			match(SCOLON);
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

	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	 
		public FuncContext() { }
		public void copyFrom(FuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RepeatContext extends FuncContext {
		public ExpressionContext exp;
		public ExpressionContext num;
		public TerminalNode LPAR() { return getToken(arthurParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(arthurParser.RPAR, 0); }
		public TerminalNode SCOLON() { return getToken(arthurParser.SCOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RepeatContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RunContext extends FuncContext {
		public ExpressionContext exp;
		public TerminalNode SCOLON() { return getToken(arthurParser.SCOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RunContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitRun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends FuncContext {
		public ExpressionContext exp;
		public ExpressionContext con;
		public TerminalNode LPAR() { return getToken(arthurParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(arthurParser.RPAR, 0); }
		public TerminalNode SCOLON() { return getToken(arthurParser.SCOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new RunContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((RunContext)_localctx).exp = expression(0);
				setState(38);
				match(T__0);
				setState(39);
				match(SCOLON);
				}
				break;
			case 2:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				((RepeatContext)_localctx).exp = expression(0);
				setState(42);
				match(T__1);
				setState(43);
				match(LPAR);
				setState(44);
				((RepeatContext)_localctx).num = expression(0);
				setState(45);
				match(RPAR);
				setState(46);
				match(SCOLON);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				((IfContext)_localctx).exp = expression(0);
				setState(49);
				match(T__2);
				setState(50);
				match(LPAR);
				setState(51);
				((IfContext)_localctx).con = expression(0);
				setState(52);
				match(RPAR);
				setState(53);
				match(SCOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DEQS() { return getToken(arthurParser.DEQS, 0); }
		public BoolOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode LPAR() { return getToken(arthurParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(arthurParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public Token exp;
		public TerminalNode QUOTES() { return getToken(arthurParser.QUOTES, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetVarContext extends ExpressionContext {
		public Token name;
		public TerminalNode NAME() { return getToken(arthurParser.NAME, 0); }
		public GetVarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterGetVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitGetVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitGetVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExpressionContext {
		public CodeBlockContext arg;
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public BlockContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicNumContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(arthurParser.NUMBER, 0); }
		public BasicNumContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterBasicNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitBasicNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitBasicNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(arthurParser.POW, 0); }
		public TerminalNode DIVIDE() { return getToken(arthurParser.DIVIDE, 0); }
		public TerminalNode TIMES() { return getToken(arthurParser.TIMES, 0); }
		public TerminalNode MOD() { return getToken(arthurParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(arthurParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(arthurParser.MINUS, 0); }
		public CompOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new BasicNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				match(NUMBER);
				}
				break;
			case QUOTES:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				((StringContext)_localctx).exp = match(QUOTES);
				}
				break;
			case NAME:
				{
				_localctx = new GetVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				((GetVarContext)_localctx).name = match(NAME);
				}
				break;
			case LPAR:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(LPAR);
				setState(62);
				((ParenContext)_localctx).exp = expression(0);
				setState(63);
				match(RPAR);
				}
				break;
			case CLEFT:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				((BlockContext)_localctx).arg = codeBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new CompOpContext(new ExpressionContext(_parentctx, _parentState));
						((CompOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(69);
						((CompOpContext)_localctx).oper = match(POW);
						setState(70);
						((CompOpContext)_localctx).right = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new CompOpContext(new ExpressionContext(_parentctx, _parentState));
						((CompOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(72);
						((CompOpContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << TIMES) | (1L << MOD))) != 0)) ) {
							((CompOpContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						((CompOpContext)_localctx).right = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new CompOpContext(new ExpressionContext(_parentctx, _parentState));
						((CompOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(75);
						((CompOpContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((CompOpContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(76);
						((CompOpContext)_localctx).right = expression(4);
						}
						break;
					case 4:
						{
						_localctx = new BoolOpContext(new ExpressionContext(_parentctx, _parentState));
						((BoolOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(78);
						((BoolOpContext)_localctx).oper = match(DEQS);
						setState(79);
						((BoolOpContext)_localctx).right = expression(3);
						}
						break;
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public Token command;
		public ExpressionContext arg;
		public TerminalNode LPAR() { return getToken(arthurParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(arthurParser.RPAR, 0); }
		public TerminalNode SCOLON() { return getToken(arthurParser.SCOLON, 0); }
		public TerminalNode PRINT() { return getToken(arthurParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arthurListener ) ((arthurListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arthurVisitor ) return ((arthurVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((PrintContext)_localctx).command = match(PRINT);
			setState(86);
			match(LPAR);
			setState(87);
			((PrintContext)_localctx).arg = expression(0);
			setState(88);
			match(RPAR);
			setState(89);
			match(SCOLON);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7E\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7S\n\7\f\7\16\7V\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\2\3\f\t\2\4\6\b\n\f\16\2\4\4\2\13\f\16\16\3\2\t\n"+
		"\2f\2\20\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n9\3\2\2\2\fD\3\2"+
		"\2\2\16W\3\2\2\2\20\22\7\25\2\2\21\23\5\4\3\2\22\21\3\2\2\2\23\24\3\2"+
		"\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27\7\26\2\2\27\3\3\2"+
		"\2\2\30\37\5\6\4\2\31\37\5\2\2\2\32\37\5\b\5\2\33\37\5\f\7\2\34\37\5\16"+
		"\b\2\35\37\5\n\6\2\36\30\3\2\2\2\36\31\3\2\2\2\36\32\3\2\2\2\36\33\3\2"+
		"\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\7\6\2\2!\7\3\2\2\2\"#"+
		"\7\30\2\2#$\7\23\2\2$%\5\f\7\2%&\7\21\2\2&\t\3\2\2\2\'(\5\f\7\2()\7\3"+
		"\2\2)*\7\21\2\2*:\3\2\2\2+,\5\f\7\2,-\7\4\2\2-.\7\17\2\2./\5\f\7\2/\60"+
		"\7\20\2\2\60\61\7\21\2\2\61:\3\2\2\2\62\63\5\f\7\2\63\64\7\5\2\2\64\65"+
		"\7\17\2\2\65\66\5\f\7\2\66\67\7\20\2\2\678\7\21\2\28:\3\2\2\29\'\3\2\2"+
		"\29+\3\2\2\29\62\3\2\2\2:\13\3\2\2\2;<\b\7\1\2<E\7\7\2\2=E\7\27\2\2>E"+
		"\7\30\2\2?@\7\17\2\2@A\5\f\7\2AB\7\20\2\2BE\3\2\2\2CE\5\2\2\2D;\3\2\2"+
		"\2D=\3\2\2\2D>\3\2\2\2D?\3\2\2\2DC\3\2\2\2ET\3\2\2\2FG\f\7\2\2GH\7\r\2"+
		"\2HS\5\f\7\bIJ\f\6\2\2JK\t\2\2\2KS\5\f\7\7LM\f\5\2\2MN\t\3\2\2NS\5\f\7"+
		"\6OP\f\4\2\2PQ\7\24\2\2QS\5\f\7\5RF\3\2\2\2RI\3\2\2\2RL\3\2\2\2RO\3\2"+
		"\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\r\3\2\2\2VT\3\2\2\2WX\7\22\2\2XY\7"+
		"\17\2\2YZ\5\f\7\2Z[\7\20\2\2[\\\7\21\2\2\\\17\3\2\2\2\b\24\369DRT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}