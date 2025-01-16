grammar javaMinusMinus;

program
:   importClass* mainClass classDeclaration* interfaceDeclaration* EOF
;

importClass
:   'import' Identifier ';'
;

mainClass
:   'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement* '}' '}'
;

classDeclaration
:   ('abstract')?  'class' Identifier ( 'extends' Identifier | 'implements' Identifier ( ',' Identifier)* )? '{'  fieldDeclaration* constructorDeclaration? methodDeclaration* abstractMethodDeclaration* '}'
;

interfaceDeclaration
:   'interface' Identifier '{' interfaceFieldDeclaration* interfaceMethodDeclaration* '}'
;

interfaceMethodDeclaration
:   (type | 'void') Identifier '(' parameterList? ')' ';'
;

interfaceFieldDeclaration
:   type Identifier EQ expression ';'
;


fieldDeclaration
:   varDeclaration
;


localDeclaration
:   type Identifier (EQ expression)? ';'
;

varDeclaration
:   (accessModifier)? type Identifier ';'
;

methodDeclaration
:   '@Override'? (accessModifier)? (type | 'void') Identifier '(' parameterList* ')' '{' methodBody '}'
;

constructorDeclaration
:   '@Override'? (accessModifier)? Identifier '(' parameterList* ')' '{' methodBody '}'
;

abstractMethodDeclaration
:   '@Override'? (accessModifier)? 'abstract' (type | 'void') Identifier '(' parameterList* ')' ';'
;


parameterList
:   parameter (',' parameter)*
;

parameter
:   type Identifier
;
///////////////////////////
methodBody
:   (localDeclaration | statement)* (RETURN expression ';')?
;
///////////////////////////
type
:   (javaType | Identifier) (LSB RSB)?
;

javaType
:   'boolean'
|   'int'
;

accessModifier
:   'private'
|   'public'
;

statement
:   '{' statement* '}'                                                #nestedStatement
|   'if' LP expression RP statement ('else' statement)?               #ifElseStatement
|   'while' LP expression RP statement                                #whileStatement
|   'for' LP localDeclaration? expression ';' expression RP statement #forStatement
|   'print' LP expressionOrString RP ';'                              #printStatement
|   Identifier EQ expression ';'                                      #variableAssignmentStatement
|   Identifier LSB expression RSB EQ expression ';'                   #arrayAssignmentStatement
|   localDeclaration                                                  #localDeclarationStatement
;


ifBlock
:   statement
;

elseBlock
:   statement
;

whileBlock
:   statement
;

expressionOrString
:   expression
|   StringLiteral
;

expression
:   expression LSB expression RSB                                      #arrayAccessExpression
|   Identifier                                                         #set_type
|   expression DOTLENGTH                                               #arrayLengthExpression
|   expression '.' Identifier LP (expression (',' expression)*)? RP    #methodCallExpression
|   NOT expression                                                     #notExpression
|   'new' type LP (expression (',' expression)*)? RP                   #objectInstantiationExpression
|   'new' type LSB expression RSB                                      #arrayInstantiationExpression
|   '{' IntegerLiteral (',' IntegerLiteral)* '}'                       #intArrayInstantiationExpression
|   expression POWER expression                                        #powExpression
|   expression TIMES expression                                        #mulExpression
|   expression PLUS expression                                         #addExpression
|   expression MINUS expression                                        #subExpression
|   expression LT expression                                           #ltExpression
|   expression AND expression                                          #andExpression
|   IntegerLiteral                                                     #intLitExpression
|   BooleanLiteral                                                     #booleanLitExpression
|   NullLiteral                                                        #nullLitExpression
|   Identifier                                                         #identifierExpression
|   'this'                                                             #thisExpression
|   '(' expression ')'                                                 #parenExpression
|   localDeclaration                                                   #variableDeclaration
;

AND: '&&';
LT: '<';
PLUS: '+';
MINUS: '-';
TIMES: '*';
POWER: '**';
NOT: '!';
LSB: '[';
RSB: ']';
DOTLENGTH: '.length';
LP: '(';
RP: ')';
RETURN: 'return';
EQ: '=';

BooleanLiteral
:   'true'
|   'false'
;

NullLiteral
:   'null'
;

StringLiteral
:   '"' ( ~["\\] | '\\' . )* '"'
;

Identifier
:   JavaLetter JavaLetterOrDigit*
;

fragment
JavaLetter
:   [a-zA-Z$_]
;

fragment
JavaLetterOrDigit
:   [a-zA-Z0-9$_]
;

IntegerLiteral
:   DecimalIntegerLiteral
;

fragment
DecimalIntegerLiteral
:   DecimalNumeral IntegertypeSuffix?
;

fragment
IntegertypeSuffix
:   [lL]
;

fragment
DecimalNumeral
   : '0'
   | NonZeroDigit (Digits? | Underscores Digits)
;

fragment
Digits
:   Digit (DigitsAndUnderscores? Digit)?
;

fragment
Digit
:   '0'
|   NonZeroDigit
;

fragment
NonZeroDigit
:   [1-9]
;

fragment
DigitsAndUnderscores
:   DigitOrUnderscore+
;

fragment
DigitOrUnderscore
:   Digit
|   '_'
;

fragment
Underscores
:   '_'+
;

WS
:   [ \r\t\n]+ -> skip
;

MULTILINE_COMMENT
:  '/*' .*? '*/' -> skip
;

LINE_COMMENT
:  '//' .*? '\n' -> skip
;
