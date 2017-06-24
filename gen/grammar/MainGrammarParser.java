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
		T__0=1, Var=2, Integer=3, Boolean=4, NUMBER=5, Minus=6, Not=7, Mult=8, 
		Div=9, Plus=10, And=11, Or=12, EQ=13, GT=14, GE=15, LT=16, LE=17, NE=18, 
		IF=19, THEN=20, ELSE=21, WHILE=22, DO=23, ASS=24, TRUE=25, FALSE=26, BGN=27, 
		END=28, SEMI=29, LPAR=30, RPAR=31, OpenArray=32, CloseArray=33, EndStatement=34, 
		Letter=35, IDNum=36, WS=37, NGHundred=38, NGThousand=39, NGMillion=40, 
		NGBillion=41, NGZero=42, NGOne=43, NGTwo=44, NGThree=45, NGFour=46, NGFive=47, 
		NGSix=48, NGSeven=49, NGEight=50, NGNine=51, NGTen=52, NGEleven=53, NGTwelve=54, 
		NGEighteen=55, NGThir=56, NGFif=57, NGTeen=58, NGTwenty=59, NGThirty=60, 
		NGForty=61, NGFifty=62, NGSixty=63, NGSeventy=64, NGEighty=65, NGNinety=66, 
		NGAnd=67, NGA=68, NGB=69, NGC=70, NGD=71, NGE=72, NGF=73, NGG=74, NGH=75, 
		NGI=76, NGJ=77, NGK=78, NGL=79, NGM=80, NGN=81, NGO=82, NGP=83, NGQ=84, 
		NGR=85, NGS=86, NGT=87, NGU=88, NGV=89, NGW=90, NGX=91, NGY=92, NGZ=93;
	public static final int
		RULE_id = 0, RULE_program = 1, RULE_statement = 2, RULE_type = 3, RULE_primitiveType = 4, 
		RULE_array = 5, RULE_expression = 6, RULE_num = 7, RULE_target = 8, RULE_prfOp = 9, 
		RULE_binOp = 10, RULE_multOp = 11, RULE_plusOp = 12, RULE_boolOp = 13, 
		RULE_compOp = 14, RULE_ngWrittenNumber = 15, RULE_nghundred = 16, RULE_ngthousand = 17, 
		RULE_ngmillion = 18, RULE_ngbillion = 19, RULE_ngsingle = 20, RULE_ngonly = 21, 
		RULE_ngsingles = 22, RULE_ngmain1 = 23, RULE_ngmain2 = 24, RULE_nghprefix = 25, 
		RULE_ngseconds = 26, RULE_ngfirst = 27, RULE_ngdoubles = 28;
	public static final String[] ruleNames = {
		"id", "program", "statement", "type", "primitiveType", "array", "expression", 
		"num", "target", "prfOp", "binOp", "multOp", "plusOp", "boolOp", "compOp", 
		"ngWrittenNumber", "nghundred", "ngthousand", "ngmillion", "ngbillion", 
		"ngsingle", "ngonly", "ngsingles", "ngmain1", "ngmain2", "nghprefix", 
		"ngseconds", "ngfirst", "ngdoubles"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'{'", "'}'", "','", "'('", "')'", "'['", "']'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Var", "Integer", "Boolean", "NUMBER", "Minus", "Not", "Mult", 
		"Div", "Plus", "And", "Or", "EQ", "GT", "GE", "LT", "LE", "NE", "IF", 
		"THEN", "ELSE", "WHILE", "DO", "ASS", "TRUE", "FALSE", "BGN", "END", "SEMI", 
		"LPAR", "RPAR", "OpenArray", "CloseArray", "EndStatement", "Letter", "IDNum", 
		"WS", "NGHundred", "NGThousand", "NGMillion", "NGBillion", "NGZero", "NGOne", 
		"NGTwo", "NGThree", "NGFour", "NGFive", "NGSix", "NGSeven", "NGEight", 
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
		public List<TerminalNode> IDNum() { return getTokens(MainGrammarParser.IDNum); }
		public TerminalNode IDNum(int i) {
			return getToken(MainGrammarParser.IDNum, i);
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
			setState(58);
			match(Letter);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					_la = _input.LA(1);
					if ( !(_la==Letter || _la==IDNum) ) {
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
				setState(64);
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
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				statement();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Var) | (1L << Integer) | (1L << Boolean) | (1L << IF) | (1L << WHILE) | (1L << BGN) | (1L << Letter) | (1L << WS))) != 0) );
			setState(70);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new DeclStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(72);
					match(WS);
					}
				}

				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Var) {
					{
					setState(75);
					match(Var);
					setState(76);
					match(WS);
					}
				}

				setState(79);
				type();
				setState(80);
				match(WS);
				setState(81);
				id();
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(82);
					match(WS);
					setState(83);
					match(ASS);
					setState(84);
					match(WS);
					setState(85);
					expression(0);
					}
					break;
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(88);
					match(WS);
					}
				}

				setState(91);
				match(EndStatement);
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(92);
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
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(95);
					match(WS);
					}
				}

				setState(98);
				target();
				setState(99);
				match(WS);
				setState(100);
				match(ASS);
				setState(101);
				match(WS);
				setState(102);
				expression(0);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(103);
					match(WS);
					}
				}

				setState(106);
				match(EndStatement);
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(107);
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
				match(IF);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(114);
					match(WS);
					}
				}

				setState(117);
				expression(0);
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(118);
					match(WS);
					}
					break;
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(121);
					match(THEN);
					}
				}

				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(124);
					match(WS);
					}
					break;
				}
				setState(127);
				statement();
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(128);
						match(WS);
						}
					}

					setState(131);
					match(ELSE);
					setState(133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(132);
						match(WS);
						}
						break;
					}
					setState(135);
					statement();
					}
					break;
				}
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(138);
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
				match(WHILE);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(145);
					match(WS);
					}
				}

				setState(148);
				expression(0);
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(149);
					match(WS);
					}
					break;
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DO) {
					{
					setState(152);
					match(DO);
					}
				}

				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(155);
					match(WS);
					}
					break;
				}
				setState(158);
				statement();
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(159);
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
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(162);
					match(WS);
					}
				}

				setState(165);
				match(BGN);
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(166);
					match(WS);
					}
					break;
				}
				setState(170); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(169);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(172); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(174);
					match(WS);
					}
				}

				setState(177);
				match(END);
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(178);
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
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
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				primitiveType();
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
			setState(187);
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

	public static class ArrayContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode OpenArray() { return getToken(MainGrammarParser.OpenArray, 0); }
		public TerminalNode CloseArray() { return getToken(MainGrammarParser.CloseArray, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			primitiveType();
			setState(190);
			match(OpenArray);
			setState(191);
			match(CloseArray);
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
	public static class BinExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MainGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MainGrammarParser.WS, i);
		}
		public BinExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterBinExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitBinExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitBinExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExpressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				_localctx = new PrfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(194);
				prfOp();
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
				expression(8);
				}
				break;
			case 2:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(LPAR);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(201);
					match(WS);
					}
				}

				setState(204);
				expression(0);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(205);
					match(WS);
					}
				}

				setState(208);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				id();
				}
				break;
			case 4:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				num();
				}
				break;
			case 5:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				id();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(213);
					match(WS);
					}
				}

				setState(216);
				match(OpenArray);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(217);
					match(WS);
					}
				}

				setState(220);
				expression(0);
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
				match(CloseArray);
				}
				break;
			case 6:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(230);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
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
					binOp();
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
					expression(8);
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 14, RULE_num);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NGHundred:
			case NGThousand:
			case NGMillion:
			case NGBillion:
			case NGZero:
			case NGOne:
			case NGTwo:
			case NGThree:
			case NGFour:
			case NGFive:
			case NGSix:
			case NGSeven:
			case NGEight:
			case NGNine:
			case NGTen:
			case NGEleven:
			case NGTwelve:
			case NGEighteen:
			case NGThir:
			case NGFif:
			case NGTwenty:
			case NGThirty:
			case NGForty:
			case NGFifty:
			case NGSixty:
			case NGSeventy:
			case NGEighty:
			case NGNinety:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				ngWrittenNumber();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
		enterRule(_localctx, 16, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 18, RULE_prfOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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

	public static class BinOpContext extends ParserRuleContext {
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public PlusOpContext plusOp() {
			return getRuleContext(PlusOpContext.class,0);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public BinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGrammarListener ) ((MainGrammarListener)listener).exitBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGrammarVisitor ) return ((MainGrammarVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binOp);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Mult:
			case Div:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				multOp();
				}
				break;
			case Minus:
			case Plus:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				plusOp();
				}
				break;
			case And:
			case Or:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				boolOp();
				}
				break;
			case EQ:
			case GT:
			case GE:
			case LT:
			case LE:
			case NE:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				compOp();
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
		enterRule(_localctx, 22, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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
		enterRule(_localctx, 24, RULE_plusOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 26, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		enterRule(_localctx, 28, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		enterRule(_localctx, 30, RULE_ngWrittenNumber);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(267);
					ngbillion();
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(268);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(273);
					ngmillion();
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(274);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(279);
					ngthousand();
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(280);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(285);
				ngsingle();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(286);
					ngbillion();
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(287);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(292);
					ngmillion();
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(293);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(298);
				ngthousand();
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(299);
					match(NGAnd);
					}
					break;
				}
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(302);
					ngsingle();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(305);
					ngbillion();
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(306);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(311);
				ngmillion();
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(312);
					match(NGAnd);
					}
					break;
				}
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(315);
					ngthousand();
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(316);
						match(NGAnd);
						}
						break;
					}
					}
					break;
				}
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(321);
					ngsingle();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				ngbillion();
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(325);
					match(NGAnd);
					}
					break;
				}
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
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
					}
					break;
				}
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(334);
					ngthousand();
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(335);
						match(NGAnd);
						}
						break;
					}
					}
					break;
				}
				setState(341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(340);
					ngsingle();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
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
		enterRule(_localctx, 32, RULE_nghundred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
		enterRule(_localctx, 34, RULE_ngthousand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (NGHundred - 38)) | (1L << (NGOne - 38)) | (1L << (NGTwo - 38)) | (1L << (NGThree - 38)) | (1L << (NGFour - 38)) | (1L << (NGFive - 38)) | (1L << (NGSix - 38)) | (1L << (NGSeven - 38)) | (1L << (NGEight - 38)) | (1L << (NGNine - 38)) | (1L << (NGTen - 38)) | (1L << (NGEleven - 38)) | (1L << (NGTwelve - 38)) | (1L << (NGEighteen - 38)) | (1L << (NGThir - 38)) | (1L << (NGFif - 38)) | (1L << (NGTwenty - 38)) | (1L << (NGThirty - 38)) | (1L << (NGForty - 38)) | (1L << (NGFifty - 38)) | (1L << (NGSixty - 38)) | (1L << (NGSeventy - 38)) | (1L << (NGEighty - 38)) | (1L << (NGNinety - 38)))) != 0)) {
				{
				setState(348);
				ngsingle();
				}
			}

			setState(351);
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
		enterRule(_localctx, 36, RULE_ngmillion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (NGHundred - 38)) | (1L << (NGOne - 38)) | (1L << (NGTwo - 38)) | (1L << (NGThree - 38)) | (1L << (NGFour - 38)) | (1L << (NGFive - 38)) | (1L << (NGSix - 38)) | (1L << (NGSeven - 38)) | (1L << (NGEight - 38)) | (1L << (NGNine - 38)) | (1L << (NGTen - 38)) | (1L << (NGEleven - 38)) | (1L << (NGTwelve - 38)) | (1L << (NGEighteen - 38)) | (1L << (NGThir - 38)) | (1L << (NGFif - 38)) | (1L << (NGTwenty - 38)) | (1L << (NGThirty - 38)) | (1L << (NGForty - 38)) | (1L << (NGFifty - 38)) | (1L << (NGSixty - 38)) | (1L << (NGSeventy - 38)) | (1L << (NGEighty - 38)) | (1L << (NGNinety - 38)))) != 0)) {
				{
				setState(353);
				ngsingle();
				}
			}

			setState(356);
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
		enterRule(_localctx, 38, RULE_ngbillion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (NGHundred - 38)) | (1L << (NGOne - 38)) | (1L << (NGTwo - 38)) | (1L << (NGThree - 38)) | (1L << (NGFour - 38)) | (1L << (NGFive - 38)) | (1L << (NGSix - 38)) | (1L << (NGSeven - 38)) | (1L << (NGEight - 38)) | (1L << (NGNine - 38)) | (1L << (NGTen - 38)) | (1L << (NGEleven - 38)) | (1L << (NGTwelve - 38)) | (1L << (NGEighteen - 38)) | (1L << (NGThir - 38)) | (1L << (NGFif - 38)) | (1L << (NGTwenty - 38)) | (1L << (NGThirty - 38)) | (1L << (NGForty - 38)) | (1L << (NGFifty - 38)) | (1L << (NGSixty - 38)) | (1L << (NGSeventy - 38)) | (1L << (NGEighty - 38)) | (1L << (NGNinety - 38)))) != 0)) {
				{
				setState(358);
				ngsingle();
				}
			}

			setState(361);
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
		enterRule(_localctx, 40, RULE_ngsingle);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (NGOne - 43)) | (1L << (NGTwo - 43)) | (1L << (NGThree - 43)) | (1L << (NGFour - 43)) | (1L << (NGFive - 43)) | (1L << (NGSix - 43)) | (1L << (NGSeven - 43)) | (1L << (NGEight - 43)) | (1L << (NGNine - 43)) | (1L << (NGTen - 43)) | (1L << (NGEleven - 43)) | (1L << (NGTwelve - 43)) | (1L << (NGEighteen - 43)) | (1L << (NGThir - 43)) | (1L << (NGFif - 43)) | (1L << (NGTwenty - 43)) | (1L << (NGThirty - 43)) | (1L << (NGForty - 43)) | (1L << (NGFifty - 43)) | (1L << (NGSixty - 43)) | (1L << (NGSeventy - 43)) | (1L << (NGEighty - 43)) | (1L << (NGNinety - 43)))) != 0)) {
					{
					setState(363);
					nghprefix();
					}
				}

				setState(366);
				nghundred();
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NGAnd) {
					{
					setState(367);
					match(NGAnd);
					}
				}

				setState(370);
				ngonly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (NGOne - 43)) | (1L << (NGTwo - 43)) | (1L << (NGThree - 43)) | (1L << (NGFour - 43)) | (1L << (NGFive - 43)) | (1L << (NGSix - 43)) | (1L << (NGSeven - 43)) | (1L << (NGEight - 43)) | (1L << (NGNine - 43)) | (1L << (NGTen - 43)) | (1L << (NGEleven - 43)) | (1L << (NGTwelve - 43)) | (1L << (NGEighteen - 43)) | (1L << (NGThir - 43)) | (1L << (NGFif - 43)) | (1L << (NGTwenty - 43)) | (1L << (NGThirty - 43)) | (1L << (NGForty - 43)) | (1L << (NGFifty - 43)) | (1L << (NGSixty - 43)) | (1L << (NGSeventy - 43)) | (1L << (NGEighty - 43)) | (1L << (NGNinety - 43)))) != 0)) {
					{
					setState(372);
					nghprefix();
					}
				}

				setState(375);
				nghundred();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
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
		enterRule(_localctx, 42, RULE_ngonly);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				ngmain1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				ngmain2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
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
		enterRule(_localctx, 44, RULE_ngsingles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
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
		enterRule(_localctx, 46, RULE_ngmain1);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NGEleven:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(NGEleven);
				}
				break;
			case NGTwelve:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(NGTwelve);
				}
				break;
			case NGEighteen:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
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
				setState(389);
				ngfirst();
				setState(390);
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
		enterRule(_localctx, 48, RULE_ngmain2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			ngdoubles();
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(395);
					match(T__0);
					}
				}

				setState(398);
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
		enterRule(_localctx, 50, RULE_nghprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		enterRule(_localctx, 52, RULE_ngseconds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		enterRule(_localctx, 54, RULE_ngfirst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		enterRule(_localctx, 56, RULE_ngdoubles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u019c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\7\2?\n\2\f"+
		"\2\16\2B\13\2\3\3\6\3E\n\3\r\3\16\3F\3\3\3\3\3\4\5\4L\n\4\3\4\3\4\5\4"+
		"P\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\4\5\4\\\n\4\3\4\3\4\5\4`"+
		"\n\4\3\4\5\4c\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4k\n\4\3\4\3\4\5\4o\n\4\3"+
		"\4\5\4r\n\4\3\4\3\4\5\4v\n\4\3\4\3\4\5\4z\n\4\3\4\5\4}\n\4\3\4\5\4\u0080"+
		"\n\4\3\4\3\4\5\4\u0084\n\4\3\4\3\4\5\4\u0088\n\4\3\4\5\4\u008b\n\4\3\4"+
		"\5\4\u008e\n\4\3\4\5\4\u0091\n\4\3\4\3\4\5\4\u0095\n\4\3\4\3\4\5\4\u0099"+
		"\n\4\3\4\5\4\u009c\n\4\3\4\5\4\u009f\n\4\3\4\3\4\5\4\u00a3\n\4\3\4\5\4"+
		"\u00a6\n\4\3\4\3\4\5\4\u00aa\n\4\3\4\6\4\u00ad\n\4\r\4\16\4\u00ae\3\4"+
		"\5\4\u00b2\n\4\3\4\3\4\5\4\u00b6\n\4\5\4\u00b8\n\4\3\5\3\5\5\5\u00bc\n"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u00c7\n\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00cd\n\b\3\b\3\b\5\b\u00d1\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d9\n"+
		"\b\3\b\3\b\5\b\u00dd\n\b\3\b\3\b\5\b\u00e1\n\b\3\b\3\b\3\b\3\b\5\b\u00e7"+
		"\n\b\3\b\3\b\5\b\u00eb\n\b\3\b\3\b\5\b\u00ef\n\b\3\b\3\b\7\b\u00f3\n\b"+
		"\f\b\16\b\u00f6\13\b\3\t\3\t\5\t\u00fa\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\5\f\u0104\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\5"+
		"\21\u0110\n\21\5\21\u0112\n\21\3\21\3\21\5\21\u0116\n\21\5\21\u0118\n"+
		"\21\3\21\3\21\5\21\u011c\n\21\5\21\u011e\n\21\3\21\3\21\3\21\5\21\u0123"+
		"\n\21\5\21\u0125\n\21\3\21\3\21\5\21\u0129\n\21\5\21\u012b\n\21\3\21\3"+
		"\21\5\21\u012f\n\21\3\21\5\21\u0132\n\21\3\21\3\21\5\21\u0136\n\21\5\21"+
		"\u0138\n\21\3\21\3\21\5\21\u013c\n\21\3\21\3\21\5\21\u0140\n\21\5\21\u0142"+
		"\n\21\3\21\5\21\u0145\n\21\3\21\3\21\5\21\u0149\n\21\3\21\3\21\5\21\u014d"+
		"\n\21\5\21\u014f\n\21\3\21\3\21\5\21\u0153\n\21\5\21\u0155\n\21\3\21\5"+
		"\21\u0158\n\21\3\21\5\21\u015b\n\21\3\22\3\22\3\23\5\23\u0160\n\23\3\23"+
		"\3\23\3\24\5\24\u0165\n\24\3\24\3\24\3\25\5\25\u016a\n\25\3\25\3\25\3"+
		"\26\5\26\u016f\n\26\3\26\3\26\5\26\u0173\n\26\3\26\3\26\3\26\5\26\u0178"+
		"\n\26\3\26\3\26\5\26\u017c\n\26\3\27\3\27\3\27\5\27\u0181\n\27\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u018b\n\31\3\32\3\32\5\32\u018f"+
		"\n\32\3\32\5\32\u0192\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\2\3\16\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:\2\r\3\2%&\3\2\5\6\3\2\b\t\3\2\n\13\4\2\b\b\f\f\3\2\r\16\3\2\17\24\3"+
		"\2-\66\3\2-\65\6\2\60\60\62\63\65\65:;\3\2=D\2\u01df\2<\3\2\2\2\4D\3\2"+
		"\2\2\6\u00b7\3\2\2\2\b\u00bb\3\2\2\2\n\u00bd\3\2\2\2\f\u00bf\3\2\2\2\16"+
		"\u00e6\3\2\2\2\20\u00f9\3\2\2\2\22\u00fb\3\2\2\2\24\u00fd\3\2\2\2\26\u0103"+
		"\3\2\2\2\30\u0105\3\2\2\2\32\u0107\3\2\2\2\34\u0109\3\2\2\2\36\u010b\3"+
		"\2\2\2 \u015a\3\2\2\2\"\u015c\3\2\2\2$\u015f\3\2\2\2&\u0164\3\2\2\2(\u0169"+
		"\3\2\2\2*\u017b\3\2\2\2,\u0180\3\2\2\2.\u0182\3\2\2\2\60\u018a\3\2\2\2"+
		"\62\u018c\3\2\2\2\64\u0193\3\2\2\2\66\u0195\3\2\2\28\u0197\3\2\2\2:\u0199"+
		"\3\2\2\2<@\7%\2\2=?\t\2\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3"+
		"\3\2\2\2B@\3\2\2\2CE\5\6\4\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G"+
		"H\3\2\2\2HI\7\2\2\3I\5\3\2\2\2JL\7\'\2\2KJ\3\2\2\2KL\3\2\2\2LO\3\2\2\2"+
		"MN\7\4\2\2NP\7\'\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\5\b\5\2RS\7\'\2\2"+
		"SX\5\2\2\2TU\7\'\2\2UV\7\32\2\2VW\7\'\2\2WY\5\16\b\2XT\3\2\2\2XY\3\2\2"+
		"\2Y[\3\2\2\2Z\\\7\'\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\7$\2\2^`\7\'"+
		"\2\2_^\3\2\2\2_`\3\2\2\2`\u00b8\3\2\2\2ac\7\'\2\2ba\3\2\2\2bc\3\2\2\2"+
		"cd\3\2\2\2de\5\22\n\2ef\7\'\2\2fg\7\32\2\2gh\7\'\2\2hj\5\16\b\2ik\7\'"+
		"\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2ln\7$\2\2mo\7\'\2\2nm\3\2\2\2no\3\2"+
		"\2\2o\u00b8\3\2\2\2pr\7\'\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7\25\2\2"+
		"tv\7\'\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\5\16\b\2xz\7\'\2\2yx\3\2\2"+
		"\2yz\3\2\2\2z|\3\2\2\2{}\7\26\2\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080"+
		"\7\'\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u008a"+
		"\5\6\4\2\u0082\u0084\7\'\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\7\27\2\2\u0086\u0088\7\'\2\2\u0087\u0086\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\5\6\4\2\u008a"+
		"\u0083\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008e\7\'"+
		"\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u00b8\3\2\2\2\u008f"+
		"\u0091\7\'\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0094\7\30\2\2\u0093\u0095\7\'\2\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\5\16\b\2\u0097\u0099\7"+
		"\'\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u009c\7\31\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3"+
		"\2\2\2\u009d\u009f\7\'\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\5\6\4\2\u00a1\u00a3\7\'\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00b8\3\2\2\2\u00a4\u00a6\7\'\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\7\35"+
		"\2\2\u00a8\u00aa\7\'\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00ad\5\6\4\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00b2\7\'\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\7\36\2\2\u00b4\u00b6\7\'\2\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7K\3\2\2\2\u00b7b\3\2\2\2\u00b7"+
		"q\3\2\2\2\u00b7\u0090\3\2\2\2\u00b7\u00a5\3\2\2\2\u00b8\7\3\2\2\2\u00b9"+
		"\u00bc\5\f\7\2\u00ba\u00bc\5\n\6\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\t\3\2\2\2\u00bd\u00be\t\3\2\2\u00be\13\3\2\2\2\u00bf\u00c0"+
		"\5\n\6\2\u00c0\u00c1\7\"\2\2\u00c1\u00c2\7#\2\2\u00c2\r\3\2\2\2\u00c3"+
		"\u00c4\b\b\1\2\u00c4\u00c6\5\24\13\2\u00c5\u00c7\7\'\2\2\u00c6\u00c5\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\5\16\b\n\u00c9"+
		"\u00e7\3\2\2\2\u00ca\u00cc\7 \2\2\u00cb\u00cd\7\'\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\5\16\b\2\u00cf"+
		"\u00d1\7\'\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\7!\2\2\u00d3\u00e7\3\2\2\2\u00d4\u00e7\5\2\2\2\u00d5"+
		"\u00e7\5\20\t\2\u00d6\u00d8\5\2\2\2\u00d7\u00d9\7\'\2\2\u00d8\u00d7\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7\"\2\2\u00db"+
		"\u00dd\7\'\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e0\5\16\b\2\u00df\u00e1\7\'\2\2\u00e0\u00df\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7#\2\2\u00e3\u00e7\3\2"+
		"\2\2\u00e4\u00e7\7\33\2\2\u00e5\u00e7\7\34\2\2\u00e6\u00c3\3\2\2\2\u00e6"+
		"\u00ca\3\2\2\2\u00e6\u00d4\3\2\2\2\u00e6\u00d5\3\2\2\2\u00e6\u00d6\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00f4\3\2\2\2\u00e8"+
		"\u00ea\f\t\2\2\u00e9\u00eb\7\'\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\5\26\f\2\u00ed\u00ef\7\'\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\5\16"+
		"\b\n\u00f1\u00f3\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\17\3\2\2\2\u00f6\u00f4\3\2\2"+
		"\2\u00f7\u00fa\5 \21\2\u00f8\u00fa\7\7\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa\21\3\2\2\2\u00fb\u00fc\5\2\2\2\u00fc\23\3\2\2\2\u00fd\u00fe"+
		"\t\4\2\2\u00fe\25\3\2\2\2\u00ff\u0104\5\30\r\2\u0100\u0104\5\32\16\2\u0101"+
		"\u0104\5\34\17\2\u0102\u0104\5\36\20\2\u0103\u00ff\3\2\2\2\u0103\u0100"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\27\3\2\2\2\u0105"+
		"\u0106\t\5\2\2\u0106\31\3\2\2\2\u0107\u0108\t\6\2\2\u0108\33\3\2\2\2\u0109"+
		"\u010a\t\7\2\2\u010a\35\3\2\2\2\u010b\u010c\t\b\2\2\u010c\37\3\2\2\2\u010d"+
		"\u010f\5(\25\2\u010e\u0110\7E\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0112\3\2\2\2\u0111\u010d\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0117\3\2\2\2\u0113\u0115\5&\24\2\u0114\u0116\7E\2\2\u0115\u0114\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0113\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011d\3\2\2\2\u0119\u011b\5$\23\2\u011a\u011c\7E"+
		"\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u0119\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u015b\5*"+
		"\26\2\u0120\u0122\5(\25\2\u0121\u0123\7E\2\2\u0122\u0121\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u012a\3\2\2\2\u0126\u0128\5&\24\2\u0127\u0129\7E\2\2\u0128"+
		"\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0126\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\5$\23\2\u012d"+
		"\u012f\7E\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2"+
		"\2\2\u0130\u0132\5*\26\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u015b\3\2\2\2\u0133\u0135\5(\25\2\u0134\u0136\7E\2\2\u0135\u0134\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0133\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\5&\24\2\u013a\u013c\7E"+
		"\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0141\3\2\2\2\u013d"+
		"\u013f\5$\23\2\u013e\u0140\7E\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0142\3\2\2\2\u0141\u013d\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0145\5*\26\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u015b\3\2\2\2\u0146\u0148\5(\25\2\u0147\u0149\7E\2\2\u0148"+
		"\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014e\3\2\2\2\u014a\u014c\5&"+
		"\24\2\u014b\u014d\7E\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u014a\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0154\3\2"+
		"\2\2\u0150\u0152\5$\23\2\u0151\u0153\7E\2\2\u0152\u0151\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0157\3\2\2\2\u0156\u0158\5*\26\2\u0157\u0156\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u015b\7,\2\2\u015a\u0111\3\2"+
		"\2\2\u015a\u0124\3\2\2\2\u015a\u0137\3\2\2\2\u015a\u0146\3\2\2\2\u015a"+
		"\u0159\3\2\2\2\u015b!\3\2\2\2\u015c\u015d\7(\2\2\u015d#\3\2\2\2\u015e"+
		"\u0160\5*\26\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0162\7)\2\2\u0162%\3\2\2\2\u0163\u0165\5*\26\2\u0164\u0163"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7*\2\2\u0167"+
		"\'\3\2\2\2\u0168\u016a\5*\26\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2"+
		"\u016a\u016b\3\2\2\2\u016b\u016c\7+\2\2\u016c)\3\2\2\2\u016d\u016f\5\64"+
		"\33\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0172\5\"\22\2\u0171\u0173\7E\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0175\5,\27\2\u0175\u017c\3\2\2\2\u0176"+
		"\u0178\5\64\33\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3"+
		"\2\2\2\u0179\u017c\5\"\22\2\u017a\u017c\5,\27\2\u017b\u016e\3\2\2\2\u017b"+
		"\u0177\3\2\2\2\u017b\u017a\3\2\2\2\u017c+\3\2\2\2\u017d\u0181\5\60\31"+
		"\2\u017e\u0181\5\62\32\2\u017f\u0181\5.\30\2\u0180\u017d\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181-\3\2\2\2\u0182\u0183\t\t\2\2"+
		"\u0183/\3\2\2\2\u0184\u018b\7\67\2\2\u0185\u018b\78\2\2\u0186\u018b\7"+
		"9\2\2\u0187\u0188\58\35\2\u0188\u0189\7<\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u0184\3\2\2\2\u018a\u0185\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u0187\3\2"+
		"\2\2\u018b\61\3\2\2\2\u018c\u0191\5:\36\2\u018d\u018f\7\3\2\2\u018e\u018d"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\5\66\34\2"+
		"\u0191\u018e\3\2\2\2\u0191\u0192\3\2\2\2\u0192\63\3\2\2\2\u0193\u0194"+
		"\5,\27\2\u0194\65\3\2\2\2\u0195\u0196\t\n\2\2\u0196\67\3\2\2\2\u0197\u0198"+
		"\t\13\2\2\u01989\3\2\2\2\u0199\u019a\t\f\2\2\u019a;\3\2\2\2R@FKOX[_bj"+
		"nquy|\177\u0083\u0087\u008a\u008d\u0090\u0094\u0098\u009b\u009e\u00a2"+
		"\u00a5\u00a9\u00ae\u00b1\u00b5\u00b7\u00bb\u00c6\u00cc\u00d0\u00d8\u00dc"+
		"\u00e0\u00e6\u00ea\u00ee\u00f4\u00f9\u0103\u010f\u0111\u0115\u0117\u011b"+
		"\u011d\u0122\u0124\u0128\u012a\u012e\u0131\u0135\u0137\u013b\u013f\u0141"+
		"\u0144\u0148\u014c\u014e\u0152\u0154\u0157\u015a\u015f\u0164\u0169\u016e"+
		"\u0172\u0177\u017b\u0180\u018a\u018e\u0191";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}