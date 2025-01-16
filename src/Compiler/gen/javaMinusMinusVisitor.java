package gen;
// Generated from C:/Users/User/OneDrive/Desktop/com/grammar/javaMinusMinus.g4 by ANTLR 4.13.1


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link javaMinusMinusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface javaMinusMinusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(javaMinusMinusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#importClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportClass(javaMinusMinusParser.ImportClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(javaMinusMinusParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(javaMinusMinusParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(javaMinusMinusParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(javaMinusMinusParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#interfaceFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceFieldDeclaration(javaMinusMinusParser.InterfaceFieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(javaMinusMinusParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#localDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclaration(javaMinusMinusParser.LocalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(javaMinusMinusParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(javaMinusMinusParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(javaMinusMinusParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#abstractMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractMethodDeclaration(javaMinusMinusParser.AbstractMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(javaMinusMinusParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(javaMinusMinusParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(javaMinusMinusParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(javaMinusMinusParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#javaType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaType(javaMinusMinusParser.JavaTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(javaMinusMinusParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedStatement(javaMinusMinusParser.NestedStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(javaMinusMinusParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(javaMinusMinusParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(javaMinusMinusParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(javaMinusMinusParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableAssignmentStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignmentStatement(javaMinusMinusParser.VariableAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignmentStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignmentStatement(javaMinusMinusParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localDeclarationStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclarationStatement(javaMinusMinusParser.LocalDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(javaMinusMinusParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(javaMinusMinusParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(javaMinusMinusParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaMinusMinusParser#expressionOrString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrString(javaMinusMinusParser.ExpressionOrStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpression(javaMinusMinusParser.LtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInstantiationExpression(javaMinusMinusParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInstantiationExpression(javaMinusMinusParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(javaMinusMinusParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code set_type}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_type(javaMinusMinusParser.Set_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(javaMinusMinusParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(javaMinusMinusParser.MethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(javaMinusMinusParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLitExpression(javaMinusMinusParser.BooleanLitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(javaMinusMinusParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLitExpression(javaMinusMinusParser.IntLitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(javaMinusMinusParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLitExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLitExpression(javaMinusMinusParser.NullLitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(javaMinusMinusParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(javaMinusMinusParser.ArrayAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(javaMinusMinusParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(javaMinusMinusParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthExpression(javaMinusMinusParser.ArrayLengthExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intArrayInstantiationExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrayInstantiationExpression(javaMinusMinusParser.IntArrayInstantiationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(javaMinusMinusParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(javaMinusMinusParser.MulExpressionContext ctx);
}