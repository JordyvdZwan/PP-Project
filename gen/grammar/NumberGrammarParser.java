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
		T__0=1, NGUnderscore=2, NGHundred=3, NGThousand=4, NGMillion=5, NGBillion=6, 
		NGZero=7, NGOne=8, NGTwo=9, NGThree=10, NGFour=11, NGFive=12, NGSix=13, 
		NGSeven=14, NGEight=15, NGNine=16, NGTen=17, NGEleven=18, NGTwelve=19, 
		NGEighteen=20, NGThir=21, NGFif=22, NGTeen=23, NGTwenty=24, NGThirty=25, 
		NGForty=26, NGFifty=27, NGSixty=28, NGSeventy=29, NGEighty=30, NGNinety=31, 
		NGAnd=32, NGA=33, NGB=34, NGC=35, NGD=36, NGE=37, NGF=38, NGG=39, NGH=40, 
		NGI=41, NGJ=42, NGK=43, NGL=44, NGM=45, NGN=46, NGO=47, NGP=48, NGQ=49, 
		NGR=50, NGS=51, NGT=52, NGU=53, NGV=54, NGW=55, NGX=56, NGY=57, NGZ=58;
	public static final int
		RULE_ngWrittenNumber = 0, RULE_nghundred = 1, RULE_ngthousand = 2, RULE_ngmillion = 3, 
		RULE_ngbillion = 4, RULE_ngsingle = 5, RULE_ngonly = 6, RULE_ngsingles = 7, 
		RULE_ngmain1 = 8, RULE_ngmain2 = 9, RULE_nghprefix = 10, RULE_ngseconds = 11, 
		RULE_ngfirst = 12, RULE_ngdoubles = 13;
	public static final String[] ruleNames = {
		"ngWrittenNumber", "nghundred", "ngthousand", "ngmillion", "ngbillion", 
		"ngsingle", "ngonly", "ngsingles", "ngmain1", "ngmain2", "nghprefix", 
		"ngseconds", "ngfirst", "ngdoubles"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NGUnderscore", "NGHundred", "NGThousand", "NGMillion", "NGBillion", 
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
	public static class NgWrittenNumberContext extends ParserRuleContext {
		public TerminalNode NGUnderscore() { return getToken(NumberGrammarParser.NGUnderscore, 0); }
		public NgsingleContext ngsingle() {
			return getRuleContext(NgsingleContext.class,0);
		}
		public NgbillionContext ngbillion() {
			return getRuleContext(NgbillionContext.class,0);
		}
		public NgmillionContext ngmillion() {
			return getRuleContext(NgmillionContext.class,0);
		}
		public NgthousandContext ngthousand() {
			return getRuleContext(NgthousandContext.class,0);
		}
		public List<TerminalNode> NGAnd() { return getTokens(NumberGrammarParser.NGAnd); }
		public TerminalNode NGAnd(int i) {
			return getToken(NumberGrammarParser.NGAnd, i);
		}
		public TerminalNode NGZero() { return getToken(NumberGrammarParser.NGZero, 0); }
		public NgWrittenNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngWrittenNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgWrittenNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgWrittenNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgWrittenNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgWrittenNumberContext ngWrittenNumber() throws RecognitionException {
		NgWrittenNumberContext _localctx = new NgWrittenNumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ngWrittenNumber);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(NGUnderscore);
				setState(33);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(29);
					ngbillion();
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(30);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(35);
					ngmillion();
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(36);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(41);
					ngthousand();
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(42);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(47);
				ngsingle();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(NGUnderscore);
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(49);
					ngbillion();
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(50);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(55);
					ngmillion();
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(56);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(61);
				ngthousand();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NGAnd) {
					{
					setState(62);
					match(NGAnd);
					}
				}

				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGHundred) | (1L << NGOne) | (1L << NGTwo) | (1L << NGThree) | (1L << NGFour) | (1L << NGFive) | (1L << NGSix) | (1L << NGSeven) | (1L << NGEight) | (1L << NGNine) | (1L << NGTen) | (1L << NGEleven) | (1L << NGTwelve) | (1L << NGEighteen) | (1L << NGThir) | (1L << NGFif) | (1L << NGTwenty) | (1L << NGThirty) | (1L << NGForty) | (1L << NGFifty) | (1L << NGSixty) | (1L << NGSeventy) | (1L << NGEighty) | (1L << NGNinety))) != 0)) {
					{
					setState(65);
					ngsingle();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(NGUnderscore);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(69);
					ngbillion();
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(70);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(75);
				ngmillion();
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NGAnd) {
					{
					setState(76);
					match(NGAnd);
					}
				}

				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(79);
					ngthousand();
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(80);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGHundred) | (1L << NGOne) | (1L << NGTwo) | (1L << NGThree) | (1L << NGFour) | (1L << NGFive) | (1L << NGSix) | (1L << NGSeven) | (1L << NGEight) | (1L << NGNine) | (1L << NGTen) | (1L << NGEleven) | (1L << NGTwelve) | (1L << NGEighteen) | (1L << NGThir) | (1L << NGFif) | (1L << NGTwenty) | (1L << NGThirty) | (1L << NGForty) | (1L << NGFifty) | (1L << NGSixty) | (1L << NGSeventy) | (1L << NGEighty) | (1L << NGNinety))) != 0)) {
					{
					setState(85);
					ngsingle();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(NGUnderscore);
				setState(89);
				ngbillion();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NGAnd) {
					{
					setState(90);
					match(NGAnd);
					}
				}

				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(93);
					ngmillion();
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(94);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(99);
					ngthousand();
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(100);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGHundred) | (1L << NGOne) | (1L << NGTwo) | (1L << NGThree) | (1L << NGFour) | (1L << NGFive) | (1L << NGSix) | (1L << NGSeven) | (1L << NGEight) | (1L << NGNine) | (1L << NGTen) | (1L << NGEleven) | (1L << NGTwelve) | (1L << NGEighteen) | (1L << NGThir) | (1L << NGFif) | (1L << NGTwenty) | (1L << NGThirty) | (1L << NGForty) | (1L << NGFifty) | (1L << NGSixty) | (1L << NGSeventy) | (1L << NGEighty) | (1L << NGNinety))) != 0)) {
					{
					setState(105);
					ngsingle();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				match(NGUnderscore);
				setState(109);
				match(NGZero);
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

	public static class NghundredContext extends ParserRuleContext {
		public TerminalNode NGHundred() { return getToken(NumberGrammarParser.NGHundred, 0); }
		public NghundredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nghundred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNghundred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNghundred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNghundred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NghundredContext nghundred() throws RecognitionException {
		NghundredContext _localctx = new NghundredContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nghundred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(NGHundred);
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

	public static class NgthousandContext extends ParserRuleContext {
		public TerminalNode NGThousand() { return getToken(NumberGrammarParser.NGThousand, 0); }
		public NgsingleContext ngsingle() {
			return getRuleContext(NgsingleContext.class,0);
		}
		public NgthousandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngthousand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgthousand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgthousand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgthousand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgthousandContext ngthousand() throws RecognitionException {
		NgthousandContext _localctx = new NgthousandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ngthousand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGHundred) | (1L << NGOne) | (1L << NGTwo) | (1L << NGThree) | (1L << NGFour) | (1L << NGFive) | (1L << NGSix) | (1L << NGSeven) | (1L << NGEight) | (1L << NGNine) | (1L << NGTen) | (1L << NGEleven) | (1L << NGTwelve) | (1L << NGEighteen) | (1L << NGThir) | (1L << NGFif) | (1L << NGTwenty) | (1L << NGThirty) | (1L << NGForty) | (1L << NGFifty) | (1L << NGSixty) | (1L << NGSeventy) | (1L << NGEighty) | (1L << NGNinety))) != 0)) {
				{
				setState(114);
				ngsingle();
				}
			}

			setState(117);
			match(NGThousand);
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

	public static class NgmillionContext extends ParserRuleContext {
		public TerminalNode NGMillion() { return getToken(NumberGrammarParser.NGMillion, 0); }
		public NgsingleContext ngsingle() {
			return getRuleContext(NgsingleContext.class,0);
		}
		public NgmillionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngmillion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgmillion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgmillion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgmillion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgmillionContext ngmillion() throws RecognitionException {
		NgmillionContext _localctx = new NgmillionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ngmillion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGHundred) | (1L << NGOne) | (1L << NGTwo) | (1L << NGThree) | (1L << NGFour) | (1L << NGFive) | (1L << NGSix) | (1L << NGSeven) | (1L << NGEight) | (1L << NGNine) | (1L << NGTen) | (1L << NGEleven) | (1L << NGTwelve) | (1L << NGEighteen) | (1L << NGThir) | (1L << NGFif) | (1L << NGTwenty) | (1L << NGThirty) | (1L << NGForty) | (1L << NGFifty) | (1L << NGSixty) | (1L << NGSeventy) | (1L << NGEighty) | (1L << NGNinety))) != 0)) {
				{
				setState(119);
				ngsingle();
				}
			}

			setState(122);
			match(NGMillion);
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

	public static class NgbillionContext extends ParserRuleContext {
		public TerminalNode NGBillion() { return getToken(NumberGrammarParser.NGBillion, 0); }
		public NgsingleContext ngsingle() {
			return getRuleContext(NgsingleContext.class,0);
		}
		public NgbillionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngbillion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgbillion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgbillion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgbillion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgbillionContext ngbillion() throws RecognitionException {
		NgbillionContext _localctx = new NgbillionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ngbillion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGHundred) | (1L << NGOne) | (1L << NGTwo) | (1L << NGThree) | (1L << NGFour) | (1L << NGFive) | (1L << NGSix) | (1L << NGSeven) | (1L << NGEight) | (1L << NGNine) | (1L << NGTen) | (1L << NGEleven) | (1L << NGTwelve) | (1L << NGEighteen) | (1L << NGThir) | (1L << NGFif) | (1L << NGTwenty) | (1L << NGThirty) | (1L << NGForty) | (1L << NGFifty) | (1L << NGSixty) | (1L << NGSeventy) | (1L << NGEighty) | (1L << NGNinety))) != 0)) {
				{
				setState(124);
				ngsingle();
				}
			}

			setState(127);
			match(NGBillion);
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

	public static class NgsingleContext extends ParserRuleContext {
		public NghundredContext nghundred() {
			return getRuleContext(NghundredContext.class,0);
		}
		public NgonlyContext ngonly() {
			return getRuleContext(NgonlyContext.class,0);
		}
		public NghprefixContext nghprefix() {
			return getRuleContext(NghprefixContext.class,0);
		}
		public TerminalNode NGAnd() { return getToken(NumberGrammarParser.NGAnd, 0); }
		public NgsingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngsingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgsingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgsingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgsingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgsingleContext ngsingle() throws RecognitionException {
		NgsingleContext _localctx = new NgsingleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ngsingle);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGOne) | (1L << NGTwo) | (1L << NGThree) | (1L << NGFour) | (1L << NGFive) | (1L << NGSix) | (1L << NGSeven) | (1L << NGEight) | (1L << NGNine) | (1L << NGTen) | (1L << NGEleven) | (1L << NGTwelve) | (1L << NGEighteen) | (1L << NGThir) | (1L << NGFif) | (1L << NGTwenty) | (1L << NGThirty) | (1L << NGForty) | (1L << NGFifty) | (1L << NGSixty) | (1L << NGSeventy) | (1L << NGEighty) | (1L << NGNinety))) != 0)) {
					{
					setState(129);
					nghprefix();
					}
				}

				setState(132);
				nghundred();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NGAnd) {
					{
					setState(133);
					match(NGAnd);
					}
				}

				setState(136);
				ngonly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGOne) | (1L << NGTwo) | (1L << NGThree) | (1L << NGFour) | (1L << NGFive) | (1L << NGSix) | (1L << NGSeven) | (1L << NGEight) | (1L << NGNine) | (1L << NGTen) | (1L << NGEleven) | (1L << NGTwelve) | (1L << NGEighteen) | (1L << NGThir) | (1L << NGFif) | (1L << NGTwenty) | (1L << NGThirty) | (1L << NGForty) | (1L << NGFifty) | (1L << NGSixty) | (1L << NGSeventy) | (1L << NGEighty) | (1L << NGNinety))) != 0)) {
					{
					setState(138);
					nghprefix();
					}
				}

				setState(141);
				nghundred();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				ngonly();
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

	public static class NgonlyContext extends ParserRuleContext {
		public Ngmain1Context ngmain1() {
			return getRuleContext(Ngmain1Context.class,0);
		}
		public Ngmain2Context ngmain2() {
			return getRuleContext(Ngmain2Context.class,0);
		}
		public NgsinglesContext ngsingles() {
			return getRuleContext(NgsinglesContext.class,0);
		}
		public NgonlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngonly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgonly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgonly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgonly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgonlyContext ngonly() throws RecognitionException {
		NgonlyContext _localctx = new NgonlyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ngonly);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				ngmain1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				ngmain2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				ngsingles();
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

	public static class NgsinglesContext extends ParserRuleContext {
		public TerminalNode NGOne() { return getToken(NumberGrammarParser.NGOne, 0); }
		public TerminalNode NGTwo() { return getToken(NumberGrammarParser.NGTwo, 0); }
		public TerminalNode NGThree() { return getToken(NumberGrammarParser.NGThree, 0); }
		public TerminalNode NGFour() { return getToken(NumberGrammarParser.NGFour, 0); }
		public TerminalNode NGFive() { return getToken(NumberGrammarParser.NGFive, 0); }
		public TerminalNode NGSix() { return getToken(NumberGrammarParser.NGSix, 0); }
		public TerminalNode NGSeven() { return getToken(NumberGrammarParser.NGSeven, 0); }
		public TerminalNode NGEight() { return getToken(NumberGrammarParser.NGEight, 0); }
		public TerminalNode NGNine() { return getToken(NumberGrammarParser.NGNine, 0); }
		public TerminalNode NGTen() { return getToken(NumberGrammarParser.NGTen, 0); }
		public NgsinglesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngsingles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgsingles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgsingles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgsingles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgsinglesContext ngsingles() throws RecognitionException {
		NgsinglesContext _localctx = new NgsinglesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ngsingles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGOne) | (1L << NGTwo) | (1L << NGThree) | (1L << NGFour) | (1L << NGFive) | (1L << NGSix) | (1L << NGSeven) | (1L << NGEight) | (1L << NGNine) | (1L << NGTen))) != 0)) ) {
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

	public static class Ngmain1Context extends ParserRuleContext {
		public TerminalNode NGEleven() { return getToken(NumberGrammarParser.NGEleven, 0); }
		public TerminalNode NGTwelve() { return getToken(NumberGrammarParser.NGTwelve, 0); }
		public TerminalNode NGEighteen() { return getToken(NumberGrammarParser.NGEighteen, 0); }
		public NgfirstContext ngfirst() {
			return getRuleContext(NgfirstContext.class,0);
		}
		public TerminalNode NGTeen() { return getToken(NumberGrammarParser.NGTeen, 0); }
		public Ngmain1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngmain1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgmain1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgmain1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgmain1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ngmain1Context ngmain1() throws RecognitionException {
		Ngmain1Context _localctx = new Ngmain1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_ngmain1);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NGEleven:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(NGEleven);
				}
				break;
			case NGTwelve:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(NGTwelve);
				}
				break;
			case NGEighteen:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(NGEighteen);
				}
				break;
			case NGFour:
			case NGSix:
			case NGSeven:
			case NGNine:
			case NGThir:
			case NGFif:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				ngfirst();
				setState(156);
				match(NGTeen);
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

	public static class Ngmain2Context extends ParserRuleContext {
		public NgdoublesContext ngdoubles() {
			return getRuleContext(NgdoublesContext.class,0);
		}
		public NgsecondsContext ngseconds() {
			return getRuleContext(NgsecondsContext.class,0);
		}
		public Ngmain2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngmain2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgmain2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgmain2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgmain2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ngmain2Context ngmain2() throws RecognitionException {
		Ngmain2Context _localctx = new Ngmain2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_ngmain2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			ngdoubles();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NGOne) | (1L << NGTwo) | (1L << NGThree) | (1L << NGFour) | (1L << NGFive) | (1L << NGSix) | (1L << NGSeven) | (1L << NGEight) | (1L << NGNine))) != 0)) {
				{
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(161);
					match(T__0);
					}
				}

				setState(164);
				ngseconds();
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

	public static class NghprefixContext extends ParserRuleContext {
		public NgonlyContext ngonly() {
			return getRuleContext(NgonlyContext.class,0);
		}
		public NghprefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nghprefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNghprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNghprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNghprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NghprefixContext nghprefix() throws RecognitionException {
		NghprefixContext _localctx = new NghprefixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nghprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			ngonly();
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

	public static class NgsecondsContext extends ParserRuleContext {
		public TerminalNode NGOne() { return getToken(NumberGrammarParser.NGOne, 0); }
		public TerminalNode NGTwo() { return getToken(NumberGrammarParser.NGTwo, 0); }
		public TerminalNode NGThree() { return getToken(NumberGrammarParser.NGThree, 0); }
		public TerminalNode NGFour() { return getToken(NumberGrammarParser.NGFour, 0); }
		public TerminalNode NGFive() { return getToken(NumberGrammarParser.NGFive, 0); }
		public TerminalNode NGSix() { return getToken(NumberGrammarParser.NGSix, 0); }
		public TerminalNode NGSeven() { return getToken(NumberGrammarParser.NGSeven, 0); }
		public TerminalNode NGEight() { return getToken(NumberGrammarParser.NGEight, 0); }
		public TerminalNode NGNine() { return getToken(NumberGrammarParser.NGNine, 0); }
		public NgsecondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngseconds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgseconds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgseconds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgseconds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgsecondsContext ngseconds() throws RecognitionException {
		NgsecondsContext _localctx = new NgsecondsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ngseconds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGOne) | (1L << NGTwo) | (1L << NGThree) | (1L << NGFour) | (1L << NGFive) | (1L << NGSix) | (1L << NGSeven) | (1L << NGEight) | (1L << NGNine))) != 0)) ) {
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

	public static class NgfirstContext extends ParserRuleContext {
		public TerminalNode NGThir() { return getToken(NumberGrammarParser.NGThir, 0); }
		public TerminalNode NGFour() { return getToken(NumberGrammarParser.NGFour, 0); }
		public TerminalNode NGFif() { return getToken(NumberGrammarParser.NGFif, 0); }
		public TerminalNode NGSix() { return getToken(NumberGrammarParser.NGSix, 0); }
		public TerminalNode NGSeven() { return getToken(NumberGrammarParser.NGSeven, 0); }
		public TerminalNode NGNine() { return getToken(NumberGrammarParser.NGNine, 0); }
		public NgfirstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngfirst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgfirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgfirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgfirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgfirstContext ngfirst() throws RecognitionException {
		NgfirstContext _localctx = new NgfirstContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ngfirst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGFour) | (1L << NGSix) | (1L << NGSeven) | (1L << NGNine) | (1L << NGThir) | (1L << NGFif))) != 0)) ) {
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

	public static class NgdoublesContext extends ParserRuleContext {
		public TerminalNode NGTwenty() { return getToken(NumberGrammarParser.NGTwenty, 0); }
		public TerminalNode NGThirty() { return getToken(NumberGrammarParser.NGThirty, 0); }
		public TerminalNode NGForty() { return getToken(NumberGrammarParser.NGForty, 0); }
		public TerminalNode NGFifty() { return getToken(NumberGrammarParser.NGFifty, 0); }
		public TerminalNode NGSixty() { return getToken(NumberGrammarParser.NGSixty, 0); }
		public TerminalNode NGSeventy() { return getToken(NumberGrammarParser.NGSeventy, 0); }
		public TerminalNode NGEighty() { return getToken(NumberGrammarParser.NGEighty, 0); }
		public TerminalNode NGNinety() { return getToken(NumberGrammarParser.NGNinety, 0); }
		public NgdoublesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngdoubles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNgdoubles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNgdoubles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberGrammarVisitor ) return ((NumberGrammarVisitor<? extends T>)visitor).visitNgdoubles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgdoublesContext ngdoubles() throws RecognitionException {
		NgdoublesContext _localctx = new NgdoublesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ngdoubles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NGTwenty) | (1L << NGThirty) | (1L << NGForty) | (1L << NGFifty) | (1L << NGSixty) | (1L << NGSeventy) | (1L << NGEighty) | (1L << NGNinety))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u00b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\5\2\"\n\2\5\2$\n\2"+
		"\3\2\3\2\5\2(\n\2\5\2*\n\2\3\2\3\2\5\2.\n\2\5\2\60\n\2\3\2\3\2\3\2\3\2"+
		"\5\2\66\n\2\5\28\n\2\3\2\3\2\5\2<\n\2\5\2>\n\2\3\2\3\2\5\2B\n\2\3\2\5"+
		"\2E\n\2\3\2\3\2\3\2\5\2J\n\2\5\2L\n\2\3\2\3\2\5\2P\n\2\3\2\3\2\5\2T\n"+
		"\2\5\2V\n\2\3\2\5\2Y\n\2\3\2\3\2\3\2\5\2^\n\2\3\2\3\2\5\2b\n\2\5\2d\n"+
		"\2\3\2\3\2\5\2h\n\2\5\2j\n\2\3\2\5\2m\n\2\3\2\3\2\5\2q\n\2\3\3\3\3\3\4"+
		"\5\4v\n\4\3\4\3\4\3\5\5\5{\n\5\3\5\3\5\3\6\5\6\u0080\n\6\3\6\3\6\3\7\5"+
		"\7\u0085\n\7\3\7\3\7\5\7\u0089\n\7\3\7\3\7\3\7\5\7\u008e\n\7\3\7\3\7\5"+
		"\7\u0092\n\7\3\b\3\b\3\b\5\b\u0097\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00a1\n\n\3\13\3\13\5\13\u00a5\n\13\3\13\5\13\u00a8\n\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\6\3\2\n\23\3\2\n\22\6\2\r\r\17\20\22\22\27\30\3\2\32!\2\u00ce"+
		"\2p\3\2\2\2\4r\3\2\2\2\6u\3\2\2\2\bz\3\2\2\2\n\177\3\2\2\2\f\u0091\3\2"+
		"\2\2\16\u0096\3\2\2\2\20\u0098\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2"+
		"\2\26\u00a9\3\2\2\2\30\u00ab\3\2\2\2\32\u00ad\3\2\2\2\34\u00af\3\2\2\2"+
		"\36#\7\4\2\2\37!\5\n\6\2 \"\7\"\2\2! \3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#\37"+
		"\3\2\2\2#$\3\2\2\2$)\3\2\2\2%\'\5\b\5\2&(\7\"\2\2\'&\3\2\2\2\'(\3\2\2"+
		"\2(*\3\2\2\2)%\3\2\2\2)*\3\2\2\2*/\3\2\2\2+-\5\6\4\2,.\7\"\2\2-,\3\2\2"+
		"\2-.\3\2\2\2.\60\3\2\2\2/+\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61q\5\f\7"+
		"\2\62\67\7\4\2\2\63\65\5\n\6\2\64\66\7\"\2\2\65\64\3\2\2\2\65\66\3\2\2"+
		"\2\668\3\2\2\2\67\63\3\2\2\2\678\3\2\2\28=\3\2\2\29;\5\b\5\2:<\7\"\2\2"+
		";:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=9\3\2\2\2=>\3\2\2\2>?\3\2\2\2?A\5\6\4\2"+
		"@B\7\"\2\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\5\f\7\2DC\3\2\2\2DE\3\2\2\2"+
		"Eq\3\2\2\2FK\7\4\2\2GI\5\n\6\2HJ\7\"\2\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2"+
		"KG\3\2\2\2KL\3\2\2\2LM\3\2\2\2MO\5\b\5\2NP\7\"\2\2ON\3\2\2\2OP\3\2\2\2"+
		"PU\3\2\2\2QS\5\6\4\2RT\7\"\2\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UQ\3\2\2\2"+
		"UV\3\2\2\2VX\3\2\2\2WY\5\f\7\2XW\3\2\2\2XY\3\2\2\2Yq\3\2\2\2Z[\7\4\2\2"+
		"[]\5\n\6\2\\^\7\"\2\2]\\\3\2\2\2]^\3\2\2\2^c\3\2\2\2_a\5\b\5\2`b\7\"\2"+
		"\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2c_\3\2\2\2cd\3\2\2\2di\3\2\2\2eg\5\6\4"+
		"\2fh\7\"\2\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ie\3\2\2\2ij\3\2\2\2jl\3\2\2"+
		"\2km\5\f\7\2lk\3\2\2\2lm\3\2\2\2mq\3\2\2\2no\7\4\2\2oq\7\t\2\2p\36\3\2"+
		"\2\2p\62\3\2\2\2pF\3\2\2\2pZ\3\2\2\2pn\3\2\2\2q\3\3\2\2\2rs\7\5\2\2s\5"+
		"\3\2\2\2tv\5\f\7\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\6\2\2x\7\3\2\2\2"+
		"y{\5\f\7\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\7\2\2}\t\3\2\2\2~\u0080\5"+
		"\f\7\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\7\b\2\2\u0082\13\3\2\2\2\u0083\u0085\5\26\f\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\5\4\3\2\u0087\u0089\7\""+
		"\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\5\16\b\2\u008b\u0092\3\2\2\2\u008c\u008e\5\26\f\2\u008d\u008c\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\5\4\3\2\u0090"+
		"\u0092\5\16\b\2\u0091\u0084\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u0090\3"+
		"\2\2\2\u0092\r\3\2\2\2\u0093\u0097\5\22\n\2\u0094\u0097\5\24\13\2\u0095"+
		"\u0097\5\20\t\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3"+
		"\2\2\2\u0097\17\3\2\2\2\u0098\u0099\t\2\2\2\u0099\21\3\2\2\2\u009a\u00a1"+
		"\7\24\2\2\u009b\u00a1\7\25\2\2\u009c\u00a1\7\26\2\2\u009d\u009e\5\32\16"+
		"\2\u009e\u009f\7\31\2\2\u009f\u00a1\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0"+
		"\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\23\3\2\2"+
		"\2\u00a2\u00a7\5\34\17\2\u00a3\u00a5\7\3\2\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\5\30\r\2\u00a7\u00a4\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\25\3\2\2\2\u00a9\u00aa\5\16\b\2\u00aa"+
		"\27\3\2\2\2\u00ab\u00ac\t\3\2\2\u00ac\31\3\2\2\2\u00ad\u00ae\t\4\2\2\u00ae"+
		"\33\3\2\2\2\u00af\u00b0\t\5\2\2\u00b0\35\3\2\2\2&!#\')-/\65\67;=ADIKO"+
		"SUX]acgilpuz\177\u0084\u0088\u008d\u0091\u0096\u00a0\u00a4\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}