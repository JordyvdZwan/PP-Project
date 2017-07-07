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
		Letter=1, StartComment=2, EndComent=3, Comment=4, Fork=5, Join=6, Shared=7, 
		Lock=8, Unlock=9, Var=10, Integer=11, Boolean=12, NUMBER=13, Minus=14, 
		MINUS=15, MINUS2=16, Not=17, NOT=18, Mult=19, TIMES=20, Plus=21, PLUS=22, 
		And=23, AND=24, Or=25, OR=26, EQ=27, GT=28, GE=29, LT=30, LE=31, NE=32, 
		IF=33, THEN=34, ELSE=35, WHILE=36, DO=37, ASS=38, TRUE=39, FALSE=40, BGN=41, 
		END=42, SEMI=43, LPAR=44, RPAR=45, OpenArray=46, CloseArray=47, EndStatement=48, 
		WS=49, NGUnderscore=50, NGHundred=51, NGThousand=52, NGMillion=53, NGBillion=54, 
		NGZero=55, NGOne=56, NGTwo=57, NGThree=58, NGFour=59, NGFive=60, NGSix=61, 
		NGSeven=62, NGEight=63, NGNine=64, NGTen=65, NGEleven=66, NGTwelve=67, 
		NGEighteen=68, NGThir=69, NGFif=70, NGTeen=71, NGTwenty=72, NGThirty=73, 
		NGForty=74, NGFifty=75, NGSixty=76, NGSeventy=77, NGEighty=78, NGNinety=79, 
		NGAnd=80, NGA=81, NGB=82, NGC=83, NGD=84, NGE=85, NGF=86, NGG=87, NGH=88, 
		NGI=89, NGJ=90, NGK=91, NGL=92, NGM=93, NGN=94, NGO=95, NGP=96, NGQ=97, 
		NGR=98, NGS=99, NGT=100, NGU=101, NGV=102, NGW=103, NGX=104, NGY=105, 
		NGZ=106;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Letter", "StartComment", "EndComent", "Comment", "Fork", "Join", "Shared", 
		"Lock", "Unlock", "Var", "Integer", "Boolean", "NUMBER", "Minus", "MINUS", 
		"MINUS2", "Not", "NOT", "Mult", "TIMES", "Plus", "PLUS", "And", "AND", 
		"Or", "OR", "EQ", "GT", "GE", "LT", "LE", "NE", "IF", "THEN", "ELSE", 
		"WHILE", "DO", "ASS", "TRUE", "FALSE", "BGN", "END", "SEMI", "LPAR", "RPAR", 
		"OpenArray", "CloseArray", "EndStatement", "WS", "A", "B", "C", "D", "E", 
		"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
		"T", "U", "V", "W", "X", "Y", "Z", "NGUnderscore", "NGHundred", "NGThousand", 
		"NGMillion", "NGBillion", "NGZero", "NGOne", "NGTwo", "NGThree", "NGFour", 
		"NGFive", "NGSix", "NGSeven", "NGEight", "NGNine", "NGTen", "NGEleven", 
		"NGTwelve", "NGEighteen", "NGThir", "NGFif", "NGTeen", "NGTwenty", "NGThirty", 
		"NGForty", "NGFifty", "NGSixty", "NGSeventy", "NGEighty", "NGNinety", 
		"NGAnd", "NGA", "NGB", "NGC", "NGD", "NGE", "NGF", "NGG", "NGH", "NGI", 
		"NGJ", "NGK", "NGL", "NGM", "NGN", "NGO", "NGP", "NGQ", "NGR", "NGS", 
		"NGT", "NGU", "NGV", "NGW", "NGX", "NGY", "NGZ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'-'", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'{'", "'}'", "','", "'('", "')'", "'['", 
		"']'", "';'", null, "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Letter", "StartComment", "EndComent", "Comment", "Fork", "Join", 
		"Shared", "Lock", "Unlock", "Var", "Integer", "Boolean", "NUMBER", "Minus", 
		"MINUS", "MINUS2", "Not", "NOT", "Mult", "TIMES", "Plus", "PLUS", "And", 
		"AND", "Or", "OR", "EQ", "GT", "GE", "LT", "LE", "NE", "IF", "THEN", "ELSE", 
		"WHILE", "DO", "ASS", "TRUE", "FALSE", "BGN", "END", "SEMI", "LPAR", "RPAR", 
		"OpenArray", "CloseArray", "EndStatement", "WS", "NGUnderscore", "NGHundred", 
		"NGThousand", "NGMillion", "NGBillion", "NGZero", "NGOne", "NGTwo", "NGThree", 
		"NGFour", "NGFive", "NGSix", "NGSeven", "NGEight", "NGNine", "NGTen", 
		"NGEleven", "NGTwelve", "NGEighteen", "NGThir", "NGFif", "NGTeen", "NGTwenty", 
		"NGThirty", "NGForty", "NGFifty", "NGSixty", "NGSeventy", "NGEighty", 
		"NGNinety", "NGAnd", "NGA", "NGB", "NGC", "NGD", "NGE", "NGF", "NGG", 
		"NGH", "NGI", "NGJ", "NGK", "NGL", "NGM", "NGN", "NGO", "NGP", "NGQ", 
		"NGR", "NGS", "NGT", "NGU", "NGV", "NGW", "NGX", "NGY", "NGZ"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2l\u03b1\b\1\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0126\n\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\7\5\u0130\n\5\f\5\16\5\u0133\13\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u016b"+
		"\n\16\r\16\16\16\u016c\3\17\3\17\5\17\u0171\n\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\5\22\u017d\n\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\5\24\u0185\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u018f"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u019a\n\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01a4\n\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01b8\n\34\3\34\3\34\3\34\5\34\u01bd\n\34\3\35\3\35\3\35\3\35\5"+
		"\35\u01c3\n\35\5\35\u01c5\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u01cf\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u01d6\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u01dd\n\36\5\36\u01df\n\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u01e9\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u01f0\n"+
		"\36\3\36\3\36\3\36\5\36\u01f5\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u01fe\n\36\3\37\3\37\3\37\3\37\5\37\u0204\n\37\5\37\u0206\n\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\5\37\u020e\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0215\n\37\3 \3 \3 \3 \3 \5 \u021c\n \5 \u021e\n \3 \3 \3 \3 \3"+
		" \3 \5 \u0226\n \3 \3 \3 \3 \3 \5 \u022d\n \3 \3 \3 \5 \u0232\n \3 \3"+
		" \3 \3 \3 \3 \3 \5 \u023b\n \3!\3!\3!\3!\3!\3!\5!\u0243\n!\3!\3!\3!\3"+
		"!\3!\3!\5!\u024b\n!\3!\3!\3!\5!\u0250\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u0270\n\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\6\62\u028e\n\62\r\62\16\62\u028f"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3V\3V\3"+
		"V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3"+
		"^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3a\3a\3a\3a\3b\3b\3b\3"+
		"b\3b\3c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3"+
		"f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3"+
		"i\3i\3i\3j\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3"+
		"p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3"+
		"|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3"+
		"\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\2\2\u0086\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2i\2k\2m\2o\2q\2s\2"+
		"u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2"+
		"\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\64\u009b\65\u009d"+
		"\66\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad>\u00af?\u00b1"+
		"@\u00b3A\u00b5B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1H\u00c3I\u00c5"+
		"J\u00c7K\u00c9L\u00cbM\u00cdN\u00cfO\u00d1P\u00d3Q\u00d5R\u00d7S\u00d9"+
		"T\u00dbU\u00ddV\u00dfW\u00e1X\u00e3Y\u00e5Z\u00e7[\u00e9\\\u00eb]\u00ed"+
		"^\u00ef_\u00f1`\u00f3a\u00f5b\u00f7c\u00f9d\u00fbe\u00fdf\u00ffg\u0101"+
		"h\u0103i\u0105j\u0107k\u0109l\3\2\36\3\2\62;\5\2\13\f\17\17\"\"\4\2CC"+
		"cc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u03d7"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f"+
		"\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2"+
		"\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1"+
		"\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2"+
		"\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3"+
		"\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2"+
		"\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5"+
		"\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2"+
		"\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7"+
		"\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2"+
		"\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9"+
		"\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2"+
		"\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\3\u0125"+
		"\3\2\2\2\5\u0127\3\2\2\2\7\u0129\3\2\2\2\t\u012b\3\2\2\2\13\u0138\3\2"+
		"\2\2\r\u013d\3\2\2\2\17\u0142\3\2\2\2\21\u0149\3\2\2\2\23\u014e\3\2\2"+
		"\2\25\u0155\3\2\2\2\27\u0159\3\2\2\2\31\u0161\3\2\2\2\33\u016a\3\2\2\2"+
		"\35\u0170\3\2\2\2\37\u0172\3\2\2\2!\u0174\3\2\2\2#\u017c\3\2\2\2%\u017e"+
		"\3\2\2\2\'\u0184\3\2\2\2)\u0186\3\2\2\2+\u018e\3\2\2\2-\u0190\3\2\2\2"+
		"/\u0199\3\2\2\2\61\u019b\3\2\2\2\63\u01a3\3\2\2\2\65\u01a5\3\2\2\2\67"+
		"\u01bc\3\2\2\29\u01d5\3\2\2\2;\u01fd\3\2\2\2=\u0214\3\2\2\2?\u023a\3\2"+
		"\2\2A\u024f\3\2\2\2C\u0251\3\2\2\2E\u0254\3\2\2\2G\u0259\3\2\2\2I\u025e"+
		"\3\2\2\2K\u0264\3\2\2\2M\u026f\3\2\2\2O\u0271\3\2\2\2Q\u0276\3\2\2\2S"+
		"\u027c\3\2\2\2U\u027e\3\2\2\2W\u0280\3\2\2\2Y\u0282\3\2\2\2[\u0284\3\2"+
		"\2\2]\u0286\3\2\2\2_\u0288\3\2\2\2a\u028a\3\2\2\2c\u028d\3\2\2\2e\u0291"+
		"\3\2\2\2g\u0293\3\2\2\2i\u0295\3\2\2\2k\u0297\3\2\2\2m\u0299\3\2\2\2o"+
		"\u029b\3\2\2\2q\u029d\3\2\2\2s\u029f\3\2\2\2u\u02a1\3\2\2\2w\u02a3\3\2"+
		"\2\2y\u02a5\3\2\2\2{\u02a7\3\2\2\2}\u02a9\3\2\2\2\177\u02ab\3\2\2\2\u0081"+
		"\u02ad\3\2\2\2\u0083\u02af\3\2\2\2\u0085\u02b1\3\2\2\2\u0087\u02b3\3\2"+
		"\2\2\u0089\u02b5\3\2\2\2\u008b\u02b7\3\2\2\2\u008d\u02b9\3\2\2\2\u008f"+
		"\u02bb\3\2\2\2\u0091\u02bd\3\2\2\2\u0093\u02bf\3\2\2\2\u0095\u02c1\3\2"+
		"\2\2\u0097\u02c3\3\2\2\2\u0099\u02c5\3\2\2\2\u009b\u02c7\3\2\2\2\u009d"+
		"\u02cf\3\2\2\2\u009f\u02d8\3\2\2\2\u00a1\u02e0\3\2\2\2\u00a3\u02e8\3\2"+
		"\2\2\u00a5\u02ed\3\2\2\2\u00a7\u02f1\3\2\2\2\u00a9\u02f5\3\2\2\2\u00ab"+
		"\u02fb\3\2\2\2\u00ad\u0300\3\2\2\2\u00af\u0305\3\2\2\2\u00b1\u0309\3\2"+
		"\2\2\u00b3\u030f\3\2\2\2\u00b5\u0315\3\2\2\2\u00b7\u031a\3\2\2\2\u00b9"+
		"\u031e\3\2\2\2\u00bb\u0325\3\2\2\2\u00bd\u032c\3\2\2\2\u00bf\u0335\3\2"+
		"\2\2\u00c1\u033a\3\2\2\2\u00c3\u033e\3\2\2\2\u00c5\u0343\3\2\2\2\u00c7"+
		"\u034a\3\2\2\2\u00c9\u0351\3\2\2\2\u00cb\u0357\3\2\2\2\u00cd\u035d\3\2"+
		"\2\2\u00cf\u0363\3\2\2\2\u00d1\u036b\3\2\2\2\u00d3\u0372\3\2\2\2\u00d5"+
		"\u0379\3\2\2\2\u00d7\u037d\3\2\2\2\u00d9\u037f\3\2\2\2\u00db\u0381\3\2"+
		"\2\2\u00dd\u0383\3\2\2\2\u00df\u0385\3\2\2\2\u00e1\u0387\3\2\2\2\u00e3"+
		"\u0389\3\2\2\2\u00e5\u038b\3\2\2\2\u00e7\u038d\3\2\2\2\u00e9\u038f\3\2"+
		"\2\2\u00eb\u0391\3\2\2\2\u00ed\u0393\3\2\2\2\u00ef\u0395\3\2\2\2\u00f1"+
		"\u0397\3\2\2\2\u00f3\u0399\3\2\2\2\u00f5\u039b\3\2\2\2\u00f7\u039d\3\2"+
		"\2\2\u00f9\u039f\3\2\2\2\u00fb\u03a1\3\2\2\2\u00fd\u03a3\3\2\2\2\u00ff"+
		"\u03a5\3\2\2\2\u0101\u03a7\3\2\2\2\u0103\u03a9\3\2\2\2\u0105\u03ab\3\2"+
		"\2\2\u0107\u03ad\3\2\2\2\u0109\u03af\3\2\2\2\u010b\u0126\5e\63\2\u010c"+
		"\u0126\5g\64\2\u010d\u0126\5i\65\2\u010e\u0126\5k\66\2\u010f\u0126\5m"+
		"\67\2\u0110\u0126\5o8\2\u0111\u0126\5q9\2\u0112\u0126\5s:\2\u0113\u0126"+
		"\5u;\2\u0114\u0126\5w<\2\u0115\u0126\5y=\2\u0116\u0126\5{>\2\u0117\u0126"+
		"\5}?\2\u0118\u0126\5\177@\2\u0119\u0126\5\u0081A\2\u011a\u0126\5\u0083"+
		"B\2\u011b\u0126\5\u0085C\2\u011c\u0126\5\u0087D\2\u011d\u0126\5\u0089"+
		"E\2\u011e\u0126\5\u008bF\2\u011f\u0126\5\u008dG\2\u0120\u0126\5\u008f"+
		"H\2\u0121\u0126\5\u0091I\2\u0122\u0126\5\u0093J\2\u0123\u0126\5\u0095"+
		"K\2\u0124\u0126\5\u0097L\2\u0125\u010b\3\2\2\2\u0125\u010c\3\2\2\2\u0125"+
		"\u010d\3\2\2\2\u0125\u010e\3\2\2\2\u0125\u010f\3\2\2\2\u0125\u0110\3\2"+
		"\2\2\u0125\u0111\3\2\2\2\u0125\u0112\3\2\2\2\u0125\u0113\3\2\2\2\u0125"+
		"\u0114\3\2\2\2\u0125\u0115\3\2\2\2\u0125\u0116\3\2\2\2\u0125\u0117\3\2"+
		"\2\2\u0125\u0118\3\2\2\2\u0125\u0119\3\2\2\2\u0125\u011a\3\2\2\2\u0125"+
		"\u011b\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u011e\3\2"+
		"\2\2\u0125\u011f\3\2\2\2\u0125\u0120\3\2\2\2\u0125\u0121\3\2\2\2\u0125"+
		"\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\4\3\2\2\2"+
		"\u0127\u0128\7\'\2\2\u0128\6\3\2\2\2\u0129\u012a\7\'\2\2\u012a\b\3\2\2"+
		"\2\u012b\u0131\5\5\3\2\u012c\u0130\5\3\2\2\u012d\u0130\5\33\16\2\u012e"+
		"\u0130\5c\62\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5\7\4\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0137\b\5\2\2\u0137\n\3\2\2\2\u0138\u0139\5o8\2\u0139\u013a"+
		"\5\u0081A\2\u013a\u013b\5\u0087D\2\u013b\u013c\5y=\2\u013c\f\3\2\2\2\u013d"+
		"\u013e\5w<\2\u013e\u013f\5\u0081A\2\u013f\u0140\5u;\2\u0140\u0141\5\177"+
		"@\2\u0141\16\3\2\2\2\u0142\u0143\5\u0089E\2\u0143\u0144\5s:\2\u0144\u0145"+
		"\5e\63\2\u0145\u0146\5\u0087D\2\u0146\u0147\5m\67\2\u0147\u0148\5k\66"+
		"\2\u0148\20\3\2\2\2\u0149\u014a\5{>\2\u014a\u014b\5\u0081A\2\u014b\u014c"+
		"\5i\65\2\u014c\u014d\5y=\2\u014d\22\3\2\2\2\u014e\u014f\5\u008dG\2\u014f"+
		"\u0150\5\177@\2\u0150\u0151\5{>\2\u0151\u0152\5\u0081A\2\u0152\u0153\5"+
		"i\65\2\u0153\u0154\5y=\2\u0154\24\3\2\2\2\u0155\u0156\5\u008fH\2\u0156"+
		"\u0157\5e\63\2\u0157\u0158\5\u0087D\2\u0158\26\3\2\2\2\u0159\u015a\5u"+
		";\2\u015a\u015b\5\177@\2\u015b\u015c\5\u008bF\2\u015c\u015d\5m\67\2\u015d"+
		"\u015e\5q9\2\u015e\u015f\5m\67\2\u015f\u0160\5\u0087D\2\u0160\30\3\2\2"+
		"\2\u0161\u0162\5g\64\2\u0162\u0163\5\u0081A\2\u0163\u0164\5\u0081A\2\u0164"+
		"\u0165\5{>\2\u0165\u0166\5m\67\2\u0166\u0167\5e\63\2\u0167\u0168\5\177"+
		"@\2\u0168\32\3\2\2\2\u0169\u016b\t\2\2\2\u016a\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\34\3\2\2\2\u016e"+
		"\u0171\5\37\20\2\u016f\u0171\5!\21\2\u0170\u016e\3\2\2\2\u0170\u016f\3"+
		"\2\2\2\u0171\36\3\2\2\2\u0172\u0173\7/\2\2\u0173 \3\2\2\2\u0174\u0175"+
		"\5}?\2\u0175\u0176\5u;\2\u0176\u0177\5\177@\2\u0177\u0178\5\u008dG\2\u0178"+
		"\u0179\5\u0089E\2\u0179\"\3\2\2\2\u017a\u017d\7#\2\2\u017b\u017d\5%\23"+
		"\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d$\3\2\2\2\u017e\u017f"+
		"\5\177@\2\u017f\u0180\5\u0081A\2\u0180\u0181\5\u008bF\2\u0181&\3\2\2\2"+
		"\u0182\u0185\7,\2\2\u0183\u0185\5)\25\2\u0184\u0182\3\2\2\2\u0184\u0183"+
		"\3\2\2\2\u0185(\3\2\2\2\u0186\u0187\5\u008bF\2\u0187\u0188\5u;\2\u0188"+
		"\u0189\5}?\2\u0189\u018a\5m\67\2\u018a\u018b\5\u0089E\2\u018b*\3\2\2\2"+
		"\u018c\u018f\7-\2\2\u018d\u018f\5-\27\2\u018e\u018c\3\2\2\2\u018e\u018d"+
		"\3\2\2\2\u018f,\3\2\2\2\u0190\u0191\5\u0083B\2\u0191\u0192\5{>\2\u0192"+
		"\u0193\5\u008dG\2\u0193\u0194\5\u0089E\2\u0194.\3\2\2\2\u0195\u019a\7"+
		"(\2\2\u0196\u0197\7(\2\2\u0197\u019a\7(\2\2\u0198\u019a\5\61\31\2\u0199"+
		"\u0195\3\2\2\2\u0199\u0196\3\2\2\2\u0199\u0198\3\2\2\2\u019a\60\3\2\2"+
		"\2\u019b\u019c\5e\63\2\u019c\u019d\5\177@\2\u019d\u019e\5k\66\2\u019e"+
		"\62\3\2\2\2\u019f\u01a4\7~\2\2\u01a0\u01a1\7~\2\2\u01a1\u01a4\7~\2\2\u01a2"+
		"\u01a4\5\65\33\2\u01a3\u019f\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a2\3"+
		"\2\2\2\u01a4\64\3\2\2\2\u01a5\u01a6\5\u0081A\2\u01a6\u01a7\5\u0087D\2"+
		"\u01a7\66\3\2\2\2\u01a8\u01a9\7?\2\2\u01a9\u01bd\7?\2\2\u01aa\u01ab\5"+
		"m\67\2\u01ab\u01ac\5\u0085C\2\u01ac\u01ad\5\u008dG\2\u01ad\u01ae\5e\63"+
		"\2\u01ae\u01af\5{>\2\u01af\u01b0\5\u0089E\2\u01b0\u01bd\3\2\2\2\u01b1"+
		"\u01b2\5m\67\2\u01b2\u01b3\5\u0085C\2\u01b3\u01b4\5\u008dG\2\u01b4\u01b5"+
		"\5e\63\2\u01b5\u01b7\5{>\2\u01b6\u01b8\5c\62\2\u01b7\u01b6\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\5\u008bF\2\u01ba\u01bb"+
		"\5\u0081A\2\u01bb\u01bd\3\2\2\2\u01bc\u01a8\3\2\2\2\u01bc\u01aa\3\2\2"+
		"\2\u01bc\u01b1\3\2\2\2\u01bd8\3\2\2\2\u01be\u01d6\7@\2\2\u01bf\u01c0\5"+
		"u;\2\u01c0\u01c2\5\u0089E\2\u01c1\u01c3\5c\62\2\u01c2\u01c1\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01bf\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\5q9\2\u01c7\u01c8\5\u0087D\2\u01c8"+
		"\u01c9\5m\67\2\u01c9\u01ca\5e\63\2\u01ca\u01cb\5\u008bF\2\u01cb\u01cc"+
		"\5m\67\2\u01cc\u01ce\5\u0087D\2\u01cd\u01cf\5c\62\2\u01ce\u01cd\3\2\2"+
		"\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\5\u008bF\2\u01d1"+
		"\u01d2\5s:\2\u01d2\u01d3\5e\63\2\u01d3\u01d4\5\177@\2\u01d4\u01d6\3\2"+
		"\2\2\u01d5\u01be\3\2\2\2\u01d5\u01c4\3\2\2\2\u01d6:\3\2\2\2\u01d7\u01d8"+
		"\7@\2\2\u01d8\u01fe\7?\2\2\u01d9\u01da\5u;\2\u01da\u01dc\5\u0089E\2\u01db"+
		"\u01dd\5c\62\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2"+
		"\2\2\u01de\u01d9\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e1\5q9\2\u01e1\u01e2\5\u0087D\2\u01e2\u01e3\5m\67\2\u01e3\u01e4\5"+
		"e\63\2\u01e4\u01e5\5\u008bF\2\u01e5\u01e6\5m\67\2\u01e6\u01e8\5\u0087"+
		"D\2\u01e7\u01e9\5c\62\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\5\u008bF\2\u01eb\u01ec\5s:\2\u01ec\u01ed\5"+
		"e\63\2\u01ed\u01ef\5\177@\2\u01ee\u01f0\5c\62\2\u01ef\u01ee\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\5\u0081A\2\u01f2\u01f4"+
		"\5\u0087D\2\u01f3\u01f5\5c\62\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2"+
		"\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\5m\67\2\u01f7\u01f8\5\u0085C\2\u01f8"+
		"\u01f9\5\u008dG\2\u01f9\u01fa\5e\63\2\u01fa\u01fb\5{>\2\u01fb\u01fc\5"+
		"\u0089E\2\u01fc\u01fe\3\2\2\2\u01fd\u01d7\3\2\2\2\u01fd\u01de\3\2\2\2"+
		"\u01fe<\3\2\2\2\u01ff\u0215\7>\2\2\u0200\u0201\5u;\2\u0201\u0203\5\u0089"+
		"E\2\u0202\u0204\5c\62\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0206\3\2\2\2\u0205\u0200\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0208\5{>\2\u0208\u0209\5\u0081A\2\u0209\u020a\5\u0091I\2\u020a"+
		"\u020b\5m\67\2\u020b\u020d\5\u0087D\2\u020c\u020e\5c\62\2\u020d\u020c"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\5\u008bF"+
		"\2\u0210\u0211\5s:\2\u0211\u0212\5e\63\2\u0212\u0213\5\177@\2\u0213\u0215"+
		"\3\2\2\2\u0214\u01ff\3\2\2\2\u0214\u0205\3\2\2\2\u0215>\3\2\2\2\u0216"+
		"\u0217\7>\2\2\u0217\u023b\7?\2\2\u0218\u0219\5u;\2\u0219\u021b\5\u0089"+
		"E\2\u021a\u021c\5c\62\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021e\3\2\2\2\u021d\u0218\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0220\5{>\2\u0220\u0221\5\u0081A\2\u0221\u0222\5\u0091I\2\u0222"+
		"\u0223\5m\67\2\u0223\u0225\5\u0087D\2\u0224\u0226\5c\62\2\u0225\u0224"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\5\u008bF"+
		"\2\u0228\u0229\5s:\2\u0229\u022a\5e\63\2\u022a\u022c\5\177@\2\u022b\u022d"+
		"\5c\62\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u022f\5\u0081A\2\u022f\u0231\5\u0087D\2\u0230\u0232\5c\62\2\u0231\u0230"+
		"\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\5m\67\2\u0234"+
		"\u0235\5\u0085C\2\u0235\u0236\5\u008dG\2\u0236\u0237\5e\63\2\u0237\u0238"+
		"\5{>\2\u0238\u0239\5\u0089E\2\u0239\u023b\3\2\2\2\u023a\u0216\3\2\2\2"+
		"\u023a\u021d\3\2\2\2\u023b@\3\2\2\2\u023c\u023d\7#\2\2\u023d\u0250\7?"+
		"\2\2\u023e\u023f\5\177@\2\u023f\u0240\5\u0081A\2\u0240\u0242\5\u008bF"+
		"\2\u0241\u0243\5c\62\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\u0245\5m\67\2\u0245\u0246\5\u0085C\2\u0246\u0247\5\u008d"+
		"G\2\u0247\u0248\5e\63\2\u0248\u024a\5{>\2\u0249\u024b\5c\62\2\u024a\u0249"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\5\u008bF"+
		"\2\u024d\u024e\5\u0081A\2\u024e\u0250\3\2\2\2\u024f\u023c\3\2\2\2\u024f"+
		"\u023e\3\2\2\2\u0250B\3\2\2\2\u0251\u0252\5u;\2\u0252\u0253\5o8\2\u0253"+
		"D\3\2\2\2\u0254\u0255\5\u008bF\2\u0255\u0256\5s:\2\u0256\u0257\5m\67\2"+
		"\u0257\u0258\5\177@\2\u0258F\3\2\2\2\u0259\u025a\5m\67\2\u025a\u025b\5"+
		"{>\2\u025b\u025c\5\u0089E\2\u025c\u025d\5m\67\2\u025dH\3\2\2\2\u025e\u025f"+
		"\5\u0091I\2\u025f\u0260\5s:\2\u0260\u0261\5u;\2\u0261\u0262\5{>\2\u0262"+
		"\u0263\5m\67\2\u0263J\3\2\2\2\u0264\u0265\5k\66\2\u0265\u0266\5\u0081"+
		"A\2\u0266L\3\2\2\2\u0267\u0270\7?\2\2\u0268\u0269\5\u0089E\2\u0269\u026a"+
		"\5m\67\2\u026a\u026b\5\u008bF\2\u026b\u026c\5c\62\2\u026c\u026d\5\u008b"+
		"F\2\u026d\u026e\5\u0081A\2\u026e\u0270\3\2\2\2\u026f\u0267\3\2\2\2\u026f"+
		"\u0268\3\2\2\2\u0270N\3\2\2\2\u0271\u0272\5\u008bF\2\u0272\u0273\5\u0087"+
		"D\2\u0273\u0274\5\u008dG\2\u0274\u0275\5m\67\2\u0275P\3\2\2\2\u0276\u0277"+
		"\5o8\2\u0277\u0278\5e\63\2\u0278\u0279\5{>\2\u0279\u027a\5\u0089E\2\u027a"+
		"\u027b\5m\67\2\u027bR\3\2\2\2\u027c\u027d\7}\2\2\u027dT\3\2\2\2\u027e"+
		"\u027f\7\177\2\2\u027fV\3\2\2\2\u0280\u0281\7.\2\2\u0281X\3\2\2\2\u0282"+
		"\u0283\7*\2\2\u0283Z\3\2\2\2\u0284\u0285\7+\2\2\u0285\\\3\2\2\2\u0286"+
		"\u0287\7]\2\2\u0287^\3\2\2\2\u0288\u0289\7_\2\2\u0289`\3\2\2\2\u028a\u028b"+
		"\7=\2\2\u028bb\3\2\2\2\u028c\u028e\t\3\2\2\u028d\u028c\3\2\2\2\u028e\u028f"+
		"\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290d\3\2\2\2\u0291"+
		"\u0292\t\4\2\2\u0292f\3\2\2\2\u0293\u0294\t\5\2\2\u0294h\3\2\2\2\u0295"+
		"\u0296\t\6\2\2\u0296j\3\2\2\2\u0297\u0298\t\7\2\2\u0298l\3\2\2\2\u0299"+
		"\u029a\t\b\2\2\u029an\3\2\2\2\u029b\u029c\t\t\2\2\u029cp\3\2\2\2\u029d"+
		"\u029e\t\n\2\2\u029er\3\2\2\2\u029f\u02a0\t\13\2\2\u02a0t\3\2\2\2\u02a1"+
		"\u02a2\t\f\2\2\u02a2v\3\2\2\2\u02a3\u02a4\t\r\2\2\u02a4x\3\2\2\2\u02a5"+
		"\u02a6\t\16\2\2\u02a6z\3\2\2\2\u02a7\u02a8\t\17\2\2\u02a8|\3\2\2\2\u02a9"+
		"\u02aa\t\20\2\2\u02aa~\3\2\2\2\u02ab\u02ac\t\21\2\2\u02ac\u0080\3\2\2"+
		"\2\u02ad\u02ae\t\22\2\2\u02ae\u0082\3\2\2\2\u02af\u02b0\t\23\2\2\u02b0"+
		"\u0084\3\2\2\2\u02b1\u02b2\t\24\2\2\u02b2\u0086\3\2\2\2\u02b3\u02b4\t"+
		"\25\2\2\u02b4\u0088\3\2\2\2\u02b5\u02b6\t\26\2\2\u02b6\u008a\3\2\2\2\u02b7"+
		"\u02b8\t\27\2\2\u02b8\u008c\3\2\2\2\u02b9\u02ba\t\30\2\2\u02ba\u008e\3"+
		"\2\2\2\u02bb\u02bc\t\31\2\2\u02bc\u0090\3\2\2\2\u02bd\u02be\t\32\2\2\u02be"+
		"\u0092\3\2\2\2\u02bf\u02c0\t\33\2\2\u02c0\u0094\3\2\2\2\u02c1\u02c2\t"+
		"\34\2\2\u02c2\u0096\3\2\2\2\u02c3\u02c4\t\35\2\2\u02c4\u0098\3\2\2\2\u02c5"+
		"\u02c6\7a\2\2\u02c6\u009a\3\2\2\2\u02c7\u02c8\5\u00e5s\2\u02c8\u02c9\5"+
		"\u00ff\u0080\2\u02c9\u02ca\5\u00f1y\2\u02ca\u02cb\5\u00ddo\2\u02cb\u02cc"+
		"\5\u00f9}\2\u02cc\u02cd\5\u00dfp\2\u02cd\u02ce\5\u00ddo\2\u02ce\u009c"+
		"\3\2\2\2\u02cf\u02d0\5\u00fd\177\2\u02d0\u02d1\5\u00e5s\2\u02d1\u02d2"+
		"\5\u00f3z\2\u02d2\u02d3\5\u00ff\u0080\2\u02d3\u02d4\5\u00fb~\2\u02d4\u02d5"+
		"\5\u00d7l\2\u02d5\u02d6\5\u00f1y\2\u02d6\u02d7\5\u00ddo\2\u02d7\u009e"+
		"\3\2\2\2\u02d8\u02d9\5\u00efx\2\u02d9\u02da\5\u00e7t\2\u02da\u02db\5\u00ed"+
		"w\2\u02db\u02dc\5\u00edw\2\u02dc\u02dd\5\u00e7t\2\u02dd\u02de\5\u00f3"+
		"z\2\u02de\u02df\5\u00f1y\2\u02df\u00a0\3\2\2\2\u02e0\u02e1\5\u00d9m\2"+
		"\u02e1\u02e2\5\u00e7t\2\u02e2\u02e3\5\u00edw\2\u02e3\u02e4\5\u00edw\2"+
		"\u02e4\u02e5\5\u00e7t\2\u02e5\u02e6\5\u00f3z\2\u02e6\u02e7\5\u00f1y\2"+
		"\u02e7\u00a2\3\2\2\2\u02e8\u02e9\5\u0109\u0085\2\u02e9\u02ea\5\u00dfp"+
		"\2\u02ea\u02eb\5\u00f9}\2\u02eb\u02ec\5\u00f3z\2\u02ec\u00a4\3\2\2\2\u02ed"+
		"\u02ee\5\u00f3z\2\u02ee\u02ef\5\u00f1y\2\u02ef\u02f0\5\u00dfp\2\u02f0"+
		"\u00a6\3\2\2\2\u02f1\u02f2\5\u00fd\177\2\u02f2\u02f3\5\u0103\u0082\2\u02f3"+
		"\u02f4\5\u00f3z\2\u02f4\u00a8\3\2\2\2\u02f5\u02f6\5\u00fd\177\2\u02f6"+
		"\u02f7\5\u00e5s\2\u02f7\u02f8\5\u00f9}\2\u02f8\u02f9\5\u00dfp\2\u02f9"+
		"\u02fa\5\u00dfp\2\u02fa\u00aa\3\2\2\2\u02fb\u02fc\5\u00e1q\2\u02fc\u02fd"+
		"\5\u00f3z\2\u02fd\u02fe\5\u00ff\u0080\2\u02fe\u02ff\5\u00f9}\2\u02ff\u00ac"+
		"\3\2\2\2\u0300\u0301\5\u00e1q\2\u0301\u0302\5\u00e7t\2\u0302\u0303\5\u0101"+
		"\u0081\2\u0303\u0304\5\u00dfp\2\u0304\u00ae\3\2\2\2\u0305\u0306\5\u00fb"+
		"~\2\u0306\u0307\5\u00e7t\2\u0307\u0308\5\u0105\u0083\2\u0308\u00b0\3\2"+
		"\2\2\u0309\u030a\5\u00fb~\2\u030a\u030b\5\u00dfp\2\u030b\u030c\5\u0101"+
		"\u0081\2\u030c\u030d\5\u00dfp\2\u030d\u030e\5\u00f1y\2\u030e\u00b2\3\2"+
		"\2\2\u030f\u0310\5\u00dfp\2\u0310\u0311\5\u00e7t\2\u0311\u0312\5\u00e3"+
		"r\2\u0312\u0313\5\u00e5s\2\u0313\u0314\5\u00fd\177\2\u0314\u00b4\3\2\2"+
		"\2\u0315\u0316\5\u00f1y\2\u0316\u0317\5\u00e7t\2\u0317\u0318\5\u00f1y"+
		"\2\u0318\u0319\5\u00dfp\2\u0319\u00b6\3\2\2\2\u031a\u031b\5\u00fd\177"+
		"\2\u031b\u031c\5\u00dfp\2\u031c\u031d\5\u00f1y\2\u031d\u00b8\3\2\2\2\u031e"+
		"\u031f\5\u00dfp\2\u031f\u0320\5\u00edw\2\u0320\u0321\5\u00dfp\2\u0321"+
		"\u0322\5\u0101\u0081\2\u0322\u0323\5\u00dfp\2\u0323\u0324\5\u00f1y\2\u0324"+
		"\u00ba\3\2\2\2\u0325\u0326\5\u00fd\177\2\u0326\u0327\5\u0103\u0082\2\u0327"+
		"\u0328\5\u00dfp\2\u0328\u0329\5\u00edw\2\u0329\u032a\5\u0101\u0081\2\u032a"+
		"\u032b\5\u00dfp\2\u032b\u00bc\3\2\2\2\u032c\u032d\5\u00dfp\2\u032d\u032e"+
		"\5\u00e7t\2\u032e\u032f\5\u00e3r\2\u032f\u0330\5\u00e5s\2\u0330\u0331"+
		"\5\u00fd\177\2\u0331\u0332\5\u00dfp\2\u0332\u0333\5\u00dfp\2\u0333\u0334"+
		"\5\u00f1y\2\u0334\u00be\3\2\2\2\u0335\u0336\5\u00fd\177\2\u0336\u0337"+
		"\5\u00e5s\2\u0337\u0338\5\u00e7t\2\u0338\u0339\5\u00f9}\2\u0339\u00c0"+
		"\3\2\2\2\u033a\u033b\5\u00e1q\2\u033b\u033c\5\u00e7t\2\u033c\u033d\5\u00e1"+
		"q\2\u033d\u00c2\3\2\2\2\u033e\u033f\5\u00fd\177\2\u033f\u0340\5\u00df"+
		"p\2\u0340\u0341\5\u00dfp\2\u0341\u0342\5\u00f1y\2\u0342\u00c4\3\2\2\2"+
		"\u0343\u0344\5\u00fd\177\2\u0344\u0345\5\u0103\u0082\2\u0345\u0346\5\u00df"+
		"p\2\u0346\u0347\5\u00f1y\2\u0347\u0348\5\u00fd\177\2\u0348\u0349\5\u0107"+
		"\u0084\2\u0349\u00c6\3\2\2\2\u034a\u034b\5\u00fd\177\2\u034b\u034c\5\u00e5"+
		"s\2\u034c\u034d\5\u00e7t\2\u034d\u034e\5\u00f9}\2\u034e\u034f\5\u00fd"+
		"\177\2\u034f\u0350\5\u0107\u0084\2\u0350\u00c8\3\2\2\2\u0351\u0352\5\u00e1"+
		"q\2\u0352\u0353\5\u00f3z\2\u0353\u0354\5\u00f9}\2\u0354\u0355\5\u00fd"+
		"\177\2\u0355\u0356\5\u0107\u0084\2\u0356\u00ca\3\2\2\2\u0357\u0358\5\u00e1"+
		"q\2\u0358\u0359\5\u00e7t\2\u0359\u035a\5\u00e1q\2\u035a\u035b\5\u00fd"+
		"\177\2\u035b\u035c\5\u0107\u0084\2\u035c\u00cc\3\2\2\2\u035d\u035e\5\u00fb"+
		"~\2\u035e\u035f\5\u00e7t\2\u035f\u0360\5\u0105\u0083\2\u0360\u0361\5\u00fd"+
		"\177\2\u0361\u0362\5\u0107\u0084\2\u0362\u00ce\3\2\2\2\u0363\u0364\5\u00fb"+
		"~\2\u0364\u0365\5\u00dfp\2\u0365\u0366\5\u0101\u0081\2\u0366\u0367\5\u00df"+
		"p\2\u0367\u0368\5\u00f1y\2\u0368\u0369\5\u00fd\177\2\u0369\u036a\5\u0107"+
		"\u0084\2\u036a\u00d0\3\2\2\2\u036b\u036c\5\u00dfp\2\u036c\u036d\5\u00e7"+
		"t\2\u036d\u036e\5\u00e3r\2\u036e\u036f\5\u00e5s\2\u036f\u0370\5\u00fd"+
		"\177\2\u0370\u0371\5\u0107\u0084\2\u0371\u00d2\3\2\2\2\u0372\u0373\5\u00f1"+
		"y\2\u0373\u0374\5\u00e7t\2\u0374\u0375\5\u00f1y\2\u0375\u0376\5\u00df"+
		"p\2\u0376\u0377\5\u00fd\177\2\u0377\u0378\5\u0107\u0084\2\u0378\u00d4"+
		"\3\2\2\2\u0379\u037a\5\u00d7l\2\u037a\u037b\5\u00f1y\2\u037b\u037c\5\u00dd"+
		"o\2\u037c\u00d6\3\2\2\2\u037d\u037e\t\4\2\2\u037e\u00d8\3\2\2\2\u037f"+
		"\u0380\t\5\2\2\u0380\u00da\3\2\2\2\u0381\u0382\t\6\2\2\u0382\u00dc\3\2"+
		"\2\2\u0383\u0384\t\7\2\2\u0384\u00de\3\2\2\2\u0385\u0386\t\b\2\2\u0386"+
		"\u00e0\3\2\2\2\u0387\u0388\t\t\2\2\u0388\u00e2\3\2\2\2\u0389\u038a\t\n"+
		"\2\2\u038a\u00e4\3\2\2\2\u038b\u038c\t\13\2\2\u038c\u00e6\3\2\2\2\u038d"+
		"\u038e\t\f\2\2\u038e\u00e8\3\2\2\2\u038f\u0390\t\r\2\2\u0390\u00ea\3\2"+
		"\2\2\u0391\u0392\t\16\2\2\u0392\u00ec\3\2\2\2\u0393\u0394\t\17\2\2\u0394"+
		"\u00ee\3\2\2\2\u0395\u0396\t\20\2\2\u0396\u00f0\3\2\2\2\u0397\u0398\t"+
		"\21\2\2\u0398\u00f2\3\2\2\2\u0399\u039a\t\22\2\2\u039a\u00f4\3\2\2\2\u039b"+
		"\u039c\t\23\2\2\u039c\u00f6\3\2\2\2\u039d\u039e\t\24\2\2\u039e\u00f8\3"+
		"\2\2\2\u039f\u03a0\t\25\2\2\u03a0\u00fa\3\2\2\2\u03a1\u03a2\t\26\2\2\u03a2"+
		"\u00fc\3\2\2\2\u03a3\u03a4\t\27\2\2\u03a4\u00fe\3\2\2\2\u03a5\u03a6\t"+
		"\30\2\2\u03a6\u0100\3\2\2\2\u03a7\u03a8\t\31\2\2\u03a8\u0102\3\2\2\2\u03a9"+
		"\u03aa\t\32\2\2\u03aa\u0104\3\2\2\2\u03ab\u03ac\t\33\2\2\u03ac\u0106\3"+
		"\2\2\2\u03ad\u03ae\t\34\2\2\u03ae\u0108\3\2\2\2\u03af\u03b0\t\35\2\2\u03b0"+
		"\u010a\3\2\2\2(\2\u0125\u012f\u0131\u016c\u0170\u017c\u0184\u018e\u0199"+
		"\u01a3\u01b7\u01bc\u01c2\u01c4\u01ce\u01d5\u01dc\u01de\u01e8\u01ef\u01f4"+
		"\u01fd\u0203\u0205\u020d\u0214\u021b\u021d\u0225\u022c\u0231\u023a\u0242"+
		"\u024a\u024f\u026f\u028f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}