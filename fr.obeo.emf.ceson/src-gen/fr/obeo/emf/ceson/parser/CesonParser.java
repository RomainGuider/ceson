// Generated from Ceson.g4 by ANTLR 4.3
package fr.obeo.emf.ceson.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CesonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, Boolean=11, WS=12, SL_COMMENT=13, ML_COMMENT=14, ID=15, Int=16, 
		Date=17, Float=18, String=19;
	public static final String[] tokenNames = {
		"<INVALID>", "':'", "'{'", "'['", "';'", "','", "'}'", "']'", "'='", "'>'", 
		"'.'", "Boolean", "WS", "SL_COMMENT", "ML_COMMENT", "ID", "Int", "Date", 
		"Float", "String"
	};
	public static final int
		RULE_model = 0, RULE_definition = 1, RULE_value = 2, RULE_array = 3, RULE_object = 4, 
		RULE_featureList = 5, RULE_enumName = 6, RULE_className = 7, RULE_feature = 8;
	public static final String[] ruleNames = {
		"model", "definition", "value", "array", "object", "featureList", "enumName", 
		"className", "feature"
	};

	@Override
	public String getGrammarFileName() { return "Ceson.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CesonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); definition();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(19); match(T__6);
				setState(20); definition();
				}
				}
				setState(25);
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CesonParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(ID);
			setState(27); match(T__2);
			setState(28); value();
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RealLiteralContext extends ValueContext {
		public TerminalNode Float() { return getToken(CesonParser.Float, 0); }
		public RealLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterRealLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitRealLiteral(this);
		}
	}
	public static class RefContext extends ValueContext {
		public TerminalNode ID() { return getToken(CesonParser.ID, 0); }
		public RefContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitRef(this);
		}
	}
	public static class ObjectLiteralContext extends ValueContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitObjectLiteral(this);
		}
	}
	public static class StringLiteralContext extends ValueContext {
		public TerminalNode String() { return getToken(CesonParser.String, 0); }
		public StringLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitStringLiteral(this);
		}
	}
	public static class DateLiteralContext extends ValueContext {
		public TerminalNode Date() { return getToken(CesonParser.Date, 0); }
		public DateLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitDateLiteral(this);
		}
	}
	public static class BooleanLiteralContext extends ValueContext {
		public TerminalNode Boolean() { return getToken(CesonParser.Boolean, 0); }
		public BooleanLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitBooleanLiteral(this);
		}
	}
	public static class IntLiteralContext extends ValueContext {
		public TerminalNode Int() { return getToken(CesonParser.Int, 0); }
		public IntLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitIntLiteral(this);
		}
	}
	public static class EnumLiteralContext extends ValueContext {
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public EnumLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterEnumLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitEnumLiteral(this);
		}
	}
	public static class ArrayLiteralContext extends ValueContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitArrayLiteral(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(39);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new RefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30); match(ID);
				}
				break;

			case 2:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31); match(Int);
				}
				break;

			case 3:
				_localctx = new RealLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32); match(Float);
				}
				break;

			case 4:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33); match(String);
				}
				break;

			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(34); match(Boolean);
				}
				break;

			case 6:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(35); match(Date);
				}
				break;

			case 7:
				_localctx = new EnumLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(36); enumName();
				}
				break;

			case 8:
				_localctx = new ObjectLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(37); object();
				}
				break;

			case 9:
				_localctx = new ArrayLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(38); array();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(T__7);
			setState(50);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << Boolean) | (1L << ID) | (1L << Int) | (1L << Date) | (1L << Float) | (1L << String))) != 0)) {
				{
				setState(42); value();
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(43); match(T__5);
					setState(44); value();
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(52); match(T__3);
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

	public static class ObjectContext extends ParserRuleContext {
		public FeatureListContext featureList() {
			return getRuleContext(FeatureListContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); className();
			setState(55); match(T__8);
			setState(56); featureList();
			setState(57); match(T__4);
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

	public static class FeatureListContext extends ParserRuleContext {
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterFeatureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitFeatureList(this);
		}
	}

	public final FeatureListContext featureList() throws RecognitionException {
		FeatureListContext _localctx = new FeatureListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_featureList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(59); feature();
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(60); match(T__5);
					setState(61); feature();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class EnumNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CesonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CesonParser.ID, i);
		}
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitEnumName(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(69); match(ID);
				setState(70); match(T__0);
				}
				break;
			}
			setState(73); match(ID);
			setState(74); match(T__0);
			setState(75); match(ID);
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

	public static class ClassNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CesonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CesonParser.ID, i);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(77); match(ID);
				setState(78); match(T__0);
				}
				break;
			}
			setState(81); match(ID);
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

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReferenceContext extends FeatureContext {
		public TerminalNode ID() { return getToken(CesonParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReferenceContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitReference(this);
		}
	}
	public static class ContainmentContext extends FeatureContext {
		public TerminalNode ID() { return getToken(CesonParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ContainmentContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).enterContainment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CesonListener ) ((CesonListener)listener).exitContainment(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_feature);
		try {
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ContainmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83); match(ID);
				setState(84); match(T__9);
				setState(85); value();
				}
				break;

			case 2:
				_localctx = new ReferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86); match(ID);
				setState(87); match(T__1);
				setState(88); value();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\7\5\60\n\5\f\5\16\5\63\13\5\5\5\65"+
		"\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7\5"+
		"\7F\n\7\3\b\3\b\5\bJ\n\b\3\b\3\b\3\b\3\b\3\t\3\t\5\tR\n\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\\\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2d\2"+
		"\24\3\2\2\2\4\34\3\2\2\2\6)\3\2\2\2\b+\3\2\2\2\n8\3\2\2\2\fE\3\2\2\2\16"+
		"I\3\2\2\2\20Q\3\2\2\2\22[\3\2\2\2\24\31\5\4\3\2\25\26\7\6\2\2\26\30\5"+
		"\4\3\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3"+
		"\2\2\2\33\31\3\2\2\2\34\35\7\21\2\2\35\36\7\n\2\2\36\37\5\6\4\2\37\5\3"+
		"\2\2\2 *\7\21\2\2!*\7\22\2\2\"*\7\24\2\2#*\7\25\2\2$*\7\r\2\2%*\7\23\2"+
		"\2&*\5\16\b\2\'*\5\n\6\2(*\5\b\5\2) \3\2\2\2)!\3\2\2\2)\"\3\2\2\2)#\3"+
		"\2\2\2)$\3\2\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\7\3\2\2\2+"+
		"\64\7\5\2\2,\61\5\6\4\2-.\7\7\2\2.\60\5\6\4\2/-\3\2\2\2\60\63\3\2\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\64,\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\3\2\2\2\66\67\7\t\2\2\67\t\3\2\2\289\5\20\t\29:\7\4"+
		"\2\2:;\5\f\7\2;<\7\b\2\2<\13\3\2\2\2=B\5\22\n\2>?\7\7\2\2?A\5\22\n\2@"+
		">\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DB\3\2\2\2E=\3\2\2\2"+
		"EF\3\2\2\2F\r\3\2\2\2GH\7\21\2\2HJ\7\f\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2"+
		"\2KL\7\21\2\2LM\7\f\2\2MN\7\21\2\2N\17\3\2\2\2OP\7\21\2\2PR\7\f\2\2QO"+
		"\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\21\2\2T\21\3\2\2\2UV\7\21\2\2VW\7\3\2"+
		"\2W\\\5\6\4\2XY\7\21\2\2YZ\7\13\2\2Z\\\5\6\4\2[U\3\2\2\2[X\3\2\2\2\\\23"+
		"\3\2\2\2\13\31)\61\64BEIQ[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}