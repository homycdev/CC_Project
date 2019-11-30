grammar OLang;

classDeclaration: 'class' className  ('extends' className)? 'is'
            memberDeclaration*
        'end';

className: Identifier ;


memberDeclaration
    : variableDeclaration
    | methodDeclaration
    | constructorDeclaration
    | 'pass';

variableDeclaration
    : 'var' Identifier ':' expression;

methodDeclaration
    : 'method' Identifier parameters? (':' Identifier)?
    'is' body 'end';

parameters : '(' parameterDeclaration (',' parameterDeclaration)* ')'
    ;

parameterDeclaration
    : Identifier ':' className;

body
    :  (variableDeclaration | statement)*
    ;

constructorDeclaration
    : 'this' parameters? 'is' body 'end';

statement
    : assignment
    | whileLoop
    | ifStatement
    | returnStatement;

assignment : Identifier ':=' expression;

whileLoop
    : 'while' expression 'loop' body 'end';

ifStatement
    : 'if' expression 'then' body  ('else' body)? 'end'
    ;

returnStatement
    : 'return' expression?
    ;

expression
    : primary ('.' Identifier arguments?)*
    ;

arguments
    : '(' expression (',' expression)* ')'
    ;

primary
    : IntegerLiteral
    | RealLiteral
    | BooleanLiteral
    | 'this'
    | className
    ;

// Separators

LPAREN : '(';
RPAREN : ')';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';
ASSIGN: ':=';
COLON: ':';

// Keywords
END : 'end';
VAR : 'var';
CLASS : 'class';
METHOD : 'method';
EXTENDS : 'extends';
WHILE : 'while';
THIS : 'this';
LOOP : 'loop';
IF : 'if';
THEN : 'then';
ELSE : 'else';
RETURN : 'return';
IS : 'is';

// Identifiers
Identifier: Letter LetterOrDigit*
            	;

fragment
Letter
	:	[a-zA-Z$_] // these are the "java letters" below 0x7F
	|	// covers all characters above 0x7F which are not a surrogate
		~[\u0000-\u007F\uD800-\uDBFF]
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

fragment
LetterOrDigit
	:	[a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
	|	// covers all characters above 0x7F which are not a surrogate
		~[\u0000-\u007F\uD800-\uDBFF]
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;


// Integer Literals
IntegerLiteral
	:	DecimalIntegerLiteral;

fragment
DecimalIntegerLiteral
	:	DecimalNumeral
	;

fragment
DecimalNumeral
	:	'0'
	|	NonZeroDigit (Digits?)
	;

fragment
Digits
	:	Digit Digit?
	;

fragment
Digit
	:	'0'
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

BooleanLiteral
	:	'true'
	|	'false'
	;


RealLiteral
	:	DecimalFloatingPointLiteral
	;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	|	'.' Digits ExponentPart? FloatTypeSuffix?
	|	Digits ExponentPart FloatTypeSuffix?
	|	Digits FloatTypeSuffix
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger
	;

fragment
ExponentIndicator
	:	[eE]
	;

fragment
SignedInteger
	:	Sign? Digits
	;

fragment
Sign
	:	[+-]
	;

fragment
FloatTypeSuffix
	:	[fFdD]
	;

StringLiteral
	:	'"' StringCharacters? '"'
	;
fragment
StringCharacters
	:	StringCharacter+
	;
fragment
StringCharacter
	:	~["\\]
	|	EscapeSequence
	;

fragment
EscapeSequence
	:	'\\' [btnfr"'\\];
