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
		T__0=1, T__1=2, Letter=3, Var=4, Integer=5, Boolean=6, NUMBER=7, Minus=8, 
		Not=9, Mult=10, Div=11, Plus=12, And=13, Or=14, EQ=15, GT=16, GE=17, LT=18, 
		LE=19, NE=20, IF=21, THEN=22, ELSE=23, WHILE=24, DO=25, ASS=26, TRUE=27, 
		FALSE=28, BGN=29, END=30, SEMI=31, LPAR=32, RPAR=33, OpenArray=34, CloseArray=35, 
		EndStatement=36, WS=37, NGHundred=38, NGThousand=39, NGMillion=40, NGBillion=41, 
		NGZero=42, NGOne=43, NGTwo=44, NGThree=45, NGFour=46, NGFive=47, NGSix=48, 
		NGSeven=49, NGEight=50, NGNine=51, NGTen=52, NGEleven=53, NGTwelve=54, 
		NGEighteen=55, NGThir=56, NGFif=57, NGTeen=58, NGTwenty=59, NGThirty=60, 
		NGForty=61, NGFifty=62, NGSixty=63, NGSeventy=64, NGEighty=65, NGNinety=66, 
		NGAnd=67, NGA=68, NGB=69, NGC=70, NGD=71, NGE=72, NGF=73, NGG=74, NGH=75, 
		NGI=76, NGJ=77, NGK=78, NGL=79, NGM=80, NGN=81, NGO=82, NGP=83, NGQ=84, 
		NGR=85, NGS=86, NGT=87, NGU=88, NGV=89, NGW=90, NGX=91, NGY=92, NGZ=93;
	public static final int
		RULE_id = 0, RULE_program = 1, RULE_statement = 2, RULE_type = 3, RULE_primitiveType = 4, 
		RULE_array = 5, RULE_expression = 6, RULE_num = 7, RULE_target = 8, RULE_prfOp = 9, 
		RULE_multOp = 10, RULE_plusOp = 11, RULE_boolOp = 12, RULE_compOp = 13, 
		RULE_ngWrittenNumber = 14, RULE_nghundred = 15, RULE_ngthousand = 16, 
		RULE_ngmillion = 17, RULE_ngbillion = 18, RULE_ngsingle = 19, RULE_ngonly = 20, 
		RULE_ngsingles = 21, RULE_ngmain1 = 22, RULE_ngmain2 = 23, RULE_nghprefix = 24, 
		RULE_ngseconds = 25, RULE_ngfirst = 26, RULE_ngdoubles = 27;
	public static final String[] ruleNames = {
		"id", "program", "statement", "type", "primitiveType", "array", "expression", 
		"num", "target", "prfOp", "multOp", "plusOp", "boolOp", "compOp", "ngWrittenNumber", 
		"nghundred", "ngthousand", "ngmillion", "ngbillion", "ngsingle", "ngonly", 
		"ngsingles", "ngmain1", "ngmain2", "nghprefix", "ngseconds", "ngfirst", 
		"ngdoubles"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "'-'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'{'", "'}'", "','", "'('", "')'", "'['", 
		"']'", "';'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'a'", "'b'", "'c'", 
		"'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", 
		"'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", 
		"'x'", "'y'", "'z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Letter", "Var", "Integer", "Boolean", "NUMBER", "Minus", 
		"Not", "Mult", "Div", "Plus", "And", "Or", "EQ", "GT", "GE", "LT", "LE", 
		"NE", "IF", "THEN", "ELSE", "WHILE", "DO", "ASS", "TRUE", "FALSE", "BGN", 
		"END", "SEMI", "LPAR", "RPAR", "OpenArray", "CloseArray", "EndStatement", 
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
			setState(56);
			match(Letter);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
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
				setState(62);
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
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				statement();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Letter) | (1L << Var) | (1L << Integer) | (1L << Boolean) | (1L << IF) | (1L << WHILE) | (1L << BGN) | (1L << WS))) != 0) );
			setState(68);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new DeclStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(70);
					match(WS);
					}
				}

				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Var) {
					{
					setState(73);
					match(Var);
					setState(74);
					match(WS);
					}
				}

				setState(77);
				type();
				setState(78);
				match(WS);
				setState(79);
				id();
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(80);
					match(WS);
					setState(81);
					match(ASS);
					setState(82);
					match(WS);
					setState(83);
					expression(0);
					}
					break;
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(86);
					match(WS);
					}
				}

				setState(89);
				match(EndStatement);
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(90);
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
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(93);
					match(WS);
					}
				}

				setState(96);
				target();
				setState(97);
				match(WS);
				setState(98);
				match(ASS);
				setState(99);
				match(WS);
				setState(100);
				expression(0);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(101);
					match(WS);
					}
				}

				setState(104);
				match(EndStatement);
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(105);
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
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(108);
					match(WS);
					}
				}

				setState(111);
				match(IF);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(112);
					match(WS);
					}
				}

				setState(115);
				expression(0);
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(116);
					match(WS);
					}
					break;
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(119);
					match(THEN);
					}
				}

				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(122);
					match(WS);
					}
					break;
				}
				setState(125);
				statement();
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(126);
						match(WS);
						}
					}

					setState(129);
					match(ELSE);
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(130);
						match(WS);
						}
						break;
					}
					setState(133);
					statement();
					}
					break;
				}
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(136);
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
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(139);
					match(WS);
					}
				}

				setState(142);
				match(WHILE);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(143);
					match(WS);
					}
				}

				setState(146);
				expression(0);
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(147);
					match(WS);
					}
					break;
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DO) {
					{
					setState(150);
					match(DO);
					}
				}

				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(153);
					match(WS);
					}
					break;
				}
				setState(156);
				statement();
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(157);
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
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(160);
					match(WS);
					}
				}

				setState(163);
				match(BGN);
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(164);
					match(WS);
					}
					break;
				}
				setState(168); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(167);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(170); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(172);
					match(WS);
					}
				}

				setState(175);
				match(END);
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(176);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
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
			setState(185);
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
			setState(187);
			primitiveType();
			setState(188);
			match(OpenArray);
			setState(189);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				_localctx = new PrfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(192);
				prfOp();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(193);
					match(WS);
					}
				}

				setState(196);
				expression(11);
				}
				break;
			case 2:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(LPAR);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(199);
					match(WS);
					}
				}

				setState(202);
				expression(0);
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
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				id();
				}
				break;
			case 4:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				num();
				}
				break;
			case 5:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				id();
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
				match(OpenArray);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(215);
					match(WS);
					}
				}

				setState(218);
				expression(0);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(219);
					match(WS);
					}
				}

				setState(222);
				match(CloseArray);
				}
				break;
			case 6:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(268);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(230);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(229);
							match(WS);
							}
						}

						setState(232);
						multOp();
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(233);
							match(WS);
							}
						}

						setState(236);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new PlusExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(239);
							match(WS);
							}
						}

						setState(242);
						plusOp();
						setState(244);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(243);
							match(WS);
							}
						}

						setState(246);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new BoolExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(249);
							match(WS);
							}
						}

						setState(252);
						boolOp();
						setState(254);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(253);
							match(WS);
							}
						}

						setState(256);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new CompExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(260);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(259);
							match(WS);
							}
						}

						setState(262);
						compOp();
						setState(264);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(263);
							match(WS);
							}
						}

						setState(266);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				ngWrittenNumber();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
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
			setState(277);
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
			setState(279);
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
		enterRule(_localctx, 20, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		enterRule(_localctx, 22, RULE_plusOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		enterRule(_localctx, 24, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		enterRule(_localctx, 26, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
		enterRule(_localctx, 28, RULE_ngWrittenNumber);
		int _la;
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(T__0);
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(290);
					ngbillion();
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(291);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(296);
					ngmillion();
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(297);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(302);
					ngthousand();
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
				setState(308);
				ngsingle();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(T__0);
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(310);
					ngbillion();
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(311);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(316);
					ngmillion();
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(317);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(322);
				ngthousand();
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(323);
					match(NGAnd);
					}
					break;
				}
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(326);
					ngsingle();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(T__0);
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(330);
					ngbillion();
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NGAnd) {
						{
						setState(331);
						match(NGAnd);
						}
					}

					}
					break;
				}
				setState(336);
				ngmillion();
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(337);
					match(NGAnd);
					}
					break;
				}
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(340);
					ngthousand();
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(341);
						match(NGAnd);
						}
						break;
					}
					}
					break;
				}
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(346);
					ngsingle();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				match(T__0);
				setState(350);
				ngbillion();
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(351);
					match(NGAnd);
					}
					break;
				}
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(354);
					ngmillion();
					setState(356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(355);
						match(NGAnd);
						}
						break;
					}
					}
					break;
				}
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(360);
					ngthousand();
					setState(362);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(361);
						match(NGAnd);
						}
						break;
					}
					}
					break;
				}
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(366);
					ngsingle();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(369);
				match(T__0);
				setState(370);
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
		enterRule(_localctx, 30, RULE_nghundred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		enterRule(_localctx, 32, RULE_ngthousand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (NGHundred - 38)) | (1L << (NGOne - 38)) | (1L << (NGTwo - 38)) | (1L << (NGThree - 38)) | (1L << (NGFour - 38)) | (1L << (NGFive - 38)) | (1L << (NGSix - 38)) | (1L << (NGSeven - 38)) | (1L << (NGEight - 38)) | (1L << (NGNine - 38)) | (1L << (NGTen - 38)) | (1L << (NGEleven - 38)) | (1L << (NGTwelve - 38)) | (1L << (NGEighteen - 38)) | (1L << (NGThir - 38)) | (1L << (NGFif - 38)) | (1L << (NGTwenty - 38)) | (1L << (NGThirty - 38)) | (1L << (NGForty - 38)) | (1L << (NGFifty - 38)) | (1L << (NGSixty - 38)) | (1L << (NGSeventy - 38)) | (1L << (NGEighty - 38)) | (1L << (NGNinety - 38)))) != 0)) {
				{
				setState(375);
				ngsingle();
				}
			}

			setState(378);
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
		enterRule(_localctx, 34, RULE_ngmillion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (NGHundred - 38)) | (1L << (NGOne - 38)) | (1L << (NGTwo - 38)) | (1L << (NGThree - 38)) | (1L << (NGFour - 38)) | (1L << (NGFive - 38)) | (1L << (NGSix - 38)) | (1L << (NGSeven - 38)) | (1L << (NGEight - 38)) | (1L << (NGNine - 38)) | (1L << (NGTen - 38)) | (1L << (NGEleven - 38)) | (1L << (NGTwelve - 38)) | (1L << (NGEighteen - 38)) | (1L << (NGThir - 38)) | (1L << (NGFif - 38)) | (1L << (NGTwenty - 38)) | (1L << (NGThirty - 38)) | (1L << (NGForty - 38)) | (1L << (NGFifty - 38)) | (1L << (NGSixty - 38)) | (1L << (NGSeventy - 38)) | (1L << (NGEighty - 38)) | (1L << (NGNinety - 38)))) != 0)) {
				{
				setState(380);
				ngsingle();
				}
			}

			setState(383);
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
		enterRule(_localctx, 36, RULE_ngbillion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (NGHundred - 38)) | (1L << (NGOne - 38)) | (1L << (NGTwo - 38)) | (1L << (NGThree - 38)) | (1L << (NGFour - 38)) | (1L << (NGFive - 38)) | (1L << (NGSix - 38)) | (1L << (NGSeven - 38)) | (1L << (NGEight - 38)) | (1L << (NGNine - 38)) | (1L << (NGTen - 38)) | (1L << (NGEleven - 38)) | (1L << (NGTwelve - 38)) | (1L << (NGEighteen - 38)) | (1L << (NGThir - 38)) | (1L << (NGFif - 38)) | (1L << (NGTwenty - 38)) | (1L << (NGThirty - 38)) | (1L << (NGForty - 38)) | (1L << (NGFifty - 38)) | (1L << (NGSixty - 38)) | (1L << (NGSeventy - 38)) | (1L << (NGEighty - 38)) | (1L << (NGNinety - 38)))) != 0)) {
				{
				setState(385);
				ngsingle();
				}
			}

			setState(388);
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
		enterRule(_localctx, 38, RULE_ngsingle);
		int _la;
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (NGOne - 43)) | (1L << (NGTwo - 43)) | (1L << (NGThree - 43)) | (1L << (NGFour - 43)) | (1L << (NGFive - 43)) | (1L << (NGSix - 43)) | (1L << (NGSeven - 43)) | (1L << (NGEight - 43)) | (1L << (NGNine - 43)) | (1L << (NGTen - 43)) | (1L << (NGEleven - 43)) | (1L << (NGTwelve - 43)) | (1L << (NGEighteen - 43)) | (1L << (NGThir - 43)) | (1L << (NGFif - 43)) | (1L << (NGTwenty - 43)) | (1L << (NGThirty - 43)) | (1L << (NGForty - 43)) | (1L << (NGFifty - 43)) | (1L << (NGSixty - 43)) | (1L << (NGSeventy - 43)) | (1L << (NGEighty - 43)) | (1L << (NGNinety - 43)))) != 0)) {
					{
					setState(390);
					nghprefix();
					}
				}

				setState(393);
				nghundred();
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NGAnd) {
					{
					setState(394);
					match(NGAnd);
					}
				}

				setState(397);
				ngonly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (NGOne - 43)) | (1L << (NGTwo - 43)) | (1L << (NGThree - 43)) | (1L << (NGFour - 43)) | (1L << (NGFive - 43)) | (1L << (NGSix - 43)) | (1L << (NGSeven - 43)) | (1L << (NGEight - 43)) | (1L << (NGNine - 43)) | (1L << (NGTen - 43)) | (1L << (NGEleven - 43)) | (1L << (NGTwelve - 43)) | (1L << (NGEighteen - 43)) | (1L << (NGThir - 43)) | (1L << (NGFif - 43)) | (1L << (NGTwenty - 43)) | (1L << (NGThirty - 43)) | (1L << (NGForty - 43)) | (1L << (NGFifty - 43)) | (1L << (NGSixty - 43)) | (1L << (NGSeventy - 43)) | (1L << (NGEighty - 43)) | (1L << (NGNinety - 43)))) != 0)) {
					{
					setState(399);
					nghprefix();
					}
				}

				setState(402);
				nghundred();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
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
		enterRule(_localctx, 40, RULE_ngonly);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				ngmain1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				ngmain2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
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
		enterRule(_localctx, 42, RULE_ngsingles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
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
		enterRule(_localctx, 44, RULE_ngmain1);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NGEleven:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(NGEleven);
				}
				break;
			case NGTwelve:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(NGTwelve);
				}
				break;
			case NGEighteen:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
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
				setState(416);
				ngfirst();
				setState(417);
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
		enterRule(_localctx, 46, RULE_ngmain2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			ngdoubles();
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(422);
					match(T__1);
					}
				}

				setState(425);
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
		enterRule(_localctx, 48, RULE_nghprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
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
		enterRule(_localctx, 50, RULE_ngseconds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
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
		enterRule(_localctx, 52, RULE_ngfirst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		enterRule(_localctx, 54, RULE_ngdoubles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u01b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\3\6\3C\n\3\r\3\16\3D\3\3\3\3\3\4\5\4J\n\4\3\4\3\4\5\4N\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4W\n\4\3\4\5\4Z\n\4\3\4\3\4\5\4^\n\4\3\4\5\4"+
		"a\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4i\n\4\3\4\3\4\5\4m\n\4\3\4\5\4p\n\4\3"+
		"\4\3\4\5\4t\n\4\3\4\3\4\5\4x\n\4\3\4\5\4{\n\4\3\4\5\4~\n\4\3\4\3\4\5\4"+
		"\u0082\n\4\3\4\3\4\5\4\u0086\n\4\3\4\5\4\u0089\n\4\3\4\5\4\u008c\n\4\3"+
		"\4\5\4\u008f\n\4\3\4\3\4\5\4\u0093\n\4\3\4\3\4\5\4\u0097\n\4\3\4\5\4\u009a"+
		"\n\4\3\4\5\4\u009d\n\4\3\4\3\4\5\4\u00a1\n\4\3\4\5\4\u00a4\n\4\3\4\3\4"+
		"\5\4\u00a8\n\4\3\4\6\4\u00ab\n\4\r\4\16\4\u00ac\3\4\5\4\u00b0\n\4\3\4"+
		"\3\4\5\4\u00b4\n\4\5\4\u00b6\n\4\3\5\3\5\5\5\u00ba\n\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\5\b\u00c5\n\b\3\b\3\b\3\b\3\b\5\b\u00cb\n\b\3\b\3"+
		"\b\5\b\u00cf\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d7\n\b\3\b\3\b\5\b\u00db"+
		"\n\b\3\b\3\b\5\b\u00df\n\b\3\b\3\b\3\b\3\b\5\b\u00e5\n\b\3\b\3\b\5\b\u00e9"+
		"\n\b\3\b\3\b\5\b\u00ed\n\b\3\b\3\b\3\b\3\b\5\b\u00f3\n\b\3\b\3\b\5\b\u00f7"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u00fd\n\b\3\b\3\b\5\b\u0101\n\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0107\n\b\3\b\3\b\5\b\u010b\n\b\3\b\3\b\7\b\u010f\n\b\f\b\16\b"+
		"\u0112\13\b\3\t\3\t\5\t\u0116\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\5\20\u0127\n\20\5\20\u0129\n\20\3\20"+
		"\3\20\5\20\u012d\n\20\5\20\u012f\n\20\3\20\3\20\5\20\u0133\n\20\5\20\u0135"+
		"\n\20\3\20\3\20\3\20\3\20\5\20\u013b\n\20\5\20\u013d\n\20\3\20\3\20\5"+
		"\20\u0141\n\20\5\20\u0143\n\20\3\20\3\20\5\20\u0147\n\20\3\20\5\20\u014a"+
		"\n\20\3\20\3\20\3\20\5\20\u014f\n\20\5\20\u0151\n\20\3\20\3\20\5\20\u0155"+
		"\n\20\3\20\3\20\5\20\u0159\n\20\5\20\u015b\n\20\3\20\5\20\u015e\n\20\3"+
		"\20\3\20\3\20\5\20\u0163\n\20\3\20\3\20\5\20\u0167\n\20\5\20\u0169\n\20"+
		"\3\20\3\20\5\20\u016d\n\20\5\20\u016f\n\20\3\20\5\20\u0172\n\20\3\20\3"+
		"\20\5\20\u0176\n\20\3\21\3\21\3\22\5\22\u017b\n\22\3\22\3\22\3\23\5\23"+
		"\u0180\n\23\3\23\3\23\3\24\5\24\u0185\n\24\3\24\3\24\3\25\5\25\u018a\n"+
		"\25\3\25\3\25\5\25\u018e\n\25\3\25\3\25\3\25\5\25\u0193\n\25\3\25\3\25"+
		"\5\25\u0197\n\25\3\26\3\26\3\26\5\26\u019c\n\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\5\30\u01a6\n\30\3\31\3\31\5\31\u01aa\n\31\3\31\5\31"+
		"\u01ad\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\2\3\16\36\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\r\4\2\5\5"+
		"\t\t\3\2\7\b\3\2\n\13\3\2\f\r\4\2\n\n\16\16\3\2\17\20\3\2\21\26\3\2-\66"+
		"\3\2-\65\6\2\60\60\62\63\65\65:;\3\2=D\2\u0201\2:\3\2\2\2\4B\3\2\2\2\6"+
		"\u00b5\3\2\2\2\b\u00b9\3\2\2\2\n\u00bb\3\2\2\2\f\u00bd\3\2\2\2\16\u00e4"+
		"\3\2\2\2\20\u0115\3\2\2\2\22\u0117\3\2\2\2\24\u0119\3\2\2\2\26\u011b\3"+
		"\2\2\2\30\u011d\3\2\2\2\32\u011f\3\2\2\2\34\u0121\3\2\2\2\36\u0175\3\2"+
		"\2\2 \u0177\3\2\2\2\"\u017a\3\2\2\2$\u017f\3\2\2\2&\u0184\3\2\2\2(\u0196"+
		"\3\2\2\2*\u019b\3\2\2\2,\u019d\3\2\2\2.\u01a5\3\2\2\2\60\u01a7\3\2\2\2"+
		"\62\u01ae\3\2\2\2\64\u01b0\3\2\2\2\66\u01b2\3\2\2\28\u01b4\3\2\2\2:>\7"+
		"\5\2\2;=\t\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\3\3\2\2\2@>"+
		"\3\2\2\2AC\5\6\4\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2F"+
		"G\7\2\2\3G\5\3\2\2\2HJ\7\'\2\2IH\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KL\7\6\2\2"+
		"LN\7\'\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\5\b\5\2PQ\7\'\2\2QV\5\2\2\2"+
		"RS\7\'\2\2ST\7\34\2\2TU\7\'\2\2UW\5\16\b\2VR\3\2\2\2VW\3\2\2\2WY\3\2\2"+
		"\2XZ\7\'\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\7&\2\2\\^\7\'\2\2]\\\3\2"+
		"\2\2]^\3\2\2\2^\u00b6\3\2\2\2_a\7\'\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2"+
		"bc\5\22\n\2cd\7\'\2\2de\7\34\2\2ef\7\'\2\2fh\5\16\b\2gi\7\'\2\2hg\3\2"+
		"\2\2hi\3\2\2\2ij\3\2\2\2jl\7&\2\2km\7\'\2\2lk\3\2\2\2lm\3\2\2\2m\u00b6"+
		"\3\2\2\2np\7\'\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\7\27\2\2rt\7\'\2\2"+
		"sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\5\16\b\2vx\7\'\2\2wv\3\2\2\2wx\3\2\2"+
		"\2xz\3\2\2\2y{\7\30\2\2zy\3\2\2\2z{\3\2\2\2{}\3\2\2\2|~\7\'\2\2}|\3\2"+
		"\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0088\5\6\4\2\u0080\u0082\7\'\2\2\u0081"+
		"\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\7\31"+
		"\2\2\u0084\u0086\7\'\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\5\6\4\2\u0088\u0081\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008b\3\2\2\2\u008a\u008c\7\'\2\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u00b6\3\2\2\2\u008d\u008f\7\'\2\2\u008e\u008d\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\7\32\2\2\u0091"+
		"\u0093\7\'\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\5\16\b\2\u0095\u0097\7\'\2\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\7\33\2\2\u0099\u0098\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u009d\7\'\2\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\5\6"+
		"\4\2\u009f\u00a1\7\'\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00b6\3\2\2\2\u00a2\u00a4\7\'\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\7\37\2\2\u00a6\u00a8\7\'\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00ab\5\6"+
		"\4\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00b0\7\'\2\2\u00af\u00ae\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\7 \2\2\u00b2"+
		"\u00b4\7\'\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5I\3\2\2\2\u00b5`\3\2\2\2\u00b5o\3\2\2\2\u00b5\u008e\3\2\2\2"+
		"\u00b5\u00a3\3\2\2\2\u00b6\7\3\2\2\2\u00b7\u00ba\5\f\7\2\u00b8\u00ba\5"+
		"\n\6\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\t\3\2\2\2\u00bb\u00bc"+
		"\t\3\2\2\u00bc\13\3\2\2\2\u00bd\u00be\5\n\6\2\u00be\u00bf\7$\2\2\u00bf"+
		"\u00c0\7%\2\2\u00c0\r\3\2\2\2\u00c1\u00c2\b\b\1\2\u00c2\u00c4\5\24\13"+
		"\2\u00c3\u00c5\7\'\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c7\5\16\b\r\u00c7\u00e5\3\2\2\2\u00c8\u00ca\7\"\2\2"+
		"\u00c9\u00cb\7\'\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00ce\5\16\b\2\u00cd\u00cf\7\'\2\2\u00ce\u00cd\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1\u00e5"+
		"\3\2\2\2\u00d2\u00e5\5\2\2\2\u00d3\u00e5\5\20\t\2\u00d4\u00d6\5\2\2\2"+
		"\u00d5\u00d7\7\'\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00da\7$\2\2\u00d9\u00db\7\'\2\2\u00da\u00d9\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\5\16\b\2\u00dd\u00df\7"+
		"\'\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7%\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e5\7\35\2\2\u00e3\u00e5\7\36"+
		"\2\2\u00e4\u00c1\3\2\2\2\u00e4\u00c8\3\2\2\2\u00e4\u00d2\3\2\2\2\u00e4"+
		"\u00d3\3\2\2\2\u00e4\u00d4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\u0110\3\2\2\2\u00e6\u00e8\f\f\2\2\u00e7\u00e9\7\'\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\5\26"+
		"\f\2\u00eb\u00ed\7\'\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\5\16\b\r\u00ef\u010f\3\2\2\2\u00f0\u00f2\f"+
		"\13\2\2\u00f1\u00f3\7\'\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\5\30\r\2\u00f5\u00f7\7\'\2\2\u00f6\u00f5\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\5\16\b\f\u00f9"+
		"\u010f\3\2\2\2\u00fa\u00fc\f\n\2\2\u00fb\u00fd\7\'\2\2\u00fc\u00fb\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\5\32\16\2\u00ff"+
		"\u0101\7\'\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0103\5\16\b\13\u0103\u010f\3\2\2\2\u0104\u0106\f\t\2\2\u0105"+
		"\u0107\7\'\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u010a\5\34\17\2\u0109\u010b\7\'\2\2\u010a\u0109\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\5\16\b\n\u010d\u010f\3"+
		"\2\2\2\u010e\u00e6\3\2\2\2\u010e\u00f0\3\2\2\2\u010e\u00fa\3\2\2\2\u010e"+
		"\u0104\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\17\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0116\5\36\20\2\u0114"+
		"\u0116\7\t\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\21\3\2\2"+
		"\2\u0117\u0118\5\2\2\2\u0118\23\3\2\2\2\u0119\u011a\t\4\2\2\u011a\25\3"+
		"\2\2\2\u011b\u011c\t\5\2\2\u011c\27\3\2\2\2\u011d\u011e\t\6\2\2\u011e"+
		"\31\3\2\2\2\u011f\u0120\t\7\2\2\u0120\33\3\2\2\2\u0121\u0122\t\b\2\2\u0122"+
		"\35\3\2\2\2\u0123\u0128\7\3\2\2\u0124\u0126\5&\24\2\u0125\u0127\7E\2\2"+
		"\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0124"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012e\3\2\2\2\u012a\u012c\5$\23\2\u012b"+
		"\u012d\7E\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u012a\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0134\3\2\2\2\u0130"+
		"\u0132\5\"\22\2\u0131\u0133\7E\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0135\3\2\2\2\u0134\u0130\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0176\5(\25\2\u0137\u013c\7\3\2\2\u0138\u013a\5&"+
		"\24\2\u0139\u013b\7E\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0142\3\2"+
		"\2\2\u013e\u0140\5$\23\2\u013f\u0141\7E\2\2\u0140\u013f\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0146\5\"\22\2\u0145\u0147\7E\2\2\u0146"+
		"\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u014a\5("+
		"\25\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0176\3\2\2\2\u014b"+
		"\u0150\7\3\2\2\u014c\u014e\5&\24\2\u014d\u014f\7E\2\2\u014e\u014d\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014c\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\5$\23\2\u0153\u0155\7E"+
		"\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u015a\3\2\2\2\u0156"+
		"\u0158\5\"\22\2\u0157\u0159\7E\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015b\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u015e\5(\25\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u0176\3\2\2\2\u015f\u0160\7\3\2\2\u0160\u0162\5&\24\2\u0161"+
		"\u0163\7E\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0168\3\2"+
		"\2\2\u0164\u0166\5$\23\2\u0165\u0167\7E\2\2\u0166\u0165\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016e\3\2\2\2\u016a\u016c\5\"\22\2\u016b\u016d\7E\2\2\u016c"+
		"\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016a\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\5(\25\2\u0171"+
		"\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0176\3\2\2\2\u0173\u0174\7\3"+
		"\2\2\u0174\u0176\7,\2\2\u0175\u0123\3\2\2\2\u0175\u0137\3\2\2\2\u0175"+
		"\u014b\3\2\2\2\u0175\u015f\3\2\2\2\u0175\u0173\3\2\2\2\u0176\37\3\2\2"+
		"\2\u0177\u0178\7(\2\2\u0178!\3\2\2\2\u0179\u017b\5(\25\2\u017a\u0179\3"+
		"\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7)\2\2\u017d"+
		"#\3\2\2\2\u017e\u0180\5(\25\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2"+
		"\u0180\u0181\3\2\2\2\u0181\u0182\7*\2\2\u0182%\3\2\2\2\u0183\u0185\5("+
		"\25\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\7+\2\2\u0187\'\3\2\2\2\u0188\u018a\5\62\32\2\u0189\u0188\3\2\2"+
		"\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\5 \21\2\u018c\u018e"+
		"\7E\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\5*\26\2\u0190\u0197\3\2\2\2\u0191\u0193\5\62\32\2\u0192\u0191\3"+
		"\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\5 \21\2\u0195"+
		"\u0197\5*\26\2\u0196\u0189\3\2\2\2\u0196\u0192\3\2\2\2\u0196\u0195\3\2"+
		"\2\2\u0197)\3\2\2\2\u0198\u019c\5.\30\2\u0199\u019c\5\60\31\2\u019a\u019c"+
		"\5,\27\2\u019b\u0198\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c"+
		"+\3\2\2\2\u019d\u019e\t\t\2\2\u019e-\3\2\2\2\u019f\u01a6\7\67\2\2\u01a0"+
		"\u01a6\78\2\2\u01a1\u01a6\79\2\2\u01a2\u01a3\5\66\34\2\u01a3\u01a4\7<"+
		"\2\2\u01a4\u01a6\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a5"+
		"\u01a1\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a6/\3\2\2\2\u01a7\u01ac\58\35\2"+
		"\u01a8\u01aa\7\4\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ad\5\64\33\2\u01ac\u01a9\3\2\2\2\u01ac\u01ad\3\2\2\2"+
		"\u01ad\61\3\2\2\2\u01ae\u01af\5*\26\2\u01af\63\3\2\2\2\u01b0\u01b1\t\n"+
		"\2\2\u01b1\65\3\2\2\2\u01b2\u01b3\t\13\2\2\u01b3\67\3\2\2\2\u01b4\u01b5"+
		"\t\f\2\2\u01b59\3\2\2\2X>DIMVY]`hloswz}\u0081\u0085\u0088\u008b\u008e"+
		"\u0092\u0096\u0099\u009c\u00a0\u00a3\u00a7\u00ac\u00af\u00b3\u00b5\u00b9"+
		"\u00c4\u00ca\u00ce\u00d6\u00da\u00de\u00e4\u00e8\u00ec\u00f2\u00f6\u00fc"+
		"\u0100\u0106\u010a\u010e\u0110\u0115\u0126\u0128\u012c\u012e\u0132\u0134"+
		"\u013a\u013c\u0140\u0142\u0146\u0149\u014e\u0150\u0154\u0158\u015a\u015d"+
		"\u0162\u0166\u0168\u016c\u016e\u0171\u0175\u017a\u017f\u0184\u0189\u018d"+
		"\u0192\u0196\u019b\u01a5\u01a9\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}