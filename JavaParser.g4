grammar JavaParser;

main: block;
block: blockStatement+;
blockStatement: localClassDeclaration | localVariableDeclarationStatement | statement;
statement: statementWithoutTrailingSubstatement| ifThenStatement | whileStatement | forStatement;
statementWithoutTrailingSubstatement: emptyStatement | expressionStatement | doStatement | breakStatement | continueStatement | returnStatement;

localClassDeclaration: modifier* 'class' IDENTIFIER classBody;
modifier: 'public' | 'protected' | 'private' | 'static' | 'final';
classBody: '{' classBodyDeclaration+ '}';
classBodyDeclaration: classMemberDeclaration | instanceInitializer;
instanceInitializer: block;
classMemberDeclaration: fieldDeclaration | methodDeclaration | classDeclaration;
fieldDeclaration: modifier* VariableType variableDeclaratorList;
methodDeclaration: modifier* methodHeader methodBody;
methodHeader: result methodDeclarator;
result: VariableType| 'void';
methodDeclarator: IDENTIFIER '(' (parameter ',')* ')';
parameter: VariableType IDENTIFIER;
methodBody: block | ';';
classDeclaration: modifier* 'class' IDENTIFIER classBody;


localVariableDeclarationStatement: localVariableDeclaration ';';


emptyStatement: ';';
doStatement: 'do' statement 'while (' expression ')' ;
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
variableDeclaratorList: variableDeclarator (', 'variableDeclarator)*;
variableDeclarator: IDENTIFIER;

expressionStatement: assignment | preIncrementExpression | preDecrementExpression | postIncrementExpression | postDecrementExpression | methodInvocation | classInstanceCreationExpression;
assignment: leftHandSide assignmentOperator expression;
leftHandSide: expressionName | fieldAccess;
assignmentOperator: '=' | '*=' | '/=' | '%=' |'+=' |'-=';
preIncrementExpression: '++' (integerLiteral | floatingPointLiteral);
preDecrementExpression: '--' (integerLiteral | floatingPointLiteral);
postIncrementExpression: (integerLiteral | floatingPointLiteral) '++';
postDecrementExpression: (integerLiteral | floatingPointLiteral) '--';





//fieldAccess
fieldAccess: (primary '.' IDENTIFIER) | ('super .' IDENTIFIER) | typeName '. super .' IDENTIFIER;
primary: literal | 'this' |( typeName '.this') | classInstanceCreationExpression;
literal: integerLiteral | floatingPointLiteral | booleanLiteral | characterLiteral | stringLiteral | nullLiteral;
classInstanceCreationExpression: unqualifiedClassInstanceCreationExpression | (expressionName '.' unqualifiedClassInstanceCreationExpression);
unqualifiedClassInstanceCreationExpression: 'new' classOrInterfaceTypeToInstanciate '(' argumentList* ')';
classOrInterfaceTypeToInstanciate: IDENTIFIER;
argumentList: expression (', ' expression)*;
methodInvocation: (IDENTIFIER '(' argumentList* ')') | (primary '.' IDENTIFIER '(' argumentList* ')') | ('super.' IDENTIFIER '(' argumentList* ')');



//int
integerLiteral: '0' | NONZERODIGIT DIGITS*;
NONZERODIGIT: [1-9];
DIGITS: [0-9];
typeName: typeIdentifier;
typeIdentifier: IDENTIFIER;


//float
floatingPointLiteral: (DIGITS '.' DIGITS*) | ('.' DIGITS);

//bool
booleanLiteral: 'true' | 'false';

//character
characterLiteral: ('\'' SINGLECHARACTER '\'');
SINGLECHARACTER: [a-zA-Z]; 

//string
stringLiteral: '"' STRINGCHARACTER '"';
STRINGCHARACTER: [a-zA-Z0-9];

//null
nullLiteral: 'null';


expressionName: IDENTIFIER;
IDENTIFIER: [a-zA-Z0-9]+;



//boolean expressions
expression: assignmentExpression;
assignmentExpression: conditionalExpression | assignment;
conditionalExpression: conditionalOrExpression | (conditionalOrExpression '?' expression ':' conditionalExpression);
conditionalOrExpression: conditionalAndExpression ('||' conditionalAndExpression)*;
conditionalAndExpression: inclusiveOrExpression ('&&' inclusiveOrExpression)*;
inclusiveOrExpression: exclusiveOrexpression ('|' exclusiveOrexpression)*;
exclusiveOrexpression: andExpression ('^'andExpression)*;
andExpression: equalityExpression ('&' equalityExpression)*;
equalityExpression: relationalExpression (('=='|'!=') relationalExpression)*;
relationalExpression: additiveExpression (('<'|'>'|'<='|'>=') additiveExpression)*;
additiveExpression: multiplicativeExpression (('+'|'-') multiplicativeExpression)*;
multiplicativeExpression: unaryExpression (('*'|'/'|'%') unaryExpression)*;
unaryExpression: preDecrementExpression | preIncrementExpression | '+' unaryExpression | '-' unaryExpression;

WS : [ \t\n\r]-> skip;