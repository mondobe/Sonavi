// Generated from arthur.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class arthurLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, STOP=4, NUMBER=5, WHITESPACE=6, PLUS=7, MINUS=8, 
		DIVIDE=9, TIMES=10, POW=11, MOD=12, LPAR=13, RPAR=14, SCOLON=15, PRINT=16, 
		EQUALS=17, DEQS=18, CLEFT=19, CRIGHT=20, QUOTES=21, NAME=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "STOP", "NUMBER", "WHITESPACE", "PLUS", "MINUS", 
			"DIVIDE", "TIMES", "POW", "MOD", "LPAR", "RPAR", "SCOLON", "PRINT", "EQUALS", 
			"DEQS", "CLEFT", "CRIGHT", "QUOTES", "NAME"
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


	public arthurLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "arthur.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\6\6G\n\6\r\6\16\6H\3\6\3\6\6\6M\n\6\r\6\16\6N\5\6Q\n\6\3\7\6"+
		"\7T\n\7\r\7\16\7U\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\7\26}\n\26\f\26\16"+
		"\26\u0080\13\26\3\26\3\26\3\27\3\27\7\27\u0086\n\27\f\27\16\27\u0089\13"+
		"\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\7\4\2\62;aa\4\2\13\13"+
		"\"\"\5\2\f\f\17\17$$\4\2C\\c|\5\2\62;C\\c|\2\u008f\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\64\3\2\2\2\7<\3\2"+
		"\2\2\t@\3\2\2\2\13F\3\2\2\2\rS\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23]\3\2"+
		"\2\2\25_\3\2\2\2\27a\3\2\2\2\31c\3\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37i\3"+
		"\2\2\2!k\3\2\2\2#q\3\2\2\2%s\3\2\2\2\'v\3\2\2\2)x\3\2\2\2+z\3\2\2\2-\u0083"+
		"\3\2\2\2/\60\7\60\2\2\60\61\7t\2\2\61\62\7w\2\2\62\63\7p\2\2\63\4\3\2"+
		"\2\2\64\65\7\60\2\2\65\66\7t\2\2\66\67\7g\2\2\678\7r\2\289\7g\2\29:\7"+
		"c\2\2:;\7v\2\2;\6\3\2\2\2<=\7\60\2\2=>\7k\2\2>?\7h\2\2?\b\3\2\2\2@A\7"+
		"#\2\2AB\7G\2\2BC\7P\2\2CD\7F\2\2D\n\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2"+
		"\2\2HF\3\2\2\2HI\3\2\2\2IP\3\2\2\2JL\7\60\2\2KM\4\62;\2LK\3\2\2\2MN\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PJ\3\2\2\2PQ\3\2\2\2Q\f\3\2\2\2RT"+
		"\t\3\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\b\7\2\2X"+
		"\16\3\2\2\2YZ\7-\2\2Z\20\3\2\2\2[\\\7/\2\2\\\22\3\2\2\2]^\7\61\2\2^\24"+
		"\3\2\2\2_`\7,\2\2`\26\3\2\2\2ab\7`\2\2b\30\3\2\2\2cd\7\'\2\2d\32\3\2\2"+
		"\2ef\7*\2\2f\34\3\2\2\2gh\7+\2\2h\36\3\2\2\2ij\7=\2\2j \3\2\2\2kl\7r\2"+
		"\2lm\7t\2\2mn\7k\2\2no\7p\2\2op\7v\2\2p\"\3\2\2\2qr\7?\2\2r$\3\2\2\2s"+
		"t\7?\2\2tu\7?\2\2u&\3\2\2\2vw\7}\2\2w(\3\2\2\2xy\7\177\2\2y*\3\2\2\2z"+
		"~\7$\2\2{}\n\4\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7$\2\2\u0082,\3\2\2\2\u0083"+
		"\u0087\t\5\2\2\u0084\u0086\t\6\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088.\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\n\2FHNPU~\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}