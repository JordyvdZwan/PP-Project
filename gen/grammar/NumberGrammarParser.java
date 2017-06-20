// Generated from C:/Projects/Project - Programming Paradigms Compiler Project/PP-Compiler-Project/src/grammar\NumberGrammar.g4 by ANTLR 4.7
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
public class NumberGrammarParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_number = 1, RULE_writtenNumber = 2, RULE_hundred = 3, 
		RULE_thousand = 4, RULE_million = 5, RULE_billion = 6, RULE_single = 7, 
		RULE_only = 8, RULE_singles = 9, RULE_main1 = 10, RULE_main2 = 11, RULE_hprefix = 12, 
		RULE_seconds = 13, RULE_first = 14, RULE_doubles = 15;
	public static final String[] ruleNames = {
		"program", "number", "writtenNumber", "hundred", "thousand", "million", 
		"billion", "single", "only", "singles", "main1", "main2", "hprefix", "seconds", 
		"first", "doubles"
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

	@Override
	public String getGrammarFileName() { return "NumberGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NumberGrammarParser(TokenStream input) {
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
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitProgram(this);
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
		public TerminalNode NumericNumber() { return getToken(NumberGrammarParser.NumericNumber, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNumber(this);
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
			case Hundred:
			case Thousand:
			case Million:
			case Billion:
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
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public BillionContext billion() {
			return getRuleContext(BillionContext.class,0);
		}
		public MillionContext million() {
			return getRuleContext(MillionContext.class,0);
		}
		public ThousandContext thousand() {
			return getRuleContext(ThousandContext.class,0);
		}
		public TerminalNode Zero() { return getToken(NumberGrammarParser.Zero, 0); }
		public WrittenNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writtenNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterWrittenNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitWrittenNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitWrittenNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WrittenNumberContext writtenNumber() throws RecognitionException {
		WrittenNumberContext _localctx = new WrittenNumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_writtenNumber);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(38);
					billion();
					}
					break;
				}
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(41);
					million();
					}
					break;
				}
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(44);
					thousand();
					}
					break;
				}
				setState(47);
				single();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(48);
					billion();
					}
					break;
				}
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(51);
					million();
					}
					break;
				}
				setState(54);
				thousand();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Hundred) | (1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety))) != 0)) {
					{
					setState(55);
					single();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(58);
					billion();
					}
					break;
				}
				setState(61);
				million();
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(62);
					thousand();
					}
					break;
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Hundred) | (1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety))) != 0)) {
					{
					setState(65);
					single();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				billion();
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(69);
					million();
					}
					break;
				}
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(72);
					thousand();
					}
					break;
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Hundred) | (1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety))) != 0)) {
					{
					setState(75);
					single();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
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

	public static class HundredContext extends ParserRuleContext {
		public TerminalNode Hundred() { return getToken(NumberGrammarParser.Hundred, 0); }
		public HundredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hundred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterHundred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitHundred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitHundred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HundredContext hundred() throws RecognitionException {
		HundredContext _localctx = new HundredContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hundred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(Hundred);
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
		public TerminalNode Thousand() { return getToken(NumberGrammarParser.Thousand, 0); }
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public ThousandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thousand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterThousand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitThousand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitThousand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThousandContext thousand() throws RecognitionException {
		ThousandContext _localctx = new ThousandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_thousand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Hundred) | (1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety))) != 0)) {
				{
				setState(83);
				single();
				}
			}

			setState(86);
			match(Thousand);
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
		public TerminalNode Million() { return getToken(NumberGrammarParser.Million, 0); }
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public MillionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_million; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterMillion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitMillion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitMillion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MillionContext million() throws RecognitionException {
		MillionContext _localctx = new MillionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_million);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Hundred) | (1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety))) != 0)) {
				{
				setState(88);
				single();
				}
			}

			setState(91);
			match(Million);
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
		public TerminalNode Billion() { return getToken(NumberGrammarParser.Billion, 0); }
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public BillionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_billion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterBillion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitBillion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitBillion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BillionContext billion() throws RecognitionException {
		BillionContext _localctx = new BillionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_billion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Hundred) | (1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety))) != 0)) {
				{
				setState(93);
				single();
				}
			}

			setState(96);
			match(Billion);
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
		public TerminalNode And() { return getToken(NumberGrammarParser.And, 0); }
		public SingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleContext single() throws RecognitionException {
		SingleContext _localctx = new SingleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_single);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety))) != 0)) {
					{
					setState(98);
					hprefix();
					}
				}

				setState(101);
				hundred();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(102);
					match(And);
					}
				}

				setState(105);
				only();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine) | (1L << Ten) | (1L << Eleven) | (1L << Twelve) | (1L << Eighteen) | (1L << Thir) | (1L << Fif) | (1L << Twenty) | (1L << Thirty) | (1L << Forty) | (1L << Fifty) | (1L << Sixty) | (1L << Seventy) | (1L << Eighty) | (1L << Ninety))) != 0)) {
					{
					setState(107);
					hprefix();
					}
				}

				setState(110);
				hundred();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
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
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnlyContext only() throws RecognitionException {
		OnlyContext _localctx = new OnlyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_only);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				main1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				main2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
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
		public TerminalNode One() { return getToken(NumberGrammarParser.One, 0); }
		public TerminalNode Two() { return getToken(NumberGrammarParser.Two, 0); }
		public TerminalNode Three() { return getToken(NumberGrammarParser.Three, 0); }
		public TerminalNode Four() { return getToken(NumberGrammarParser.Four, 0); }
		public TerminalNode Five() { return getToken(NumberGrammarParser.Five, 0); }
		public TerminalNode Six() { return getToken(NumberGrammarParser.Six, 0); }
		public TerminalNode Seven() { return getToken(NumberGrammarParser.Seven, 0); }
		public TerminalNode Eight() { return getToken(NumberGrammarParser.Eight, 0); }
		public TerminalNode Nine() { return getToken(NumberGrammarParser.Nine, 0); }
		public TerminalNode Ten() { return getToken(NumberGrammarParser.Ten, 0); }
		public SinglesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterSingles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitSingles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitSingles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglesContext singles() throws RecognitionException {
		SinglesContext _localctx = new SinglesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_singles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		public TerminalNode Eleven() { return getToken(NumberGrammarParser.Eleven, 0); }
		public TerminalNode Twelve() { return getToken(NumberGrammarParser.Twelve, 0); }
		public TerminalNode Eighteen() { return getToken(NumberGrammarParser.Eighteen, 0); }
		public FirstContext first() {
			return getRuleContext(FirstContext.class,0);
		}
		public TerminalNode Teen() { return getToken(NumberGrammarParser.Teen, 0); }
		public Main1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterMain1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitMain1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitMain1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main1Context main1() throws RecognitionException {
		Main1Context _localctx = new Main1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_main1);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Eleven:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(Eleven);
				}
				break;
			case Twelve:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(Twelve);
				}
				break;
			case Eighteen:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
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
				setState(124);
				first();
				setState(125);
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
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterMain2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitMain2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitMain2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main2Context main2() throws RecognitionException {
		Main2Context _localctx = new Main2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_main2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			doubles();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << One) | (1L << Two) | (1L << Three) | (1L << Four) | (1L << Five) | (1L << Six) | (1L << Seven) | (1L << Eight) | (1L << Nine))) != 0)) {
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(130);
					match(T__0);
					}
				}

				setState(133);
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
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterHprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitHprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitHprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HprefixContext hprefix() throws RecognitionException {
		HprefixContext _localctx = new HprefixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		public TerminalNode One() { return getToken(NumberGrammarParser.One, 0); }
		public TerminalNode Two() { return getToken(NumberGrammarParser.Two, 0); }
		public TerminalNode Three() { return getToken(NumberGrammarParser.Three, 0); }
		public TerminalNode Four() { return getToken(NumberGrammarParser.Four, 0); }
		public TerminalNode Five() { return getToken(NumberGrammarParser.Five, 0); }
		public TerminalNode Six() { return getToken(NumberGrammarParser.Six, 0); }
		public TerminalNode Seven() { return getToken(NumberGrammarParser.Seven, 0); }
		public TerminalNode Eight() { return getToken(NumberGrammarParser.Eight, 0); }
		public TerminalNode Nine() { return getToken(NumberGrammarParser.Nine, 0); }
		public SecondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seconds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterSeconds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitSeconds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitSeconds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondsContext seconds() throws RecognitionException {
		SecondsContext _localctx = new SecondsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_seconds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		public TerminalNode Thir() { return getToken(NumberGrammarParser.Thir, 0); }
		public TerminalNode Four() { return getToken(NumberGrammarParser.Four, 0); }
		public TerminalNode Fif() { return getToken(NumberGrammarParser.Fif, 0); }
		public TerminalNode Six() { return getToken(NumberGrammarParser.Six, 0); }
		public TerminalNode Seven() { return getToken(NumberGrammarParser.Seven, 0); }
		public TerminalNode Nine() { return getToken(NumberGrammarParser.Nine, 0); }
		public FirstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstContext first() throws RecognitionException {
		FirstContext _localctx = new FirstContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_first);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		public TerminalNode Twenty() { return getToken(NumberGrammarParser.Twenty, 0); }
		public TerminalNode Thirty() { return getToken(NumberGrammarParser.Thirty, 0); }
		public TerminalNode Forty() { return getToken(NumberGrammarParser.Forty, 0); }
		public TerminalNode Fifty() { return getToken(NumberGrammarParser.Fifty, 0); }
		public TerminalNode Sixty() { return getToken(NumberGrammarParser.Sixty, 0); }
		public TerminalNode Seventy() { return getToken(NumberGrammarParser.Seventy, 0); }
		public TerminalNode Eighty() { return getToken(NumberGrammarParser.Eighty, 0); }
		public TerminalNode Ninety() { return getToken(NumberGrammarParser.Ninety, 0); }
		public DoublesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterDoubles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitDoubles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitDoubles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoublesContext doubles() throws RecognitionException {
		DoublesContext _localctx = new DoublesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doubles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0093\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\5\3\'\n\3\3\4\5\4*\n\4\3\4\5\4-\n\4\3\4\5\4\60\n\4\3\4\3\4\5\4"+
		"\64\n\4\3\4\5\4\67\n\4\3\4\3\4\5\4;\n\4\3\4\5\4>\n\4\3\4\3\4\5\4B\n\4"+
		"\3\4\5\4E\n\4\3\4\3\4\5\4I\n\4\3\4\5\4L\n\4\3\4\5\4O\n\4\3\4\5\4R\n\4"+
		"\3\5\3\5\3\6\5\6W\n\6\3\6\3\6\3\7\5\7\\\n\7\3\7\3\7\3\b\5\ba\n\b\3\b\3"+
		"\b\3\t\5\tf\n\t\3\t\3\t\5\tj\n\t\3\t\3\t\3\t\5\to\n\t\3\t\3\t\5\ts\n\t"+
		"\3\n\3\n\3\n\5\nx\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0082\n\f"+
		"\3\r\3\r\5\r\u0086\n\r\3\r\5\r\u0089\n\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2"+
		"\n\23\3\2\n\22\6\2\r\r\17\20\22\22\27\30\3\2\32!\2\u00a2\2\"\3\2\2\2\4"+
		"&\3\2\2\2\6Q\3\2\2\2\bS\3\2\2\2\nV\3\2\2\2\f[\3\2\2\2\16`\3\2\2\2\20r"+
		"\3\2\2\2\22w\3\2\2\2\24y\3\2\2\2\26\u0081\3\2\2\2\30\u0083\3\2\2\2\32"+
		"\u008a\3\2\2\2\34\u008c\3\2\2\2\36\u008e\3\2\2\2 \u0090\3\2\2\2\"#\3\2"+
		"\2\2#\3\3\2\2\2$\'\5\6\4\2%\'\7\4\2\2&$\3\2\2\2&%\3\2\2\2\'\5\3\2\2\2"+
		"(*\5\16\b\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2\2+-\5\f\7\2,+\3\2\2\2,-\3\2\2"+
		"\2-/\3\2\2\2.\60\5\n\6\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61R\5\20"+
		"\t\2\62\64\5\16\b\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5"+
		"\f\7\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28:\5\n\6\29;\5\20\t\2:9"+
		"\3\2\2\2:;\3\2\2\2;R\3\2\2\2<>\5\16\b\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2"+
		"?A\5\f\7\2@B\5\n\6\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\5\20\t\2DC\3\2\2"+
		"\2DE\3\2\2\2ER\3\2\2\2FH\5\16\b\2GI\5\f\7\2HG\3\2\2\2HI\3\2\2\2IK\3\2"+
		"\2\2JL\5\n\6\2KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\5\20\t\2NM\3\2\2\2NO\3"+
		"\2\2\2OR\3\2\2\2PR\7\t\2\2Q)\3\2\2\2Q\63\3\2\2\2Q=\3\2\2\2QF\3\2\2\2Q"+
		"P\3\2\2\2R\7\3\2\2\2ST\7\5\2\2T\t\3\2\2\2UW\5\20\t\2VU\3\2\2\2VW\3\2\2"+
		"\2WX\3\2\2\2XY\7\6\2\2Y\13\3\2\2\2Z\\\5\20\t\2[Z\3\2\2\2[\\\3\2\2\2\\"+
		"]\3\2\2\2]^\7\7\2\2^\r\3\2\2\2_a\5\20\t\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2"+
		"\2bc\7\b\2\2c\17\3\2\2\2df\5\32\16\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\5"+
		"\b\5\2hj\7\"\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\5\22\n\2ls\3\2\2\2mo"+
		"\5\32\16\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2ps\5\b\5\2qs\5\22\n\2re\3\2\2"+
		"\2rn\3\2\2\2rq\3\2\2\2s\21\3\2\2\2tx\5\26\f\2ux\5\30\r\2vx\5\24\13\2w"+
		"t\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\23\3\2\2\2yz\t\2\2\2z\25\3\2\2\2{\u0082"+
		"\7\24\2\2|\u0082\7\25\2\2}\u0082\7\26\2\2~\177\5\36\20\2\177\u0080\7\31"+
		"\2\2\u0080\u0082\3\2\2\2\u0081{\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2"+
		"\u0081~\3\2\2\2\u0082\27\3\2\2\2\u0083\u0088\5 \21\2\u0084\u0086\7\3\2"+
		"\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089"+
		"\5\34\17\2\u0088\u0085\3\2\2\2\u0088\u0089\3\2\2\2\u0089\31\3\2\2\2\u008a"+
		"\u008b\5\22\n\2\u008b\33\3\2\2\2\u008c\u008d\t\3\2\2\u008d\35\3\2\2\2"+
		"\u008e\u008f\t\4\2\2\u008f\37\3\2\2\2\u0090\u0091\t\5\2\2\u0091!\3\2\2"+
		"\2\33&),/\63\66:=ADHKNQV[`einrw\u0081\u0085\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}