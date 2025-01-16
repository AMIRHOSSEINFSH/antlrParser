package gen;



// Generated from C:/Users/User/OneDrive/Desktop/com/grammar/javaMinusMinus.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class javaMinusMinusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, AND=28, LT=29, PLUS=30, MINUS=31, TIMES=32, 
		POWER=33, NOT=34, LSB=35, RSB=36, DOTLENGTH=37, LP=38, RP=39, RETURN=40, 
		EQ=41, BooleanLiteral=42, NullLiteral=43, StringLiteral=44, Identifier=45, 
		IntegerLiteral=46, WS=47, MULTILINE_COMMENT=48, LINE_COMMENT=49;
	public static final int
		RULE_program = 0, RULE_importClass = 1, RULE_mainClass = 2, RULE_classDeclaration = 3, 
		RULE_interfaceDeclaration = 4, RULE_interfaceMethodDeclaration = 5, RULE_interfaceFieldDeclaration = 6, 
		RULE_fieldDeclaration = 7, RULE_localDeclaration = 8, RULE_varDeclaration = 9, 
		RULE_methodDeclaration = 10, RULE_constructorDeclaration = 11, RULE_abstractMethodDeclaration = 12, 
		RULE_parameterList = 13, RULE_parameter = 14, RULE_methodBody = 15, RULE_type = 16, 
		RULE_javaType = 17, RULE_accessModifier = 18, RULE_statement = 19, RULE_ifBlock = 20, 
		RULE_elseBlock = 21, RULE_whileBlock = 22, RULE_expressionOrString = 23, 
		RULE_expression = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importClass", "mainClass", "classDeclaration", "interfaceDeclaration", 
			"interfaceMethodDeclaration", "interfaceFieldDeclaration", "fieldDeclaration", 
			"localDeclaration", "varDeclaration", "methodDeclaration", "constructorDeclaration", 
			"abstractMethodDeclaration", "parameterList", "parameter", "methodBody", 
			"type", "javaType", "accessModifier", "statement", "ifBlock", "elseBlock", 
			"whileBlock", "expressionOrString", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "';'", "'class'", "'{'", "'public'", "'static'", "'void'", 
			"'main'", "'String'", "'}'", "'abstract'", "'extends'", "'implements'", 
			"','", "'interface'", "'@Override'", "'boolean'", "'int'", "'private'", 
			"'if'", "'else'", "'while'", "'for'", "'print'", "'.'", "'new'", "'this'", 
			"'&&'", "'<'", "'+'", "'-'", "'*'", "'**'", "'!'", "'['", "']'", "'.length'", 
			"'('", "')'", "'return'", "'='", null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "AND", "LT", "PLUS", "MINUS", "TIMES", "POWER", 
			"NOT", "LSB", "RSB", "DOTLENGTH", "LP", "RP", "RETURN", "EQ", "BooleanLiteral", 
			"NullLiteral", "StringLiteral", "Identifier", "IntegerLiteral", "WS", 
			"MULTILINE_COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "javaMinusMinus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public javaMinusMinusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(javaMinusMinusParser.EOF, 0); }
		public List<ImportClassContext> importClass() {
			return getRuleContexts(ImportClassContext.class);
		}
		public ImportClassContext importClass(int i) {
			return getRuleContext(ImportClassContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<InterfaceDeclarationContext> interfaceDeclaration() {
			return getRuleContexts(InterfaceDeclarationContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration(int i) {
			return getRuleContext(InterfaceDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(50);
				importClass();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			mainClass();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__10) {
				{
				{
				setState(57);
				classDeclaration();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(63);
				interfaceDeclaration();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportClassContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public ImportClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterImportClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitImportClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitImportClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportClassContext importClass() throws RecognitionException {
		ImportClassContext _localctx = new ImportClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			match(Identifier);
			setState(73);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(javaMinusMinusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(javaMinusMinusParser.Identifier, i);
		}
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public TerminalNode LSB() { return getToken(javaMinusMinusParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(javaMinusMinusParser.RSB, 0); }
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__2);
			setState(76);
			match(Identifier);
			setState(77);
			match(T__3);
			setState(78);
			match(T__4);
			setState(79);
			match(T__5);
			setState(80);
			match(T__6);
			setState(81);
			match(T__7);
			setState(82);
			match(LP);
			setState(83);
			match(T__8);
			setState(84);
			match(LSB);
			setState(85);
			match(RSB);
			setState(86);
			match(Identifier);
			setState(87);
			match(RP);
			setState(88);
			match(T__3);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184402890768L) != 0)) {
				{
				{
				setState(89);
				statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(T__9);
			setState(96);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(javaMinusMinusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(javaMinusMinusParser.Identifier, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<AbstractMethodDeclarationContext> abstractMethodDeclaration() {
			return getRuleContexts(AbstractMethodDeclarationContext.class);
		}
		public AbstractMethodDeclarationContext abstractMethodDeclaration(int i) {
			return getRuleContext(AbstractMethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(98);
				match(T__10);
				}
			}

			setState(101);
			match(T__2);
			setState(102);
			match(Identifier);
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(103);
				match(T__11);
				setState(104);
				match(Identifier);
				}
				break;
			case T__12:
				{
				setState(105);
				match(T__12);
				setState(106);
				match(Identifier);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(107);
					match(T__13);
					setState(108);
					match(Identifier);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				break;
			default:
				break;
			}
			setState(116);
			match(T__3);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					fieldDeclaration();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(123);
				constructorDeclaration();
				}
				break;
			}
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					methodDeclaration();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 591904L) != 0)) {
				{
				{
				setState(132);
				abstractMethodDeclaration();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public List<InterfaceFieldDeclarationContext> interfaceFieldDeclaration() {
			return getRuleContexts(InterfaceFieldDeclarationContext.class);
		}
		public InterfaceFieldDeclarationContext interfaceFieldDeclaration(int i) {
			return getRuleContext(InterfaceFieldDeclarationContext.class,i);
		}
		public List<InterfaceMethodDeclarationContext> interfaceMethodDeclaration() {
			return getRuleContexts(InterfaceMethodDeclarationContext.class);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration(int i) {
			return getRuleContext(InterfaceMethodDeclarationContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interfaceDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__14);
			setState(141);
			match(Identifier);
			setState(142);
			match(T__3);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					interfaceFieldDeclaration();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372482176L) != 0)) {
				{
				{
				setState(149);
				interfaceMethodDeclaration();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case Identifier:
				{
				setState(157);
				type();
				}
				break;
			case T__6:
				{
				setState(158);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(161);
			match(Identifier);
			setState(162);
			match(LP);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372482048L) != 0)) {
				{
				setState(163);
				parameterList();
				}
			}

			setState(166);
			match(RP);
			setState(167);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceFieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(javaMinusMinusParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InterfaceFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceFieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterInterfaceFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitInterfaceFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitInterfaceFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceFieldDeclarationContext interfaceFieldDeclaration() throws RecognitionException {
		InterfaceFieldDeclarationContext _localctx = new InterfaceFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceFieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			type();
			setState(170);
			match(Identifier);
			setState(171);
			match(EQ);
			setState(172);
			expression(0);
			setState(173);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			varDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(javaMinusMinusParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterLocalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitLocalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationContext localDeclaration() throws RecognitionException {
		LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_localDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			type();
			setState(178);
			match(Identifier);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(179);
				match(EQ);
				setState(180);
				expression(0);
				}
			}

			setState(183);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__18) {
				{
				setState(185);
				accessModifier();
				}
			}

			setState(188);
			type();
			setState(189);
			match(Identifier);
			setState(190);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(192);
				match(T__15);
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__18) {
				{
				setState(195);
				accessModifier();
				}
			}

			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case Identifier:
				{
				setState(198);
				type();
				}
				break;
			case T__6:
				{
				setState(199);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(202);
			match(Identifier);
			setState(203);
			match(LP);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372482048L) != 0)) {
				{
				{
				setState(204);
				parameterList();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(RP);
			setState(211);
			match(T__3);
			setState(212);
			methodBody();
			setState(213);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(215);
				match(T__15);
				}
			}

			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__18) {
				{
				setState(218);
				accessModifier();
				}
			}

			setState(221);
			match(Identifier);
			setState(222);
			match(LP);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372482048L) != 0)) {
				{
				{
				setState(223);
				parameterList();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(RP);
			setState(230);
			match(T__3);
			setState(231);
			methodBody();
			setState(232);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public AbstractMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterAbstractMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitAbstractMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitAbstractMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractMethodDeclarationContext abstractMethodDeclaration() throws RecognitionException {
		AbstractMethodDeclarationContext _localctx = new AbstractMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_abstractMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(234);
				match(T__15);
				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__18) {
				{
				setState(237);
				accessModifier();
				}
			}

			setState(240);
			match(T__10);
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case Identifier:
				{
				setState(241);
				type();
				}
				break;
			case T__6:
				{
				setState(242);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			match(Identifier);
			setState(246);
			match(LP);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372482048L) != 0)) {
				{
				{
				setState(247);
				parameterList();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(RP);
			setState(254);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			parameter();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(257);
				match(T__13);
				setState(258);
				parameter();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			type();
			setState(265);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public List<LocalDeclarationContext> localDeclaration() {
			return getRuleContexts(LocalDeclarationContext.class);
		}
		public LocalDeclarationContext localDeclaration(int i) {
			return getRuleContext(LocalDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(javaMinusMinusParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184402890768L) != 0)) {
				{
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(267);
					localDeclaration();
					}
					break;
				case 2:
					{
					setState(268);
					statement();
					}
					break;
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(274);
				match(RETURN);
				setState(275);
				expression(0);
				setState(276);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public JavaTypeContext javaType() {
			return getRuleContext(JavaTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public TerminalNode LSB() { return getToken(javaMinusMinusParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(javaMinusMinusParser.RSB, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
				{
				setState(280);
				javaType();
				}
				break;
			case Identifier:
				{
				setState(281);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(284);
				match(LSB);
				setState(285);
				match(RSB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JavaTypeContext extends ParserRuleContext {
		public JavaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterJavaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitJavaType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitJavaType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaTypeContext javaType() throws RecognitionException {
		JavaTypeContext _localctx = new JavaTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_javaType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__18) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public ExpressionOrStringContext expressionOrString() {
			return getRuleContext(ExpressionOrStringContext.class,0);
		}
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStatementContext extends StatementContext {
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfElseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentStatementContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(javaMinusMinusParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitVariableAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitVariableAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends StatementContext {
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalDeclarationContext localDeclaration() {
			return getRuleContext(LocalDeclarationContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalDeclarationStatementContext extends StatementContext {
		public LocalDeclarationContext localDeclaration() {
			return getRuleContext(LocalDeclarationContext.class,0);
		}
		public LocalDeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterLocalDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitLocalDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitLocalDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAssignmentStatementContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public TerminalNode LSB() { return getToken(javaMinusMinusParser.LSB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSB() { return getToken(javaMinusMinusParser.RSB, 0); }
		public TerminalNode EQ() { return getToken(javaMinusMinusParser.EQ, 0); }
		public ArrayAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterArrayAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitArrayAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitArrayAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NestedStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterNestedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitNestedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitNestedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		int _la;
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new NestedStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(T__3);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184402890768L) != 0)) {
					{
					{
					setState(293);
					statement();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(T__19);
				setState(301);
				match(LP);
				setState(302);
				expression(0);
				setState(303);
				match(RP);
				setState(304);
				statement();
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(305);
					match(T__20);
					setState(306);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(T__21);
				setState(310);
				match(LP);
				setState(311);
				expression(0);
				setState(312);
				match(RP);
				setState(313);
				statement();
				}
				break;
			case 4:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(T__22);
				setState(316);
				match(LP);
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(317);
					localDeclaration();
					}
					break;
				}
				setState(320);
				expression(0);
				setState(321);
				match(T__1);
				setState(322);
				expression(0);
				setState(323);
				match(RP);
				setState(324);
				statement();
				}
				break;
			case 5:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				match(T__23);
				setState(327);
				match(LP);
				setState(328);
				expressionOrString();
				setState(329);
				match(RP);
				setState(330);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new VariableAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				match(Identifier);
				setState(333);
				match(EQ);
				setState(334);
				expression(0);
				setState(335);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new ArrayAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(337);
				match(Identifier);
				setState(338);
				match(LSB);
				setState(339);
				expression(0);
				setState(340);
				match(RSB);
				setState(341);
				match(EQ);
				setState(342);
				expression(0);
				setState(343);
				match(T__1);
				}
				break;
			case 8:
				_localctx = new LocalDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(345);
				localDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileBlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOrStringContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(javaMinusMinusParser.StringLiteral, 0); }
		public ExpressionOrStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOrString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterExpressionOrString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitExpressionOrString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitExpressionOrString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOrStringContext expressionOrString() throws RecognitionException {
		ExpressionOrStringContext _localctx = new ExpressionOrStringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionOrString);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__16:
			case T__17:
			case T__25:
			case T__26:
			case NOT:
			case LP:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				expression(0);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(StringLiteral);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class LtExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(javaMinusMinusParser.LT, 0); }
		public LtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterLtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitLtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitLtExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInstantiationExpressionContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ObjectInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterObjectInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitObjectInstantiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitObjectInstantiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInstantiationExpressionContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LSB() { return getToken(javaMinusMinusParser.LSB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSB() { return getToken(javaMinusMinusParser.RSB, 0); }
		public ArrayInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterArrayInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitArrayInstantiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitArrayInstantiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(javaMinusMinusParser.POWER, 0); }
		public PowExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterPowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitPowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitPowExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Set_typeContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public Set_typeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterSet_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitSet_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitSet_type(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(javaMinusMinusParser.Identifier, 0); }
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(javaMinusMinusParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLitExpressionContext extends ExpressionContext {
		public TerminalNode BooleanLiteral() { return getToken(javaMinusMinusParser.BooleanLiteral, 0); }
		public BooleanLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterBooleanLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitBooleanLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitBooleanLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends ExpressionContext {
		public TerminalNode LP() { return getToken(javaMinusMinusParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(javaMinusMinusParser.RP, 0); }
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLitExpressionContext extends ExpressionContext {
		public TerminalNode IntegerLiteral() { return getToken(javaMinusMinusParser.IntegerLiteral, 0); }
		public IntLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterIntLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitIntLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitIntLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ExpressionContext {
		public LocalDeclarationContext localDeclaration() {
			return getRuleContext(LocalDeclarationContext.class,0);
		}
		public VariableDeclarationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLitExpressionContext extends ExpressionContext {
		public TerminalNode NullLiteral() { return getToken(javaMinusMinusParser.NullLiteral, 0); }
		public NullLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterNullLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitNullLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitNullLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(javaMinusMinusParser.AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LSB() { return getToken(javaMinusMinusParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(javaMinusMinusParser.RSB, 0); }
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(javaMinusMinusParser.PLUS, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExpressionContext extends ExpressionContext {
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLengthExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOTLENGTH() { return getToken(javaMinusMinusParser.DOTLENGTH, 0); }
		public ArrayLengthExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterArrayLengthExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitArrayLengthExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitArrayLengthExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntArrayInstantiationExpressionContext extends ExpressionContext {
		public List<TerminalNode> IntegerLiteral() { return getTokens(javaMinusMinusParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(javaMinusMinusParser.IntegerLiteral, i);
		}
		public IntArrayInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterIntArrayInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitIntArrayInstantiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitIntArrayInstantiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(javaMinusMinusParser.MINUS, 0); }
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(javaMinusMinusParser.TIMES, 0); }
		public MulExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaMinusMinusListener ) ((javaMinusMinusListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaMinusMinusVisitor ) return ((javaMinusMinusVisitor<? extends T>)visitor).visitMulExpression(this);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				_localctx = new Set_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(359);
				match(Identifier);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360);
				match(NOT);
				setState(361);
				expression(17);
				}
				break;
			case 3:
				{
				_localctx = new ObjectInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(362);
				match(T__25);
				setState(363);
				type();
				setState(364);
				match(LP);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 119039515295760L) != 0)) {
					{
					setState(365);
					expression(0);
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(366);
						match(T__13);
						setState(367);
						expression(0);
						}
						}
						setState(372);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(375);
				match(RP);
				}
				break;
			case 4:
				{
				_localctx = new ArrayInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(377);
				match(T__25);
				setState(378);
				type();
				setState(379);
				match(LSB);
				setState(380);
				expression(0);
				setState(381);
				match(RSB);
				}
				break;
			case 5:
				{
				_localctx = new IntArrayInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(383);
				match(T__3);
				setState(384);
				match(IntegerLiteral);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(385);
					match(T__13);
					setState(386);
					match(IntegerLiteral);
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new IntLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(393);
				match(IntegerLiteral);
				}
				break;
			case 7:
				{
				_localctx = new BooleanLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(394);
				match(BooleanLiteral);
				}
				break;
			case 8:
				{
				_localctx = new NullLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(395);
				match(NullLiteral);
				}
				break;
			case 9:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(396);
				match(Identifier);
				}
				break;
			case 10:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(397);
				match(T__26);
				}
				break;
			case 11:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(398);
				match(LP);
				setState(399);
				expression(0);
				setState(400);
				match(RP);
				}
				break;
			case 12:
				{
				_localctx = new VariableDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(402);
				localDeclaration();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(445);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new PowExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(405);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(406);
						match(POWER);
						setState(407);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(408);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(409);
						match(TIMES);
						setState(410);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(411);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(412);
						match(PLUS);
						setState(413);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(414);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(415);
						match(MINUS);
						setState(416);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new LtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(417);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(418);
						match(LT);
						setState(419);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(420);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(421);
						match(AND);
						setState(422);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(423);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(424);
						match(LSB);
						setState(425);
						expression(0);
						setState(426);
						match(RSB);
						}
						break;
					case 8:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(428);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(429);
						match(DOTLENGTH);
						}
						break;
					case 9:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(430);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(431);
						match(T__24);
						setState(432);
						match(Identifier);
						setState(433);
						match(LP);
						setState(442);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 119039515295760L) != 0)) {
							{
							setState(434);
							expression(0);
							setState(439);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__13) {
								{
								{
								setState(435);
								match(T__13);
								setState(436);
								expression(0);
								}
								}
								setState(441);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(444);
						match(RP);
						}
						break;
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 21);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u01c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t\u0000\u0001\u0000"+
		"\u0005\u0000A\b\u0000\n\u0000\f\u0000D\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002[\b\u0002\n\u0002\f\u0002^\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003d\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003n\b\u0003\n\u0003\f\u0003q\t\u0003\u0003\u0003"+
		"s\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003w\b\u0003\n\u0003\f\u0003"+
		"z\t\u0003\u0001\u0003\u0003\u0003}\b\u0003\u0001\u0003\u0005\u0003\u0080"+
		"\b\u0003\n\u0003\f\u0003\u0083\t\u0003\u0001\u0003\u0005\u0003\u0086\b"+
		"\u0003\n\u0003\f\u0003\u0089\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0091\b\u0004\n\u0004"+
		"\f\u0004\u0094\t\u0004\u0001\u0004\u0005\u0004\u0097\b\u0004\n\u0004\f"+
		"\u0004\u009a\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00a0\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a5"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b6\b\b\u0001\b\u0001\b\u0001\t\u0003"+
		"\t\u00bb\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0003\n\u00c2\b\n"+
		"\u0001\n\u0003\n\u00c5\b\n\u0001\n\u0001\n\u0003\n\u00c9\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00ce\b\n\n\n\f\n\u00d1\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0003\u000b\u00d9\b\u000b\u0001\u000b\u0003"+
		"\u000b\u00dc\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e1"+
		"\b\u000b\n\u000b\f\u000b\u00e4\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0003\f\u00ec\b\f\u0001\f\u0003\f\u00ef"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f4\b\f\u0001\f\u0001\f\u0001\f"+
		"\u0005\f\u00f9\b\f\n\f\f\f\u00fc\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u0104\b\r\n\r\f\r\u0107\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u010e\b\u000f\n\u000f"+
		"\f\u000f\u0111\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0117\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u011b\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u011f\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0127"+
		"\b\u0013\n\u0013\f\u0013\u012a\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0134\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u013f\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u015b\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0165\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0171\b\u0018\n\u0018\f\u0018\u0174\t\u0018\u0003\u0018\u0176"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0184\b\u0018\n\u0018\f\u0018\u0187\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0194\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u01b6\b\u0018\n\u0018\f\u0018\u01b9"+
		"\t\u0018\u0003\u0018\u01bb\b\u0018\u0001\u0018\u0005\u0018\u01be\b\u0018"+
		"\n\u0018\f\u0018\u01c1\t\u0018\u0001\u0018\u0000\u00010\u0019\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.0\u0000\u0002\u0001\u0000\u0011\u0012\u0002\u0000\u0005\u0005"+
		"\u0013\u0013\u01f0\u00005\u0001\u0000\u0000\u0000\u0002G\u0001\u0000\u0000"+
		"\u0000\u0004K\u0001\u0000\u0000\u0000\u0006c\u0001\u0000\u0000\u0000\b"+
		"\u008c\u0001\u0000\u0000\u0000\n\u009f\u0001\u0000\u0000\u0000\f\u00a9"+
		"\u0001\u0000\u0000\u0000\u000e\u00af\u0001\u0000\u0000\u0000\u0010\u00b1"+
		"\u0001\u0000\u0000\u0000\u0012\u00ba\u0001\u0000\u0000\u0000\u0014\u00c1"+
		"\u0001\u0000\u0000\u0000\u0016\u00d8\u0001\u0000\u0000\u0000\u0018\u00eb"+
		"\u0001\u0000\u0000\u0000\u001a\u0100\u0001\u0000\u0000\u0000\u001c\u0108"+
		"\u0001\u0000\u0000\u0000\u001e\u010f\u0001\u0000\u0000\u0000 \u011a\u0001"+
		"\u0000\u0000\u0000\"\u0120\u0001\u0000\u0000\u0000$\u0122\u0001\u0000"+
		"\u0000\u0000&\u015a\u0001\u0000\u0000\u0000(\u015c\u0001\u0000\u0000\u0000"+
		"*\u015e\u0001\u0000\u0000\u0000,\u0160\u0001\u0000\u0000\u0000.\u0164"+
		"\u0001\u0000\u0000\u00000\u0193\u0001\u0000\u0000\u000024\u0003\u0002"+
		"\u0001\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u00008<\u0003\u0004\u0002\u00009;\u0003\u0006\u0003"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=B\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?A\u0003\b\u0004\u0000@?\u0001\u0000\u0000\u0000AD\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u0000\u0000"+
		"\u0001F\u0001\u0001\u0000\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0005"+
		"-\u0000\u0000IJ\u0005\u0002\u0000\u0000J\u0003\u0001\u0000\u0000\u0000"+
		"KL\u0005\u0003\u0000\u0000LM\u0005-\u0000\u0000MN\u0005\u0004\u0000\u0000"+
		"NO\u0005\u0005\u0000\u0000OP\u0005\u0006\u0000\u0000PQ\u0005\u0007\u0000"+
		"\u0000QR\u0005\b\u0000\u0000RS\u0005&\u0000\u0000ST\u0005\t\u0000\u0000"+
		"TU\u0005#\u0000\u0000UV\u0005$\u0000\u0000VW\u0005-\u0000\u0000WX\u0005"+
		"\'\u0000\u0000X\\\u0005\u0004\u0000\u0000Y[\u0003&\u0013\u0000ZY\u0001"+
		"\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000_`\u0005\n\u0000\u0000`a\u0005\n\u0000\u0000a\u0005\u0001\u0000"+
		"\u0000\u0000bd\u0005\u000b\u0000\u0000cb\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0005\u0003\u0000\u0000"+
		"fr\u0005-\u0000\u0000gh\u0005\f\u0000\u0000hs\u0005-\u0000\u0000ij\u0005"+
		"\r\u0000\u0000jo\u0005-\u0000\u0000kl\u0005\u000e\u0000\u0000ln\u0005"+
		"-\u0000\u0000mk\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000rg\u0001\u0000\u0000\u0000ri\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tx\u0005\u0004"+
		"\u0000\u0000uw\u0003\u000e\u0007\u0000vu\u0001\u0000\u0000\u0000wz\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{}\u0003\u0016\u000b"+
		"\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0081\u0001"+
		"\u0000\u0000\u0000~\u0080\u0003\u0014\n\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0087\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u0018\f\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\n\u0000\u0000\u008b\u0007\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005\u000f\u0000\u0000\u008d\u008e\u0005-\u0000\u0000\u008e\u0092"+
		"\u0005\u0004\u0000\u0000\u008f\u0091\u0003\f\u0006\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0098\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0097\u0003"+
		"\n\u0005\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005\n\u0000\u0000\u009c\t\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0003 \u0010\u0000\u009e\u00a0\u0005\u0007\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005-\u0000\u0000\u00a2"+
		"\u00a4\u0005&\u0000\u0000\u00a3\u00a5\u0003\u001a\r\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\'\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0002\u0000\u0000\u00a8\u000b\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003"+
		" \u0010\u0000\u00aa\u00ab\u0005-\u0000\u0000\u00ab\u00ac\u0005)\u0000"+
		"\u0000\u00ac\u00ad\u00030\u0018\u0000\u00ad\u00ae\u0005\u0002\u0000\u0000"+
		"\u00ae\r\u0001\u0000\u0000\u0000\u00af\u00b0\u0003\u0012\t\u0000\u00b0"+
		"\u000f\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003 \u0010\u0000\u00b2\u00b5"+
		"\u0005-\u0000\u0000\u00b3\u00b4\u0005)\u0000\u0000\u00b4\u00b6\u00030"+
		"\u0018\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0002"+
		"\u0000\u0000\u00b8\u0011\u0001\u0000\u0000\u0000\u00b9\u00bb\u0003$\u0012"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003 \u0010\u0000"+
		"\u00bd\u00be\u0005-\u0000\u0000\u00be\u00bf\u0005\u0002\u0000\u0000\u00bf"+
		"\u0013\u0001\u0000\u0000\u0000\u00c0\u00c2\u0005\u0010\u0000\u0000\u00c1"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003$\u0012\u0000\u00c4\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c9\u0003 \u0010\u0000\u00c7\u00c9\u0005"+
		"\u0007\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005"+
		"-\u0000\u0000\u00cb\u00cf\u0005&\u0000\u0000\u00cc\u00ce\u0003\u001a\r"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0005\'\u0000\u0000\u00d3\u00d4\u0005\u0004\u0000\u0000"+
		"\u00d4\u00d5\u0003\u001e\u000f\u0000\u00d5\u00d6\u0005\n\u0000\u0000\u00d6"+
		"\u0015\u0001\u0000\u0000\u0000\u00d7\u00d9\u0005\u0010\u0000\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00db\u0001\u0000\u0000\u0000\u00da\u00dc\u0003$\u0012\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0005-\u0000\u0000\u00de\u00e2\u0005"+
		"&\u0000\u0000\u00df\u00e1\u0003\u001a\r\u0000\u00e0\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\'\u0000"+
		"\u0000\u00e6\u00e7\u0005\u0004\u0000\u0000\u00e7\u00e8\u0003\u001e\u000f"+
		"\u0000\u00e8\u00e9\u0005\n\u0000\u0000\u00e9\u0017\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ec\u0005\u0010\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0003$\u0012\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f3\u0005\u000b\u0000\u0000\u00f1\u00f4\u0003 \u0010\u0000\u00f2\u00f4"+
		"\u0005\u0007\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0005-\u0000\u0000\u00f6\u00fa\u0005&\u0000\u0000\u00f7\u00f9\u0003\u001a"+
		"\r\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0005\'\u0000\u0000\u00fe\u00ff\u0005\u0002\u0000\u0000"+
		"\u00ff\u0019\u0001\u0000\u0000\u0000\u0100\u0105\u0003\u001c\u000e\u0000"+
		"\u0101\u0102\u0005\u000e\u0000\u0000\u0102\u0104\u0003\u001c\u000e\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u001b\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0003 \u0010\u0000\u0109\u010a\u0005-\u0000\u0000\u010a\u001d"+
		"\u0001\u0000\u0000\u0000\u010b\u010e\u0003\u0010\b\u0000\u010c\u010e\u0003"+
		"&\u0013\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0116\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0005(\u0000"+
		"\u0000\u0113\u0114\u00030\u0018\u0000\u0114\u0115\u0005\u0002\u0000\u0000"+
		"\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0112\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u001f\u0001\u0000\u0000\u0000"+
		"\u0118\u011b\u0003\"\u0011\u0000\u0119\u011b\u0005-\u0000\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b"+
		"\u011e\u0001\u0000\u0000\u0000\u011c\u011d\u0005#\u0000\u0000\u011d\u011f"+
		"\u0005$\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f!\u0001\u0000\u0000\u0000\u0120\u0121\u0007\u0000"+
		"\u0000\u0000\u0121#\u0001\u0000\u0000\u0000\u0122\u0123\u0007\u0001\u0000"+
		"\u0000\u0123%\u0001\u0000\u0000\u0000\u0124\u0128\u0005\u0004\u0000\u0000"+
		"\u0125\u0127\u0003&\u0013\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a"+
		"\u0128\u0001\u0000\u0000\u0000\u012b\u015b\u0005\n\u0000\u0000\u012c\u012d"+
		"\u0005\u0014\u0000\u0000\u012d\u012e\u0005&\u0000\u0000\u012e\u012f\u0003"+
		"0\u0018\u0000\u012f\u0130\u0005\'\u0000\u0000\u0130\u0133\u0003&\u0013"+
		"\u0000\u0131\u0132\u0005\u0015\u0000\u0000\u0132\u0134\u0003&\u0013\u0000"+
		"\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000"+
		"\u0134\u015b\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0016\u0000\u0000"+
		"\u0136\u0137\u0005&\u0000\u0000\u0137\u0138\u00030\u0018\u0000\u0138\u0139"+
		"\u0005\'\u0000\u0000\u0139\u013a\u0003&\u0013\u0000\u013a\u015b\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005\u0017\u0000\u0000\u013c\u013e\u0005"+
		"&\u0000\u0000\u013d\u013f\u0003\u0010\b\u0000\u013e\u013d\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u00030\u0018\u0000\u0141\u0142\u0005\u0002\u0000"+
		"\u0000\u0142\u0143\u00030\u0018\u0000\u0143\u0144\u0005\'\u0000\u0000"+
		"\u0144\u0145\u0003&\u0013\u0000\u0145\u015b\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0005\u0018\u0000\u0000\u0147\u0148\u0005&\u0000\u0000\u0148\u0149"+
		"\u0003.\u0017\u0000\u0149\u014a\u0005\'\u0000\u0000\u014a\u014b\u0005"+
		"\u0002\u0000\u0000\u014b\u015b\u0001\u0000\u0000\u0000\u014c\u014d\u0005"+
		"-\u0000\u0000\u014d\u014e\u0005)\u0000\u0000\u014e\u014f\u00030\u0018"+
		"\u0000\u014f\u0150\u0005\u0002\u0000\u0000\u0150\u015b\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0005-\u0000\u0000\u0152\u0153\u0005#\u0000\u0000\u0153"+
		"\u0154\u00030\u0018\u0000\u0154\u0155\u0005$\u0000\u0000\u0155\u0156\u0005"+
		")\u0000\u0000\u0156\u0157\u00030\u0018\u0000\u0157\u0158\u0005\u0002\u0000"+
		"\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u015b\u0003\u0010\b\u0000"+
		"\u015a\u0124\u0001\u0000\u0000\u0000\u015a\u012c\u0001\u0000\u0000\u0000"+
		"\u015a\u0135\u0001\u0000\u0000\u0000\u015a\u013b\u0001\u0000\u0000\u0000"+
		"\u015a\u0146\u0001\u0000\u0000\u0000\u015a\u014c\u0001\u0000\u0000\u0000"+
		"\u015a\u0151\u0001\u0000\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000"+
		"\u015b\'\u0001\u0000\u0000\u0000\u015c\u015d\u0003&\u0013\u0000\u015d"+
		")\u0001\u0000\u0000\u0000\u015e\u015f\u0003&\u0013\u0000\u015f+\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0003&\u0013\u0000\u0161-\u0001\u0000\u0000"+
		"\u0000\u0162\u0165\u00030\u0018\u0000\u0163\u0165\u0005,\u0000\u0000\u0164"+
		"\u0162\u0001\u0000\u0000\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165"+
		"/\u0001\u0000\u0000\u0000\u0166\u0167\u0006\u0018\uffff\uffff\u0000\u0167"+
		"\u0194\u0005-\u0000\u0000\u0168\u0169\u0005\"\u0000\u0000\u0169\u0194"+
		"\u00030\u0018\u0011\u016a\u016b\u0005\u001a\u0000\u0000\u016b\u016c\u0003"+
		" \u0010\u0000\u016c\u0175\u0005&\u0000\u0000\u016d\u0172\u00030\u0018"+
		"\u0000\u016e\u016f\u0005\u000e\u0000\u0000\u016f\u0171\u00030\u0018\u0000"+
		"\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000"+
		"\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0175\u016d\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0005\'\u0000\u0000\u0178"+
		"\u0194\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u001a\u0000\u0000\u017a"+
		"\u017b\u0003 \u0010\u0000\u017b\u017c\u0005#\u0000\u0000\u017c\u017d\u0003"+
		"0\u0018\u0000\u017d\u017e\u0005$\u0000\u0000\u017e\u0194\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0005\u0004\u0000\u0000\u0180\u0185\u0005.\u0000\u0000"+
		"\u0181\u0182\u0005\u000e\u0000\u0000\u0182\u0184\u0005.\u0000\u0000\u0183"+
		"\u0181\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"\u0188\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188"+
		"\u0194\u0005\n\u0000\u0000\u0189\u0194\u0005.\u0000\u0000\u018a\u0194"+
		"\u0005*\u0000\u0000\u018b\u0194\u0005+\u0000\u0000\u018c\u0194\u0005-"+
		"\u0000\u0000\u018d\u0194\u0005\u001b\u0000\u0000\u018e\u018f\u0005&\u0000"+
		"\u0000\u018f\u0190\u00030\u0018\u0000\u0190\u0191\u0005\'\u0000\u0000"+
		"\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0194\u0003\u0010\b\u0000\u0193"+
		"\u0166\u0001\u0000\u0000\u0000\u0193\u0168\u0001\u0000\u0000\u0000\u0193"+
		"\u016a\u0001\u0000\u0000\u0000\u0193\u0179\u0001\u0000\u0000\u0000\u0193"+
		"\u017f\u0001\u0000\u0000\u0000\u0193\u0189\u0001\u0000\u0000\u0000\u0193"+
		"\u018a\u0001\u0000\u0000\u0000\u0193\u018b\u0001\u0000\u0000\u0000\u0193"+
		"\u018c\u0001\u0000\u0000\u0000\u0193\u018d\u0001\u0000\u0000\u0000\u0193"+
		"\u018e\u0001\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194"+
		"\u01bf\u0001\u0000\u0000\u0000\u0195\u0196\n\r\u0000\u0000\u0196\u0197"+
		"\u0005!\u0000\u0000\u0197\u01be\u00030\u0018\u000e\u0198\u0199\n\f\u0000"+
		"\u0000\u0199\u019a\u0005 \u0000\u0000\u019a\u01be\u00030\u0018\r\u019b"+
		"\u019c\n\u000b\u0000\u0000\u019c\u019d\u0005\u001e\u0000\u0000\u019d\u01be"+
		"\u00030\u0018\f\u019e\u019f\n\n\u0000\u0000\u019f\u01a0\u0005\u001f\u0000"+
		"\u0000\u01a0\u01be\u00030\u0018\u000b\u01a1\u01a2\n\t\u0000\u0000\u01a2"+
		"\u01a3\u0005\u001d\u0000\u0000\u01a3\u01be\u00030\u0018\n\u01a4\u01a5"+
		"\n\b\u0000\u0000\u01a5\u01a6\u0005\u001c\u0000\u0000\u01a6\u01be\u0003"+
		"0\u0018\t\u01a7\u01a8\n\u0015\u0000\u0000\u01a8\u01a9\u0005#\u0000\u0000"+
		"\u01a9\u01aa\u00030\u0018\u0000\u01aa\u01ab\u0005$\u0000\u0000\u01ab\u01be"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\n\u0013\u0000\u0000\u01ad\u01be\u0005"+
		"%\u0000\u0000\u01ae\u01af\n\u0012\u0000\u0000\u01af\u01b0\u0005\u0019"+
		"\u0000\u0000\u01b0\u01b1\u0005-\u0000\u0000\u01b1\u01ba\u0005&\u0000\u0000"+
		"\u01b2\u01b7\u00030\u0018\u0000\u01b3\u01b4\u0005\u000e\u0000\u0000\u01b4"+
		"\u01b6\u00030\u0018\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7"+
		"\u0001\u0000\u0000\u0000\u01ba\u01b2\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be"+
		"\u0005\'\u0000\u0000\u01bd\u0195\u0001\u0000\u0000\u0000\u01bd\u0198\u0001"+
		"\u0000\u0000\u0000\u01bd\u019b\u0001\u0000\u0000\u0000\u01bd\u019e\u0001"+
		"\u0000\u0000\u0000\u01bd\u01a1\u0001\u0000\u0000\u0000\u01bd\u01a4\u0001"+
		"\u0000\u0000\u0000\u01bd\u01a7\u0001\u0000\u0000\u0000\u01bd\u01ac\u0001"+
		"\u0000\u0000\u0000\u01bd\u01ae\u0001\u0000\u0000\u0000\u01be\u01c1\u0001"+
		"\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c01\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000"+
		"\u0000\u0000/5<B\\corx|\u0081\u0087\u0092\u0098\u009f\u00a4\u00b5\u00ba"+
		"\u00c1\u00c4\u00c8\u00cf\u00d8\u00db\u00e2\u00eb\u00ee\u00f3\u00fa\u0105"+
		"\u010d\u010f\u0116\u011a\u011e\u0128\u0133\u013e\u015a\u0164\u0172\u0175"+
		"\u0185\u0193\u01b7\u01ba\u01bd\u01bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}