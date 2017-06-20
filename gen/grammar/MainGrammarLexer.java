// Generated from C:/Projects/Project - Programming Paradigms Compiler Project/PP-Compiler-Project/src/grammar\MainGrammar.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NumericNumber=2, Zero=3, One=4, Two=5, Three=6, Four=7, Five=8, 
		Six=9, Seven=10, Eight=11, Nine=12, Ten=13, Eleven=14, Twelve=15, Eighteen=16, 
		Thir=17, Fif=18, Teen=19, Twenty=20, Thirty=21, Forty=22, Fifty=23, Sixty=24, 
		Seventy=25, Eighty=26, Ninety=27, And=28, A=29, B=30, C=31, D=32, E=33, 
		F=34, G=35, H=36, I=37, J=38, K=39, L=40, M=41, N=42, O=43, P=44, Q=45, 
		R=46, S=47, T=48, U=49, V=50, W=51, X=52, Y=53, Z=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "NumericNumber", "Zero", "One", "Two", "Three", "Four", "Five", 
		"Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Eighteen", 
		"Thir", "Fif", "Teen", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", 
		"Seventy", "Eighty", "Ninety", "And", "A", "B", "C", "D", "E", "F", "G", 
		"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
		"V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NumericNumber", "Zero", "One", "Two", "Three", "Four", "Five", 
		"Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Eighteen", 
		"Thir", "Fif", "Teen", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", 
		"Seventy", "Eighty", "Ninety", "And", "A", "B", "C", "D", "E", "F", "G", 
		"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
		"V", "W", "X", "Y", "Z"
	};
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


	public MainGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MainGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u013f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\6\3s\n\3\r\3\16\3t\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\2\28\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3\2\35\3"+
		"\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJj"+
		"j\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2"+
		"SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\2\u013f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5r\3\2\2\2\7v\3\2\2\2\t{\3\2\2\2\13\177"+
		"\3\2\2\2\r\u0083\3\2\2\2\17\u0089\3\2\2\2\21\u008e\3\2\2\2\23\u0093\3"+
		"\2\2\2\25\u0097\3\2\2\2\27\u009d\3\2\2\2\31\u00a3\3\2\2\2\33\u00a8\3\2"+
		"\2\2\35\u00ac\3\2\2\2\37\u00b3\3\2\2\2!\u00ba\3\2\2\2#\u00c3\3\2\2\2%"+
		"\u00c8\3\2\2\2\'\u00cc\3\2\2\2)\u00d1\3\2\2\2+\u00d8\3\2\2\2-\u00df\3"+
		"\2\2\2/\u00e5\3\2\2\2\61\u00eb\3\2\2\2\63\u00f1\3\2\2\2\65\u00f9\3\2\2"+
		"\2\67\u0100\3\2\2\29\u0107\3\2\2\2;\u010b\3\2\2\2=\u010d\3\2\2\2?\u010f"+
		"\3\2\2\2A\u0111\3\2\2\2C\u0113\3\2\2\2E\u0115\3\2\2\2G\u0117\3\2\2\2I"+
		"\u0119\3\2\2\2K\u011b\3\2\2\2M\u011d\3\2\2\2O\u011f\3\2\2\2Q\u0121\3\2"+
		"\2\2S\u0123\3\2\2\2U\u0125\3\2\2\2W\u0127\3\2\2\2Y\u0129\3\2\2\2[\u012b"+
		"\3\2\2\2]\u012d\3\2\2\2_\u012f\3\2\2\2a\u0131\3\2\2\2c\u0133\3\2\2\2e"+
		"\u0135\3\2\2\2g\u0137\3\2\2\2i\u0139\3\2\2\2k\u013b\3\2\2\2m\u013d\3\2"+
		"\2\2op\7/\2\2p\4\3\2\2\2qs\t\2\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2"+
		"\2\2u\6\3\2\2\2vw\5m\67\2wx\5C\"\2xy\5]/\2yz\5W,\2z\b\3\2\2\2{|\5W,\2"+
		"|}\5U+\2}~\5C\"\2~\n\3\2\2\2\177\u0080\5a\61\2\u0080\u0081\5g\64\2\u0081"+
		"\u0082\5W,\2\u0082\f\3\2\2\2\u0083\u0084\5a\61\2\u0084\u0085\5I%\2\u0085"+
		"\u0086\5]/\2\u0086\u0087\5C\"\2\u0087\u0088\5C\"\2\u0088\16\3\2\2\2\u0089"+
		"\u008a\5E#\2\u008a\u008b\5W,\2\u008b\u008c\5c\62\2\u008c\u008d\5]/\2\u008d"+
		"\20\3\2\2\2\u008e\u008f\5E#\2\u008f\u0090\5K&\2\u0090\u0091\5e\63\2\u0091"+
		"\u0092\5C\"\2\u0092\22\3\2\2\2\u0093\u0094\5_\60\2\u0094\u0095\5K&\2\u0095"+
		"\u0096\5i\65\2\u0096\24\3\2\2\2\u0097\u0098\5_\60\2\u0098\u0099\5C\"\2"+
		"\u0099\u009a\5e\63\2\u009a\u009b\5C\"\2\u009b\u009c\5U+\2\u009c\26\3\2"+
		"\2\2\u009d\u009e\5C\"\2\u009e\u009f\5K&\2\u009f\u00a0\5G$\2\u00a0\u00a1"+
		"\5I%\2\u00a1\u00a2\5a\61\2\u00a2\30\3\2\2\2\u00a3\u00a4\5U+\2\u00a4\u00a5"+
		"\5K&\2\u00a5\u00a6\5U+\2\u00a6\u00a7\5C\"\2\u00a7\32\3\2\2\2\u00a8\u00a9"+
		"\5a\61\2\u00a9\u00aa\5C\"\2\u00aa\u00ab\5U+\2\u00ab\34\3\2\2\2\u00ac\u00ad"+
		"\5C\"\2\u00ad\u00ae\5Q)\2\u00ae\u00af\5C\"\2\u00af\u00b0\5e\63\2\u00b0"+
		"\u00b1\5C\"\2\u00b1\u00b2\5U+\2\u00b2\36\3\2\2\2\u00b3\u00b4\5a\61\2\u00b4"+
		"\u00b5\5g\64\2\u00b5\u00b6\5C\"\2\u00b6\u00b7\5Q)\2\u00b7\u00b8\5e\63"+
		"\2\u00b8\u00b9\5C\"\2\u00b9 \3\2\2\2\u00ba\u00bb\5C\"\2\u00bb\u00bc\5"+
		"K&\2\u00bc\u00bd\5G$\2\u00bd\u00be\5I%\2\u00be\u00bf\5a\61\2\u00bf\u00c0"+
		"\5C\"\2\u00c0\u00c1\5C\"\2\u00c1\u00c2\5U+\2\u00c2\"\3\2\2\2\u00c3\u00c4"+
		"\5a\61\2\u00c4\u00c5\5I%\2\u00c5\u00c6\5K&\2\u00c6\u00c7\5]/\2\u00c7$"+
		"\3\2\2\2\u00c8\u00c9\5E#\2\u00c9\u00ca\5K&\2\u00ca\u00cb\5E#\2\u00cb&"+
		"\3\2\2\2\u00cc\u00cd\5a\61\2\u00cd\u00ce\5C\"\2\u00ce\u00cf\5C\"\2\u00cf"+
		"\u00d0\5U+\2\u00d0(\3\2\2\2\u00d1\u00d2\5a\61\2\u00d2\u00d3\5g\64\2\u00d3"+
		"\u00d4\5C\"\2\u00d4\u00d5\5U+\2\u00d5\u00d6\5a\61\2\u00d6\u00d7\5k\66"+
		"\2\u00d7*\3\2\2\2\u00d8\u00d9\5a\61\2\u00d9\u00da\5I%\2\u00da\u00db\5"+
		"K&\2\u00db\u00dc\5]/\2\u00dc\u00dd\5a\61\2\u00dd\u00de\5k\66\2\u00de,"+
		"\3\2\2\2\u00df\u00e0\5E#\2\u00e0\u00e1\5W,\2\u00e1\u00e2\5]/\2\u00e2\u00e3"+
		"\5a\61\2\u00e3\u00e4\5k\66\2\u00e4.\3\2\2\2\u00e5\u00e6\5E#\2\u00e6\u00e7"+
		"\5K&\2\u00e7\u00e8\5E#\2\u00e8\u00e9\5a\61\2\u00e9\u00ea\5k\66\2\u00ea"+
		"\60\3\2\2\2\u00eb\u00ec\5_\60\2\u00ec\u00ed\5K&\2\u00ed\u00ee\5i\65\2"+
		"\u00ee\u00ef\5a\61\2\u00ef\u00f0\5k\66\2\u00f0\62\3\2\2\2\u00f1\u00f2"+
		"\5_\60\2\u00f2\u00f3\5C\"\2\u00f3\u00f4\5e\63\2\u00f4\u00f5\5C\"\2\u00f5"+
		"\u00f6\5U+\2\u00f6\u00f7\5a\61\2\u00f7\u00f8\5k\66\2\u00f8\64\3\2\2\2"+
		"\u00f9\u00fa\5C\"\2\u00fa\u00fb\5K&\2\u00fb\u00fc\5G$\2\u00fc\u00fd\5"+
		"I%\2\u00fd\u00fe\5a\61\2\u00fe\u00ff\5k\66\2\u00ff\66\3\2\2\2\u0100\u0101"+
		"\5U+\2\u0101\u0102\5K&\2\u0102\u0103\5U+\2\u0103\u0104\5C\"\2\u0104\u0105"+
		"\5a\61\2\u0105\u0106\5k\66\2\u01068\3\2\2\2\u0107\u0108\5;\36\2\u0108"+
		"\u0109\5U+\2\u0109\u010a\5A!\2\u010a:\3\2\2\2\u010b\u010c\t\3\2\2\u010c"+
		"<\3\2\2\2\u010d\u010e\t\4\2\2\u010e>\3\2\2\2\u010f\u0110\t\5\2\2\u0110"+
		"@\3\2\2\2\u0111\u0112\t\6\2\2\u0112B\3\2\2\2\u0113\u0114\t\7\2\2\u0114"+
		"D\3\2\2\2\u0115\u0116\t\b\2\2\u0116F\3\2\2\2\u0117\u0118\t\t\2\2\u0118"+
		"H\3\2\2\2\u0119\u011a\t\n\2\2\u011aJ\3\2\2\2\u011b\u011c\t\13\2\2\u011c"+
		"L\3\2\2\2\u011d\u011e\t\f\2\2\u011eN\3\2\2\2\u011f\u0120\t\r\2\2\u0120"+
		"P\3\2\2\2\u0121\u0122\t\16\2\2\u0122R\3\2\2\2\u0123\u0124\t\17\2\2\u0124"+
		"T\3\2\2\2\u0125\u0126\t\20\2\2\u0126V\3\2\2\2\u0127\u0128\t\21\2\2\u0128"+
		"X\3\2\2\2\u0129\u012a\t\22\2\2\u012aZ\3\2\2\2\u012b\u012c\t\23\2\2\u012c"+
		"\\\3\2\2\2\u012d\u012e\t\24\2\2\u012e^\3\2\2\2\u012f\u0130\t\25\2\2\u0130"+
		"`\3\2\2\2\u0131\u0132\t\26\2\2\u0132b\3\2\2\2\u0133\u0134\t\27\2\2\u0134"+
		"d\3\2\2\2\u0135\u0136\t\30\2\2\u0136f\3\2\2\2\u0137\u0138\t\31\2\2\u0138"+
		"h\3\2\2\2\u0139\u013a\t\32\2\2\u013aj\3\2\2\2\u013b\u013c\t\33\2\2\u013c"+
		"l\3\2\2\2\u013d\u013e\t\34\2\2\u013en\3\2\2\2\4\2t\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}