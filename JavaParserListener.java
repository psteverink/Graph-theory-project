// Generated from JavaParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParserParser}.
 */
public interface JavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(JavaParserParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(JavaParserParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaParserParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaParserParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(JavaParserParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(JavaParserParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#localClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalClassDeclaration(JavaParserParser.LocalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#localClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalClassDeclaration(JavaParserParser.LocalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaParserParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaParserParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaParserParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaParserParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(JavaParserParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(JavaParserParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(JavaParserParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(JavaParserParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaParserParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaParserParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaParserParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaParserParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JavaParserParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JavaParserParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JavaParserParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JavaParserParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JavaParserParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JavaParserParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JavaParserParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JavaParserParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaParserParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaParserParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaParserParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaParserParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JavaParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JavaParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JavaParserParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JavaParserParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(JavaParserParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(JavaParserParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaParserParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaParserParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaParserParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaParserParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaParserParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaParserParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(JavaParserParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(JavaParserParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaParserParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaParserParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaParserParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaParserParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaParserParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaParserParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JavaParserParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JavaParserParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(JavaParserParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(JavaParserParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(JavaParserParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(JavaParserParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaParserParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaParserParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaParserParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaParserParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JavaParserParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JavaParserParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaParserParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaParserParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JavaParserParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JavaParserParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JavaParserParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JavaParserParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(JavaParserParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(JavaParserParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(JavaParserParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(JavaParserParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(JavaParserParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(JavaParserParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(JavaParserParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(JavaParserParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(JavaParserParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(JavaParserParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaParserParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaParserParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(JavaParserParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(JavaParserParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unqualifiedClassInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedClassInstanceCreationExpression(JavaParserParser.UnqualifiedClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unqualifiedClassInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedClassInstanceCreationExpression(JavaParserParser.UnqualifiedClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classOrInterfaceTypeToInstanciate}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceTypeToInstanciate(JavaParserParser.ClassOrInterfaceTypeToInstanciateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classOrInterfaceTypeToInstanciate}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceTypeToInstanciate(JavaParserParser.ClassOrInterfaceTypeToInstanciateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaParserParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaParserParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(JavaParserParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(JavaParserParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JavaParserParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JavaParserParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JavaParserParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JavaParserParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(JavaParserParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(JavaParserParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(JavaParserParser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(JavaParserParser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(JavaParserParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(JavaParserParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(JavaParserParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(JavaParserParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(JavaParserParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(JavaParserParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(JavaParserParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(JavaParserParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(JavaParserParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(JavaParserParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JavaParserParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JavaParserParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JavaParserParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JavaParserParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(JavaParserParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(JavaParserParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JavaParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JavaParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(JavaParserParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(JavaParserParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#exclusiveOrexpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrexpression(JavaParserParser.ExclusiveOrexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#exclusiveOrexpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrexpression(JavaParserParser.ExclusiveOrexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JavaParserParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JavaParserParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JavaParserParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JavaParserParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JavaParserParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JavaParserParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JavaParserParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JavaParserParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JavaParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JavaParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JavaParserParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JavaParserParser.UnaryExpressionContext ctx);
}