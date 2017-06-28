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
		T__0=1, Letter=2, Var=3, Integer=4, Boolean=5, NUMBER=6, Minus=7, Not=8, 
		Mult=9, Div=10, Plus=11, And=12, Or=13, EQ=14, GT=15, GE=16, LT=17, LE=18, 
		NE=19, IF=20, THEN=21, ELSE=22, WHILE=23, DO=24, ASS=25, TRUE=26, FALSE=27, 
		BGN=28, END=29, SEMI=30, LPAR=31, RPAR=32, OpenArray=33, CloseArray=34, 
		EndStatement=35, WS=36, NGUnderscore=37, NGHundred=38, NGThousand=39, 
		NGMillion=40, NGBillion=41, NGZero=42, NGOne=43, NGTwo=44, NGThree=45, 
		NGFour=46, NGFive=47, NGSix=48, NGSeven=49, NGEight=50, NGNine=51, NGTen=52, 
		NGEleven=53, NGTwelve=54, NGEighteen=55, NGThir=56, NGFif=57, NGTeen=58, 
		NGTwenty=59, NGThirty=60, NGForty=61, NGFifty=62, NGSixty=63, NGSeventy=64, 
		NGEighty=65, NGNinety=66, NGAnd=67, NGA=68, NGB=69, NGC=70, NGD=71, NGE=72, 
		NGF=73, NGG=74, NGH=75, NGI=76, NGJ=77, NGK=78, NGL=79, NGM=80, NGN=81, 
		NGO=82, NGP=83, NGQ=84, NGR=85, NGS=86, NGT=87, NGU=88, NGV=89, NGW=90, 
		NGX=91, NGY=92, NGZ=93;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "Letter", "Var", "Integer", "Boolean", "NUMBER", "Minus", "Not", 
		"Mult", "Div", "Plus", "And", "Or", "EQ", "GT", "GE", "LT", "LE", "NE", 
		"IF", "THEN", "ELSE", "WHILE", "DO", "ASS", "TRUE", "FALSE", "BGN", "END", 
		"SEMI", "LPAR", "RPAR", "OpenArray", "CloseArray", "EndStatement", "WS", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "NGUnderscore", 
		"NGHundred", "NGThousand", "NGMillion", "NGBillion", "NGZero", "NGOne", 
		"NGTwo", "NGThree", "NGFour", "NGFive", "NGSix", "NGSeven", "NGEight", 
		"NGNine", "NGTen", "NGEleven", "NGTwelve", "NGEighteen", "NGThir", "NGFif", 
		"NGTeen", "NGTwenty", "NGThirty", "NGForty", "NGFifty", "NGSixty", "NGSeventy", 
		"NGEighty", "NGNinety", "NGAnd", "NGA", "NGB", "NGC", "NGD", "NGE", "NGF", 
		"NGG", "NGH", "NGI", "NGJ", "NGK", "NGL", "NGM", "NGN", "NGO", "NGP", 
		"NGQ", "NGR", "NGS", "NGT", "NGU", "NGV", "NGW", "NGX", "NGY", "NGZ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'{'", "'}'", "','", "'('", "')'", "'['", "']'", 
		"';'", null, "'_'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'a'", "'b'", "'c'", 
		"'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", 
		"'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", 
		"'x'", "'y'", "'z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Letter", "Var", "Integer", "Boolean", "NUMBER", "Minus", 
		"Not", "Mult", "Div", "Plus", "And", "Or", "EQ", "GT", "GE", "LT", "LE", 
		"NE", "IF", "THEN", "ELSE", "WHILE", "DO", "ASS", "TRUE", "FALSE", "BGN", 
		"END", "SEMI", "LPAR", "RPAR", "OpenArray", "CloseArray", "EndStatement", 
		"WS", "NGUnderscore", "NGHundred", "NGThousand", "NGMillion", "NGBillion", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2_\u037e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u010e\n\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0120"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u012f\n\6"+
		"\3\7\6\7\u0132\n\7\r\7\16\7\u0133\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u013d"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0144\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u014d\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u015b\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0163\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u016c\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0174\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0185\n\17\3\17\3\17\3\17\5\17\u018a\n\17\3\20\3\20\3\20"+
		"\3\20\5\20\u0190\n\20\5\20\u0192\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u019c\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u01a3\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u01aa\n\21\5\21\u01ac\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u01b6\n\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u01bd\n\21\3\21\3\21\3\21\5\21\u01c2\n\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u01cb\n\21\3\22\3\22\3\22\3\22\5\22\u01d1\n\22\5\22\u01d3"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01db\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u01e2\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u01e9\n\23\5\23\u01eb"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01f3\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u01fa\n\23\3\23\3\23\3\23\5\23\u01ff\n\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u0208\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0210\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0218\n\24\3\24\3\24\3"+
		"\24\5\24\u021d\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u023d\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\6%\u025b\n%\r%\16%\u025c\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"E\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3"+
		"I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3N\3"+
		"N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3"+
		"V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3"+
		"d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3"+
		"o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\2\2y\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2"+
		"u\2w\2y\2{\2}\2\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d"+
		".\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65\u009d\66"+
		"\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad>\u00af?\u00b1"+
		"@\u00b3A\u00b5B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1H\u00c3I\u00c5"+
		"J\u00c7K\u00c9L\u00cbM\u00cdN\u00cfO\u00d1P\u00d3Q\u00d5R\u00d7S\u00d9"+
		"T\u00dbU\u00ddV\u00dfW\u00e1X\u00e3Y\u00e5Z\u00e7[\u00e9\\\u00eb]\u00ed"+
		"^\u00ef_\3\2\36\3\2\62;\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4"+
		"\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWw"+
		"w\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u03a4\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7"+
		"\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2"+
		"\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9"+
		"\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2"+
		"\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb"+
		"\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\3\u00f1\3\2\2\2\5\u010d\3\2\2"+
		"\2\7\u010f\3\2\2\2\t\u011f\3\2\2\2\13\u012e\3\2\2\2\r\u0131\3\2\2\2\17"+
		"\u013c\3\2\2\2\21\u0143\3\2\2\2\23\u014c\3\2\2\2\25\u015a\3\2\2\2\27\u0162"+
		"\3\2\2\2\31\u016b\3\2\2\2\33\u0173\3\2\2\2\35\u0189\3\2\2\2\37\u01a2\3"+
		"\2\2\2!\u01ca\3\2\2\2#\u01e1\3\2\2\2%\u0207\3\2\2\2\'\u021c\3\2\2\2)\u021e"+
		"\3\2\2\2+\u0221\3\2\2\2-\u0226\3\2\2\2/\u022b\3\2\2\2\61\u0231\3\2\2\2"+
		"\63\u023c\3\2\2\2\65\u023e\3\2\2\2\67\u0243\3\2\2\29\u0249\3\2\2\2;\u024b"+
		"\3\2\2\2=\u024d\3\2\2\2?\u024f\3\2\2\2A\u0251\3\2\2\2C\u0253\3\2\2\2E"+
		"\u0255\3\2\2\2G\u0257\3\2\2\2I\u025a\3\2\2\2K\u025e\3\2\2\2M\u0260\3\2"+
		"\2\2O\u0262\3\2\2\2Q\u0264\3\2\2\2S\u0266\3\2\2\2U\u0268\3\2\2\2W\u026a"+
		"\3\2\2\2Y\u026c\3\2\2\2[\u026e\3\2\2\2]\u0270\3\2\2\2_\u0272\3\2\2\2a"+
		"\u0274\3\2\2\2c\u0276\3\2\2\2e\u0278\3\2\2\2g\u027a\3\2\2\2i\u027c\3\2"+
		"\2\2k\u027e\3\2\2\2m\u0280\3\2\2\2o\u0282\3\2\2\2q\u0284\3\2\2\2s\u0286"+
		"\3\2\2\2u\u0288\3\2\2\2w\u028a\3\2\2\2y\u028c\3\2\2\2{\u028e\3\2\2\2}"+
		"\u0290\3\2\2\2\177\u0292\3\2\2\2\u0081\u0294\3\2\2\2\u0083\u029c\3\2\2"+
		"\2\u0085\u02a5\3\2\2\2\u0087\u02ad\3\2\2\2\u0089\u02b5\3\2\2\2\u008b\u02ba"+
		"\3\2\2\2\u008d\u02be\3\2\2\2\u008f\u02c2\3\2\2\2\u0091\u02c8\3\2\2\2\u0093"+
		"\u02cd\3\2\2\2\u0095\u02d2\3\2\2\2\u0097\u02d6\3\2\2\2\u0099\u02dc\3\2"+
		"\2\2\u009b\u02e2\3\2\2\2\u009d\u02e7\3\2\2\2\u009f\u02eb\3\2\2\2\u00a1"+
		"\u02f2\3\2\2\2\u00a3\u02f9\3\2\2\2\u00a5\u0302\3\2\2\2\u00a7\u0307\3\2"+
		"\2\2\u00a9\u030b\3\2\2\2\u00ab\u0310\3\2\2\2\u00ad\u0317\3\2\2\2\u00af"+
		"\u031e\3\2\2\2\u00b1\u0324\3\2\2\2\u00b3\u032a\3\2\2\2\u00b5\u0330\3\2"+
		"\2\2\u00b7\u0338\3\2\2\2\u00b9\u033f\3\2\2\2\u00bb\u0346\3\2\2\2\u00bd"+
		"\u034a\3\2\2\2\u00bf\u034c\3\2\2\2\u00c1\u034e\3\2\2\2\u00c3\u0350\3\2"+
		"\2\2\u00c5\u0352\3\2\2\2\u00c7\u0354\3\2\2\2\u00c9\u0356\3\2\2\2\u00cb"+
		"\u0358\3\2\2\2\u00cd\u035a\3\2\2\2\u00cf\u035c\3\2\2\2\u00d1\u035e\3\2"+
		"\2\2\u00d3\u0360\3\2\2\2\u00d5\u0362\3\2\2\2\u00d7\u0364\3\2\2\2\u00d9"+
		"\u0366\3\2\2\2\u00db\u0368\3\2\2\2\u00dd\u036a\3\2\2\2\u00df\u036c\3\2"+
		"\2\2\u00e1\u036e\3\2\2\2\u00e3\u0370\3\2\2\2\u00e5\u0372\3\2\2\2\u00e7"+
		"\u0374\3\2\2\2\u00e9\u0376\3\2\2\2\u00eb\u0378\3\2\2\2\u00ed\u037a\3\2"+
		"\2\2\u00ef\u037c\3\2\2\2\u00f1\u00f2\7/\2\2\u00f2\4\3\2\2\2\u00f3\u010e"+
		"\5K&\2\u00f4\u010e\5M\'\2\u00f5\u010e\5O(\2\u00f6\u010e\5Q)\2\u00f7\u010e"+
		"\5S*\2\u00f8\u010e\5U+\2\u00f9\u010e\5W,\2\u00fa\u010e\5Y-\2\u00fb\u010e"+
		"\5[.\2\u00fc\u010e\5]/\2\u00fd\u010e\5_\60\2\u00fe\u010e\5a\61\2\u00ff"+
		"\u010e\5c\62\2\u0100\u010e\5e\63\2\u0101\u010e\5g\64\2\u0102\u010e\5i"+
		"\65\2\u0103\u010e\5k\66\2\u0104\u010e\5m\67\2\u0105\u010e\5o8\2\u0106"+
		"\u010e\5q9\2\u0107\u010e\5s:\2\u0108\u010e\5u;\2\u0109\u010e\5w<\2\u010a"+
		"\u010e\5y=\2\u010b\u010e\5{>\2\u010c\u010e\5}?\2\u010d\u00f3\3\2\2\2\u010d"+
		"\u00f4\3\2\2\2\u010d\u00f5\3\2\2\2\u010d\u00f6\3\2\2\2\u010d\u00f7\3\2"+
		"\2\2\u010d\u00f8\3\2\2\2\u010d\u00f9\3\2\2\2\u010d\u00fa\3\2\2\2\u010d"+
		"\u00fb\3\2\2\2\u010d\u00fc\3\2\2\2\u010d\u00fd\3\2\2\2\u010d\u00fe\3\2"+
		"\2\2\u010d\u00ff\3\2\2\2\u010d\u0100\3\2\2\2\u010d\u0101\3\2\2\2\u010d"+
		"\u0102\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0104\3\2\2\2\u010d\u0105\3\2"+
		"\2\2\u010d\u0106\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0108\3\2\2\2\u010d"+
		"\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2"+
		"\2\2\u010e\6\3\2\2\2\u010f\u0110\5u;\2\u0110\u0111\5K&\2\u0111\u0112\5"+
		"m\67\2\u0112\b\3\2\2\2\u0113\u0114\5[.\2\u0114\u0115\5e\63\2\u0115\u0116"+
		"\5q9\2\u0116\u0117\5S*\2\u0117\u0118\5W,\2\u0118\u0119\5S*\2\u0119\u011a"+
		"\5m\67\2\u011a\u0120\3\2\2\2\u011b\u011c\5[.\2\u011c\u011d\5e\63\2\u011d"+
		"\u011e\5q9\2\u011e\u0120\3\2\2\2\u011f\u0113\3\2\2\2\u011f\u011b\3\2\2"+
		"\2\u0120\n\3\2\2\2\u0121\u0122\5M\'\2\u0122\u0123\5g\64\2\u0123\u0124"+
		"\5g\64\2\u0124\u0125\5a\61\2\u0125\u0126\5S*\2\u0126\u0127\5K&\2\u0127"+
		"\u0128\5e\63\2\u0128\u012f\3\2\2\2\u0129\u012a\5M\'\2\u012a\u012b\5g\64"+
		"\2\u012b\u012c\5g\64\2\u012c\u012d\5a\61\2\u012d\u012f\3\2\2\2\u012e\u0121"+
		"\3\2\2\2\u012e\u0129\3\2\2\2\u012f\f\3\2\2\2\u0130\u0132\t\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\16\3\2\2\2\u0135\u013d\7/\2\2\u0136\u0137\5c\62\2\u0137\u0138"+
		"\5[.\2\u0138\u0139\5e\63\2\u0139\u013a\5s:\2\u013a\u013b\5o8\2\u013b\u013d"+
		"\3\2\2\2\u013c\u0135\3\2\2\2\u013c\u0136\3\2\2\2\u013d\20\3\2\2\2\u013e"+
		"\u0144\7#\2\2\u013f\u0140\5e\63\2\u0140\u0141\5g\64\2\u0141\u0142\5q9"+
		"\2\u0142\u0144\3\2\2\2\u0143\u013e\3\2\2\2\u0143\u013f\3\2\2\2\u0144\22"+
		"\3\2\2\2\u0145\u014d\7,\2\2\u0146\u0147\5q9\2\u0147\u0148\5[.\2\u0148"+
		"\u0149\5c\62\2\u0149\u014a\5S*\2\u014a\u014b\5o8\2\u014b\u014d\3\2\2\2"+
		"\u014c\u0145\3\2\2\2\u014c\u0146\3\2\2\2\u014d\24\3\2\2\2\u014e\u015b"+
		"\7\61\2\2\u014f\u0150\5Q)\2\u0150\u0151\5[.\2\u0151\u0152\5u;\2\u0152"+
		"\u0153\5[.\2\u0153\u0154\5Q)\2\u0154\u0155\5S*\2\u0155\u0156\5Q)\2\u0156"+
		"\u0157\5I%\2\u0157\u0158\5M\'\2\u0158\u0159\5{>\2\u0159\u015b\3\2\2\2"+
		"\u015a\u014e\3\2\2\2\u015a\u014f\3\2\2\2\u015b\26\3\2\2\2\u015c\u0163"+
		"\7-\2\2\u015d\u015e\5i\65\2\u015e\u015f\5a\61\2\u015f\u0160\5s:\2\u0160"+
		"\u0161\5o8\2\u0161\u0163\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u015d\3\2\2"+
		"\2\u0163\30\3\2\2\2\u0164\u016c\7(\2\2\u0165\u0166\7(\2\2\u0166\u016c"+
		"\7(\2\2\u0167\u0168\5K&\2\u0168\u0169\5e\63\2\u0169\u016a\5Q)\2\u016a"+
		"\u016c\3\2\2\2\u016b\u0164\3\2\2\2\u016b\u0165\3\2\2\2\u016b\u0167\3\2"+
		"\2\2\u016c\32\3\2\2\2\u016d\u0174\7~\2\2\u016e\u016f\7~\2\2\u016f\u0174"+
		"\7~\2\2\u0170\u0171\5g\64\2\u0171\u0172\5m\67\2\u0172\u0174\3\2\2\2\u0173"+
		"\u016d\3\2\2\2\u0173\u016e\3\2\2\2\u0173\u0170\3\2\2\2\u0174\34\3\2\2"+
		"\2\u0175\u0176\7?\2\2\u0176\u018a\7?\2\2\u0177\u0178\5S*\2\u0178\u0179"+
		"\5k\66\2\u0179\u017a\5s:\2\u017a\u017b\5K&\2\u017b\u017c\5a\61\2\u017c"+
		"\u017d\5o8\2\u017d\u018a\3\2\2\2\u017e\u017f\5S*\2\u017f\u0180\5k\66\2"+
		"\u0180\u0181\5s:\2\u0181\u0182\5K&\2\u0182\u0184\5a\61\2\u0183\u0185\5"+
		"I%\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\5q9\2\u0187\u0188\5g\64\2\u0188\u018a\3\2\2\2\u0189\u0175\3\2\2"+
		"\2\u0189\u0177\3\2\2\2\u0189\u017e\3\2\2\2\u018a\36\3\2\2\2\u018b\u01a3"+
		"\7@\2\2\u018c\u018d\5[.\2\u018d\u018f\5o8\2\u018e\u0190\5I%\2\u018f\u018e"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018c\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\5W,\2\u0194\u0195\5m\67"+
		"\2\u0195\u0196\5S*\2\u0196\u0197\5K&\2\u0197\u0198\5q9\2\u0198\u0199\5"+
		"S*\2\u0199\u019b\5m\67\2\u019a\u019c\5I%\2\u019b\u019a\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\5q9\2\u019e\u019f\5Y-\2\u019f"+
		"\u01a0\5K&\2\u01a0\u01a1\5e\63\2\u01a1\u01a3\3\2\2\2\u01a2\u018b\3\2\2"+
		"\2\u01a2\u0191\3\2\2\2\u01a3 \3\2\2\2\u01a4\u01a5\7@\2\2\u01a5\u01cb\7"+
		"?\2\2\u01a6\u01a7\5[.\2\u01a7\u01a9\5o8\2\u01a8\u01aa\5I%\2\u01a9\u01a8"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\5W,\2\u01ae\u01af\5m\67"+
		"\2\u01af\u01b0\5S*\2\u01b0\u01b1\5K&\2\u01b1\u01b2\5q9\2\u01b2\u01b3\5"+
		"S*\2\u01b3\u01b5\5m\67\2\u01b4\u01b6\5I%\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\5q9\2\u01b8\u01b9\5Y-\2\u01b9"+
		"\u01ba\5K&\2\u01ba\u01bc\5e\63\2\u01bb\u01bd\5I%\2\u01bc\u01bb\3\2\2\2"+
		"\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5g\64\2\u01bf\u01c1"+
		"\5m\67\2\u01c0\u01c2\5I%\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c4\5S*\2\u01c4\u01c5\5k\66\2\u01c5\u01c6\5s:\2"+
		"\u01c6\u01c7\5K&\2\u01c7\u01c8\5a\61\2\u01c8\u01c9\5o8\2\u01c9\u01cb\3"+
		"\2\2\2\u01ca\u01a4\3\2\2\2\u01ca\u01ab\3\2\2\2\u01cb\"\3\2\2\2\u01cc\u01e2"+
		"\7>\2\2\u01cd\u01ce\5[.\2\u01ce\u01d0\5o8\2\u01cf\u01d1\5I%\2\u01d0\u01cf"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\5a\61\2\u01d5\u01d6\5g"+
		"\64\2\u01d6\u01d7\5w<\2\u01d7\u01d8\5S*\2\u01d8\u01da\5m\67\2\u01d9\u01db"+
		"\5I%\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01dd\5q9\2\u01dd\u01de\5Y-\2\u01de\u01df\5K&\2\u01df\u01e0\5e\63\2\u01e0"+
		"\u01e2\3\2\2\2\u01e1\u01cc\3\2\2\2\u01e1\u01d2\3\2\2\2\u01e2$\3\2\2\2"+
		"\u01e3\u01e4\7>\2\2\u01e4\u0208\7?\2\2\u01e5\u01e6\5[.\2\u01e6\u01e8\5"+
		"o8\2\u01e7\u01e9\5I%\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb"+
		"\3\2\2\2\u01ea\u01e5\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ed\5a\61\2\u01ed\u01ee\5g\64\2\u01ee\u01ef\5w<\2\u01ef\u01f0\5S*\2"+
		"\u01f0\u01f2\5m\67\2\u01f1\u01f3\5I%\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\5q9\2\u01f5\u01f6\5Y-\2\u01f6"+
		"\u01f7\5K&\2\u01f7\u01f9\5e\63\2\u01f8\u01fa\5I%\2\u01f9\u01f8\3\2\2\2"+
		"\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\5g\64\2\u01fc\u01fe"+
		"\5m\67\2\u01fd\u01ff\5I%\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0201\5S*\2\u0201\u0202\5k\66\2\u0202\u0203\5s:\2"+
		"\u0203\u0204\5K&\2\u0204\u0205\5a\61\2\u0205\u0206\5o8\2\u0206\u0208\3"+
		"\2\2\2\u0207\u01e3\3\2\2\2\u0207\u01ea\3\2\2\2\u0208&\3\2\2\2\u0209\u020a"+
		"\7#\2\2\u020a\u021d\7?\2\2\u020b\u020c\5e\63\2\u020c\u020d\5g\64\2\u020d"+
		"\u020f\5q9\2\u020e\u0210\5I%\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2"+
		"\u0210\u0211\3\2\2\2\u0211\u0212\5S*\2\u0212\u0213\5k\66\2\u0213\u0214"+
		"\5s:\2\u0214\u0215\5K&\2\u0215\u0217\5a\61\2\u0216\u0218\5I%\2\u0217\u0216"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\5q9\2\u021a"+
		"\u021b\5g\64\2\u021b\u021d\3\2\2\2\u021c\u0209\3\2\2\2\u021c\u020b\3\2"+
		"\2\2\u021d(\3\2\2\2\u021e\u021f\5[.\2\u021f\u0220\5U+\2\u0220*\3\2\2\2"+
		"\u0221\u0222\5q9\2\u0222\u0223\5Y-\2\u0223\u0224\5S*\2\u0224\u0225\5e"+
		"\63\2\u0225,\3\2\2\2\u0226\u0227\5S*\2\u0227\u0228\5a\61\2\u0228\u0229"+
		"\5o8\2\u0229\u022a\5S*\2\u022a.\3\2\2\2\u022b\u022c\5w<\2\u022c\u022d"+
		"\5Y-\2\u022d\u022e\5[.\2\u022e\u022f\5a\61\2\u022f\u0230\5S*\2\u0230\60"+
		"\3\2\2\2\u0231\u0232\5Q)\2\u0232\u0233\5g\64\2\u0233\62\3\2\2\2\u0234"+
		"\u023d\7?\2\2\u0235\u0236\5o8\2\u0236\u0237\5S*\2\u0237\u0238\5q9\2\u0238"+
		"\u0239\5I%\2\u0239\u023a\5q9\2\u023a\u023b\5g\64\2\u023b\u023d\3\2\2\2"+
		"\u023c\u0234\3\2\2\2\u023c\u0235\3\2\2\2\u023d\64\3\2\2\2\u023e\u023f"+
		"\5q9\2\u023f\u0240\5m\67\2\u0240\u0241\5s:\2\u0241\u0242\5S*\2\u0242\66"+
		"\3\2\2\2\u0243\u0244\5U+\2\u0244\u0245\5K&\2\u0245\u0246\5a\61\2\u0246"+
		"\u0247\5o8\2\u0247\u0248\5S*\2\u02488\3\2\2\2\u0249\u024a\7}\2\2\u024a"+
		":\3\2\2\2\u024b\u024c\7\177\2\2\u024c<\3\2\2\2\u024d\u024e\7.\2\2\u024e"+
		">\3\2\2\2\u024f\u0250\7*\2\2\u0250@\3\2\2\2\u0251\u0252\7+\2\2\u0252B"+
		"\3\2\2\2\u0253\u0254\7]\2\2\u0254D\3\2\2\2\u0255\u0256\7_\2\2\u0256F\3"+
		"\2\2\2\u0257\u0258\7=\2\2\u0258H\3\2\2\2\u0259\u025b\t\3\2\2\u025a\u0259"+
		"\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"J\3\2\2\2\u025e\u025f\t\4\2\2\u025fL\3\2\2\2\u0260\u0261\t\5\2\2\u0261"+
		"N\3\2\2\2\u0262\u0263\t\6\2\2\u0263P\3\2\2\2\u0264\u0265\t\7\2\2\u0265"+
		"R\3\2\2\2\u0266\u0267\t\b\2\2\u0267T\3\2\2\2\u0268\u0269\t\t\2\2\u0269"+
		"V\3\2\2\2\u026a\u026b\t\n\2\2\u026bX\3\2\2\2\u026c\u026d\t\13\2\2\u026d"+
		"Z\3\2\2\2\u026e\u026f\t\f\2\2\u026f\\\3\2\2\2\u0270\u0271\t\r\2\2\u0271"+
		"^\3\2\2\2\u0272\u0273\t\16\2\2\u0273`\3\2\2\2\u0274\u0275\t\17\2\2\u0275"+
		"b\3\2\2\2\u0276\u0277\t\20\2\2\u0277d\3\2\2\2\u0278\u0279\t\21\2\2\u0279"+
		"f\3\2\2\2\u027a\u027b\t\22\2\2\u027bh\3\2\2\2\u027c\u027d\t\23\2\2\u027d"+
		"j\3\2\2\2\u027e\u027f\t\24\2\2\u027fl\3\2\2\2\u0280\u0281\t\25\2\2\u0281"+
		"n\3\2\2\2\u0282\u0283\t\26\2\2\u0283p\3\2\2\2\u0284\u0285\t\27\2\2\u0285"+
		"r\3\2\2\2\u0286\u0287\t\30\2\2\u0287t\3\2\2\2\u0288\u0289\t\31\2\2\u0289"+
		"v\3\2\2\2\u028a\u028b\t\32\2\2\u028bx\3\2\2\2\u028c\u028d\t\33\2\2\u028d"+
		"z\3\2\2\2\u028e\u028f\t\34\2\2\u028f|\3\2\2\2\u0290\u0291\t\35\2\2\u0291"+
		"~\3\2\2\2\u0292\u0293\7a\2\2\u0293\u0080\3\2\2\2\u0294\u0295\5\u00cbf"+
		"\2\u0295\u0296\5\u00e5s\2\u0296\u0297\5\u00d7l\2\u0297\u0298\5\u00c3b"+
		"\2\u0298\u0299\5\u00dfp\2\u0299\u029a\5\u00c5c\2\u029a\u029b\5\u00c3b"+
		"\2\u029b\u0082\3\2\2\2\u029c\u029d\5\u00e3r\2\u029d\u029e\5\u00cbf\2\u029e"+
		"\u029f\5\u00d9m\2\u029f\u02a0\5\u00e5s\2\u02a0\u02a1\5\u00e1q\2\u02a1"+
		"\u02a2\5\u00bd_\2\u02a2\u02a3\5\u00d7l\2\u02a3\u02a4\5\u00c3b\2\u02a4"+
		"\u0084\3\2\2\2\u02a5\u02a6\5\u00d5k\2\u02a6\u02a7\5\u00cdg\2\u02a7\u02a8"+
		"\5\u00d3j\2\u02a8\u02a9\5\u00d3j\2\u02a9\u02aa\5\u00cdg\2\u02aa\u02ab"+
		"\5\u00d9m\2\u02ab\u02ac\5\u00d7l\2\u02ac\u0086\3\2\2\2\u02ad\u02ae\5\u00bf"+
		"`\2\u02ae\u02af\5\u00cdg\2\u02af\u02b0\5\u00d3j\2\u02b0\u02b1\5\u00d3"+
		"j\2\u02b1\u02b2\5\u00cdg\2\u02b2\u02b3\5\u00d9m\2\u02b3\u02b4\5\u00d7"+
		"l\2\u02b4\u0088\3\2\2\2\u02b5\u02b6\5\u00efx\2\u02b6\u02b7\5\u00c5c\2"+
		"\u02b7\u02b8\5\u00dfp\2\u02b8\u02b9\5\u00d9m\2\u02b9\u008a\3\2\2\2\u02ba"+
		"\u02bb\5\u00d9m\2\u02bb\u02bc\5\u00d7l\2\u02bc\u02bd\5\u00c5c\2\u02bd"+
		"\u008c\3\2\2\2\u02be\u02bf\5\u00e3r\2\u02bf\u02c0\5\u00e9u\2\u02c0\u02c1"+
		"\5\u00d9m\2\u02c1\u008e\3\2\2\2\u02c2\u02c3\5\u00e3r\2\u02c3\u02c4\5\u00cb"+
		"f\2\u02c4\u02c5\5\u00dfp\2\u02c5\u02c6\5\u00c5c\2\u02c6\u02c7\5\u00c5"+
		"c\2\u02c7\u0090\3\2\2\2\u02c8\u02c9\5\u00c7d\2\u02c9\u02ca\5\u00d9m\2"+
		"\u02ca\u02cb\5\u00e5s\2\u02cb\u02cc\5\u00dfp\2\u02cc\u0092\3\2\2\2\u02cd"+
		"\u02ce\5\u00c7d\2\u02ce\u02cf\5\u00cdg\2\u02cf\u02d0\5\u00e7t\2\u02d0"+
		"\u02d1\5\u00c5c\2\u02d1\u0094\3\2\2\2\u02d2\u02d3\5\u00e1q\2\u02d3\u02d4"+
		"\5\u00cdg\2\u02d4\u02d5\5\u00ebv\2\u02d5\u0096\3\2\2\2\u02d6\u02d7\5\u00e1"+
		"q\2\u02d7\u02d8\5\u00c5c\2\u02d8\u02d9\5\u00e7t\2\u02d9\u02da\5\u00c5"+
		"c\2\u02da\u02db\5\u00d7l\2\u02db\u0098\3\2\2\2\u02dc\u02dd\5\u00c5c\2"+
		"\u02dd\u02de\5\u00cdg\2\u02de\u02df\5\u00c9e\2\u02df\u02e0\5\u00cbf\2"+
		"\u02e0\u02e1\5\u00e3r\2\u02e1\u009a\3\2\2\2\u02e2\u02e3\5\u00d7l\2\u02e3"+
		"\u02e4\5\u00cdg\2\u02e4\u02e5\5\u00d7l\2\u02e5\u02e6\5\u00c5c\2\u02e6"+
		"\u009c\3\2\2\2\u02e7\u02e8\5\u00e3r\2\u02e8\u02e9\5\u00c5c\2\u02e9\u02ea"+
		"\5\u00d7l\2\u02ea\u009e\3\2\2\2\u02eb\u02ec\5\u00c5c\2\u02ec\u02ed\5\u00d3"+
		"j\2\u02ed\u02ee\5\u00c5c\2\u02ee\u02ef\5\u00e7t\2\u02ef\u02f0\5\u00c5"+
		"c\2\u02f0\u02f1\5\u00d7l\2\u02f1\u00a0\3\2\2\2\u02f2\u02f3\5\u00e3r\2"+
		"\u02f3\u02f4\5\u00e9u\2\u02f4\u02f5\5\u00c5c\2\u02f5\u02f6\5\u00d3j\2"+
		"\u02f6\u02f7\5\u00e7t\2\u02f7\u02f8\5\u00c5c\2\u02f8\u00a2\3\2\2\2\u02f9"+
		"\u02fa\5\u00c5c\2\u02fa\u02fb\5\u00cdg\2\u02fb\u02fc\5\u00c9e\2\u02fc"+
		"\u02fd\5\u00cbf\2\u02fd\u02fe\5\u00e3r\2\u02fe\u02ff\5\u00c5c\2\u02ff"+
		"\u0300\5\u00c5c\2\u0300\u0301\5\u00d7l\2\u0301\u00a4\3\2\2\2\u0302\u0303"+
		"\5\u00e3r\2\u0303\u0304\5\u00cbf\2\u0304\u0305\5\u00cdg\2\u0305\u0306"+
		"\5\u00dfp\2\u0306\u00a6\3\2\2\2\u0307\u0308\5\u00c7d\2\u0308\u0309\5\u00cd"+
		"g\2\u0309\u030a\5\u00c7d\2\u030a\u00a8\3\2\2\2\u030b\u030c\5\u00e3r\2"+
		"\u030c\u030d\5\u00c5c\2\u030d\u030e\5\u00c5c\2\u030e\u030f\5\u00d7l\2"+
		"\u030f\u00aa\3\2\2\2\u0310\u0311\5\u00e3r\2\u0311\u0312\5\u00e9u\2\u0312"+
		"\u0313\5\u00c5c\2\u0313\u0314\5\u00d7l\2\u0314\u0315\5\u00e3r\2\u0315"+
		"\u0316\5\u00edw\2\u0316\u00ac\3\2\2\2\u0317\u0318\5\u00e3r\2\u0318\u0319"+
		"\5\u00cbf\2\u0319\u031a\5\u00cdg\2\u031a\u031b\5\u00dfp\2\u031b\u031c"+
		"\5\u00e3r\2\u031c\u031d\5\u00edw\2\u031d\u00ae\3\2\2\2\u031e\u031f\5\u00c7"+
		"d\2\u031f\u0320\5\u00d9m\2\u0320\u0321\5\u00dfp\2\u0321\u0322\5\u00e3"+
		"r\2\u0322\u0323\5\u00edw\2\u0323\u00b0\3\2\2\2\u0324\u0325\5\u00c7d\2"+
		"\u0325\u0326\5\u00cdg\2\u0326\u0327\5\u00c7d\2\u0327\u0328\5\u00e3r\2"+
		"\u0328\u0329\5\u00edw\2\u0329\u00b2\3\2\2\2\u032a\u032b\5\u00e1q\2\u032b"+
		"\u032c\5\u00cdg\2\u032c\u032d\5\u00ebv\2\u032d\u032e\5\u00e3r\2\u032e"+
		"\u032f\5\u00edw\2\u032f\u00b4\3\2\2\2\u0330\u0331\5\u00e1q\2\u0331\u0332"+
		"\5\u00c5c\2\u0332\u0333\5\u00e7t\2\u0333\u0334\5\u00c5c\2\u0334\u0335"+
		"\5\u00d7l\2\u0335\u0336\5\u00e3r\2\u0336\u0337\5\u00edw\2\u0337\u00b6"+
		"\3\2\2\2\u0338\u0339\5\u00c5c\2\u0339\u033a\5\u00cdg\2\u033a\u033b\5\u00c9"+
		"e\2\u033b\u033c\5\u00cbf\2\u033c\u033d\5\u00e3r\2\u033d\u033e\5\u00ed"+
		"w\2\u033e\u00b8\3\2\2\2\u033f\u0340\5\u00d7l\2\u0340\u0341\5\u00cdg\2"+
		"\u0341\u0342\5\u00d7l\2\u0342\u0343\5\u00c5c\2\u0343\u0344\5\u00e3r\2"+
		"\u0344\u0345\5\u00edw\2\u0345\u00ba\3\2\2\2\u0346\u0347\5\u00bd_\2\u0347"+
		"\u0348\5\u00d7l\2\u0348\u0349\5\u00c3b\2\u0349\u00bc\3\2\2\2\u034a\u034b"+
		"\7c\2\2\u034b\u00be\3\2\2\2\u034c\u034d\7d\2\2\u034d\u00c0\3\2\2\2\u034e"+
		"\u034f\7e\2\2\u034f\u00c2\3\2\2\2\u0350\u0351\7f\2\2\u0351\u00c4\3\2\2"+
		"\2\u0352\u0353\7g\2\2\u0353\u00c6\3\2\2\2\u0354\u0355\7h\2\2\u0355\u00c8"+
		"\3\2\2\2\u0356\u0357\7i\2\2\u0357\u00ca\3\2\2\2\u0358\u0359\7j\2\2\u0359"+
		"\u00cc\3\2\2\2\u035a\u035b\7k\2\2\u035b\u00ce\3\2\2\2\u035c\u035d\7l\2"+
		"\2\u035d\u00d0\3\2\2\2\u035e\u035f\7m\2\2\u035f\u00d2\3\2\2\2\u0360\u0361"+
		"\7n\2\2\u0361\u00d4\3\2\2\2\u0362\u0363\7o\2\2\u0363\u00d6\3\2\2\2\u0364"+
		"\u0365\7p\2\2\u0365\u00d8\3\2\2\2\u0366\u0367\7q\2\2\u0367\u00da\3\2\2"+
		"\2\u0368\u0369\7r\2\2\u0369\u00dc\3\2\2\2\u036a\u036b\7s\2\2\u036b\u00de"+
		"\3\2\2\2\u036c\u036d\7t\2\2\u036d\u00e0\3\2\2\2\u036e\u036f\7u\2\2\u036f"+
		"\u00e2\3\2\2\2\u0370\u0371\7v\2\2\u0371\u00e4\3\2\2\2\u0372\u0373\7w\2"+
		"\2\u0373\u00e6\3\2\2\2\u0374\u0375\7x\2\2\u0375\u00e8\3\2\2\2\u0376\u0377"+
		"\7y\2\2\u0377\u00ea\3\2\2\2\u0378\u0379\7z\2\2\u0379\u00ec\3\2\2\2\u037a"+
		"\u037b\7{\2\2\u037b\u00ee\3\2\2\2\u037c\u037d\7|\2\2\u037d\u00f0\3\2\2"+
		"\2)\2\u010d\u011f\u012e\u0133\u013c\u0143\u014c\u015a\u0162\u016b\u0173"+
		"\u0184\u0189\u018f\u0191\u019b\u01a2\u01a9\u01ab\u01b5\u01bc\u01c1\u01ca"+
		"\u01d0\u01d2\u01da\u01e1\u01e8\u01ea\u01f2\u01f9\u01fe\u0207\u020f\u0217"+
		"\u021c\u023c\u025c\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}