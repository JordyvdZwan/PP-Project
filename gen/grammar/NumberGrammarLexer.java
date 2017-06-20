// Generated from C:/Projects/Project - Programming Paradigms Compiler Project/PP-Compiler-Project/src/grammar\NumberGrammar.g4 by ANTLR 4.7
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
public class NumberGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NumericNumber=2, Hundred=3, Thousand=4, Million=5, Billion=6, 
		Zero=7, One=8, Two=9, Three=10, Four=11, Five=12, Six=13, Seven=14, Eight=15, 
		Nine=16, Ten=17, Eleven=18, Twelve=19, Eighteen=20, Thir=21, Fif=22, Teen=23, 
		Twenty=24, Thirty=25, Forty=26, Fifty=27, Sixty=28, Seventy=29, Eighty=30, 
		Ninety=31, And=32, A=33, B=34, C=35, D=36, E=37, F=38, G=39, H=40, I=41, 
		J=42, K=43, L=44, M=45, N=46, O=47, P=48, Q=49, R=50, S=51, T=52, U=53, 
		V=54, W=55, X=56, Y=57, Z=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "NumericNumber", "Hundred", "Thousand", "Million", "Billion", 
		"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", 
		"Nine", "Ten", "Eleven", "Twelve", "Eighteen", "Thir", "Fif", "Teen", 
		"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", 
		"And", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
		"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NumericNumber", "Hundred", "Thousand", "Million", "Billion", 
		"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", 
		"Nine", "Ten", "Eleven", "Twelve", "Eighteen", "Thir", "Fif", "Teen", 
		"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", 
		"And", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
		"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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


	public NumberGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NumberGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0168\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\6\3{\n\3\r\3\16\3|\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\2\2<"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<\3\2\35\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHh"+
		"h\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2"+
		"QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\2\u0168\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\3w\3\2\2\2\5z\3\2\2\2\7~\3\2\2\2\t\u0086\3\2\2\2\13\u008f\3\2"+
		"\2\2\r\u0097\3\2\2\2\17\u009f\3\2\2\2\21\u00a4\3\2\2\2\23\u00a8\3\2\2"+
		"\2\25\u00ac\3\2\2\2\27\u00b2\3\2\2\2\31\u00b7\3\2\2\2\33\u00bc\3\2\2\2"+
		"\35\u00c0\3\2\2\2\37\u00c6\3\2\2\2!\u00cc\3\2\2\2#\u00d1\3\2\2\2%\u00d5"+
		"\3\2\2\2\'\u00dc\3\2\2\2)\u00e3\3\2\2\2+\u00ec\3\2\2\2-\u00f1\3\2\2\2"+
		"/\u00f5\3\2\2\2\61\u00fa\3\2\2\2\63\u0101\3\2\2\2\65\u0108\3\2\2\2\67"+
		"\u010e\3\2\2\29\u0114\3\2\2\2;\u011a\3\2\2\2=\u0122\3\2\2\2?\u0129\3\2"+
		"\2\2A\u0130\3\2\2\2C\u0134\3\2\2\2E\u0136\3\2\2\2G\u0138\3\2\2\2I\u013a"+
		"\3\2\2\2K\u013c\3\2\2\2M\u013e\3\2\2\2O\u0140\3\2\2\2Q\u0142\3\2\2\2S"+
		"\u0144\3\2\2\2U\u0146\3\2\2\2W\u0148\3\2\2\2Y\u014a\3\2\2\2[\u014c\3\2"+
		"\2\2]\u014e\3\2\2\2_\u0150\3\2\2\2a\u0152\3\2\2\2c\u0154\3\2\2\2e\u0156"+
		"\3\2\2\2g\u0158\3\2\2\2i\u015a\3\2\2\2k\u015c\3\2\2\2m\u015e\3\2\2\2o"+
		"\u0160\3\2\2\2q\u0162\3\2\2\2s\u0164\3\2\2\2u\u0166\3\2\2\2wx\7/\2\2x"+
		"\4\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\6\3\2\2"+
		"\2~\177\5Q)\2\177\u0080\5k\66\2\u0080\u0081\5]/\2\u0081\u0082\5I%\2\u0082"+
		"\u0083\5e\63\2\u0083\u0084\5K&\2\u0084\u0085\5I%\2\u0085\b\3\2\2\2\u0086"+
		"\u0087\5i\65\2\u0087\u0088\5Q)\2\u0088\u0089\5_\60\2\u0089\u008a\5k\66"+
		"\2\u008a\u008b\5g\64\2\u008b\u008c\5C\"\2\u008c\u008d\5]/\2\u008d\u008e"+
		"\5I%\2\u008e\n\3\2\2\2\u008f\u0090\5[.\2\u0090\u0091\5S*\2\u0091\u0092"+
		"\5Y-\2\u0092\u0093\5Y-\2\u0093\u0094\5S*\2\u0094\u0095\5_\60\2\u0095\u0096"+
		"\5]/\2\u0096\f\3\2\2\2\u0097\u0098\5E#\2\u0098\u0099\5S*\2\u0099\u009a"+
		"\5Y-\2\u009a\u009b\5Y-\2\u009b\u009c\5S*\2\u009c\u009d\5_\60\2\u009d\u009e"+
		"\5]/\2\u009e\16\3\2\2\2\u009f\u00a0\5u;\2\u00a0\u00a1\5K&\2\u00a1\u00a2"+
		"\5e\63\2\u00a2\u00a3\5_\60\2\u00a3\20\3\2\2\2\u00a4\u00a5\5_\60\2\u00a5"+
		"\u00a6\5]/\2\u00a6\u00a7\5K&\2\u00a7\22\3\2\2\2\u00a8\u00a9\5i\65\2\u00a9"+
		"\u00aa\5o8\2\u00aa\u00ab\5_\60\2\u00ab\24\3\2\2\2\u00ac\u00ad\5i\65\2"+
		"\u00ad\u00ae\5Q)\2\u00ae\u00af\5e\63\2\u00af\u00b0\5K&\2\u00b0\u00b1\5"+
		"K&\2\u00b1\26\3\2\2\2\u00b2\u00b3\5M\'\2\u00b3\u00b4\5_\60\2\u00b4\u00b5"+
		"\5k\66\2\u00b5\u00b6\5e\63\2\u00b6\30\3\2\2\2\u00b7\u00b8\5M\'\2\u00b8"+
		"\u00b9\5S*\2\u00b9\u00ba\5m\67\2\u00ba\u00bb\5K&\2\u00bb\32\3\2\2\2\u00bc"+
		"\u00bd\5g\64\2\u00bd\u00be\5S*\2\u00be\u00bf\5q9\2\u00bf\34\3\2\2\2\u00c0"+
		"\u00c1\5g\64\2\u00c1\u00c2\5K&\2\u00c2\u00c3\5m\67\2\u00c3\u00c4\5K&\2"+
		"\u00c4\u00c5\5]/\2\u00c5\36\3\2\2\2\u00c6\u00c7\5K&\2\u00c7\u00c8\5S*"+
		"\2\u00c8\u00c9\5O(\2\u00c9\u00ca\5Q)\2\u00ca\u00cb\5i\65\2\u00cb \3\2"+
		"\2\2\u00cc\u00cd\5]/\2\u00cd\u00ce\5S*\2\u00ce\u00cf\5]/\2\u00cf\u00d0"+
		"\5K&\2\u00d0\"\3\2\2\2\u00d1\u00d2\5i\65\2\u00d2\u00d3\5K&\2\u00d3\u00d4"+
		"\5]/\2\u00d4$\3\2\2\2\u00d5\u00d6\5K&\2\u00d6\u00d7\5Y-\2\u00d7\u00d8"+
		"\5K&\2\u00d8\u00d9\5m\67\2\u00d9\u00da\5K&\2\u00da\u00db\5]/\2\u00db&"+
		"\3\2\2\2\u00dc\u00dd\5i\65\2\u00dd\u00de\5o8\2\u00de\u00df\5K&\2\u00df"+
		"\u00e0\5Y-\2\u00e0\u00e1\5m\67\2\u00e1\u00e2\5K&\2\u00e2(\3\2\2\2\u00e3"+
		"\u00e4\5K&\2\u00e4\u00e5\5S*\2\u00e5\u00e6\5O(\2\u00e6\u00e7\5Q)\2\u00e7"+
		"\u00e8\5i\65\2\u00e8\u00e9\5K&\2\u00e9\u00ea\5K&\2\u00ea\u00eb\5]/\2\u00eb"+
		"*\3\2\2\2\u00ec\u00ed\5i\65\2\u00ed\u00ee\5Q)\2\u00ee\u00ef\5S*\2\u00ef"+
		"\u00f0\5e\63\2\u00f0,\3\2\2\2\u00f1\u00f2\5M\'\2\u00f2\u00f3\5S*\2\u00f3"+
		"\u00f4\5M\'\2\u00f4.\3\2\2\2\u00f5\u00f6\5i\65\2\u00f6\u00f7\5K&\2\u00f7"+
		"\u00f8\5K&\2\u00f8\u00f9\5]/\2\u00f9\60\3\2\2\2\u00fa\u00fb\5i\65\2\u00fb"+
		"\u00fc\5o8\2\u00fc\u00fd\5K&\2\u00fd\u00fe\5]/\2\u00fe\u00ff\5i\65\2\u00ff"+
		"\u0100\5s:\2\u0100\62\3\2\2\2\u0101\u0102\5i\65\2\u0102\u0103\5Q)\2\u0103"+
		"\u0104\5S*\2\u0104\u0105\5e\63\2\u0105\u0106\5i\65\2\u0106\u0107\5s:\2"+
		"\u0107\64\3\2\2\2\u0108\u0109\5M\'\2\u0109\u010a\5_\60\2\u010a\u010b\5"+
		"e\63\2\u010b\u010c\5i\65\2\u010c\u010d\5s:\2\u010d\66\3\2\2\2\u010e\u010f"+
		"\5M\'\2\u010f\u0110\5S*\2\u0110\u0111\5M\'\2\u0111\u0112\5i\65\2\u0112"+
		"\u0113\5s:\2\u01138\3\2\2\2\u0114\u0115\5g\64\2\u0115\u0116\5S*\2\u0116"+
		"\u0117\5q9\2\u0117\u0118\5i\65\2\u0118\u0119\5s:\2\u0119:\3\2\2\2\u011a"+
		"\u011b\5g\64\2\u011b\u011c\5K&\2\u011c\u011d\5m\67\2\u011d\u011e\5K&\2"+
		"\u011e\u011f\5]/\2\u011f\u0120\5i\65\2\u0120\u0121\5s:\2\u0121<\3\2\2"+
		"\2\u0122\u0123\5K&\2\u0123\u0124\5S*\2\u0124\u0125\5O(\2\u0125\u0126\5"+
		"Q)\2\u0126\u0127\5i\65\2\u0127\u0128\5s:\2\u0128>\3\2\2\2\u0129\u012a"+
		"\5]/\2\u012a\u012b\5S*\2\u012b\u012c\5]/\2\u012c\u012d\5K&\2\u012d\u012e"+
		"\5i\65\2\u012e\u012f\5s:\2\u012f@\3\2\2\2\u0130\u0131\5C\"\2\u0131\u0132"+
		"\5]/\2\u0132\u0133\5I%\2\u0133B\3\2\2\2\u0134\u0135\t\3\2\2\u0135D\3\2"+
		"\2\2\u0136\u0137\t\4\2\2\u0137F\3\2\2\2\u0138\u0139\t\5\2\2\u0139H\3\2"+
		"\2\2\u013a\u013b\t\6\2\2\u013bJ\3\2\2\2\u013c\u013d\t\7\2\2\u013dL\3\2"+
		"\2\2\u013e\u013f\t\b\2\2\u013fN\3\2\2\2\u0140\u0141\t\t\2\2\u0141P\3\2"+
		"\2\2\u0142\u0143\t\n\2\2\u0143R\3\2\2\2\u0144\u0145\t\13\2\2\u0145T\3"+
		"\2\2\2\u0146\u0147\t\f\2\2\u0147V\3\2\2\2\u0148\u0149\t\r\2\2\u0149X\3"+
		"\2\2\2\u014a\u014b\t\16\2\2\u014bZ\3\2\2\2\u014c\u014d\t\17\2\2\u014d"+
		"\\\3\2\2\2\u014e\u014f\t\20\2\2\u014f^\3\2\2\2\u0150\u0151\t\21\2\2\u0151"+
		"`\3\2\2\2\u0152\u0153\t\22\2\2\u0153b\3\2\2\2\u0154\u0155\t\23\2\2\u0155"+
		"d\3\2\2\2\u0156\u0157\t\24\2\2\u0157f\3\2\2\2\u0158\u0159\t\25\2\2\u0159"+
		"h\3\2\2\2\u015a\u015b\t\26\2\2\u015bj\3\2\2\2\u015c\u015d\t\27\2\2\u015d"+
		"l\3\2\2\2\u015e\u015f\t\30\2\2\u015fn\3\2\2\2\u0160\u0161\t\31\2\2\u0161"+
		"p\3\2\2\2\u0162\u0163\t\32\2\2\u0163r\3\2\2\2\u0164\u0165\t\33\2\2\u0165"+
		"t\3\2\2\2\u0166\u0167\t\34\2\2\u0167v\3\2\2\2\4\2|\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}