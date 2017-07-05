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
	public static final int
		RULE_id = 0, RULE_program = 1, RULE_statement = 2, RULE_type = 3, RULE_primitiveType = 4, 
		RULE_expression = 5, RULE_num = 6, RULE_target = 7, RULE_prfOp = 8, RULE_multOp = 9, 
		RULE_plusOp = 10, RULE_boolOp = 11, RULE_compOp = 12, RULE_ngWrittenNumber = 13, 
		RULE_nghundred = 14, RULE_ngthousand = 15, RULE_ngmillion = 16, RULE_ngbillion = 17, 
		RULE_ngsingle = 18, RULE_ngonly = 19, RULE_ngsingles = 20, RULE_ngmain1 = 21, 
		RULE_ngmain2 = 22, RULE_nghprefix = 23, RULE_ngseconds = 24, RULE_ngfirst = 25, 
		RULE_ngdoubles = 26;
	public static final String[] ruleNames = {
		"id", "program", "statement", "type", "primitiveType", "expression", "num", 
		"target", "prfOp", "multOp", "plusOp", "boolOp", "compOp", "ngWrittenNumber", 
		"nghundred", "ngthousand", "ngmillion", "ngbillion", "ngsingle", "ngonly", 
		"ngsingles", "ngmain1", "ngmain2", "nghprefix", "ngseconds", "ngfirst", 
		"ngdoubles"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'{'", "'}'", "','", "'('", "')'", "'['", "']'", 
		"';'", null, "'_'"
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
	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> Letter() { return getTokens(MainGrammarParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(MainGrammarParser.Letter, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(MainGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MainGrammarParser.NUMBER, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(Letter);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					_la = _input.LA(1);
					if ( !(_la==Letter || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MainGrammarParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				statement();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Letter) | (1L << Var) | (1L << Integer) | (1L << Boolean) | (1L << IF) | (1L << WHILE) | (1L << BGN) | (1L << WS))) != 0) );
			setState(66);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssStatContext extends StatementContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public TerminalNode ASS() { return getToken(MainGrammarParser.ASS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EndStatement() { return getToken(MainGrammarParser.EndStatement, 0); }
		public AssStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterAssStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitAssStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitAssStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatContext extends StatementContext {
		public TerminalNode IF() { return getToken(MainGrammarParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public TerminalNode THEN() { return getToken(MainGrammarParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(MainGrammarParser.ELSE, 0); }
		public IfStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatContext extends StatementContext {
		public TerminalNode BGN() { return getToken(MainGrammarParser.BGN, 0); }
		public TerminalNode END() { return getToken(MainGrammarParser.END, 0); }
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitBlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitBlockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclStatContext extends StatementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EndStatement() { return getToken(MainGrammarParser.EndStatement, 0); }
		public TerminalNode Var() { return getToken(MainGrammarParser.Var, 0); }
		public TerminalNode ASS() { return getToken(MainGrammarParser.ASS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterDeclStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitDeclStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitDeclStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(MainGrammarParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public TerminalNode DO() { return getToken(MainGrammarParser.DO, 0); }
		public WhileStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new DeclStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(68);
					match(WS);
					}
				}

				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Var) {
					{
					setState(71);
					match(Var);
					setState(72);
					match(WS);
					}
				}

				setState(75);
				type();
				setState(76);
				match(WS);
				setState(77);
				id();
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(78);
					match(WS);
					setState(79);
					match(ASS);
					setState(80);
					match(WS);
					setState(81);
					expression(0);
					}
					break;
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(84);
					match(WS);
					}
				}

				setState(87);
				match(EndStatement);
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(88);
					match(WS);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AssStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(91);
					match(WS);
					}
				}

				setState(94);
				target();
				setState(95);
				match(WS);
				setState(96);
				match(ASS);
				setState(97);
				match(WS);
				setState(98);
				expression(0);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(99);
					match(WS);
					}
				}

				setState(102);
				match(EndStatement);
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(103);
					match(WS);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(106);
					match(WS);
					}
				}

				setState(109);
				match(IF);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(110);
					match(WS);
					}
				}

				setState(113);
				expression(0);
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(114);
					match(WS);
					}
					break;
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(117);
					match(THEN);
					}
				}

				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(120);
					match(WS);
					}
					break;
				}
				setState(123);
				statement();
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(124);
						match(WS);
						}
					}

					setState(127);
					match(ELSE);
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(128);
						match(WS);
						}
						break;
					}
					setState(131);
					statement();
					}
					break;
				}
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(134);
					match(WS);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(137);
					match(WS);
					}
				}

				setState(140);
				match(WHILE);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(141);
					match(WS);
					}
				}

				setState(144);
				expression(0);
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(145);
					match(WS);
					}
					break;
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DO) {
					{
					setState(148);
					match(DO);
					}
				}

				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(151);
					match(WS);
					}
					break;
				}
				setState(154);
				statement();
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(155);
					match(WS);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new BlockStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(158);
					match(WS);
					}
				}

				setState(161);
				match(BGN);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(162);
					match(WS);
					}
					break;
				}
				setState(166); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(165);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(168); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(170);
					match(WS);
					}
				}

				setState(173);
				match(END);
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(174);
					match(WS);
					}
					break;
				}
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			primitiveType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(MainGrammarParser.Integer, 0); }
		public TerminalNode Boolean() { return getToken(MainGrammarParser.Boolean, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==Integer || _la==Boolean) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends ExpressionContext {
		public TerminalNode LPAR() { return getToken(MainGrammarParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MainGrammarParser.RPAR, 0); }
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public ParExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OpenArray() { return getToken(MainGrammarParser.OpenArray, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseArray() { return getToken(MainGrammarParser.CloseArray, 0); }
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public ArrayExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExprContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(MainGrammarParser.TRUE, 0); }
		public TrueExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public CompExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrfExprContext extends ExpressionContext {
		public PrfOpContext prfOp() {
			return getRuleContext(PrfOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WS() { return getToken(MainGrammarParser.WS, 0); }
		public PrfExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterPrfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitPrfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitPrfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExprContext extends ExpressionContext {
		public TerminalNode FALSE() { return getToken(MainGrammarParser.FALSE, 0); }
		public FalseExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public BoolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public MultExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExpressionContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NumExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlusOpContext plusOp() {
			return getRuleContext(PlusOpContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public PlusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExpressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
			case Not:
				{
				_localctx = new PrfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184);
				prfOp();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(185);
					match(WS);
					}
				}

				setState(188);
				expression(11);
				}
				break;
			case LPAR:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(LPAR);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(191);
					match(WS);
					}
				}

				setState(194);
				expression(0);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(195);
					match(WS);
					}
				}

				setState(198);
				match(RPAR);
				}
				break;
			case Letter:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				id();
				}
				break;
			case NUMBER:
			case NGUnderscore:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				num();
				}
				break;
			case Integer:
			case Boolean:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				type();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(203);
					match(WS);
					}
				}

				setState(206);
				match(OpenArray);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(207);
					match(WS);
					}
				}

				setState(210);
				expression(0);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(211);
					match(WS);
					}
				}

				setState(214);
				match(CloseArray);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(221);
							match(WS);
							}
						}

						setState(224);
						multOp();
						setState(226);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(225);
							match(WS);
							}
						}

						setState(228);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new PlusExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(232);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(231);
							match(WS);
							}
						}

						setState(234);
						plusOp();
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(235);
							match(WS);
							}
						}

						setState(238);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new BoolExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(242);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(241);
							match(WS);
							}
						}

						setState(244);
						boolOp();
						setState(246);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(245);
							match(WS);
							}
						}

						setState(248);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new CompExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(252);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(251);
							match(WS);
							}
						}

						setState(254);
						compOp();
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(255);
							match(WS);
							}
						}

						setState(258);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public NgWrittenNumberContext ngWrittenNumber() {
			return getRuleContext(NgWrittenNumberContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(MainGrammarParser.NUMBER, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_num);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NGUnderscore:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				ngWrittenNumber();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(NUMBER);
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

	public static class TargetContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			id();
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

	public static class PrfOpContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(MainGrammarParser.Minus, 0); }
		public TerminalNode Not() { return getToken(MainGrammarParser.Not, 0); }
		public PrfOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prfOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterPrfOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitPrfOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitPrfOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrfOpContext prfOp() throws RecognitionException {
		PrfOpContext _localctx = new PrfOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prfOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==Minus || _la==Not) ) {
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

	public static class MultOpContext extends ParserRuleContext {
		public TerminalNode Mult() { return getToken(MainGrammarParser.Mult, 0); }
		public TerminalNode Div() { return getToken(MainGrammarParser.Div, 0); }
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitMultOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==Mult || _la==Div) ) {
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

	public static class PlusOpContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(MainGrammarParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(MainGrammarParser.Minus, 0); }
		public PlusOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterPlusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitPlusOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitPlusOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusOpContext plusOp() throws RecognitionException {
		PlusOpContext _localctx = new PlusOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_plusOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==Minus || _la==Plus) ) {
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

	public static class BoolOpContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(MainGrammarParser.And, 0); }
		public TerminalNode Or() { return getToken(MainGrammarParser.Or, 0); }
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Or) ) {
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

	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(MainGrammarParser.EQ, 0); }
		public TerminalNode LT() { return getToken(MainGrammarParser.LT, 0); }
		public TerminalNode LE() { return getToken(MainGrammarParser.LE, 0); }
		public TerminalNode NE() { return getToken(MainGrammarParser.NE, 0); }
		public TerminalNode GT() { return getToken(MainGrammarParser.GT, 0); }
		public TerminalNode GE() { return getToken(MainGrammarParser.GE, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << NE))) != 0)) ) {
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

	public static class NgWrittenNumberContext extends ParserRuleContext {
		public TerminalNode NGUnderscore() { return getToken(MainGrammarParser.NGUnderscore, 0); }
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
		public List<TerminalNode> NGAnd() { return getTokens(MainGrammarParser.NGAnd); }
		public TerminalNode NGAnd(int i) {
			return getToken(MainGrammarParser.NGAnd, i);
		}
		public TerminalNode NGZero() { return getToken(MainGrammarParser.NGZero, 0); }
		public NgWrittenNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngWrittenNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgWrittenNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgWrittenNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgWrittenNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgWrittenNumberContext ngWrittenNumber() throws RecognitionException {
		NgWrittenNumberContext _localctx = new NgWrittenNumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ngWrittenNumber);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(NGUnderscore);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(282);
					ngbillion();
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(283);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(288);
					ngmillion();
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(289);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(294);
					ngthousand();
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(295);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(300);
				ngsingle();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(NGUnderscore);
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(302);
					ngbillion();
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(303);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(308);
					ngmillion();
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(309);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(314);
				ngthousand();
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(315);
					match(NGAnd);
					}
					break;
				}
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(318);
					ngsingle();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(NGUnderscore);
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(322);
					ngbillion();
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(323);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(328);
				ngmillion();
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(329);
					match(NGAnd);
					}
					break;
				}
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(332);
					ngthousand();
					setState(334);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(333);
						match(NGAnd);
						}
						break;
					}
					}
					break;
				}
				setState(339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(338);
					ngsingle();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				match(NGUnderscore);
				setState(342);
				ngbillion();
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(343);
					match(NGAnd);
					}
					break;
				}
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(346);
					ngmillion();
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(347);
						match(NGAnd);
						}
						break;
					}
					}
					break;
				}
				setState(356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(352);
					ngthousand();
					setState(354);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(353);
						match(NGAnd);
						}
						break;
					}
					}
					break;
				}
				setState(359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(358);
					ngsingle();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				match(NGUnderscore);
				setState(362);
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
		public TerminalNode NGHundred() { return getToken(MainGrammarParser.NGHundred, 0); }
		public NghundredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nghundred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNghundred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNghundred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNghundred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NghundredContext nghundred() throws RecognitionException {
		NghundredContext _localctx = new NghundredContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nghundred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		public TerminalNode NGThousand() { return getToken(MainGrammarParser.NGThousand, 0); }
		public NgsingleContext ngsingle() {
			return getRuleContext(NgsingleContext.class,0);
		}
		public NgthousandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngthousand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgthousand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgthousand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgthousand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgthousandContext ngthousand() throws RecognitionException {
		NgthousandContext _localctx = new NgthousandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ngthousand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (NGHundred - 38)) | (1L << (NGOne - 38)) | (1L << (NGTwo - 38)) | (1L << (NGThree - 38)) | (1L << (NGFour - 38)) | (1L << (NGFive - 38)) | (1L << (NGSix - 38)) | (1L << (NGSeven - 38)) | (1L << (NGEight - 38)) | (1L << (NGNine - 38)) | (1L << (NGTen - 38)) | (1L << (NGEleven - 38)) | (1L << (NGTwelve - 38)) | (1L << (NGEighteen - 38)) | (1L << (NGThir - 38)) | (1L << (NGFif - 38)) | (1L << (NGTwenty - 38)) | (1L << (NGThirty - 38)) | (1L << (NGForty - 38)) | (1L << (NGFifty - 38)) | (1L << (NGSixty - 38)) | (1L << (NGSeventy - 38)) | (1L << (NGEighty - 38)) | (1L << (NGNinety - 38)))) != 0)) {
				{
				setState(367);
				ngsingle();
				}
			}

			setState(370);
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
		public TerminalNode NGMillion() { return getToken(MainGrammarParser.NGMillion, 0); }
		public NgsingleContext ngsingle() {
			return getRuleContext(NgsingleContext.class,0);
		}
		public NgmillionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngmillion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgmillion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgmillion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgmillion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgmillionContext ngmillion() throws RecognitionException {
		NgmillionContext _localctx = new NgmillionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ngmillion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (NGHundred - 38)) | (1L << (NGOne - 38)) | (1L << (NGTwo - 38)) | (1L << (NGThree - 38)) | (1L << (NGFour - 38)) | (1L << (NGFive - 38)) | (1L << (NGSix - 38)) | (1L << (NGSeven - 38)) | (1L << (NGEight - 38)) | (1L << (NGNine - 38)) | (1L << (NGTen - 38)) | (1L << (NGEleven - 38)) | (1L << (NGTwelve - 38)) | (1L << (NGEighteen - 38)) | (1L << (NGThir - 38)) | (1L << (NGFif - 38)) | (1L << (NGTwenty - 38)) | (1L << (NGThirty - 38)) | (1L << (NGForty - 38)) | (1L << (NGFifty - 38)) | (1L << (NGSixty - 38)) | (1L << (NGSeventy - 38)) | (1L << (NGEighty - 38)) | (1L << (NGNinety - 38)))) != 0)) {
				{
				setState(372);
				ngsingle();
				}
			}

			setState(375);
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
		public TerminalNode NGBillion() { return getToken(MainGrammarParser.NGBillion, 0); }
		public NgsingleContext ngsingle() {
			return getRuleContext(NgsingleContext.class,0);
		}
		public NgbillionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngbillion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgbillion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgbillion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgbillion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgbillionContext ngbillion() throws RecognitionException {
		NgbillionContext _localctx = new NgbillionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ngbillion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (NGHundred - 38)) | (1L << (NGOne - 38)) | (1L << (NGTwo - 38)) | (1L << (NGThree - 38)) | (1L << (NGFour - 38)) | (1L << (NGFive - 38)) | (1L << (NGSix - 38)) | (1L << (NGSeven - 38)) | (1L << (NGEight - 38)) | (1L << (NGNine - 38)) | (1L << (NGTen - 38)) | (1L << (NGEleven - 38)) | (1L << (NGTwelve - 38)) | (1L << (NGEighteen - 38)) | (1L << (NGThir - 38)) | (1L << (NGFif - 38)) | (1L << (NGTwenty - 38)) | (1L << (NGThirty - 38)) | (1L << (NGForty - 38)) | (1L << (NGFifty - 38)) | (1L << (NGSixty - 38)) | (1L << (NGSeventy - 38)) | (1L << (NGEighty - 38)) | (1L << (NGNinety - 38)))) != 0)) {
				{
				setState(377);
				ngsingle();
				}
			}

			setState(380);
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
		public TerminalNode NGAnd() { return getToken(MainGrammarParser.NGAnd, 0); }
		public NgsingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngsingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgsingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgsingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgsingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgsingleContext ngsingle() throws RecognitionException {
		NgsingleContext _localctx = new NgsingleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ngsingle);
		int _la;
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (NGOne - 43)) | (1L << (NGTwo - 43)) | (1L << (NGThree - 43)) | (1L << (NGFour - 43)) | (1L << (NGFive - 43)) | (1L << (NGSix - 43)) | (1L << (NGSeven - 43)) | (1L << (NGEight - 43)) | (1L << (NGNine - 43)) | (1L << (NGTen - 43)) | (1L << (NGEleven - 43)) | (1L << (NGTwelve - 43)) | (1L << (NGEighteen - 43)) | (1L << (NGThir - 43)) | (1L << (NGFif - 43)) | (1L << (NGTwenty - 43)) | (1L << (NGThirty - 43)) | (1L << (NGForty - 43)) | (1L << (NGFifty - 43)) | (1L << (NGSixty - 43)) | (1L << (NGSeventy - 43)) | (1L << (NGEighty - 43)) | (1L << (NGNinety - 43)))) != 0)) {
					{
					setState(382);
					nghprefix();
					}
				}

				setState(385);
				nghundred();
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NGAnd) {
					{
					setState(386);
					match(NGAnd);
					}
				}

				setState(389);
				ngonly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (NGOne - 43)) | (1L << (NGTwo - 43)) | (1L << (NGThree - 43)) | (1L << (NGFour - 43)) | (1L << (NGFive - 43)) | (1L << (NGSix - 43)) | (1L << (NGSeven - 43)) | (1L << (NGEight - 43)) | (1L << (NGNine - 43)) | (1L << (NGTen - 43)) | (1L << (NGEleven - 43)) | (1L << (NGTwelve - 43)) | (1L << (NGEighteen - 43)) | (1L << (NGThir - 43)) | (1L << (NGFif - 43)) | (1L << (NGTwenty - 43)) | (1L << (NGThirty - 43)) | (1L << (NGForty - 43)) | (1L << (NGFifty - 43)) | (1L << (NGSixty - 43)) | (1L << (NGSeventy - 43)) | (1L << (NGEighty - 43)) | (1L << (NGNinety - 43)))) != 0)) {
					{
					setState(391);
					nghprefix();
					}
				}

				setState(394);
				nghundred();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
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
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgonly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgonly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgonly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgonlyContext ngonly() throws RecognitionException {
		NgonlyContext _localctx = new NgonlyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ngonly);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				ngmain1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				ngmain2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
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
		public TerminalNode NGOne() { return getToken(MainGrammarParser.NGOne, 0); }
		public TerminalNode NGTwo() { return getToken(MainGrammarParser.NGTwo, 0); }
		public TerminalNode NGThree() { return getToken(MainGrammarParser.NGThree, 0); }
		public TerminalNode NGFour() { return getToken(MainGrammarParser.NGFour, 0); }
		public TerminalNode NGFive() { return getToken(MainGrammarParser.NGFive, 0); }
		public TerminalNode NGSix() { return getToken(MainGrammarParser.NGSix, 0); }
		public TerminalNode NGSeven() { return getToken(MainGrammarParser.NGSeven, 0); }
		public TerminalNode NGEight() { return getToken(MainGrammarParser.NGEight, 0); }
		public TerminalNode NGNine() { return getToken(MainGrammarParser.NGNine, 0); }
		public TerminalNode NGTen() { return getToken(MainGrammarParser.NGTen, 0); }
		public NgsinglesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngsingles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgsingles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgsingles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgsingles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgsinglesContext ngsingles() throws RecognitionException {
		NgsinglesContext _localctx = new NgsinglesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ngsingles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		public TerminalNode NGEleven() { return getToken(MainGrammarParser.NGEleven, 0); }
		public TerminalNode NGTwelve() { return getToken(MainGrammarParser.NGTwelve, 0); }
		public TerminalNode NGEighteen() { return getToken(MainGrammarParser.NGEighteen, 0); }
		public NgfirstContext ngfirst() {
			return getRuleContext(NgfirstContext.class,0);
		}
		public TerminalNode NGTeen() { return getToken(MainGrammarParser.NGTeen, 0); }
		public Ngmain1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngmain1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgmain1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgmain1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgmain1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ngmain1Context ngmain1() throws RecognitionException {
		Ngmain1Context _localctx = new Ngmain1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_ngmain1);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NGEleven:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(NGEleven);
				}
				break;
			case NGTwelve:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(NGTwelve);
				}
				break;
			case NGEighteen:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
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
				setState(408);
				ngfirst();
				setState(409);
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
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgmain2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgmain2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgmain2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ngmain2Context ngmain2() throws RecognitionException {
		Ngmain2Context _localctx = new Ngmain2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_ngmain2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			ngdoubles();
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(414);
					match(T__0);
					}
				}

				setState(417);
				ngseconds();
				}
				break;
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
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNghprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNghprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNghprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NghprefixContext nghprefix() throws RecognitionException {
		NghprefixContext _localctx = new NghprefixContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nghprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
		public TerminalNode NGOne() { return getToken(MainGrammarParser.NGOne, 0); }
		public TerminalNode NGTwo() { return getToken(MainGrammarParser.NGTwo, 0); }
		public TerminalNode NGThree() { return getToken(MainGrammarParser.NGThree, 0); }
		public TerminalNode NGFour() { return getToken(MainGrammarParser.NGFour, 0); }
		public TerminalNode NGFive() { return getToken(MainGrammarParser.NGFive, 0); }
		public TerminalNode NGSix() { return getToken(MainGrammarParser.NGSix, 0); }
		public TerminalNode NGSeven() { return getToken(MainGrammarParser.NGSeven, 0); }
		public TerminalNode NGEight() { return getToken(MainGrammarParser.NGEight, 0); }
		public TerminalNode NGNine() { return getToken(MainGrammarParser.NGNine, 0); }
		public NgsecondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngseconds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgseconds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgseconds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgseconds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgsecondsContext ngseconds() throws RecognitionException {
		NgsecondsContext _localctx = new NgsecondsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ngseconds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		public TerminalNode NGThir() { return getToken(MainGrammarParser.NGThir, 0); }
		public TerminalNode NGFour() { return getToken(MainGrammarParser.NGFour, 0); }
		public TerminalNode NGFif() { return getToken(MainGrammarParser.NGFif, 0); }
		public TerminalNode NGSix() { return getToken(MainGrammarParser.NGSix, 0); }
		public TerminalNode NGSeven() { return getToken(MainGrammarParser.NGSeven, 0); }
		public TerminalNode NGNine() { return getToken(MainGrammarParser.NGNine, 0); }
		public NgfirstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngfirst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgfirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgfirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgfirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgfirstContext ngfirst() throws RecognitionException {
		NgfirstContext _localctx = new NgfirstContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ngfirst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		public TerminalNode NGTwenty() { return getToken(MainGrammarParser.NGTwenty, 0); }
		public TerminalNode NGThirty() { return getToken(MainGrammarParser.NGThirty, 0); }
		public TerminalNode NGForty() { return getToken(MainGrammarParser.NGForty, 0); }
		public TerminalNode NGFifty() { return getToken(MainGrammarParser.NGFifty, 0); }
		public TerminalNode NGSixty() { return getToken(MainGrammarParser.NGSixty, 0); }
		public TerminalNode NGSeventy() { return getToken(MainGrammarParser.NGSeventy, 0); }
		public TerminalNode NGEighty() { return getToken(MainGrammarParser.NGEighty, 0); }
		public TerminalNode NGNinety() { return getToken(MainGrammarParser.NGNinety, 0); }
		public NgdoublesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngdoubles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterNgdoubles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitNgdoubles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitNgdoubles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgdoublesContext ngdoubles() throws RecognitionException {
		NgdoublesContext _localctx = new NgdoublesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ngdoubles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (NGTwenty - 59)) | (1L << (NGThirty - 59)) | (1L << (NGForty - 59)) | (1L << (NGFifty - 59)) | (1L << (NGSixty - 59)) | (1L << (NGSeventy - 59)) | (1L << (NGEighty - 59)) | (1L << (NGNinety - 59)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u01af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\3\6\3"+
		"A\n\3\r\3\16\3B\3\3\3\3\3\4\5\4H\n\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4U\n\4\3\4\5\4X\n\4\3\4\3\4\5\4\\\n\4\3\4\5\4_\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4g\n\4\3\4\3\4\5\4k\n\4\3\4\5\4n\n\4\3\4\3\4\5"+
		"\4r\n\4\3\4\3\4\5\4v\n\4\3\4\5\4y\n\4\3\4\5\4|\n\4\3\4\3\4\5\4\u0080\n"+
		"\4\3\4\3\4\5\4\u0084\n\4\3\4\5\4\u0087\n\4\3\4\5\4\u008a\n\4\3\4\5\4\u008d"+
		"\n\4\3\4\3\4\5\4\u0091\n\4\3\4\3\4\5\4\u0095\n\4\3\4\5\4\u0098\n\4\3\4"+
		"\5\4\u009b\n\4\3\4\3\4\5\4\u009f\n\4\3\4\5\4\u00a2\n\4\3\4\3\4\5\4\u00a6"+
		"\n\4\3\4\6\4\u00a9\n\4\r\4\16\4\u00aa\3\4\5\4\u00ae\n\4\3\4\3\4\5\4\u00b2"+
		"\n\4\5\4\u00b4\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u00bd\n\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00c3\n\7\3\7\3\7\5\7\u00c7\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00cf\n\7\3\7\3\7\5\7\u00d3\n\7\3\7\3\7\5\7\u00d7\n\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00dd\n\7\3\7\3\7\5\7\u00e1\n\7\3\7\3\7\5\7\u00e5\n\7\3\7\3\7\3\7"+
		"\3\7\5\7\u00eb\n\7\3\7\3\7\5\7\u00ef\n\7\3\7\3\7\3\7\3\7\5\7\u00f5\n\7"+
		"\3\7\3\7\5\7\u00f9\n\7\3\7\3\7\3\7\3\7\5\7\u00ff\n\7\3\7\3\7\5\7\u0103"+
		"\n\7\3\7\3\7\7\7\u0107\n\7\f\7\16\7\u010a\13\7\3\b\3\b\5\b\u010e\n\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17"+
		"\u011f\n\17\5\17\u0121\n\17\3\17\3\17\5\17\u0125\n\17\5\17\u0127\n\17"+
		"\3\17\3\17\5\17\u012b\n\17\5\17\u012d\n\17\3\17\3\17\3\17\3\17\5\17\u0133"+
		"\n\17\5\17\u0135\n\17\3\17\3\17\5\17\u0139\n\17\5\17\u013b\n\17\3\17\3"+
		"\17\5\17\u013f\n\17\3\17\5\17\u0142\n\17\3\17\3\17\3\17\5\17\u0147\n\17"+
		"\5\17\u0149\n\17\3\17\3\17\5\17\u014d\n\17\3\17\3\17\5\17\u0151\n\17\5"+
		"\17\u0153\n\17\3\17\5\17\u0156\n\17\3\17\3\17\3\17\5\17\u015b\n\17\3\17"+
		"\3\17\5\17\u015f\n\17\5\17\u0161\n\17\3\17\3\17\5\17\u0165\n\17\5\17\u0167"+
		"\n\17\3\17\5\17\u016a\n\17\3\17\3\17\5\17\u016e\n\17\3\20\3\20\3\21\5"+
		"\21\u0173\n\21\3\21\3\21\3\22\5\22\u0178\n\22\3\22\3\22\3\23\5\23\u017d"+
		"\n\23\3\23\3\23\3\24\5\24\u0182\n\24\3\24\3\24\5\24\u0186\n\24\3\24\3"+
		"\24\3\24\5\24\u018b\n\24\3\24\3\24\5\24\u018f\n\24\3\25\3\25\3\25\5\25"+
		"\u0194\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u019e\n\27\3"+
		"\30\3\30\5\30\u01a2\n\30\3\30\5\30\u01a5\n\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\2\3\f\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\66\2\r\4\2\4\4\b\b\3\2\6\7\3\2\t\n\3\2\13\f\4\2\t\t"+
		"\r\r\3\2\16\17\3\2\20\25\3\2-\66\3\2-\65\6\2\60\60\62\63\65\65:;\3\2="+
		"D\2\u01f9\28\3\2\2\2\4@\3\2\2\2\6\u00b3\3\2\2\2\b\u00b5\3\2\2\2\n\u00b7"+
		"\3\2\2\2\f\u00dc\3\2\2\2\16\u010d\3\2\2\2\20\u010f\3\2\2\2\22\u0111\3"+
		"\2\2\2\24\u0113\3\2\2\2\26\u0115\3\2\2\2\30\u0117\3\2\2\2\32\u0119\3\2"+
		"\2\2\34\u016d\3\2\2\2\36\u016f\3\2\2\2 \u0172\3\2\2\2\"\u0177\3\2\2\2"+
		"$\u017c\3\2\2\2&\u018e\3\2\2\2(\u0193\3\2\2\2*\u0195\3\2\2\2,\u019d\3"+
		"\2\2\2.\u019f\3\2\2\2\60\u01a6\3\2\2\2\62\u01a8\3\2\2\2\64\u01aa\3\2\2"+
		"\2\66\u01ac\3\2\2\28<\7\4\2\29;\t\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2"+
		"<=\3\2\2\2=\3\3\2\2\2><\3\2\2\2?A\5\6\4\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2"+
		"\2BC\3\2\2\2CD\3\2\2\2DE\7\2\2\3E\5\3\2\2\2FH\7&\2\2GF\3\2\2\2GH\3\2\2"+
		"\2HK\3\2\2\2IJ\7\5\2\2JL\7&\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\5\b\5"+
		"\2NO\7&\2\2OT\5\2\2\2PQ\7&\2\2QR\7\33\2\2RS\7&\2\2SU\5\f\7\2TP\3\2\2\2"+
		"TU\3\2\2\2UW\3\2\2\2VX\7&\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y[\7%\2\2Z"+
		"\\\7&\2\2[Z\3\2\2\2[\\\3\2\2\2\\\u00b4\3\2\2\2]_\7&\2\2^]\3\2\2\2^_\3"+
		"\2\2\2_`\3\2\2\2`a\5\20\t\2ab\7&\2\2bc\7\33\2\2cd\7&\2\2df\5\f\7\2eg\7"+
		"&\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hj\7%\2\2ik\7&\2\2ji\3\2\2\2jk\3\2"+
		"\2\2k\u00b4\3\2\2\2ln\7&\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2oq\7\26\2\2"+
		"pr\7&\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\5\f\7\2tv\7&\2\2ut\3\2\2\2u"+
		"v\3\2\2\2vx\3\2\2\2wy\7\27\2\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\7&\2\2"+
		"{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0086\5\6\4\2~\u0080\7&\2\2\177~\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\7\30\2\2\u0082\u0084"+
		"\7&\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\5\6\4\2\u0086\177\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2"+
		"\2\u0088\u008a\7&\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u00b4"+
		"\3\2\2\2\u008b\u008d\7&\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\7\31\2\2\u008f\u0091\7&\2\2\u0090\u008f\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\5\f\7\2\u0093"+
		"\u0095\7&\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0098\7\32\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u009b\7&\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\5\6\4\2\u009d\u009f\7&\2\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00b4\3\2\2\2\u00a0\u00a2\7&"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\7\36\2\2\u00a4\u00a6\7&\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\5\6\4\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00ae\7&\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\7\37\2\2\u00b0\u00b2\7&\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3G\3\2\2\2\u00b3^\3\2"+
		"\2\2\u00b3m\3\2\2\2\u00b3\u008c\3\2\2\2\u00b3\u00a1\3\2\2\2\u00b4\7\3"+
		"\2\2\2\u00b5\u00b6\5\n\6\2\u00b6\t\3\2\2\2\u00b7\u00b8\t\3\2\2\u00b8\13"+
		"\3\2\2\2\u00b9\u00ba\b\7\1\2\u00ba\u00bc\5\22\n\2\u00bb\u00bd\7&\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\5\f"+
		"\7\r\u00bf\u00dd\3\2\2\2\u00c0\u00c2\7!\2\2\u00c1\u00c3\7&\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\5\f\7\2\u00c5"+
		"\u00c7\7&\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00dd\3\2\2\2\u00ca\u00dd\5\2\2\2\u00cb"+
		"\u00dd\5\16\b\2\u00cc\u00ce\5\b\5\2\u00cd\u00cf\7&\2\2\u00ce\u00cd\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\7#\2\2\u00d1"+
		"\u00d3\7&\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d6\5\f\7\2\u00d5\u00d7\7&\2\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7$\2\2\u00d9\u00dd\3\2"+
		"\2\2\u00da\u00dd\7\34\2\2\u00db\u00dd\7\35\2\2\u00dc\u00b9\3\2\2\2\u00dc"+
		"\u00c0\3\2\2\2\u00dc\u00ca\3\2\2\2\u00dc\u00cb\3\2\2\2\u00dc\u00cc\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u0108\3\2\2\2\u00de"+
		"\u00e0\f\f\2\2\u00df\u00e1\7&\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\5\24\13\2\u00e3\u00e5\7&\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\5\f"+
		"\7\r\u00e7\u0107\3\2\2\2\u00e8\u00ea\f\13\2\2\u00e9\u00eb\7&\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\5\26"+
		"\f\2\u00ed\u00ef\7&\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\5\f\7\f\u00f1\u0107\3\2\2\2\u00f2\u00f4\f\n"+
		"\2\2\u00f3\u00f5\7&\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f8\5\30\r\2\u00f7\u00f9\7&\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\5\f\7\13\u00fb"+
		"\u0107\3\2\2\2\u00fc\u00fe\f\t\2\2\u00fd\u00ff\7&\2\2\u00fe\u00fd\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\5\32\16\2\u0101"+
		"\u0103\7&\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\5\f\7\n\u0105\u0107\3\2\2\2\u0106\u00de\3\2\2\2\u0106"+
		"\u00e8\3\2\2\2\u0106\u00f2\3\2\2\2\u0106\u00fc\3\2\2\2\u0107\u010a\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\r\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010e\5\34\17\2\u010c\u010e\7\b\2\2\u010d\u010b\3\2\2\2"+
		"\u010d\u010c\3\2\2\2\u010e\17\3\2\2\2\u010f\u0110\5\2\2\2\u0110\21\3\2"+
		"\2\2\u0111\u0112\t\4\2\2\u0112\23\3\2\2\2\u0113\u0114\t\5\2\2\u0114\25"+
		"\3\2\2\2\u0115\u0116\t\6\2\2\u0116\27\3\2\2\2\u0117\u0118\t\7\2\2\u0118"+
		"\31\3\2\2\2\u0119\u011a\t\b\2\2\u011a\33\3\2\2\2\u011b\u0120\7\'\2\2\u011c"+
		"\u011e\5$\23\2\u011d\u011f\7E\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0126\3\2\2\2\u0122\u0124\5\"\22\2\u0123\u0125\7E\2\2\u0124\u0123\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0122\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u012c\3\2\2\2\u0128\u012a\5 \21\2\u0129\u012b\7E"+
		"\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u0128\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u016e\5&"+
		"\24\2\u012f\u0134\7\'\2\2\u0130\u0132\5$\23\2\u0131\u0133\7E\2\2\u0132"+
		"\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0130\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u013a\3\2\2\2\u0136\u0138\5\"\22\2\u0137"+
		"\u0139\7E\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u0136\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\5 \21\2\u013d\u013f\7E\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u0142\5&\24\2\u0141\u0140\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u016e\3\2\2\2\u0143\u0148\7\'\2\2\u0144\u0146\5$"+
		"\23\2\u0145\u0147\7E\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014c\5\"\22\2\u014b\u014d\7E\2\2\u014c\u014b\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u0152\3\2\2\2\u014e\u0150\5 \21\2\u014f\u0151\7E"+
		"\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u014e\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156\5&"+
		"\24\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u016e\3\2\2\2\u0157"+
		"\u0158\7\'\2\2\u0158\u015a\5$\23\2\u0159\u015b\7E\2\2\u015a\u0159\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u0160\3\2\2\2\u015c\u015e\5\"\22\2\u015d"+
		"\u015f\7E\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015c\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0166\3\2\2\2\u0162"+
		"\u0164\5 \21\2\u0163\u0165\7E\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0167\3\2\2\2\u0166\u0162\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u016a\5&\24\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016e\3\2\2\2\u016b\u016c\7\'\2\2\u016c\u016e\7,\2\2\u016d"+
		"\u011b\3\2\2\2\u016d\u012f\3\2\2\2\u016d\u0143\3\2\2\2\u016d\u0157\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016e\35\3\2\2\2\u016f\u0170\7(\2\2\u0170\37"+
		"\3\2\2\2\u0171\u0173\5&\24\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\7)\2\2\u0175!\3\2\2\2\u0176\u0178\5&\24\2\u0177"+
		"\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7*"+
		"\2\2\u017a#\3\2\2\2\u017b\u017d\5&\24\2\u017c\u017b\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7+\2\2\u017f%\3\2\2\2\u0180\u0182"+
		"\5\60\31\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2"+
		"\u0183\u0185\5\36\20\2\u0184\u0186\7E\2\2\u0185\u0184\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\5(\25\2\u0188\u018f\3\2\2\2\u0189"+
		"\u018b\5\60\31\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3"+
		"\2\2\2\u018c\u018f\5\36\20\2\u018d\u018f\5(\25\2\u018e\u0181\3\2\2\2\u018e"+
		"\u018a\3\2\2\2\u018e\u018d\3\2\2\2\u018f\'\3\2\2\2\u0190\u0194\5,\27\2"+
		"\u0191\u0194\5.\30\2\u0192\u0194\5*\26\2\u0193\u0190\3\2\2\2\u0193\u0191"+
		"\3\2\2\2\u0193\u0192\3\2\2\2\u0194)\3\2\2\2\u0195\u0196\t\t\2\2\u0196"+
		"+\3\2\2\2\u0197\u019e\7\67\2\2\u0198\u019e\78\2\2\u0199\u019e\79\2\2\u019a"+
		"\u019b\5\64\33\2\u019b\u019c\7<\2\2\u019c\u019e\3\2\2\2\u019d\u0197\3"+
		"\2\2\2\u019d\u0198\3\2\2\2\u019d\u0199\3\2\2\2\u019d\u019a\3\2\2\2\u019e"+
		"-\3\2\2\2\u019f\u01a4\5\66\34\2\u01a0\u01a2\7\3\2\2\u01a1\u01a0\3\2\2"+
		"\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\5\62\32\2\u01a4"+
		"\u01a1\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5/\3\2\2\2\u01a6\u01a7\5(\25\2"+
		"\u01a7\61\3\2\2\2\u01a8\u01a9\t\n\2\2\u01a9\63\3\2\2\2\u01aa\u01ab\t\13"+
		"\2\2\u01ab\65\3\2\2\2\u01ac\u01ad\t\f\2\2\u01ad\67\3\2\2\2W<BGKTW[^fj"+
		"mqux{\177\u0083\u0086\u0089\u008c\u0090\u0094\u0097\u009a\u009e\u00a1"+
		"\u00a5\u00aa\u00ad\u00b1\u00b3\u00bc\u00c2\u00c6\u00ce\u00d2\u00d6\u00dc"+
		"\u00e0\u00e4\u00ea\u00ee\u00f4\u00f8\u00fe\u0102\u0106\u0108\u010d\u011e"+
		"\u0120\u0124\u0126\u012a\u012c\u0132\u0134\u0138\u013a\u013e\u0141\u0146"+
		"\u0148\u014c\u0150\u0152\u0155\u015a\u015e\u0160\u0164\u0166\u0169\u016d"+
		"\u0172\u0177\u017c\u0181\u0185\u018a\u018e\u0193\u019d\u01a1\u01a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}