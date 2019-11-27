package grammatics;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OLangLexer extends Lexer {
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
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK",
                "SEMI", "COMMA", "DOT", "END", "VAR", "CLASS", "METHOD", "EXTENDS", "WHILE",
                "THIS", "LOOP", "IF", "THEN", "ELSE", "RETURN", "IS", "Identifier", "JavaLetter",
                "JavaLetterOrDigit", "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral",
                "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral",
                "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore",
                "Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores",
                "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit",
                "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral",
                "BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore",
                "BooleanLiteral", "RealLiteral", "DecimalFloatingPointLiteral", "ExponentPart",
                "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral",
                "HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "StringLiteral",
                "StringCharacters", "StringCharacter", "EscapeSequence", "OctalEscape",
                "ZeroToThree", "UnicodeEscape"
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


    public OLangLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    @Override
    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 25:
                return JavaLetter_sempred((RuleContext) _localctx, predIndex);
            case 26:
                return JavaLetterOrDigit_sempred((RuleContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return Character.isJavaIdentifierStart(_input.LA(-1));
            case 1:
                return Character.isJavaIdentifierStart(Character.toCodePoint((char) _input.LA(-2), (char) _input.LA(-1)));
        }
        return true;
    }

    private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
        switch (predIndex) {
            case 2:
                return Character.isJavaIdentifierPart(_input.LA(-1));
            case 3:
                return Character.isJavaIdentifierPart(Character.toCodePoint((char) _input.LA(-2), (char) _input.LA(-1)));
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0208\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
                    "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64" +
                    "\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t" +
                    "=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4" +
                    "I\tI\4J\tJ\4K\tK\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3" +
                    "\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16" +
                    "\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
                    "\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26" +
                    "\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30" +
                    "\3\30\3\30\3\31\3\31\3\31\3\32\3\32\7\32\u00f5\n\32\f\32\16\32\u00f8\13" +
                    "\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0100\n\33\3\34\3\34\3\34\3\34" +
                    "\3\34\3\34\5\34\u0108\n\34\3\35\3\35\3\35\3\35\5\35\u010e\n\35\3\36\3" +
                    "\36\5\36\u0112\n\36\3\37\3\37\5\37\u0116\n\37\3 \3 \5 \u011a\n \3!\3!" +
                    "\5!\u011e\n!\3\"\3\"\3#\3#\3#\5#\u0125\n#\3#\3#\3#\5#\u012a\n#\5#\u012c" +
                    "\n#\3$\3$\5$\u0130\n$\3$\5$\u0133\n$\3%\3%\5%\u0137\n%\3&\3&\3\'\6\'\u013c" +
                    "\n\'\r\'\16\'\u013d\3(\3(\5(\u0142\n(\3)\6)\u0145\n)\r)\16)\u0146\3*\3" +
                    "*\3*\3*\3+\3+\5+\u014f\n+\3+\5+\u0152\n+\3,\3,\3-\6-\u0157\n-\r-\16-\u0158" +
                    "\3.\3.\5.\u015d\n.\3/\3/\5/\u0161\n/\3/\3/\3\60\3\60\5\60\u0167\n\60\3" +
                    "\60\5\60\u016a\n\60\3\61\3\61\3\62\6\62\u016f\n\62\r\62\16\62\u0170\3" +
                    "\63\3\63\5\63\u0175\n\63\3\64\3\64\3\64\3\64\3\65\3\65\5\65\u017d\n\65" +
                    "\3\65\5\65\u0180\n\65\3\66\3\66\3\67\6\67\u0185\n\67\r\67\16\67\u0186" +
                    "\38\38\58\u018b\n8\39\39\39\39\39\39\39\39\39\59\u0196\n9\3:\3:\5:\u019a" +
                    "\n:\3;\3;\3;\5;\u019f\n;\3;\5;\u01a2\n;\3;\5;\u01a5\n;\3;\3;\3;\5;\u01aa" +
                    "\n;\3;\5;\u01ad\n;\3;\3;\3;\5;\u01b2\n;\3;\3;\3;\5;\u01b7\n;\3<\3<\3<" +
                    "\3=\3=\3>\5>\u01bf\n>\3>\3>\3?\3?\3@\3@\3A\3A\3A\5A\u01ca\nA\3B\3B\5B" +
                    "\u01ce\nB\3B\3B\3B\5B\u01d3\nB\3B\3B\5B\u01d7\nB\3C\3C\3C\3D\3D\3E\3E" +
                    "\5E\u01e0\nE\3E\3E\3F\6F\u01e5\nF\rF\16F\u01e6\3G\3G\5G\u01eb\nG\3H\3" +
                    "H\3H\3H\5H\u01f1\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u01fe\nI\3J\3" +
                    "J\3K\3K\3K\3K\3K\3K\3K\2\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25" +
                    "\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32" +
                    "\63\33\65\2\67\29\34;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[" +
                    "\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\35s\36u\2w\2y\2{\2}\2\177\2\u0081\2" +
                    "\u0083\2\u0085\2\u0087\2\u0089\37\u008b\2\u008d\2\u008f\2\u0091\2\u0093" +
                    "\2\u0095\2\3\2\25\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01" +
                    "\3\2\udc02\ue001\7\2&&\62;C\\aac|\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch" +
                    "\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2$$^" +
                    "^\n\2$$))^^ddhhppttvv\3\2\62\65\2\u0213\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3" +
                    "\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2" +
                    "\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35" +
                    "\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)" +
                    "\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2" +
                    "9\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2\u0089\3\2\2\2\3\u0097\3\2\2\2\5\u0099" +
                    "\3\2\2\2\7\u009c\3\2\2\2\t\u009e\3\2\2\2\13\u00a0\3\2\2\2\r\u00a2\3\2" +
                    "\2\2\17\u00a4\3\2\2\2\21\u00a6\3\2\2\2\23\u00a8\3\2\2\2\25\u00aa\3\2\2" +
                    "\2\27\u00ac\3\2\2\2\31\u00ae\3\2\2\2\33\u00b2\3\2\2\2\35\u00b6\3\2\2\2" +
                    "\37\u00bc\3\2\2\2!\u00c3\3\2\2\2#\u00cb\3\2\2\2%\u00d1\3\2\2\2\'\u00d6" +
                    "\3\2\2\2)\u00db\3\2\2\2+\u00de\3\2\2\2-\u00e3\3\2\2\2/\u00e8\3\2\2\2\61" +
                    "\u00ef\3\2\2\2\63\u00f2\3\2\2\2\65\u00ff\3\2\2\2\67\u0107\3\2\2\29\u010d" +
                    "\3\2\2\2;\u010f\3\2\2\2=\u0113\3\2\2\2?\u0117\3\2\2\2A\u011b\3\2\2\2C" +
                    "\u011f\3\2\2\2E\u012b\3\2\2\2G\u012d\3\2\2\2I\u0136\3\2\2\2K\u0138\3\2" +
                    "\2\2M\u013b\3\2\2\2O\u0141\3\2\2\2Q\u0144\3\2\2\2S\u0148\3\2\2\2U\u014c" +
                    "\3\2\2\2W\u0153\3\2\2\2Y\u0156\3\2\2\2[\u015c\3\2\2\2]\u015e\3\2\2\2_" +
                    "\u0164\3\2\2\2a\u016b\3\2\2\2c\u016e\3\2\2\2e\u0174\3\2\2\2g\u0176\3\2" +
                    "\2\2i\u017a\3\2\2\2k\u0181\3\2\2\2m\u0184\3\2\2\2o\u018a\3\2\2\2q\u0195" +
                    "\3\2\2\2s\u0199\3\2\2\2u\u01b6\3\2\2\2w\u01b8\3\2\2\2y\u01bb\3\2\2\2{" +
                    "\u01be\3\2\2\2}\u01c2\3\2\2\2\177\u01c4\3\2\2\2\u0081\u01c6\3\2\2\2\u0083" +
                    "\u01d6\3\2\2\2\u0085\u01d8\3\2\2\2\u0087\u01db\3\2\2\2\u0089\u01dd\3\2" +
                    "\2\2\u008b\u01e4\3\2\2\2\u008d\u01ea\3\2\2\2\u008f\u01f0\3\2\2\2\u0091" +
                    "\u01fd\3\2\2\2\u0093\u01ff\3\2\2\2\u0095\u0201\3\2\2\2\u0097\u0098\7<" +
                    "\2\2\u0098\4\3\2\2\2\u0099\u009a\7<\2\2\u009a\u009b\7?\2\2\u009b\6\3\2" +
                    "\2\2\u009c\u009d\7*\2\2\u009d\b\3\2\2\2\u009e\u009f\7+\2\2\u009f\n\3\2" +
                    "\2\2\u00a0\u00a1\7}\2\2\u00a1\f\3\2\2\2\u00a2\u00a3\7\177\2\2\u00a3\16" +
                    "\3\2\2\2\u00a4\u00a5\7]\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\7_\2\2\u00a7" +
                    "\22\3\2\2\2\u00a8\u00a9\7=\2\2\u00a9\24\3\2\2\2\u00aa\u00ab\7.\2\2\u00ab" +
                    "\26\3\2\2\2\u00ac\u00ad\7\60\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7g\2\2\u00af" +
                    "\u00b0\7p\2\2\u00b0\u00b1\7f\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7x\2\2\u00b3" +
                    "\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7e\2\2\u00b7" +
                    "\u00b8\7n\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7u\2\2" +
                    "\u00bb\36\3\2\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7" +
                    "v\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7f\2\2\u00c2 " +
                    "\3\2\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7z\2\2\u00c5\u00c6\7v\2\2\u00c6" +
                    "\u00c7\7g\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7u\2\2" +
                    "\u00ca\"\3\2\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd\7j\2\2\u00cd\u00ce\7k" +
                    "\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0$\3\2\2\2\u00d1\u00d2" +
                    "\7v\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7u\2\2\u00d5" +
                    "&\3\2\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7q\2\2\u00d9" +
                    "\u00da\7r\2\2\u00da(\3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7h\2\2\u00dd" +
                    "*\3\2\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7j\2\2\u00e0\u00e1\7g\2\2\u00e1" +
                    "\u00e2\7p\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7n\2\2\u00e5" +
                    "\u00e6\7u\2\2\u00e6\u00e7\7g\2\2\u00e7.\3\2\2\2\u00e8\u00e9\7t\2\2\u00e9" +
                    "\u00ea\7g\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7t\2\2" +
                    "\u00ed\u00ee\7p\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7" +
                    "u\2\2\u00f1\62\3\2\2\2\u00f2\u00f6\5\65\33\2\u00f3\u00f5\5\67\34\2\u00f4" +
                    "\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2" +
                    "\2\2\u00f7\64\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u0100\t\2\2\2\u00fa\u00fb" +
                    "\n\3\2\2\u00fb\u0100\6\33\2\2\u00fc\u00fd\t\4\2\2\u00fd\u00fe\t\5\2\2" +
                    "\u00fe\u0100\6\33\3\2\u00ff\u00f9\3\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fc" +
                    "\3\2\2\2\u0100\66\3\2\2\2\u0101\u0108\t\6\2\2\u0102\u0103\n\3\2\2\u0103" +
                    "\u0108\6\34\4\2\u0104\u0105\t\4\2\2\u0105\u0106\t\5\2\2\u0106\u0108\6" +
                    "\34\5\2\u0107\u0101\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0104\3\2\2\2\u0108" +
                    "8\3\2\2\2\u0109\u010e\5;\36\2\u010a\u010e\5=\37\2\u010b\u010e\5? \2\u010c" +
                    "\u010e\5A!\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2" +
                    "\2\u010d\u010c\3\2\2\2\u010e:\3\2\2\2\u010f\u0111\5E#\2\u0110\u0112\5" +
                    "C\"\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112<\3\2\2\2\u0113\u0115" +
                    "\5S*\2\u0114\u0116\5C\"\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116" +
                    ">\3\2\2\2\u0117\u0119\5]/\2\u0118\u011a\5C\"\2\u0119\u0118\3\2\2\2\u0119" +
                    "\u011a\3\2\2\2\u011a@\3\2\2\2\u011b\u011d\5g\64\2\u011c\u011e\5C\"\2\u011d" +
                    "\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011eB\3\2\2\2\u011f\u0120\t\7\2\2" +
                    "\u0120D\3\2\2\2\u0121\u012c\7\62\2\2\u0122\u0129\5K&\2\u0123\u0125\5G" +
                    "$\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012a\3\2\2\2\u0126" +
                    "\u0127\5Q)\2\u0127\u0128\5G$\2\u0128\u012a\3\2\2\2\u0129\u0124\3\2\2\2" +
                    "\u0129\u0126\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0121\3\2\2\2\u012b\u0122" +
                    "\3\2\2\2\u012cF\3\2\2\2\u012d\u0132\5I%\2\u012e\u0130\5M\'\2\u012f\u012e" +
                    "\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\5I%\2\u0132" +
                    "\u012f\3\2\2\2\u0132\u0133\3\2\2\2\u0133H\3\2\2\2\u0134\u0137\7\62\2\2" +
                    "\u0135\u0137\5K&\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137J\3\2" +
                    "\2\2\u0138\u0139\t\b\2\2\u0139L\3\2\2\2\u013a\u013c\5O(\2\u013b\u013a" +
                    "\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e" +
                    "N\3\2\2\2\u013f\u0142\5I%\2\u0140\u0142\7a\2\2\u0141\u013f\3\2\2\2\u0141" +
                    "\u0140\3\2\2\2\u0142P\3\2\2\2\u0143\u0145\7a\2\2\u0144\u0143\3\2\2\2\u0145" +
                    "\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147R\3\2\2\2" +
                    "\u0148\u0149\7\62\2\2\u0149\u014a\t\t\2\2\u014a\u014b\5U+\2\u014bT\3\2" +
                    "\2\2\u014c\u0151\5W,\2\u014d\u014f\5Y-\2\u014e\u014d\3\2\2\2\u014e\u014f" +
                    "\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\5W,\2\u0151\u014e\3\2\2\2\u0151" +
                    "\u0152\3\2\2\2\u0152V\3\2\2\2\u0153\u0154\t\n\2\2\u0154X\3\2\2\2\u0155" +
                    "\u0157\5[.\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2" +
                    "\2\u0158\u0159\3\2\2\2\u0159Z\3\2\2\2\u015a\u015d\5W,\2\u015b\u015d\7" +
                    "a\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d\\\3\2\2\2\u015e\u0160" +
                    "\7\62\2\2\u015f\u0161\5Q)\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161" +
                    "\u0162\3\2\2\2\u0162\u0163\5_\60\2\u0163^\3\2\2\2\u0164\u0169\5a\61\2" +
                    "\u0165\u0167\5c\62\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168" +
                    "\3\2\2\2\u0168\u016a\5a\61\2\u0169\u0166\3\2\2\2\u0169\u016a\3\2\2\2\u016a" +
                    "`\3\2\2\2\u016b\u016c\t\13\2\2\u016cb\3\2\2\2\u016d\u016f\5e\63\2\u016e" +
                    "\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2" +
                    "\2\2\u0171d\3\2\2\2\u0172\u0175\5a\61\2\u0173\u0175\7a\2\2\u0174\u0172" +
                    "\3\2\2\2\u0174\u0173\3\2\2\2\u0175f\3\2\2\2\u0176\u0177\7\62\2\2\u0177" +
                    "\u0178\t\f\2\2\u0178\u0179\5i\65\2\u0179h\3\2\2\2\u017a\u017f\5k\66\2" +
                    "\u017b\u017d\5m\67\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e" +
                    "\3\2\2\2\u017e\u0180\5k\66\2\u017f\u017c\3\2\2\2\u017f\u0180\3\2\2\2\u0180" +
                    "j\3\2\2\2\u0181\u0182\t\r\2\2\u0182l\3\2\2\2\u0183\u0185\5o8\2\u0184\u0183" +
                    "\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187" +
                    "n\3\2\2\2\u0188\u018b\5k\66\2\u0189\u018b\7a\2\2\u018a\u0188\3\2\2\2\u018a" +
                    "\u0189\3\2\2\2\u018bp\3\2\2\2\u018c\u018d\7v\2\2\u018d\u018e\7t\2\2\u018e" +
                    "\u018f\7w\2\2\u018f\u0196\7g\2\2\u0190\u0191\7h\2\2\u0191\u0192\7c\2\2" +
                    "\u0192\u0193\7n\2\2\u0193\u0194\7u\2\2\u0194\u0196\7g\2\2\u0195\u018c" +
                    "\3\2\2\2\u0195\u0190\3\2\2\2\u0196r\3\2\2\2\u0197\u019a\5u;\2\u0198\u019a" +
                    "\5\u0081A\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019at\3\2\2\2\u019b" +
                    "\u019c\5G$\2\u019c\u019e\7\60\2\2\u019d\u019f\5G$\2\u019e\u019d\3\2\2" +
                    "\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\5w<\2\u01a1\u01a0" +
                    "\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a5\5\177@\2" +
                    "\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01b7\3\2\2\2\u01a6\u01a7" +
                    "\7\60\2\2\u01a7\u01a9\5G$\2\u01a8\u01aa\5w<\2\u01a9\u01a8\3\2\2\2\u01a9" +
                    "\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\5\177@\2\u01ac\u01ab\3" +
                    "\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b7\3\2\2\2\u01ae\u01af\5G$\2\u01af" +
                    "\u01b1\5w<\2\u01b0\u01b2\5\177@\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2" +
                    "\2\2\u01b2\u01b7\3\2\2\2\u01b3\u01b4\5G$\2\u01b4\u01b5\5\177@\2\u01b5" +
                    "\u01b7\3\2\2\2\u01b6\u019b\3\2\2\2\u01b6\u01a6\3\2\2\2\u01b6\u01ae\3\2" +
                    "\2\2\u01b6\u01b3\3\2\2\2\u01b7v\3\2\2\2\u01b8\u01b9\5y=\2\u01b9\u01ba" +
                    "\5{>\2\u01bax\3\2\2\2\u01bb\u01bc\t\16\2\2\u01bcz\3\2\2\2\u01bd\u01bf" +
                    "\5}?\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0" +
                    "\u01c1\5G$\2\u01c1|\3\2\2\2\u01c2\u01c3\t\17\2\2\u01c3~\3\2\2\2\u01c4" +
                    "\u01c5\t\20\2\2\u01c5\u0080\3\2\2\2\u01c6\u01c7\5\u0083B\2\u01c7\u01c9" +
                    "\5\u0085C\2\u01c8\u01ca\5\177@\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2" +
                    "\2\u01ca\u0082\3\2\2\2\u01cb\u01cd\5S*\2\u01cc\u01ce\7\60\2\2\u01cd\u01cc" +
                    "\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d7\3\2\2\2\u01cf\u01d0\7\62\2\2" +
                    "\u01d0\u01d2\t\t\2\2\u01d1\u01d3\5U+\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3" +
                    "\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\7\60\2\2\u01d5\u01d7\5U+\2\u01d6" +
                    "\u01cb\3\2\2\2\u01d6\u01cf\3\2\2\2\u01d7\u0084\3\2\2\2\u01d8\u01d9\5\u0087" +
                    "D\2\u01d9\u01da\5{>\2\u01da\u0086\3\2\2\2\u01db\u01dc\t\21\2\2\u01dc\u0088" +
                    "\3\2\2\2\u01dd\u01df\7$\2\2\u01de\u01e0\5\u008bF\2\u01df\u01de\3\2\2\2" +
                    "\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\7$\2\2\u01e2\u008a" +
                    "\3\2\2\2\u01e3\u01e5\5\u008dG\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2" +
                    "\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u008c\3\2\2\2\u01e8\u01eb" +
                    "\n\22\2\2\u01e9\u01eb\5\u008fH\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2" +
                    "\2\u01eb\u008e\3\2\2\2\u01ec\u01ed\7^\2\2\u01ed\u01f1\t\23\2\2\u01ee\u01f1" +
                    "\5\u0091I\2\u01ef\u01f1\5\u0095K\2\u01f0\u01ec\3\2\2\2\u01f0\u01ee\3\2" +
                    "\2\2\u01f0\u01ef\3\2\2\2\u01f1\u0090\3\2\2\2\u01f2\u01f3\7^\2\2\u01f3" +
                    "\u01fe\5a\61\2\u01f4\u01f5\7^\2\2\u01f5\u01f6\5a\61\2\u01f6\u01f7\5a\61" +
                    "\2\u01f7\u01fe\3\2\2\2\u01f8\u01f9\7^\2\2\u01f9\u01fa\5\u0093J\2\u01fa" +
                    "\u01fb\5a\61\2\u01fb\u01fc\5a\61\2\u01fc\u01fe\3\2\2\2\u01fd\u01f2\3\2" +
                    "\2\2\u01fd\u01f4\3\2\2\2\u01fd\u01f8\3\2\2\2\u01fe\u0092\3\2\2\2\u01ff" +
                    "\u0200\t\24\2\2\u0200\u0094\3\2\2\2\u0201\u0202\7^\2\2\u0202\u0203\7w" +
                    "\2\2\u0203\u0204\5W,\2\u0204\u0205\5W,\2\u0205\u0206\5W,\2\u0206\u0207" +
                    "\5W,\2\u0207\u0096\3\2\2\2\64\2\u00f6\u00ff\u0107\u010d\u0111\u0115\u0119" +
                    "\u011d\u0124\u0129\u012b\u012f\u0132\u0136\u013d\u0141\u0146\u014e\u0151" +
                    "\u0158\u015c\u0160\u0166\u0169\u0170\u0174\u017c\u017f\u0186\u018a\u0195" +
                    "\u0199\u019e\u01a1\u01a4\u01a9\u01ac\u01b1\u01b6\u01be\u01c9\u01cd\u01d2" +
                    "\u01d6\u01df\u01e6\u01ea\u01f0\u01fd\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}