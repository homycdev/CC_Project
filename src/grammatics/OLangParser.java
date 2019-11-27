package grammatics;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OLangParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, LPAREN = 3, RPAREN = 4, LBRACE = 5, RBRACE = 6, LBRACK = 7, RBRACK = 8,
            SEMI = 9, COMMA = 10, DOT = 11, END = 12, VAR = 13, CLASS = 14, METHOD = 15, EXTENDS = 16,
            WHILE = 17, THIS = 18, LOOP = 19, IF = 20, THEN = 21, ELSE = 22, RETURN = 23, IS = 24,
            Identifier = 25, IntegerLiteral = 26, BooleanLiteral = 27, RealLiteral = 28, StringLiteral = 29;
    public static final int
            RULE_classDeclaration = 0, RULE_className = 1, RULE_memberDeclaration = 2,
            RULE_variableDeclaration = 3, RULE_methodDeclaration = 4, RULE_parameters = 5,
            RULE_parameterDeclaration = 6, RULE_body = 7, RULE_constructorDeclaration = 8,
            RULE_statement = 9, RULE_assignment = 10, RULE_whileLoop = 11, RULE_ifStatement = 12,
            RULE_returnStatement = 13, RULE_expression = 14, RULE_arguments = 15,
            RULE_primary = 16;

    private static String[] makeRuleNames() {
        return new String[]{
                "classDeclaration", "className", "memberDeclaration", "variableDeclaration",
                "methodDeclaration", "parameters", "parameterDeclaration", "body", "constructorDeclaration",
                "statement", "assignment", "whileLoop", "ifStatement", "returnStatement",
                "expression", "arguments", "primary"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "':'", "':='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'",
                "','", "'.'", "'end'", "'var'", "'class'", "'method'", "'extends'", "'while'",
                "'this'", "'loop'", "'if'", "'then'", "'else'", "'return'", "'is'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK",
                "SEMI", "COMMA", "DOT", "END", "VAR", "CLASS", "METHOD", "EXTENDS", "WHILE",
                "THIS", "LOOP", "IF", "THEN", "ELSE", "RETURN", "IS", "Identifier", "IntegerLiteral",
                "BooleanLiteral", "RealLiteral", "StringLiteral"
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
    public String getGrammarFileName() {
        return "OLang.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public OLangParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ClassDeclarationContext extends ParserRuleContext {
        public TerminalNode CLASS() {
            return getToken(OLangParser.CLASS, 0);
        }

        public List<ClassNameContext> className() {
            return getRuleContexts(ClassNameContext.class);
        }

        public ClassNameContext className(int i) {
            return getRuleContext(ClassNameContext.class, i);
        }

        public TerminalNode LBRACK() {
            return getToken(OLangParser.LBRACK, 0);
        }

        public TerminalNode EXTENDS() {
            return getToken(OLangParser.EXTENDS, 0);
        }

        public TerminalNode RBRACK() {
            return getToken(OLangParser.RBRACK, 0);
        }

        public TerminalNode IS() {
            return getToken(OLangParser.IS, 0);
        }

        public TerminalNode LBRACE() {
            return getToken(OLangParser.LBRACE, 0);
        }

        public MemberDeclarationContext memberDeclaration() {
            return getRuleContext(MemberDeclarationContext.class, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(OLangParser.RBRACE, 0);
        }

        public TerminalNode END() {
            return getToken(OLangParser.END, 0);
        }

        public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterClassDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitClassDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor)
                return ((OLangVisitor<? extends T>) visitor).visitClassDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ClassDeclarationContext classDeclaration() throws RecognitionException {
        ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_classDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(34);
                match(CLASS);
                setState(35);
                className();
                setState(36);
                match(LBRACK);
                setState(37);
                match(EXTENDS);
                setState(38);
                className();
                setState(39);
                match(RBRACK);
                setState(40);
                match(IS);
                setState(41);
                match(LBRACE);
                setState(42);
                memberDeclaration();
                setState(43);
                match(RBRACE);
                setState(44);
                match(END);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassNameContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(OLangParser.Identifier, 0);
        }

        public ClassNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_className;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterClassName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitClassName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor) return ((OLangVisitor<? extends T>) visitor).visitClassName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ClassNameContext className() throws RecognitionException {
        ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_className);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(46);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MemberDeclarationContext extends ParserRuleContext {
        public VariableDeclarationContext variableDeclaration() {
            return getRuleContext(VariableDeclarationContext.class, 0);
        }

        public MethodDeclarationContext methodDeclaration() {
            return getRuleContext(MethodDeclarationContext.class, 0);
        }

        public ConstructorDeclarationContext constructorDeclaration() {
            return getRuleContext(ConstructorDeclarationContext.class, 0);
        }

        public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_memberDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterMemberDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitMemberDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor)
                return ((OLangVisitor<? extends T>) visitor).visitMemberDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
        MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_memberDeclaration);
        try {
            setState(51);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case VAR:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(48);
                    variableDeclaration();
                }
                break;
                case METHOD:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(49);
                    methodDeclaration();
                }
                break;
                case THIS:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(50);
                    constructorDeclaration();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableDeclarationContext extends ParserRuleContext {
        public TerminalNode VAR() {
            return getToken(OLangParser.VAR, 0);
        }

        public TerminalNode Identifier() {
            return getToken(OLangParser.Identifier, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterVariableDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitVariableDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor)
                return ((OLangVisitor<? extends T>) visitor).visitVariableDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
        VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_variableDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(53);
                match(VAR);
                setState(54);
                match(Identifier);
                setState(55);
                match(T__0);
                setState(56);
                expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodDeclarationContext extends ParserRuleContext {
        public TerminalNode METHOD() {
            return getToken(OLangParser.METHOD, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(OLangParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(OLangParser.Identifier, i);
        }

        public List<TerminalNode> LBRACK() {
            return getTokens(OLangParser.LBRACK);
        }

        public TerminalNode LBRACK(int i) {
            return getToken(OLangParser.LBRACK, i);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public List<TerminalNode> RBRACK() {
            return getTokens(OLangParser.RBRACK);
        }

        public TerminalNode RBRACK(int i) {
            return getToken(OLangParser.RBRACK, i);
        }

        public TerminalNode IS() {
            return getToken(OLangParser.IS, 0);
        }

        public BodyContext body() {
            return getRuleContext(BodyContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(OLangParser.END, 0);
        }

        public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterMethodDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitMethodDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor)
                return ((OLangVisitor<? extends T>) visitor).visitMethodDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
        MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_methodDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(58);
                match(METHOD);
                setState(59);
                match(Identifier);
                setState(60);
                match(LBRACK);
                setState(61);
                parameters();
                setState(62);
                match(RBRACK);
                setState(63);
                match(LBRACK);
                setState(64);
                match(T__0);
                setState(65);
                match(Identifier);
                setState(66);
                match(RBRACK);
                setState(67);
                match(IS);
                setState(68);
                body();
                setState(69);
                match(END);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ParametersContext extends ParserRuleContext {
        public TerminalNode LPAREN() {
            return getToken(OLangParser.LPAREN, 0);
        }

        public List<ParameterDeclarationContext> parameterDeclaration() {
            return getRuleContexts(ParameterDeclarationContext.class);
        }

        public ParameterDeclarationContext parameterDeclaration(int i) {
            return getRuleContext(ParameterDeclarationContext.class, i);
        }

        public TerminalNode LBRACE() {
            return getToken(OLangParser.LBRACE, 0);
        }

        public TerminalNode COMMA() {
            return getToken(OLangParser.COMMA, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(OLangParser.RBRACE, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(OLangParser.RPAREN, 0);
        }

        public ParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterParameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitParameters(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor) return ((OLangVisitor<? extends T>) visitor).visitParameters(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParametersContext parameters() throws RecognitionException {
        ParametersContext _localctx = new ParametersContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_parameters);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(71);
                match(LPAREN);
                setState(72);
                parameterDeclaration();
                setState(73);
                match(LBRACE);
                setState(74);
                match(COMMA);
                setState(75);
                parameterDeclaration();
                setState(76);
                match(RBRACE);
                setState(77);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ParameterDeclarationContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(OLangParser.Identifier, 0);
        }

        public ClassNameContext className() {
            return getRuleContext(ClassNameContext.class, 0);
        }

        public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameterDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterParameterDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitParameterDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor)
                return ((OLangVisitor<? extends T>) visitor).visitParameterDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
        ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_parameterDeclaration);
        try {
            setState(81);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(79);
                    match(Identifier);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(80);
                    className();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BodyContext extends ParserRuleContext {
        public TerminalNode LBRACE() {
            return getToken(OLangParser.LBRACE, 0);
        }

        public VariableDeclarationContext variableDeclaration() {
            return getRuleContext(VariableDeclarationContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(OLangParser.RBRACE, 0);
        }

        public BodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitBody(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor) return ((OLangVisitor<? extends T>) visitor).visitBody(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BodyContext body() throws RecognitionException {
        BodyContext _localctx = new BodyContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_body);
        try {
            setState(88);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LBRACE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(83);
                    match(LBRACE);
                    setState(84);
                    variableDeclaration();
                }
                break;
                case WHILE:
                case IF:
                case RETURN:
                case Identifier:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(85);
                    statement();
                    setState(86);
                    match(RBRACE);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConstructorDeclarationContext extends ParserRuleContext {
        public TerminalNode THIS() {
            return getToken(OLangParser.THIS, 0);
        }

        public TerminalNode LBRACK() {
            return getToken(OLangParser.LBRACK, 0);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public TerminalNode RBRACK() {
            return getToken(OLangParser.RBRACK, 0);
        }

        public TerminalNode IS() {
            return getToken(OLangParser.IS, 0);
        }

        public BodyContext body() {
            return getRuleContext(BodyContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(OLangParser.END, 0);
        }

        public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constructorDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterConstructorDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitConstructorDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor)
                return ((OLangVisitor<? extends T>) visitor).visitConstructorDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
        ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_constructorDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(90);
                match(THIS);
                setState(91);
                match(LBRACK);
                setState(92);
                parameters();
                setState(93);
                match(RBRACK);
                setState(94);
                match(IS);
                setState(95);
                body();
                setState(96);
                match(END);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext {
        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public WhileLoopContext whileLoop() {
            return getRuleContext(WhileLoopContext.class, 0);
        }

        public IfStatementContext ifStatement() {
            return getRuleContext(IfStatementContext.class, 0);
        }

        public ReturnStatementContext returnStatement() {
            return getRuleContext(ReturnStatementContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor) return ((OLangVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_statement);
        try {
            setState(102);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(98);
                    assignment();
                }
                break;
                case WHILE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(99);
                    whileLoop();
                }
                break;
                case IF:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(100);
                    ifStatement();
                }
                break;
                case RETURN:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(101);
                    returnStatement();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignmentContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(OLangParser.Identifier, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor) return ((OLangVisitor<? extends T>) visitor).visitAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_assignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(104);
                match(Identifier);
                setState(105);
                match(T__1);
                setState(106);
                expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WhileLoopContext extends ParserRuleContext {
        public TerminalNode WHILE() {
            return getToken(OLangParser.WHILE, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode LOOP() {
            return getToken(OLangParser.LOOP, 0);
        }

        public BodyContext body() {
            return getRuleContext(BodyContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(OLangParser.END, 0);
        }

        public WhileLoopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whileLoop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterWhileLoop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitWhileLoop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor) return ((OLangVisitor<? extends T>) visitor).visitWhileLoop(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WhileLoopContext whileLoop() throws RecognitionException {
        WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_whileLoop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(108);
                match(WHILE);
                setState(109);
                expression();
                setState(110);
                match(LOOP);
                setState(111);
                body();
                setState(112);
                match(END);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IfStatementContext extends ParserRuleContext {
        public TerminalNode IF() {
            return getToken(OLangParser.IF, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode THEN() {
            return getToken(OLangParser.THEN, 0);
        }

        public List<BodyContext> body() {
            return getRuleContexts(BodyContext.class);
        }

        public BodyContext body(int i) {
            return getRuleContext(BodyContext.class, i);
        }

        public TerminalNode LBRACK() {
            return getToken(OLangParser.LBRACK, 0);
        }

        public TerminalNode ELSE() {
            return getToken(OLangParser.ELSE, 0);
        }

        public TerminalNode RBRACK() {
            return getToken(OLangParser.RBRACK, 0);
        }

        public TerminalNode END() {
            return getToken(OLangParser.END, 0);
        }

        public IfStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterIfStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitIfStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor) return ((OLangVisitor<? extends T>) visitor).visitIfStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IfStatementContext ifStatement() throws RecognitionException {
        IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_ifStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(114);
                match(IF);
                setState(115);
                expression();
                setState(116);
                match(THEN);
                setState(117);
                body();
                setState(118);
                match(LBRACK);
                setState(119);
                match(ELSE);
                setState(120);
                body();
                setState(121);
                match(RBRACK);
                setState(122);
                match(END);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ReturnStatementContext extends ParserRuleContext {
        public TerminalNode RETURN() {
            return getToken(OLangParser.RETURN, 0);
        }

        public TerminalNode LBRACK() {
            return getToken(OLangParser.LBRACK, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RBRACK() {
            return getToken(OLangParser.RBRACK, 0);
        }

        public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_returnStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterReturnStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitReturnStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor)
                return ((OLangVisitor<? extends T>) visitor).visitReturnStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ReturnStatementContext returnStatement() throws RecognitionException {
        ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_returnStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(124);
                match(RETURN);
                setState(125);
                match(LBRACK);
                setState(126);
                expression();
                setState(127);
                match(RBRACK);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public PrimaryContext primary() {
            return getRuleContext(PrimaryContext.class, 0);
        }

        public TerminalNode LBRACE() {
            return getToken(OLangParser.LBRACE, 0);
        }

        public TerminalNode DOT() {
            return getToken(OLangParser.DOT, 0);
        }

        public TerminalNode Identifier() {
            return getToken(OLangParser.Identifier, 0);
        }

        public TerminalNode LBRACK() {
            return getToken(OLangParser.LBRACK, 0);
        }

        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        public TerminalNode RBRACK() {
            return getToken(OLangParser.RBRACK, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(OLangParser.RBRACE, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor) return ((OLangVisitor<? extends T>) visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(129);
                primary();
                setState(130);
                match(LBRACE);
                setState(131);
                match(DOT);
                setState(132);
                match(Identifier);
                setState(133);
                match(LBRACK);
                setState(134);
                arguments();
                setState(135);
                match(RBRACK);
                setState(136);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArgumentsContext extends ParserRuleContext {
        public TerminalNode LPAREN() {
            return getToken(OLangParser.LPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode LBRACE() {
            return getToken(OLangParser.LBRACE, 0);
        }

        public TerminalNode COMMA() {
            return getToken(OLangParser.COMMA, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(OLangParser.RBRACE, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(OLangParser.RPAREN, 0);
        }

        public ArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arguments;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterArguments(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitArguments(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor) return ((OLangVisitor<? extends T>) visitor).visitArguments(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArgumentsContext arguments() throws RecognitionException {
        ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_arguments);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(138);
                match(LPAREN);
                setState(139);
                expression();
                setState(140);
                match(LBRACE);
                setState(141);
                match(COMMA);
                setState(142);
                expression();
                setState(143);
                match(RBRACE);
                setState(144);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PrimaryContext extends ParserRuleContext {
        public TerminalNode IntegerLiteral() {
            return getToken(OLangParser.IntegerLiteral, 0);
        }

        public TerminalNode RealLiteral() {
            return getToken(OLangParser.RealLiteral, 0);
        }

        public TerminalNode BooleanLiteral() {
            return getToken(OLangParser.BooleanLiteral, 0);
        }

        public TerminalNode THIS() {
            return getToken(OLangParser.THIS, 0);
        }

        public ClassNameContext className() {
            return getRuleContext(ClassNameContext.class, 0);
        }

        public PrimaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primary;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).enterPrimary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof OLangListener) ((OLangListener) listener).exitPrimary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof OLangVisitor) return ((OLangVisitor<? extends T>) visitor).visitPrimary(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PrimaryContext primary() throws RecognitionException {
        PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_primary);
        try {
            setState(151);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IntegerLiteral:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(146);
                    match(IntegerLiteral);
                }
                break;
                case RealLiteral:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(147);
                    match(RealLiteral);
                }
                break;
                case BooleanLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(148);
                    match(BooleanLiteral);
                }
                break;
                case THIS:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(149);
                    match(THIS);
                }
                break;
                case Identifier:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(150);
                    className();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u009c\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\5" +
                    "\4\66\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bT\n\b\3\t\3\t" +
                    "\3\t\3\t\3\t\5\t[\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3" +
                    "\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16" +
                    "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20" +
                    "\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u009a\n\22\3\22\2\2\23\2\4\6\b\n\f" +
                    "\16\20\22\24\26\30\32\34\36 \"\2\2\2\u0095\2$\3\2\2\2\4\60\3\2\2\2\6\65" +
                    "\3\2\2\2\b\67\3\2\2\2\n<\3\2\2\2\fI\3\2\2\2\16S\3\2\2\2\20Z\3\2\2\2\22" +
                    "\\\3\2\2\2\24h\3\2\2\2\26j\3\2\2\2\30n\3\2\2\2\32t\3\2\2\2\34~\3\2\2\2" +
                    "\36\u0083\3\2\2\2 \u008c\3\2\2\2\"\u0099\3\2\2\2$%\7\20\2\2%&\5\4\3\2" +
                    "&\'\7\t\2\2\'(\7\22\2\2()\5\4\3\2)*\7\n\2\2*+\7\32\2\2+,\7\7\2\2,-\5\6" +
                    "\4\2-.\7\b\2\2./\7\16\2\2/\3\3\2\2\2\60\61\7\33\2\2\61\5\3\2\2\2\62\66" +
                    "\5\b\5\2\63\66\5\n\6\2\64\66\5\22\n\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64" +
                    "\3\2\2\2\66\7\3\2\2\2\678\7\17\2\289\7\33\2\29:\7\3\2\2:;\5\36\20\2;\t" +
                    "\3\2\2\2<=\7\21\2\2=>\7\33\2\2>?\7\t\2\2?@\5\f\7\2@A\7\n\2\2AB\7\t\2\2" +
                    "BC\7\3\2\2CD\7\33\2\2DE\7\n\2\2EF\7\32\2\2FG\5\20\t\2GH\7\16\2\2H\13\3" +
                    "\2\2\2IJ\7\5\2\2JK\5\16\b\2KL\7\7\2\2LM\7\f\2\2MN\5\16\b\2NO\7\b\2\2O" +
                    "P\7\6\2\2P\r\3\2\2\2QT\7\33\2\2RT\5\4\3\2SQ\3\2\2\2SR\3\2\2\2T\17\3\2" +
                    "\2\2UV\7\7\2\2V[\5\b\5\2WX\5\24\13\2XY\7\b\2\2Y[\3\2\2\2ZU\3\2\2\2ZW\3" +
                    "\2\2\2[\21\3\2\2\2\\]\7\24\2\2]^\7\t\2\2^_\5\f\7\2_`\7\n\2\2`a\7\32\2" +
                    "\2ab\5\20\t\2bc\7\16\2\2c\23\3\2\2\2di\5\26\f\2ei\5\30\r\2fi\5\32\16\2" +
                    "gi\5\34\17\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\25\3\2\2\2jk\7\33" +
                    "\2\2kl\7\4\2\2lm\5\36\20\2m\27\3\2\2\2no\7\23\2\2op\5\36\20\2pq\7\25\2" +
                    "\2qr\5\20\t\2rs\7\16\2\2s\31\3\2\2\2tu\7\26\2\2uv\5\36\20\2vw\7\27\2\2" +
                    "wx\5\20\t\2xy\7\t\2\2yz\7\30\2\2z{\5\20\t\2{|\7\n\2\2|}\7\16\2\2}\33\3" +
                    "\2\2\2~\177\7\31\2\2\177\u0080\7\t\2\2\u0080\u0081\5\36\20\2\u0081\u0082" +
                    "\7\n\2\2\u0082\35\3\2\2\2\u0083\u0084\5\"\22\2\u0084\u0085\7\7\2\2\u0085" +
                    "\u0086\7\r\2\2\u0086\u0087\7\33\2\2\u0087\u0088\7\t\2\2\u0088\u0089\5" +
                    " \21\2\u0089\u008a\7\n\2\2\u008a\u008b\7\b\2\2\u008b\37\3\2\2\2\u008c" +
                    "\u008d\7\5\2\2\u008d\u008e\5\36\20\2\u008e\u008f\7\7\2\2\u008f\u0090\7" +
                    "\f\2\2\u0090\u0091\5\36\20\2\u0091\u0092\7\b\2\2\u0092\u0093\7\6\2\2\u0093" +
                    "!\3\2\2\2\u0094\u009a\7\34\2\2\u0095\u009a\7\36\2\2\u0096\u009a\7\35\2" +
                    "\2\u0097\u009a\7\24\2\2\u0098\u009a\5\4\3\2\u0099\u0094\3\2\2\2\u0099" +
                    "\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2" +
                    "\2\2\u009a#\3\2\2\2\7\65SZh\u0099";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}