package gen;
// Generated from C:/Users/User/OneDrive/Desktop/com/grammar/javaMinusMinus.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link javaMinusMinusParser}.
 */
public interface javaMinusMinusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(javaMinusMinusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(javaMinusMinusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#importClass}.
	 * @param ctx the parse tree
	 */
	void enterImportClass(javaMinusMinusParser.ImportClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#importClass}.
	 * @param ctx the parse tree
	 */
	void exitImportClass(javaMinusMinusParser.ImportClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(javaMinusMinusParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(javaMinusMinusParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(javaMinusMinusParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(javaMinusMinusParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(javaMinusMinusParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(javaMinusMinusParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(javaMinusMinusParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(javaMinusMinusParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#interfaceFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceFieldDeclaration(javaMinusMinusParser.InterfaceFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#interfaceFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceFieldDeclaration(javaMinusMinusParser.InterfaceFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(javaMinusMinusParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(javaMinusMinusParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclaration(javaMinusMinusParser.LocalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclaration(javaMinusMinusParser.LocalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(javaMinusMinusParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(javaMinusMinusParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(javaMinusMinusParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(javaMinusMinusParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(javaMinusMinusParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(javaMinusMinusParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#abstractMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractMethodDeclaration(javaMinusMinusParser.AbstractMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#abstractMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractMethodDeclaration(javaMinusMinusParser.AbstractMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(javaMinusMinusParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(javaMinusMinusParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(javaMinusMinusParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(javaMinusMinusParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(javaMinusMinusParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(javaMinusMinusParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(javaMinusMinusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(javaMinusMinusParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#javaType}.
	 * @param ctx the parse tree
	 */
	void enterJavaType(javaMinusMinusParser.JavaTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#javaType}.
	 * @param ctx the parse tree
	 */
	void exitJavaType(javaMinusMinusParser.JavaTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(javaMinusMinusParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(javaMinusMinusParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNestedStatement(javaMinusMinusParser.NestedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNestedStatement(javaMinusMinusParser.NestedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(javaMinusMinusParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(javaMinusMinusParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(javaMinusMinusParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(javaMinusMinusParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(javaMinusMinusParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(javaMinusMinusParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(javaMinusMinusParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(javaMinusMinusParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableAssignmentStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStatement(javaMinusMinusParser.VariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableAssignmentStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStatement(javaMinusMinusParser.VariableAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignmentStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentStatement(javaMinusMinusParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignmentStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentStatement(javaMinusMinusParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localDeclarationStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclarationStatement(javaMinusMinusParser.LocalDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localDeclarationStatement}
	 * labeled alternative in {@link javaMinusMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclarationStatement(javaMinusMinusParser.LocalDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(javaMinusMinusParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(javaMinusMinusParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(javaMinusMinusParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(javaMinusMinusParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(javaMinusMinusParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(javaMinusMinusParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaMinusMinusParser#expressionOrString}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrString(javaMinusMinusParser.ExpressionOrStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaMinusMinusParser#expressionOrString}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrString(javaMinusMinusParser.ExpressionOrStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtExpression(javaMinusMinusParser.LtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtExpression(javaMinusMinusParser.LtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiationExpression(javaMinusMinusParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiationExpression(javaMinusMinusParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInstantiationExpression(javaMinusMinusParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInstantiationExpression(javaMinusMinusParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(javaMinusMinusParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(javaMinusMinusParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code set_type}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSet_type(javaMinusMinusParser.Set_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code set_type}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSet_type(javaMinusMinusParser.Set_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(javaMinusMinusParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(javaMinusMinusParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(javaMinusMinusParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(javaMinusMinusParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(javaMinusMinusParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(javaMinusMinusParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLitExpression(javaMinusMinusParser.BooleanLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLitExpression(javaMinusMinusParser.BooleanLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(javaMinusMinusParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(javaMinusMinusParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLitExpression(javaMinusMinusParser.IntLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLitExpression(javaMinusMinusParser.IntLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(javaMinusMinusParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(javaMinusMinusParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLitExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullLitExpression(javaMinusMinusParser.NullLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLitExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullLitExpression(javaMinusMinusParser.NullLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(javaMinusMinusParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(javaMinusMinusParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(javaMinusMinusParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(javaMinusMinusParser.ArrayAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(javaMinusMinusParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(javaMinusMinusParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(javaMinusMinusParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(javaMinusMinusParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthExpression(javaMinusMinusParser.ArrayLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthExpression(javaMinusMinusParser.ArrayLengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intArrayInstantiationExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayInstantiationExpression(javaMinusMinusParser.IntArrayInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intArrayInstantiationExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayInstantiationExpression(javaMinusMinusParser.IntArrayInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(javaMinusMinusParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(javaMinusMinusParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(javaMinusMinusParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link javaMinusMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(javaMinusMinusParser.MulExpressionContext ctx);
}