// Generated from C:/Projects/Project - Programming Paradigms Compiler Project/PP-Compiler-Project/src/grammar\MainGrammar.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainGrammarParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_number = 1, RULE_writtenNumber = 2, RULE_single = 3, 
		RULE_only = 4, RULE_singles = 5, RULE_main1 = 6, RULE_main2 = 7, RULE_hprefix = 8, 
		RULE_seconds = 9, RULE_first = 10, RULE_doubles = 11, RULE_hundred = 12, 
		RULE_thousand = 13, RULE_million = 14, RULE_billion = 15;
	public static final String[] ruleNames = {
		"program", "number", "writtenNumber", "single", "only", "singles", "main1", 
		"main2", "hprefix", "seconds", "first", "doubles", "hundred", "thousand", 
		"million", "billion"
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

	@Override
	public String getGrammarFileName() { return "MainGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MainGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class NumberContext extends ParserRuleContext {
		public WrittenNumberContext writtenNumber() {
			return getRuleContext(WrittenNumberContext.class,0);
		}
		public TerminalNode NumericNumber() { return getToken(MainGrammarParser.NumericNumber, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_number);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
			case One:
			case Two:
			case Three:
			case Four:
			case Five:
			case Six:
			case Seven:
			case Eight:
			case Nine:
			case Ten:
			case Eleven:
			case Twelve:
			case Eighteen:
			case Thir:
			case Fif:
			case Twenty:
			case Thirty:
			case Forty:
			case Fifty:
			case Sixty:
			case Seventy:
			case Eighty:
			case Ninety:
			case B:
			case H:
			case M:
			case T:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				writtenNumber();
				}
				break;
			case NumericNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(NumericNumber);
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

	public static class WrittenNumberContext extends ParserRuleContext {
		public BillionContext billion() {
			return getRuleContext(BillionContext.class,0);
		}
		public MillionContext million() {
			return getRuleContext(MillionContext.class,0);
		}
		public ThousandContext thousand() {
			return getRuleContext(ThousandContext.class,0);
		}
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public TerminalNode Zero() { return getToken(MainGrammarParser.Zero, 0); }
		public WrittenNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writtenNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterWrittenNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitWrittenNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitWrittenNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WrittenNumberContext writtenNumber() throws RecognitionException {
		WrittenNumberContext _localctx = new WrittenNumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_writtenNumber);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				billion();
				setState(39);
				million();
				setState(40);
				thousand();
				setState(41);
				single();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				billion();
				setState(44);
				million();
				setState(45);
				thousand();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				billion();
				setState(48);
				million();
				setState(49);
				single();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				million();
				setState(52);
				thousand();
				setState(53);
				single();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				billion();
				setState(56);
				thousand();
				setState(57);
				single();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				billion();
				setState(60);
				million();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				billion();
				setState(63);
				thousand();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				thousand();
				setState(66);
				single();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(68);
				million();
				setState(69);
				thousand();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(71);
				million();
				setState(72);
				single();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(74);
				billion();
				setState(75);
				single();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(77);
				million();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(78);
				billion();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(79);
				million();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(80);
				thousand();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(81);
				single();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(82);
				match(Zero);
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

	public static class SingleContext extends ParserRuleContext {
		public HundredContext hundred() {
			return getRuleContext(HundredContext.class,0);
		}
		public OnlyContext only() {
			return getRuleContext(OnlyContext.class,0);
		}
		public HprefixContext hprefix() {
			return getRuleContext(HprefixContext.class,0);
		}
		public TerminalNode And() { return getToken(MainGrammarParser.And, 0); }
		public SingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleContext single() throws RecognitionException {
		SingleContext _localctx = new SingleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety))) != 0)) {
					{
					setState(85);
					hprefix();
					}
				}

				setState(88);
				hundred();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(89);
					match(And);
					}
				}

				setState(92);
				only();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety))) != 0)) {
					{
					setState(94);
					hprefix();
					}
				}

				setState(97);
				hundred();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				only();
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

	public static class OnlyContext extends ParserRuleContext {
		public Main1Context main1() {
			return getRuleContext(Main1Context.class,0);
		}
		public Main2Context main2() {
			return getRuleContext(Main2Context.class,0);
		}
		public SinglesContext singles() {
			return getRuleContext(SinglesContext.class,0);
		}
		public OnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_only; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnlyContext only() throws RecognitionException {
		OnlyContext _localctx = new OnlyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_only);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				main1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				main2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				singles();
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

	public static class SinglesContext extends ParserRuleContext {
		public TerminalNode One() { return getToken(MainGrammarParser.One, 0); }
		public TerminalNode Two() { return getToken(MainGrammarParser.Two, 0); }
		public TerminalNode Three() { return getToken(MainGrammarParser.Three, 0); }
		public TerminalNode Four() { return getToken(MainGrammarParser.Four, 0); }
		public TerminalNode Five() { return getToken(MainGrammarParser.Five, 0); }
		public TerminalNode Six() { return getToken(MainGrammarParser.Six, 0); }
		public TerminalNode Seven() { return getToken(MainGrammarParser.Seven, 0); }
		public TerminalNode Eight() { return getToken(MainGrammarParser.Eight, 0); }
		public TerminalNode Nine() { return getToken(MainGrammarParser.Nine, 0); }
		public TerminalNode Ten() { return getToken(MainGrammarParser.Ten, 0); }
		public SinglesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterSingles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitSingles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitSingles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglesContext singles() throws RecognitionException {
		SinglesContext _localctx = new SinglesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten))) != 0)) ) {
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

	public static class Main1Context extends ParserRuleContext {
		public TerminalNode Eleven() { return getToken(MainGrammarParser.Eleven, 0); }
		public TerminalNode Twelve() { return getToken(MainGrammarParser.Twelve, 0); }
		public TerminalNode Eighteen() { return getToken(MainGrammarParser.Eighteen, 0); }
		public FirstContext first() {
			return getRuleContext(FirstContext.class,0);
		}
		public TerminalNode Teen() { return getToken(MainGrammarParser.Teen, 0); }
		public Main1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterMain1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitMain1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitMain1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main1Context main1() throws RecognitionException {
		Main1Context _localctx = new Main1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_main1);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Eleven:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(Eleven);
				}
				break;
			case Twelve:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(Twelve);
				}
				break;
			case Eighteen:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(Eighteen);
				}
				break;
			case Four:
			case Six:
			case Seven:
			case Nine:
			case Thir:
			case Fif:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				first();
				setState(112);
				match(Teen);
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

	public static class Main2Context extends ParserRuleContext {
		public DoublesContext doubles() {
			return getRuleContext(DoublesContext.class,0);
		}
		public SecondsContext seconds() {
			return getRuleContext(SecondsContext.class,0);
		}
		public Main2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterMain2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitMain2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitMain2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main2Context main2() throws RecognitionException {
		Main2Context _localctx = new Main2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_main2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			doubles();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine))) != 0)) {
				{
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(117);
					match(T__0);
					}
				}

				setState(120);
				seconds();
				}
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

	public static class HprefixContext extends ParserRuleContext {
		public OnlyContext only() {
			return getRuleContext(OnlyContext.class,0);
		}
		public HprefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hprefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterHprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitHprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitHprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HprefixContext hprefix() throws RecognitionException {
		HprefixContext _localctx = new HprefixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			only();
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

	public static class SecondsContext extends ParserRuleContext {
		public TerminalNode One() { return getToken(MainGrammarParser.One, 0); }
		public TerminalNode Two() { return getToken(MainGrammarParser.Two, 0); }
		public TerminalNode Three() { return getToken(MainGrammarParser.Three, 0); }
		public TerminalNode Four() { return getToken(MainGrammarParser.Four, 0); }
		public TerminalNode Five() { return getToken(MainGrammarParser.Five, 0); }
		public TerminalNode Six() { return getToken(MainGrammarParser.Six, 0); }
		public TerminalNode Seven() { return getToken(MainGrammarParser.Seven, 0); }
		public TerminalNode Eight() { return getToken(MainGrammarParser.Eight, 0); }
		public TerminalNode Nine() { return getToken(MainGrammarParser.Nine, 0); }
		public SecondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seconds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterSeconds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitSeconds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitSeconds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondsContext seconds() throws RecognitionException {
		SecondsContext _localctx = new SecondsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_seconds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine))) != 0)) ) {
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

	public static class FirstContext extends ParserRuleContext {
		public TerminalNode Thir() { return getToken(MainGrammarParser.Thir, 0); }
		public TerminalNode Four() { return getToken(MainGrammarParser.Four, 0); }
		public TerminalNode Fif() { return getToken(MainGrammarParser.Fif, 0); }
		public TerminalNode Six() { return getToken(MainGrammarParser.Six, 0); }
		public TerminalNode Seven() { return getToken(MainGrammarParser.Seven, 0); }
		public TerminalNode Nine() { return getToken(MainGrammarParser.Nine, 0); }
		public FirstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstContext first() throws RecognitionException {
		FirstContext _localctx = new FirstContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_first);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Four) | (1L << Six) | (1L << Seven) | (1L << Nine) | (1L << Thir) | (1L << Fif))) != 0)) ) {
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

	public static class DoublesContext extends ParserRuleContext {
		public TerminalNode Twenty() { return getToken(MainGrammarParser.Twenty, 0); }
		public TerminalNode Thirty() { return getToken(MainGrammarParser.Thirty, 0); }
		public TerminalNode Forty() { return getToken(MainGrammarParser.Forty, 0); }
		public TerminalNode Fifty() { return getToken(MainGrammarParser.Fifty, 0); }
		public TerminalNode Sixty() { return getToken(MainGrammarParser.Sixty, 0); }
		public TerminalNode Seventy() { return getToken(MainGrammarParser.Seventy, 0); }
		public TerminalNode Eighty() { return getToken(MainGrammarParser.Eighty, 0); }
		public TerminalNode Ninety() { return getToken(MainGrammarParser.Ninety, 0); }
		public DoublesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterDoubles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitDoubles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitDoubles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoublesContext doubles() throws RecognitionException {
		DoublesContext _localctx = new DoublesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_doubles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety))) != 0)) ) {
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

	public static class HundredContext extends ParserRuleContext {
		public TerminalNode H() { return getToken(MainGrammarParser.H, 0); }
		public TerminalNode U() { return getToken(MainGrammarParser.U, 0); }
		public TerminalNode N() { return getToken(MainGrammarParser.N, 0); }
		public List<TerminalNode> D() { return getTokens(MainGrammarParser.D); }
		public TerminalNode D(int i) {
			return getToken(MainGrammarParser.D, i);
		}
		public TerminalNode R() { return getToken(MainGrammarParser.R, 0); }
		public TerminalNode E() { return getToken(MainGrammarParser.E, 0); }
		public HundredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hundred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterHundred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitHundred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitHundred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HundredContext hundred() throws RecognitionException {
		HundredContext _localctx = new HundredContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hundred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(H);
			setState(132);
			match(U);
			setState(133);
			match(N);
			setState(134);
			match(D);
			setState(135);
			match(R);
			setState(136);
			match(E);
			setState(137);
			match(D);
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

	public static class ThousandContext extends ParserRuleContext {
		public TerminalNode T() { return getToken(MainGrammarParser.T, 0); }
		public TerminalNode H() { return getToken(MainGrammarParser.H, 0); }
		public TerminalNode O() { return getToken(MainGrammarParser.O, 0); }
		public TerminalNode U() { return getToken(MainGrammarParser.U, 0); }
		public TerminalNode S() { return getToken(MainGrammarParser.S, 0); }
		public TerminalNode And() { return getToken(MainGrammarParser.And, 0); }
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public ThousandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thousand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterThousand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitThousand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitThousand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThousandContext thousand() throws RecognitionException {
		ThousandContext _localctx = new ThousandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_thousand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety) | (1L << H))) != 0)) {
				{
				setState(139);
				single();
				}
			}

			setState(142);
			match(T);
			setState(143);
			match(H);
			setState(144);
			match(O);
			setState(145);
			match(U);
			setState(146);
			match(S);
			setState(147);
			match(And);
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

	public static class MillionContext extends ParserRuleContext {
		public TerminalNode M() { return getToken(MainGrammarParser.M, 0); }
		public List<TerminalNode> I() { return getTokens(MainGrammarParser.I); }
		public TerminalNode I(int i) {
			return getToken(MainGrammarParser.I, i);
		}
		public List<TerminalNode> L() { return getTokens(MainGrammarParser.L); }
		public TerminalNode L(int i) {
			return getToken(MainGrammarParser.L, i);
		}
		public TerminalNode O() { return getToken(MainGrammarParser.O, 0); }
		public TerminalNode N() { return getToken(MainGrammarParser.N, 0); }
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public MillionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_million; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterMillion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitMillion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitMillion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MillionContext million() throws RecognitionException {
		MillionContext _localctx = new MillionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_million);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety) | (1L << H))) != 0)) {
				{
				setState(149);
				single();
				}
			}

			setState(152);
			match(M);
			setState(153);
			match(I);
			setState(154);
			match(L);
			setState(155);
			match(L);
			setState(156);
			match(I);
			setState(157);
			match(O);
			setState(158);
			match(N);
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

	public static class BillionContext extends ParserRuleContext {
		public TerminalNode B() { return getToken(MainGrammarParser.B, 0); }
		public List<TerminalNode> I() { return getTokens(MainGrammarParser.I); }
		public TerminalNode I(int i) {
			return getToken(MainGrammarParser.I, i);
		}
		public List<TerminalNode> L() { return getTokens(MainGrammarParser.L); }
		public TerminalNode L(int i) {
			return getToken(MainGrammarParser.L, i);
		}
		public TerminalNode O() { return getToken(MainGrammarParser.O, 0); }
		public TerminalNode N() { return getToken(MainGrammarParser.N, 0); }
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public BillionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_billion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterBillion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitBillion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitBillion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BillionContext billion() throws RecognitionException {
		BillionContext _localctx = new BillionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_billion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety) | (1L << H))) != 0)) {
				{
				setState(160);
				single();
				}
			}

			setState(163);
			match(B);
			setState(164);
			match(I);
			setState(165);
			match(L);
			setState(166);
			match(L);
			setState(167);
			match(I);
			setState(168);
			match(O);
			setState(169);
			match(N);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u00ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4V\n\4\3\5"+
		"\5\5Y\n\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\5\5\5b\n\5\3\5\3\5\5\5f\n\5\3\6\3"+
		"\6\3\6\5\6k\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bu\n\b\3\t\3\t\5\ty"+
		"\n\t\3\t\5\t|\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\5\17\u008f\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\5\20\u0099\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\5\21\u00a4\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\2\2\22\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2\6\17\3\2\6\16\6\2\t\t\13"+
		"\f\16\16\23\24\3\2\26\35\2\u00bd\2\"\3\2\2\2\4&\3\2\2\2\6U\3\2\2\2\be"+
		"\3\2\2\2\nj\3\2\2\2\fl\3\2\2\2\16t\3\2\2\2\20v\3\2\2\2\22}\3\2\2\2\24"+
		"\177\3\2\2\2\26\u0081\3\2\2\2\30\u0083\3\2\2\2\32\u0085\3\2\2\2\34\u008e"+
		"\3\2\2\2\36\u0098\3\2\2\2 \u00a3\3\2\2\2\"#\3\2\2\2#\3\3\2\2\2$\'\5\6"+
		"\4\2%\'\7\4\2\2&$\3\2\2\2&%\3\2\2\2\'\5\3\2\2\2()\5 \21\2)*\5\36\20\2"+
		"*+\5\34\17\2+,\5\b\5\2,V\3\2\2\2-.\5 \21\2./\5\36\20\2/\60\5\34\17\2\60"+
		"V\3\2\2\2\61\62\5 \21\2\62\63\5\36\20\2\63\64\5\b\5\2\64V\3\2\2\2\65\66"+
		"\5\36\20\2\66\67\5\34\17\2\678\5\b\5\28V\3\2\2\29:\5 \21\2:;\5\34\17\2"+
		";<\5\b\5\2<V\3\2\2\2=>\5 \21\2>?\5\36\20\2?V\3\2\2\2@A\5 \21\2AB\5\34"+
		"\17\2BV\3\2\2\2CD\5\34\17\2DE\5\b\5\2EV\3\2\2\2FG\5\36\20\2GH\5\34\17"+
		"\2HV\3\2\2\2IJ\5\36\20\2JK\5\b\5\2KV\3\2\2\2LM\5 \21\2MN\5\b\5\2NV\3\2"+
		"\2\2OV\5\36\20\2PV\5 \21\2QV\5\36\20\2RV\5\34\17\2SV\5\b\5\2TV\7\5\2\2"+
		"U(\3\2\2\2U-\3\2\2\2U\61\3\2\2\2U\65\3\2\2\2U9\3\2\2\2U=\3\2\2\2U@\3\2"+
		"\2\2UC\3\2\2\2UF\3\2\2\2UI\3\2\2\2UL\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2"+
		"\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\7\3\2\2\2WY\5\22\n\2XW\3\2\2\2XY\3"+
		"\2\2\2YZ\3\2\2\2Z\\\5\32\16\2[]\7\36\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2"+
		"\2^_\5\n\6\2_f\3\2\2\2`b\5\22\n\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cf\5\32"+
		"\16\2df\5\n\6\2eX\3\2\2\2ea\3\2\2\2ed\3\2\2\2f\t\3\2\2\2gk\5\16\b\2hk"+
		"\5\20\t\2ik\5\f\7\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\13\3\2\2\2lm\t\2\2"+
		"\2m\r\3\2\2\2nu\7\20\2\2ou\7\21\2\2pu\7\22\2\2qr\5\26\f\2rs\7\25\2\2s"+
		"u\3\2\2\2tn\3\2\2\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2u\17\3\2\2\2v{\5\30\r"+
		"\2wy\7\3\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\5\24\13\2{x\3\2\2\2{|\3\2"+
		"\2\2|\21\3\2\2\2}~\5\n\6\2~\23\3\2\2\2\177\u0080\t\3\2\2\u0080\25\3\2"+
		"\2\2\u0081\u0082\t\4\2\2\u0082\27\3\2\2\2\u0083\u0084\t\5\2\2\u0084\31"+
		"\3\2\2\2\u0085\u0086\7&\2\2\u0086\u0087\7\63\2\2\u0087\u0088\7,\2\2\u0088"+
		"\u0089\7\"\2\2\u0089\u008a\7\60\2\2\u008a\u008b\7#\2\2\u008b\u008c\7\""+
		"\2\2\u008c\33\3\2\2\2\u008d\u008f\5\b\5\2\u008e\u008d\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\62\2\2\u0091\u0092\7&\2\2\u0092"+
		"\u0093\7-\2\2\u0093\u0094\7\63\2\2\u0094\u0095\7\61\2\2\u0095\u0096\7"+
		"\36\2\2\u0096\35\3\2\2\2\u0097\u0099\5\b\5\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7+\2\2\u009b\u009c\7\'"+
		"\2\2\u009c\u009d\7*\2\2\u009d\u009e\7*\2\2\u009e\u009f\7\'\2\2\u009f\u00a0"+
		"\7-\2\2\u00a0\u00a1\7,\2\2\u00a1\37\3\2\2\2\u00a2\u00a4\5\b\5\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7 "+
		"\2\2\u00a6\u00a7\7\'\2\2\u00a7\u00a8\7*\2\2\u00a8\u00a9\7*\2\2\u00a9\u00aa"+
		"\7\'\2\2\u00aa\u00ab\7-\2\2\u00ab\u00ac\7,\2\2\u00ac!\3\2\2\2\17&UX\\"+
		"aejtx{\u008e\u0098\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}