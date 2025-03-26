grammar SimplifiedJava;

main: block;
block: blockStatement+;
blockStatement: localClassDeclaration | localVariableDeclarationStatement | statement;
statement: statementWithoutTrailingSubstatement| ifThenStatement | whileStatement | forStatement;
statementWithoutTrailingSubstatement: emptyStatement | expressionStatement | breakStatement | continueStatement | returnStatement;

localClassDeclaration: Modifier* 'class' IDENTIFIER classBody;
Modifier: 'public' | 'protected' | 'private' | 'static' | 'final';
classBody: '{' classBodyDeclaration+ '}';
classBodyDeclaration: classMemberDeclaration | instanceInitializer;
instanceInitializer: block;
classMemberDeclaration: fieldDeclaration | methodDeclaration | classDeclaration;
fieldDeclaration: Modifier* VariableType variableDeclaratorList;
methodDeclaration: Modifier* methodHeader '{' methodBody '}';
methodHeader: result methodDeclarator;
result: VariableType| VoidType;
VoidType: 'void';
methodDeclarator: IDENTIFIER '(' (parameter ',')* ')';
parameter: VariableType IDENTIFIER;
methodBody: block | emptyStatement;
classDeclaration: Modifier* 'class' IDENTIFIER classBody;


localVariableDeclarationStatement: localVariableDeclaration ';';


emptyStatement: ';';
// doStatement: 'do' statement 'while (' expression ')' ;
breakStatement: 'break';
continueStatement: 'continue';
returnStatement: 'return' expression*;
ifThenStatement: 'if (' expression ')' statement ('else' statement)?;
whileStatement: 'while(' expression ')' statement;
forStatement: 'for(' forInit+ ';' expression+ ';' forUpdate+ ')' statement;
forInit: localVariableDeclaration;
localVariableDeclaration:  VariableType variableDeclaratorList;
VariableType: 'var'| 'string' | 'int' | 'char' | 'float' | 'boolean' | 'double';
forUpdate: statementExpressionList;
statementExpressionList: expressionStatement (', ' expressionStatement)*;
variableDeclaratorList: IDENTIFIER (', 'IDENTIFIER)*;
// variableDeclarator: IDENTIFIER;

expressionStatement: assignment | methodInvocation | classInstanceCreationExpression;
assignment: leftHandSide assignmentOperator expression;
leftHandSide: IDENTIFIER | fieldAccess;
assignmentOperator: '=' | '*=' | '/=' | '%=' |'+=' |'-=';
// preIncrementExpression: '++' (integerLiteral | floatingPointLiteral);
// preDecrementExpression: '--' (integerLiteral | floatingPointLiteral);
// postIncrementExpression: (integerLiteral | floatingPointLiteral) '++';
// postDecrementExpression: (integerLiteral | floatingPointLiteral) '--';





//fieldAccess
fieldAccess: primary '.' IDENTIFIER;
primary: literal | classInstanceCreationExpression;
literal: integerLiteral | floatingPointLiteral | booleanLiteral | stringLiteral | nullLiteral;
classInstanceCreationExpression: unqualifiedClassInstanceCreationExpression | (IDENTIFIER '.' unqualifiedClassInstanceCreationExpression);
unqualifiedClassInstanceCreationExpression: 'new' IDENTIFIER '(' argumentList* ')';
argumentList: expression (', ' expression)*;
methodInvocation: (IDENTIFIER '(' argumentList* ')') | (primary '.' IDENTIFIER '(' argumentList* ')');



//int
integerLiteral: '0' | NONZERODIGIT DIGITS*;
NONZERODIGIT: [1-9];
DIGITS: [0-9];
// typeName:  IDENTIFIER;


//float
floatingPointLiteral: (DIGITS '.' DIGITS*) | ('.' DIGITS);

//bool
booleanLiteral: 'true' | 'false';

//string
stringLiteral: '"' STRINGCHARACTER '"';
STRINGCHARACTER: [a-zA-Z0-9];

//null
nullLiteral: 'null';


IDENTIFIER: [a-zA-Z0-9]+;



//boolean expressions
expression: conditionalExpression | assignment;
conditionalExpression: stringLiteral;
// conditionalExpression: conditionalOrExpression | (conditionalOrExpression '?' expression ':' conditionalExpression);
// conditionalOrExpression: conditionalAndExpression ('||' conditionalAndExpression)*;
// conditionalAndExpression: inclusiveOrExpression ('&&' inclusiveOrExpression)*;
// inclusiveOrExpression: exclusiveOrexpression ('|' exclusiveOrexpression)*;
// exclusiveOrexpression: andExpression ('^'andExpression)*;
// andExpression: equalityExpression ('&' equalityExpression)*;
// equalityExpression: relationalExpression (('=='|'!=') relationalExpression)*;
// relationalExpression: additiveExpression (('<'|'>'|'<='|'>=') additiveExpression)*;
// additiveExpression: multiplicativeExpression (('+'|'-') multiplicativeExpression)*;
// multiplicativeExpression: unaryExpression (('*'|'/'|'%') unaryExpression)*;
// unaryExpression: '+' unaryExpression | '-' unaryExpression | primary;