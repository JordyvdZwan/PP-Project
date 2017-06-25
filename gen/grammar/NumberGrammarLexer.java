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
		T__0=1, T__1=2, NGHundred=3, NGThousand=4, NGMillion=5, NGBillion=6, NGZero=7, 
		NGOne=8, NGTwo=9, NGThree=10, NGFour=11, NGFive=12, NGSix=13, NGSeven=14, 
		NGEight=15, NGNine=16, NGTen=17, NGEleven=18, NGTwelve=19, NGEighteen=20, 
		NGThir=21, NGFif=22, NGTeen=23, NGTwenty=24, NGThirty=25, NGForty=26, 
		NGFifty=27, NGSixty=28, NGSeventy=29, NGEighty=30, NGNinety=31, NGAnd=32, 
		NGA=33, NGB=34, NGC=35, NGD=36, NGE=37, NGF=38, NGG=39, NGH=40, NGI=41, 
		NGJ=42, NGK=43, NGL=44, NGM=45, NGN=46, NGO=47, NGP=48, NGQ=49, NGR=50, 
		NGS=51, NGT=52, NGU=53, NGV=54, NGW=55, NGX=56, NGY=57, NGZ=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "NGHundred", "NGThousand", "NGMillion", "NGBillion", "NGZero", 
		"NGOne", "NGTwo", "NGThree", "NGFour", "NGFive", "NGSix", "NGSeven", "NGEight", 
		"NGNine", "NGTen", "NGEleven", "NGTwelve", "NGEighteen", "NGThir", "NGFif", 
		"NGTeen", "NGTwenty", "NGThirty", "NGForty", "NGFifty", "NGSixty", "NGSeventy", 
		"NGEighty", "NGNinety", "NGAnd", "NGA", "NGB", "NGC", "NGD", "NGE", "NGF", 
		"NGG", "NGH", "NGI", "NGJ", "NGK", "NGL", "NGM", "NGN", "NGO", "NGP", 
		"NGQ", "NGR", "NGS", "NGT", "NGU", "NGV", "NGW", "NGX", "NGY", "NGZ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "'-'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'a'", "'b'", "'c'", 
		"'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", 
		"'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", 
		"'x'", "'y'", "'z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "NGHundred", "NGThousand", "NGMillion", "NGBillion", 
		"NGZero", "NGOne", "NGTwo", "NGThree", "NGFour", "NGFive", "NGSix", "NGSeven", 
		"NGEight", "NGNine", "NGTen", "NGEleven", "NGTwelve", "NGEighteen", "NGThir", 
		"NGFif", "NGTeen", "NGTwenty", "NGThirty", "NGForty", "NGFifty", "NGSixty", 
		"NGSeventy", "NGEighty", "NGNinety", "NGAnd", "NGA", "NGB", "NGC", "NGD", 
		"NGE", "NGF", "NGG", "NGH", "NGI", "NGJ", "NGK", "NGL", "NGM", "NGN", 
		"NGO", "NGP", "NGQ", "NGR", "NGS", "NGT", "NGU", "NGV", "NGW", "NGX", 
		"NGY", "NGZ"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0165\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\2\2<\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<\3\2\2\2\u0164"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7"+
		"{\3\2\2\2\t\u0083\3\2\2\2\13\u008c\3\2\2\2\r\u0094\3\2\2\2\17\u009c\3"+
		"\2\2\2\21\u00a1\3\2\2\2\23\u00a5\3\2\2\2\25\u00a9\3\2\2\2\27\u00af\3\2"+
		"\2\2\31\u00b4\3\2\2\2\33\u00b9\3\2\2\2\35\u00bd\3\2\2\2\37\u00c3\3\2\2"+
		"\2!\u00c9\3\2\2\2#\u00ce\3\2\2\2%\u00d2\3\2\2\2\'\u00d9\3\2\2\2)\u00e0"+
		"\3\2\2\2+\u00e9\3\2\2\2-\u00ee\3\2\2\2/\u00f2\3\2\2\2\61\u00f7\3\2\2\2"+
		"\63\u00fe\3\2\2\2\65\u0105\3\2\2\2\67\u010b\3\2\2\29\u0111\3\2\2\2;\u0117"+
		"\3\2\2\2=\u011f\3\2\2\2?\u0126\3\2\2\2A\u012d\3\2\2\2C\u0131\3\2\2\2E"+
		"\u0133\3\2\2\2G\u0135\3\2\2\2I\u0137\3\2\2\2K\u0139\3\2\2\2M\u013b\3\2"+
		"\2\2O\u013d\3\2\2\2Q\u013f\3\2\2\2S\u0141\3\2\2\2U\u0143\3\2\2\2W\u0145"+
		"\3\2\2\2Y\u0147\3\2\2\2[\u0149\3\2\2\2]\u014b\3\2\2\2_\u014d\3\2\2\2a"+
		"\u014f\3\2\2\2c\u0151\3\2\2\2e\u0153\3\2\2\2g\u0155\3\2\2\2i\u0157\3\2"+
		"\2\2k\u0159\3\2\2\2m\u015b\3\2\2\2o\u015d\3\2\2\2q\u015f\3\2\2\2s\u0161"+
		"\3\2\2\2u\u0163\3\2\2\2wx\7a\2\2x\4\3\2\2\2yz\7/\2\2z\6\3\2\2\2{|\5Q)"+
		"\2|}\5k\66\2}~\5]/\2~\177\5I%\2\177\u0080\5e\63\2\u0080\u0081\5K&\2\u0081"+
		"\u0082\5I%\2\u0082\b\3\2\2\2\u0083\u0084\5i\65\2\u0084\u0085\5Q)\2\u0085"+
		"\u0086\5_\60\2\u0086\u0087\5k\66\2\u0087\u0088\5g\64\2\u0088\u0089\5C"+
		"\"\2\u0089\u008a\5]/\2\u008a\u008b\5I%\2\u008b\n\3\2\2\2\u008c\u008d\5"+
		"[.\2\u008d\u008e\5S*\2\u008e\u008f\5Y-\2\u008f\u0090\5Y-\2\u0090\u0091"+
		"\5S*\2\u0091\u0092\5_\60\2\u0092\u0093\5]/\2\u0093\f\3\2\2\2\u0094\u0095"+
		"\5E#\2\u0095\u0096\5S*\2\u0096\u0097\5Y-\2\u0097\u0098\5Y-\2\u0098\u0099"+
		"\5S*\2\u0099\u009a\5_\60\2\u009a\u009b\5]/\2\u009b\16\3\2\2\2\u009c\u009d"+
		"\5u;\2\u009d\u009e\5K&\2\u009e\u009f\5e\63\2\u009f\u00a0\5_\60\2\u00a0"+
		"\20\3\2\2\2\u00a1\u00a2\5_\60\2\u00a2\u00a3\5]/\2\u00a3\u00a4\5K&\2\u00a4"+
		"\22\3\2\2\2\u00a5\u00a6\5i\65\2\u00a6\u00a7\5o8\2\u00a7\u00a8\5_\60\2"+
		"\u00a8\24\3\2\2\2\u00a9\u00aa\5i\65\2\u00aa\u00ab\5Q)\2\u00ab\u00ac\5"+
		"e\63\2\u00ac\u00ad\5K&\2\u00ad\u00ae\5K&\2\u00ae\26\3\2\2\2\u00af\u00b0"+
		"\5M\'\2\u00b0\u00b1\5_\60\2\u00b1\u00b2\5k\66\2\u00b2\u00b3\5e\63\2\u00b3"+
		"\30\3\2\2\2\u00b4\u00b5\5M\'\2\u00b5\u00b6\5S*\2\u00b6\u00b7\5m\67\2\u00b7"+
		"\u00b8\5K&\2\u00b8\32\3\2\2\2\u00b9\u00ba\5g\64\2\u00ba\u00bb\5S*\2\u00bb"+
		"\u00bc\5q9\2\u00bc\34\3\2\2\2\u00bd\u00be\5g\64\2\u00be\u00bf\5K&\2\u00bf"+
		"\u00c0\5m\67\2\u00c0\u00c1\5K&\2\u00c1\u00c2\5]/\2\u00c2\36\3\2\2\2\u00c3"+
		"\u00c4\5K&\2\u00c4\u00c5\5S*\2\u00c5\u00c6\5O(\2\u00c6\u00c7\5Q)\2\u00c7"+
		"\u00c8\5i\65\2\u00c8 \3\2\2\2\u00c9\u00ca\5]/\2\u00ca\u00cb\5S*\2\u00cb"+
		"\u00cc\5]/\2\u00cc\u00cd\5K&\2\u00cd\"\3\2\2\2\u00ce\u00cf\5i\65\2\u00cf"+
		"\u00d0\5K&\2\u00d0\u00d1\5]/\2\u00d1$\3\2\2\2\u00d2\u00d3\5K&\2\u00d3"+
		"\u00d4\5Y-\2\u00d4\u00d5\5K&\2\u00d5\u00d6\5m\67\2\u00d6\u00d7\5K&\2\u00d7"+
		"\u00d8\5]/\2\u00d8&\3\2\2\2\u00d9\u00da\5i\65\2\u00da\u00db\5o8\2\u00db"+
		"\u00dc\5K&\2\u00dc\u00dd\5Y-\2\u00dd\u00de\5m\67\2\u00de\u00df\5K&\2\u00df"+
		"(\3\2\2\2\u00e0\u00e1\5K&\2\u00e1\u00e2\5S*\2\u00e2\u00e3\5O(\2\u00e3"+
		"\u00e4\5Q)\2\u00e4\u00e5\5i\65\2\u00e5\u00e6\5K&\2\u00e6\u00e7\5K&\2\u00e7"+
		"\u00e8\5]/\2\u00e8*\3\2\2\2\u00e9\u00ea\5i\65\2\u00ea\u00eb\5Q)\2\u00eb"+
		"\u00ec\5S*\2\u00ec\u00ed\5e\63\2\u00ed,\3\2\2\2\u00ee\u00ef\5M\'\2\u00ef"+
		"\u00f0\5S*\2\u00f0\u00f1\5M\'\2\u00f1.\3\2\2\2\u00f2\u00f3\5i\65\2\u00f3"+
		"\u00f4\5K&\2\u00f4\u00f5\5K&\2\u00f5\u00f6\5]/\2\u00f6\60\3\2\2\2\u00f7"+
		"\u00f8\5i\65\2\u00f8\u00f9\5o8\2\u00f9\u00fa\5K&\2\u00fa\u00fb\5]/\2\u00fb"+
		"\u00fc\5i\65\2\u00fc\u00fd\5s:\2\u00fd\62\3\2\2\2\u00fe\u00ff\5i\65\2"+
		"\u00ff\u0100\5Q)\2\u0100\u0101\5S*\2\u0101\u0102\5e\63\2\u0102\u0103\5"+
		"i\65\2\u0103\u0104\5s:\2\u0104\64\3\2\2\2\u0105\u0106\5M\'\2\u0106\u0107"+
		"\5_\60\2\u0107\u0108\5e\63\2\u0108\u0109\5i\65\2\u0109\u010a\5s:\2\u010a"+
		"\66\3\2\2\2\u010b\u010c\5M\'\2\u010c\u010d\5S*\2\u010d\u010e\5M\'\2\u010e"+
		"\u010f\5i\65\2\u010f\u0110\5s:\2\u01108\3\2\2\2\u0111\u0112\5g\64\2\u0112"+
		"\u0113\5S*\2\u0113\u0114\5q9\2\u0114\u0115\5i\65\2\u0115\u0116\5s:\2\u0116"+
		":\3\2\2\2\u0117\u0118\5g\64\2\u0118\u0119\5K&\2\u0119\u011a\5m\67\2\u011a"+
		"\u011b\5K&\2\u011b\u011c\5]/\2\u011c\u011d\5i\65\2\u011d\u011e\5s:\2\u011e"+
		"<\3\2\2\2\u011f\u0120\5K&\2\u0120\u0121\5S*\2\u0121\u0122\5O(\2\u0122"+
		"\u0123\5Q)\2\u0123\u0124\5i\65\2\u0124\u0125\5s:\2\u0125>\3\2\2\2\u0126"+
		"\u0127\5]/\2\u0127\u0128\5S*\2\u0128\u0129\5]/\2\u0129\u012a\5K&\2\u012a"+
		"\u012b\5i\65\2\u012b\u012c\5s:\2\u012c@\3\2\2\2\u012d\u012e\5C\"\2\u012e"+
		"\u012f\5]/\2\u012f\u0130\5I%\2\u0130B\3\2\2\2\u0131\u0132\7c\2\2\u0132"+
		"D\3\2\2\2\u0133\u0134\7d\2\2\u0134F\3\2\2\2\u0135\u0136\7e\2\2\u0136H"+
		"\3\2\2\2\u0137\u0138\7f\2\2\u0138J\3\2\2\2\u0139\u013a\7g\2\2\u013aL\3"+
		"\2\2\2\u013b\u013c\7h\2\2\u013cN\3\2\2\2\u013d\u013e\7i\2\2\u013eP\3\2"+
		"\2\2\u013f\u0140\7j\2\2\u0140R\3\2\2\2\u0141\u0142\7k\2\2\u0142T\3\2\2"+
		"\2\u0143\u0144\7l\2\2\u0144V\3\2\2\2\u0145\u0146\7m\2\2\u0146X\3\2\2\2"+
		"\u0147\u0148\7n\2\2\u0148Z\3\2\2\2\u0149\u014a\7o\2\2\u014a\\\3\2\2\2"+
		"\u014b\u014c\7p\2\2\u014c^\3\2\2\2\u014d\u014e\7q\2\2\u014e`\3\2\2\2\u014f"+
		"\u0150\7r\2\2\u0150b\3\2\2\2\u0151\u0152\7s\2\2\u0152d\3\2\2\2\u0153\u0154"+
		"\7t\2\2\u0154f\3\2\2\2\u0155\u0156\7u\2\2\u0156h\3\2\2\2\u0157\u0158\7"+
		"v\2\2\u0158j\3\2\2\2\u0159\u015a\7w\2\2\u015al\3\2\2\2\u015b\u015c\7x"+
		"\2\2\u015cn\3\2\2\2\u015d\u015e\7y\2\2\u015ep\3\2\2\2\u015f\u0160\7z\2"+
		"\2\u0160r\3\2\2\2\u0161\u0162\7{\2\2\u0162t\3\2\2\2\u0163\u0164\7|\2\2"+
		"\u0164v\3\2\2\2\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}