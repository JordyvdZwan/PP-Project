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
		T__0=1, NGHundred=2, NGThousand=3, NGMillion=4, NGBillion=5, NGZero=6, 
		NGOne=7, NGTwo=8, NGThree=9, NGFour=10, NGFive=11, NGSix=12, NGSeven=13, 
		NGEight=14, NGNine=15, NGTen=16, NGEleven=17, NGTwelve=18, NGEighteen=19, 
		NGThir=20, NGFif=21, NGTeen=22, NGTwenty=23, NGThirty=24, NGForty=25, 
		NGFifty=26, NGSixty=27, NGSeventy=28, NGEighty=29, NGNinety=30, NGAnd=31, 
		NGA=32, NGB=33, NGC=34, NGD=35, NGE=36, NGF=37, NGG=38, NGH=39, NGI=40, 
		NGJ=41, NGK=42, NGL=43, NGM=44, NGN=45, NGO=46, NGP=47, NGQ=48, NGR=49, 
		NGS=50, NGT=51, NGU=52, NGV=53, NGW=54, NGX=55, NGY=56, NGZ=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "NGHundred", "NGThousand", "NGMillion", "NGBillion", "NGZero", 
		"NGOne", "NGTwo", "NGThree", "NGFour", "NGFive", "NGSix", "NGSeven", "NGEight", 
		"NGNine", "NGTen", "NGEleven", "NGTwelve", "NGEighteen", "NGThir", "NGFif", 
		"NGTeen", "NGTwenty", "NGThirty", "NGForty", "NGFifty", "NGSixty", "NGSeventy", 
		"NGEighty", "NGNinety", "NGAnd", "NGA", "NGB", "NGC", "NGD", "NGE", "NGF", 
		"NGG", "NGH", "NGI", "NGJ", "NGK", "NGL", "NGM", "NGN", "NGO", "NGP", 
		"NGQ", "NGR", "NGS", "NGT", "NGU", "NGV", "NGW", "NGX", "NGY", "NGZ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NGHundred", "NGThousand", "NGMillion", "NGBillion", "NGZero", 
		"NGOne", "NGTwo", "NGThree", "NGFour", "NGFive", "NGSix", "NGSeven", "NGEight", 
		"NGNine", "NGTen", "NGEleven", "NGTwelve", "NGEighteen", "NGThir", "NGFif", 
		"NGTeen", "NGTwenty", "NGThirty", "NGForty", "NGFifty", "NGSixty", "NGSeventy", 
		"NGEighty", "NGNinety", "NGAnd", "NGA", "NGB", "NGC", "NGD", "NGE", "NGF", 
		"NGG", "NGH", "NGI", "NGJ", "NGK", "NGL", "NGM", "NGN", "NGO", "NGP", 
		"NGQ", "NGR", "NGS", "NGT", "NGU", "NGV", "NGW", "NGX", "NGY", "NGZ"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0161\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;\3\2\34\4\2CCcc\4"+
		"\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLl"+
		"l\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2"+
		"UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0160"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7\177\3\2\2"+
		"\2\t\u0088\3\2\2\2\13\u0090\3\2\2\2\r\u0098\3\2\2\2\17\u009d\3\2\2\2\21"+
		"\u00a1\3\2\2\2\23\u00a5\3\2\2\2\25\u00ab\3\2\2\2\27\u00b0\3\2\2\2\31\u00b5"+
		"\3\2\2\2\33\u00b9\3\2\2\2\35\u00bf\3\2\2\2\37\u00c5\3\2\2\2!\u00ca\3\2"+
		"\2\2#\u00ce\3\2\2\2%\u00d5\3\2\2\2\'\u00dc\3\2\2\2)\u00e5\3\2\2\2+\u00ea"+
		"\3\2\2\2-\u00ee\3\2\2\2/\u00f3\3\2\2\2\61\u00fa\3\2\2\2\63\u0101\3\2\2"+
		"\2\65\u0107\3\2\2\2\67\u010d\3\2\2\29\u0113\3\2\2\2;\u011b\3\2\2\2=\u0122"+
		"\3\2\2\2?\u0129\3\2\2\2A\u012d\3\2\2\2C\u012f\3\2\2\2E\u0131\3\2\2\2G"+
		"\u0133\3\2\2\2I\u0135\3\2\2\2K\u0137\3\2\2\2M\u0139\3\2\2\2O\u013b\3\2"+
		"\2\2Q\u013d\3\2\2\2S\u013f\3\2\2\2U\u0141\3\2\2\2W\u0143\3\2\2\2Y\u0145"+
		"\3\2\2\2[\u0147\3\2\2\2]\u0149\3\2\2\2_\u014b\3\2\2\2a\u014d\3\2\2\2c"+
		"\u014f\3\2\2\2e\u0151\3\2\2\2g\u0153\3\2\2\2i\u0155\3\2\2\2k\u0157\3\2"+
		"\2\2m\u0159\3\2\2\2o\u015b\3\2\2\2q\u015d\3\2\2\2s\u015f\3\2\2\2uv\7/"+
		"\2\2v\4\3\2\2\2wx\5O(\2xy\5i\65\2yz\5[.\2z{\5G$\2{|\5c\62\2|}\5I%\2}~"+
		"\5G$\2~\6\3\2\2\2\177\u0080\5g\64\2\u0080\u0081\5O(\2\u0081\u0082\5]/"+
		"\2\u0082\u0083\5i\65\2\u0083\u0084\5e\63\2\u0084\u0085\5A!\2\u0085\u0086"+
		"\5[.\2\u0086\u0087\5G$\2\u0087\b\3\2\2\2\u0088\u0089\5Y-\2\u0089\u008a"+
		"\5Q)\2\u008a\u008b\5W,\2\u008b\u008c\5W,\2\u008c\u008d\5Q)\2\u008d\u008e"+
		"\5]/\2\u008e\u008f\5[.\2\u008f\n\3\2\2\2\u0090\u0091\5C\"\2\u0091\u0092"+
		"\5Q)\2\u0092\u0093\5W,\2\u0093\u0094\5W,\2\u0094\u0095\5Q)\2\u0095\u0096"+
		"\5]/\2\u0096\u0097\5[.\2\u0097\f\3\2\2\2\u0098\u0099\5s:\2\u0099\u009a"+
		"\5I%\2\u009a\u009b\5c\62\2\u009b\u009c\5]/\2\u009c\16\3\2\2\2\u009d\u009e"+
		"\5]/\2\u009e\u009f\5[.\2\u009f\u00a0\5I%\2\u00a0\20\3\2\2\2\u00a1\u00a2"+
		"\5g\64\2\u00a2\u00a3\5m\67\2\u00a3\u00a4\5]/\2\u00a4\22\3\2\2\2\u00a5"+
		"\u00a6\5g\64\2\u00a6\u00a7\5O(\2\u00a7\u00a8\5c\62\2\u00a8\u00a9\5I%\2"+
		"\u00a9\u00aa\5I%\2\u00aa\24\3\2\2\2\u00ab\u00ac\5K&\2\u00ac\u00ad\5]/"+
		"\2\u00ad\u00ae\5i\65\2\u00ae\u00af\5c\62\2\u00af\26\3\2\2\2\u00b0\u00b1"+
		"\5K&\2\u00b1\u00b2\5Q)\2\u00b2\u00b3\5k\66\2\u00b3\u00b4\5I%\2\u00b4\30"+
		"\3\2\2\2\u00b5\u00b6\5e\63\2\u00b6\u00b7\5Q)\2\u00b7\u00b8\5o8\2\u00b8"+
		"\32\3\2\2\2\u00b9\u00ba\5e\63\2\u00ba\u00bb\5I%\2\u00bb\u00bc\5k\66\2"+
		"\u00bc\u00bd\5I%\2\u00bd\u00be\5[.\2\u00be\34\3\2\2\2\u00bf\u00c0\5I%"+
		"\2\u00c0\u00c1\5Q)\2\u00c1\u00c2\5M\'\2\u00c2\u00c3\5O(\2\u00c3\u00c4"+
		"\5g\64\2\u00c4\36\3\2\2\2\u00c5\u00c6\5[.\2\u00c6\u00c7\5Q)\2\u00c7\u00c8"+
		"\5[.\2\u00c8\u00c9\5I%\2\u00c9 \3\2\2\2\u00ca\u00cb\5g\64\2\u00cb\u00cc"+
		"\5I%\2\u00cc\u00cd\5[.\2\u00cd\"\3\2\2\2\u00ce\u00cf\5I%\2\u00cf\u00d0"+
		"\5W,\2\u00d0\u00d1\5I%\2\u00d1\u00d2\5k\66\2\u00d2\u00d3\5I%\2\u00d3\u00d4"+
		"\5[.\2\u00d4$\3\2\2\2\u00d5\u00d6\5g\64\2\u00d6\u00d7\5m\67\2\u00d7\u00d8"+
		"\5I%\2\u00d8\u00d9\5W,\2\u00d9\u00da\5k\66\2\u00da\u00db\5I%\2\u00db&"+
		"\3\2\2\2\u00dc\u00dd\5I%\2\u00dd\u00de\5Q)\2\u00de\u00df\5M\'\2\u00df"+
		"\u00e0\5O(\2\u00e0\u00e1\5g\64\2\u00e1\u00e2\5I%\2\u00e2\u00e3\5I%\2\u00e3"+
		"\u00e4\5[.\2\u00e4(\3\2\2\2\u00e5\u00e6\5g\64\2\u00e6\u00e7\5O(\2\u00e7"+
		"\u00e8\5Q)\2\u00e8\u00e9\5c\62\2\u00e9*\3\2\2\2\u00ea\u00eb\5K&\2\u00eb"+
		"\u00ec\5Q)\2\u00ec\u00ed\5K&\2\u00ed,\3\2\2\2\u00ee\u00ef\5g\64\2\u00ef"+
		"\u00f0\5I%\2\u00f0\u00f1\5I%\2\u00f1\u00f2\5[.\2\u00f2.\3\2\2\2\u00f3"+
		"\u00f4\5g\64\2\u00f4\u00f5\5m\67\2\u00f5\u00f6\5I%\2\u00f6\u00f7\5[.\2"+
		"\u00f7\u00f8\5g\64\2\u00f8\u00f9\5q9\2\u00f9\60\3\2\2\2\u00fa\u00fb\5"+
		"g\64\2\u00fb\u00fc\5O(\2\u00fc\u00fd\5Q)\2\u00fd\u00fe\5c\62\2\u00fe\u00ff"+
		"\5g\64\2\u00ff\u0100\5q9\2\u0100\62\3\2\2\2\u0101\u0102\5K&\2\u0102\u0103"+
		"\5]/\2\u0103\u0104\5c\62\2\u0104\u0105\5g\64\2\u0105\u0106\5q9\2\u0106"+
		"\64\3\2\2\2\u0107\u0108\5K&\2\u0108\u0109\5Q)\2\u0109\u010a\5K&\2\u010a"+
		"\u010b\5g\64\2\u010b\u010c\5q9\2\u010c\66\3\2\2\2\u010d\u010e\5e\63\2"+
		"\u010e\u010f\5Q)\2\u010f\u0110\5o8\2\u0110\u0111\5g\64\2\u0111\u0112\5"+
		"q9\2\u01128\3\2\2\2\u0113\u0114\5e\63\2\u0114\u0115\5I%\2\u0115\u0116"+
		"\5k\66\2\u0116\u0117\5I%\2\u0117\u0118\5[.\2\u0118\u0119\5g\64\2\u0119"+
		"\u011a\5q9\2\u011a:\3\2\2\2\u011b\u011c\5I%\2\u011c\u011d\5Q)\2\u011d"+
		"\u011e\5M\'\2\u011e\u011f\5O(\2\u011f\u0120\5g\64\2\u0120\u0121\5q9\2"+
		"\u0121<\3\2\2\2\u0122\u0123\5[.\2\u0123\u0124\5Q)\2\u0124\u0125\5[.\2"+
		"\u0125\u0126\5I%\2\u0126\u0127\5g\64\2\u0127\u0128\5q9\2\u0128>\3\2\2"+
		"\2\u0129\u012a\5A!\2\u012a\u012b\5[.\2\u012b\u012c\5G$\2\u012c@\3\2\2"+
		"\2\u012d\u012e\t\2\2\2\u012eB\3\2\2\2\u012f\u0130\t\3\2\2\u0130D\3\2\2"+
		"\2\u0131\u0132\t\4\2\2\u0132F\3\2\2\2\u0133\u0134\t\5\2\2\u0134H\3\2\2"+
		"\2\u0135\u0136\t\6\2\2\u0136J\3\2\2\2\u0137\u0138\t\7\2\2\u0138L\3\2\2"+
		"\2\u0139\u013a\t\b\2\2\u013aN\3\2\2\2\u013b\u013c\t\t\2\2\u013cP\3\2\2"+
		"\2\u013d\u013e\t\n\2\2\u013eR\3\2\2\2\u013f\u0140\t\13\2\2\u0140T\3\2"+
		"\2\2\u0141\u0142\t\f\2\2\u0142V\3\2\2\2\u0143\u0144\t\r\2\2\u0144X\3\2"+
		"\2\2\u0145\u0146\t\16\2\2\u0146Z\3\2\2\2\u0147\u0148\t\17\2\2\u0148\\"+
		"\3\2\2\2\u0149\u014a\t\20\2\2\u014a^\3\2\2\2\u014b\u014c\t\21\2\2\u014c"+
		"`\3\2\2\2\u014d\u014e\t\22\2\2\u014eb\3\2\2\2\u014f\u0150\t\23\2\2\u0150"+
		"d\3\2\2\2\u0151\u0152\t\24\2\2\u0152f\3\2\2\2\u0153\u0154\t\25\2\2\u0154"+
		"h\3\2\2\2\u0155\u0156\t\26\2\2\u0156j\3\2\2\2\u0157\u0158\t\27\2\2\u0158"+
		"l\3\2\2\2\u0159\u015a\t\30\2\2\u015an\3\2\2\2\u015b\u015c\t\31\2\2\u015c"+
		"p\3\2\2\2\u015d\u015e\t\32\2\2\u015er\3\2\2\2\u015f\u0160\t\33\2\2\u0160"+
		"t\3\2\2\2\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}