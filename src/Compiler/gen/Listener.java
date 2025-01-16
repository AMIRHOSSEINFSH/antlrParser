package gen;


import gen.javaMinusMinusLexer;
import gen.javaMinusMinusListener;
import gen.javaMinusMinusParser;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener implements javaMinusMinusListener {

    private int indentLevel = 0;
    private boolean isInsideIfElse = false;
    private boolean dontprint = false;
    private boolean dontprintprint = false;


    private void processInterfaceMethod(javaMinusMinusParser.InterfaceMethodDeclarationContext methodCtx) {
        enterInterfaceMethodDeclaration(methodCtx);
    }
    private void processInterfaceField(javaMinusMinusParser.InterfaceFieldDeclarationContext fieldCtx) {
        enterInterfaceFieldDeclaration(fieldCtx);
    }



    private void printIndented (String text) {
        for (int i = 0; i < indentLevel; i++) {
            System.out.print("\t"); 
        }
        System.out.println(text);
    }

    private void printIndented_nonln (String text) {
        for (int i = 0; i < indentLevel; i++) {
            System.out.print("\t"); 
        }
        System.out.print(text);
    }

    private void processStatement(javaMinusMinusParser.StatementContext ctx) {
        if (ctx instanceof javaMinusMinusParser.PrintStatementContext) {
            javaMinusMinusParser.PrintStatementContext printCtx = (javaMinusMinusParser.PrintStatementContext) ctx;
            printIndented("print(" + printCtx.expressionOrString().getText() + ")");
        } else if (ctx instanceof javaMinusMinusParser.IfElseStatementContext) {
            enterIfElseStatement((javaMinusMinusParser.IfElseStatementContext) ctx);
        } else if (ctx instanceof javaMinusMinusParser.WhileStatementContext) {
            enterWhileStatement((javaMinusMinusParser.WhileStatementContext) ctx);
        } else if (ctx instanceof javaMinusMinusParser.ForStatementContext) {
            enterForStatement((javaMinusMinusParser.ForStatementContext) ctx);
        } else if (ctx instanceof javaMinusMinusParser.VariableAssignmentStatementContext) {
            enterVariableAssignmentStatement((javaMinusMinusParser.VariableAssignmentStatementContext) ctx);
        } else if (ctx instanceof javaMinusMinusParser.NestedStatementContext) {
            for (javaMinusMinusParser.StatementContext nestedCtx : ((javaMinusMinusParser.NestedStatementContext) ctx).statement()) {
                processStatement(nestedCtx);
            }
        }
    }




    private void procesInterfaceField(javaMinusMinusParser.InterfaceFieldDeclarationContext fieldCtx) {
        enterInterfaceFieldDeclaration(fieldCtx);
    }


    @Override
    public void enterProgram(javaMinusMinusParser.ProgramContext ctx) {

    }

    @Override
    public void exitProgram(javaMinusMinusParser.ProgramContext ctx) {

    }

    @Override
    public void enterImportClass(javaMinusMinusParser.ImportClassContext ctx) {
        printIndented("IMPORT");
        indentLevel ++ ;
        printIndented("LIBRARY");
        indentLevel ++ ;
        printIndented("- " + ctx.Identifier().getText());
    }

    @Override
    public void exitImportClass(javaMinusMinusParser.ImportClassContext ctx) {
        indentLevel -= 2 ;
    }

    @Override
    public void enterMainClass(javaMinusMinusParser.MainClassContext ctx) {
//        dontprint = false ;
        printIndented("CLASS " + ctx.Identifier(0).getText());
        indentLevel++;
        printIndented("METHOD main " );
        indentLevel++;
//        dontprint = true ;

    }

    @Override
    public void exitMainClass(javaMinusMinusParser.MainClassContext ctx) {
        indentLevel -= 2 ;  
    }

    @Override
    public void enterClassDeclaration(javaMinusMinusParser.ClassDeclarationContext ctx) {

        printIndented("id level : " + indentLevel);
        String className = ctx.Identifier(0).getText();
//        printIndented(ctx.getChild(3).getText());
        if (ctx.getChildCount() > 0 && ctx.getChild(0).getText().equals("abstract")) {
            printIndented_nonln("\nABSTRACT CLASS " + className);
        }
        else {
//            printIndented_nonln("\nCLASS " + className);
            printIndented_nonln("\nCLASS " + className);

        }
        /////////////////
//        if (indentLevel > 0) indentLevel -- ;
        /////////////////
        if (ctx.getChild(3).getText().equals("extends")) {
            printIndented(" EXTENDS " + ctx.Identifier(1).getText());
        }

        if (ctx.getChild(3).getText().equals("implements") && ctx.Identifier(2) != null) {
            printIndented_nonln(" IMPLEMENT " + ctx.Identifier(1).getText());
        }
        if (ctx.getChild(3).getText().equals("implements") && ctx.Identifier(2) == null) {
            printIndented(" IMPLEMENT " + ctx.Identifier(1).getText());
        }
        int qiut = 0 ;
        int j = 2 ;
        while (qiut==0){
            if (ctx.Identifier(j) != null){
                if (ctx.Identifier(j+1) != null) printIndented_nonln(" , " + ctx.Identifier(j).getText());
                else printIndented(" , " + ctx.Identifier(j).getText());
            }
            else  qiut = 1 ;
            j ++ ;
        }
        indentLevel ++ ;
    }


    @Override
    public void exitClassDeclaration(javaMinusMinusParser.ClassDeclarationContext ctx) {
        indentLevel -- ;
    }

    @Override
    public void enterInterfaceDeclaration(javaMinusMinusParser.InterfaceDeclarationContext ctx) {

        printIndented("\nINTERFACE " + ctx.Identifier().getText());
        indentLevel++;
    }

    @Override
    public void exitInterfaceDeclaration(javaMinusMinusParser.InterfaceDeclarationContext ctx) {
        indentLevel -- ;

    }

    @Override
    public void enterInterfaceMethodDeclaration(javaMinusMinusParser.InterfaceMethodDeclarationContext ctx) {

        printIndented("INTERFACEMETHOD " + ctx.Identifier().getText());
        indentLevel ++ ;
        printIndented("RETURN_TYPE " + ctx.type().getText());

    }

    @Override
    public void exitInterfaceMethodDeclaration(javaMinusMinusParser.InterfaceMethodDeclarationContext ctx) {
        indentLevel -- ;
    }

    @Override
    public void enterInterfaceFieldDeclaration(javaMinusMinusParser.InterfaceFieldDeclarationContext ctx) {
        printIndented("INTERFACEFIELD " + " " + ctx.type().getText() + " " + ctx.Identifier().getText() + " " + ctx.EQ().getText() + " " + ctx.expression().getText()   )   ;
    }

    @Override
    public void exitInterfaceFieldDeclaration(javaMinusMinusParser.InterfaceFieldDeclarationContext ctx) {

    }

    @Override
    public void enterFieldDeclaration(javaMinusMinusParser.FieldDeclarationContext ctx) {
        printIndented("FIELD " + ctx.varDeclaration().type().getText() + " " + ctx.varDeclaration().Identifier().getText() );
        indentLevel  ++ ;
        if (ctx.varDeclaration().accessModifier() != null) printIndented("ACCESS_MIDOFIRE " + ctx.varDeclaration().accessModifier().getText());
    }


    @Override
    public void exitFieldDeclaration(javaMinusMinusParser.FieldDeclarationContext ctx) {
        indentLevel --  ;
    }

    @Override
    public void enterLocalDeclaration(javaMinusMinusParser.LocalDeclarationContext ctx) {

//        printIndented("dontprint :"+ dontprint);
        if (dontprint) {

            return;
        }

        if (ctx.expression() != null)  printIndented("DECLARE " + ctx.type().getText() + " " + ctx.Identifier().getText() + " " + ctx.EQ().getText() + " " + ctx.expression().getText());
        else printIndented("DECLARE " + ctx.type().getText() + " " + ctx.Identifier().getText());
//        dontprint = true ;
    }

    @Override
    public void exitLocalDeclaration(javaMinusMinusParser.LocalDeclarationContext ctx) {

    }

    @Override
    public void enterVarDeclaration(javaMinusMinusParser.VarDeclarationContext ctx) {

    }

    @Override
    public void exitVarDeclaration(javaMinusMinusParser.VarDeclarationContext ctx) {

    }

    @Override
    public void enterMethodDeclaration(javaMinusMinusParser.MethodDeclarationContext ctx) {

        printIndented("METHOD " + ctx.Identifier().getText() ) ;
        indentLevel ++ ;

        if (ctx.getChildCount() > 0 && ctx.getChild(0).getText().equals("@Override")) {
            printIndented("OVERRIDE true");
        }
        if(ctx.accessModifier() != null ) printIndented("ACCESS_MODIFIRE " + ctx.accessModifier().getText());

        if (ctx.type() != null) printIndented("RETURN_TYPE " + ctx.type().getText());
        else printIndented("RETURN_TYPE void");

    }

    @Override
    public void exitMethodDeclaration(javaMinusMinusParser.MethodDeclarationContext ctx) {
        indentLevel -- ;
    }

    @Override
    public void enterConstructorDeclaration(javaMinusMinusParser.ConstructorDeclarationContext ctx) {

        printIndented("CONSTRUCTOR " + ctx.Identifier().getText());
        indentLevel ++ ;
        if (ctx.getChildCount() > 0 && ctx.getChild(0).getText().equals("@Override")) {
            printIndented("OVERRIDE " );
        }
        if (ctx.accessModifier() != null ) printIndented("ACCESS_MODIFIRE " + ctx.accessModifier().getText());
//        if (ctx.parameterList() != null) printIndented("PARAMETER " + ctx.parameterList(0).getText());

    }

    @Override
    public void exitConstructorDeclaration(javaMinusMinusParser.ConstructorDeclarationContext ctx) {
        indentLevel -- ;
    }

    @Override
    public void enterAbstractMethodDeclaration(javaMinusMinusParser.AbstractMethodDeclarationContext ctx) {
//        indentLevel ++ ;
        if(ctx.accessModifier() != null) {
            printIndented("ABSTRACT METHOD " + ctx.Identifier().getText());
        }
        indentLevel ++ ;

        if (ctx.getChildCount() > 0 && ctx.getChild(0).getText().equals("@Override")) {
            printIndented("OVERRIDE " );
        }

        if(ctx.accessModifier() != null) printIndented("ACCESS_MODIFIRE " + ctx.accessModifier().getText());

        if (ctx.type() != null)  printIndented("RETURN " + ctx.type().getText());
        else printIndented("RETURN void");


    }

    @Override
    public void exitAbstractMethodDeclaration(javaMinusMinusParser.AbstractMethodDeclarationContext ctx) {
        indentLevel -= 1 ;
    }

    @Override
    public void enterParameterList(javaMinusMinusParser.ParameterListContext ctx) {

    }

    @Override
    public void exitParameterList(javaMinusMinusParser.ParameterListContext ctx) {

    }

    @Override
    public void enterParameter(javaMinusMinusParser.ParameterContext ctx) {
        printIndented("PARAMETER " + ctx.type().getText() + " " + ctx.Identifier().getText());
    }

    @Override
    public void exitParameter(javaMinusMinusParser.ParameterContext ctx) {

    }

    @Override
    public void enterMethodBody(javaMinusMinusParser.MethodBodyContext ctx) {

        printIndented("BODY");

//        dontprint = false ;

        indentLevel ++ ;

        if (ctx.expression() != null){
            printIndented("RETURN " + ctx.expression().getText());
        }
//        dontprint = true ;

    }

    @Override
    public void exitMethodBody(javaMinusMinusParser.MethodBodyContext ctx) {

        indentLevel -- ;
    }

    @Override
    public void enterType(javaMinusMinusParser.TypeContext ctx) {

    }

    @Override
    public void exitType(javaMinusMinusParser.TypeContext ctx) {

    }

    @Override
    public void enterJavaType(javaMinusMinusParser.JavaTypeContext ctx) {

    }

    @Override
    public void exitJavaType(javaMinusMinusParser.JavaTypeContext ctx) {

    }

    @Override
    public void enterAccessModifier(javaMinusMinusParser.AccessModifierContext ctx) {

    }

    @Override
    public void exitAccessModifier(javaMinusMinusParser.AccessModifierContext ctx) {

    }

    @Override
    public void enterNestedStatement(javaMinusMinusParser.NestedStatementContext ctx) {

    }

    @Override
    public void exitNestedStatement(javaMinusMinusParser.NestedStatementContext ctx) {

    }

    @Override
    public void enterIfElseStatement(javaMinusMinusParser.IfElseStatementContext ctx) {
        ctx.expression().getText();
        printIndented("IF");
        indentLevel++;
        //  CONDITION
        printIndented("CONDITION " + ctx.expression().getText());
        printIndented("BODY");
        indentLevel++;


        String statementText = ctx.statement(0).getText();
        char[] charArray = statementText.toCharArray();
        StringBuilder currentLine = new StringBuilder();

        for (char c : charArray) {
            if (c == ';') {
                printIndented(currentLine.toString().trim());
                currentLine.setLength(0);
            } else {
               if (c != '{' )currentLine.append(c);
            }
        }



//        printIndented(ctx.statement(0).getText());


        indentLevel--;
        if (ctx.statement(1) != null) {
            printIndented("ELSE");
            indentLevel++;
            printIndented("BODY");
            indentLevel++;
//            printIndented(ctx.statement(1).getText());
            statementText = ctx.statement(1).getText();
            charArray = statementText.toCharArray();
            currentLine = new StringBuilder();

            for (char c : charArray) {
                if (c == ';') {
                    printIndented(currentLine.toString().trim());
                    currentLine.setLength(0);
                } else {
                    if (c != '{' )currentLine.append(c);
                }
            }
            indentLevel--;
            indentLevel--;
        }

        dontprint = true ;
        dontprintprint = true ;


    }
    @Override
    public void exitIfElseStatement(javaMinusMinusParser.IfElseStatementContext ctx) {
        indentLevel--;
        dontprint = false ;
        dontprintprint = false ;
    }

    @Override
    public void enterWhileStatement(javaMinusMinusParser.WhileStatementContext ctx) {
//        dontprint = true ;
        printIndented("WHILE");
        indentLevel++;
        printIndented("CONDITION " + ctx.expression().getText());
        printIndented("BODY");
        indentLevel++;

    }

    @Override
    public void exitWhileStatement(javaMinusMinusParser.WhileStatementContext ctx) {
        indentLevel -= 2;
//        dontprint = false ;

    }

    @Override
    public void enterForStatement(javaMinusMinusParser.ForStatementContext ctx) {

//        dontprint = true ;
        printIndented("FOR");
        indentLevel++;
        enterLocalDeclaration(ctx.localDeclaration());
//        if (ctx.localDeclaration() != null) printIndented("DECLARE " + ctx.localDeclaration().getText());
        dontprint = true ;
        printIndented("CONDITION " + ctx.expression(0).getText());
        printIndented("INCREMENT " + ctx.expression(1).getText());

        printIndented("BODY");
        enterLocalDeclaration(ctx.localDeclaration());

        indentLevel++;
    }

    @Override
    public void exitForStatement(javaMinusMinusParser.ForStatementContext ctx) {
        indentLevel -= 2;
        dontprint = false ;
    }

    @Override
    public void enterPrintStatement(javaMinusMinusParser.PrintStatementContext ctx) {

        if (dontprintprint == false) printIndented("PRINT " + ctx.expressionOrString().getText());

        
    }

    @Override
    public void exitPrintStatement(javaMinusMinusParser.PrintStatementContext ctx) {

    }

    @Override
    public void enterVariableAssignmentStatement(javaMinusMinusParser.VariableAssignmentStatementContext ctx) {
//            dontprint = false ;
            printIndented("ASSIGN " + ctx.Identifier().getText() + " = " + ctx.expression().getText());
//            dontprint = true ;
    }


    @Override
    public void exitVariableAssignmentStatement(javaMinusMinusParser.VariableAssignmentStatementContext ctx) {
//        indentLevel--;

    }

    @Override
    public void enterArrayAssignmentStatement(javaMinusMinusParser.ArrayAssignmentStatementContext ctx) {
        dontprint = false ;
        printIndented("ARRAY ");
        indentLevel ++ ;
        printIndented("ELEMENT_NUMBER " + ctx.expression(0).getText());
        printIndented("ASSIGN " + ctx.expression(1).getText());
        dontprint = true ;
    }

    @Override
    public void exitArrayAssignmentStatement(javaMinusMinusParser.ArrayAssignmentStatementContext ctx) {
        indentLevel -- ;
    }

    @Override
    public void enterLocalDeclarationStatement(javaMinusMinusParser.LocalDeclarationStatementContext ctx) {

//        if (ctx.localDeclaration().expression() != null) {
//            printIndented("DECLARE " + ctx.localDeclaration().type().getText() + " " + ctx.localDeclaration().Identifier().getText() + " " + ctx.localDeclaration().EQ() + "  " + ctx.localDeclaration().expression().getText());
//        }
//        else    printIndented("DECLARE " + ctx.localDeclaration().type().getText() + " " + ctx.localDeclaration().Identifier().getText());

    }

    @Override
    public void exitLocalDeclarationStatement(javaMinusMinusParser.LocalDeclarationStatementContext ctx) {
//        indentLevel -- ;
    }

    @Override
    public void enterIfBlock(javaMinusMinusParser.IfBlockContext ctx) {

    }

    @Override
    public void exitIfBlock(javaMinusMinusParser.IfBlockContext ctx) {

    }

    @Override
    public void enterElseBlock(javaMinusMinusParser.ElseBlockContext ctx) {

    }

    @Override
    public void exitElseBlock(javaMinusMinusParser.ElseBlockContext ctx) {

    }

    @Override
    public void enterWhileBlock(javaMinusMinusParser.WhileBlockContext ctx) {

    }

    @Override
    public void exitWhileBlock(javaMinusMinusParser.WhileBlockContext ctx) {

    }

    @Override
    public void enterExpressionOrString(javaMinusMinusParser.ExpressionOrStringContext ctx) {

    }

    @Override
    public void exitExpressionOrString(javaMinusMinusParser.ExpressionOrStringContext ctx) {

    }

    @Override
    public void enterLtExpression(javaMinusMinusParser.LtExpressionContext ctx) {

    }

    @Override
    public void exitLtExpression(javaMinusMinusParser.LtExpressionContext ctx) {

    }

    @Override
    public void enterObjectInstantiationExpression(javaMinusMinusParser.ObjectInstantiationExpressionContext ctx) {

    }

    @Override
    public void exitObjectInstantiationExpression(javaMinusMinusParser.ObjectInstantiationExpressionContext ctx) {

    }

    @Override
    public void enterArrayInstantiationExpression(javaMinusMinusParser.ArrayInstantiationExpressionContext ctx) {

    }

    @Override
    public void exitArrayInstantiationExpression(javaMinusMinusParser.ArrayInstantiationExpressionContext ctx) {

    }

    @Override
    public void enterPowExpression(javaMinusMinusParser.PowExpressionContext ctx) {

    }

    @Override
    public void exitPowExpression(javaMinusMinusParser.PowExpressionContext ctx) {

    }

    @Override
    public void enterSet_type(javaMinusMinusParser.Set_typeContext ctx) {

    }

    @Override
    public void exitSet_type(javaMinusMinusParser.Set_typeContext ctx) {

    }

    @Override
    public void enterIdentifierExpression(javaMinusMinusParser.IdentifierExpressionContext ctx) {

    }

    @Override
    public void exitIdentifierExpression(javaMinusMinusParser.IdentifierExpressionContext ctx) {

    }

    @Override
    public void enterMethodCallExpression(javaMinusMinusParser.MethodCallExpressionContext ctx) {

    }

    @Override
    public void exitMethodCallExpression(javaMinusMinusParser.MethodCallExpressionContext ctx) {

    }

    @Override
    public void enterNotExpression(javaMinusMinusParser.NotExpressionContext ctx) {

    }

    @Override
    public void exitNotExpression(javaMinusMinusParser.NotExpressionContext ctx) {

    }

    @Override
    public void enterBooleanLitExpression(javaMinusMinusParser.BooleanLitExpressionContext ctx) {

    }

    @Override
    public void exitBooleanLitExpression(javaMinusMinusParser.BooleanLitExpressionContext ctx) {

    }

    @Override
    public void enterParenExpression(javaMinusMinusParser.ParenExpressionContext ctx) {

    }

    @Override
    public void exitParenExpression(javaMinusMinusParser.ParenExpressionContext ctx) {

    }

    @Override
    public void enterIntLitExpression(javaMinusMinusParser.IntLitExpressionContext ctx) {

    }

    @Override
    public void exitIntLitExpression(javaMinusMinusParser.IntLitExpressionContext ctx) {

    }

    @Override
    public void enterVariableDeclaration(javaMinusMinusParser.VariableDeclarationContext ctx) {

    }

    @Override
    public void exitVariableDeclaration(javaMinusMinusParser.VariableDeclarationContext ctx) {

    }

    @Override
    public void enterNullLitExpression(javaMinusMinusParser.NullLitExpressionContext ctx) {

    }

    @Override
    public void exitNullLitExpression(javaMinusMinusParser.NullLitExpressionContext ctx) {

    }

    @Override
    public void enterAndExpression(javaMinusMinusParser.AndExpressionContext ctx) {

    }

    @Override
    public void exitAndExpression(javaMinusMinusParser.AndExpressionContext ctx) {

    }

    @Override
    public void enterArrayAccessExpression(javaMinusMinusParser.ArrayAccessExpressionContext ctx) {

    }

    @Override
    public void exitArrayAccessExpression(javaMinusMinusParser.ArrayAccessExpressionContext ctx) {

    }

    @Override
    public void enterAddExpression(javaMinusMinusParser.AddExpressionContext ctx) {

    }

    @Override
    public void exitAddExpression(javaMinusMinusParser.AddExpressionContext ctx) {

    }

    @Override
    public void enterThisExpression(javaMinusMinusParser.ThisExpressionContext ctx) {

    }

    @Override
    public void exitThisExpression(javaMinusMinusParser.ThisExpressionContext ctx) {

    }

    @Override
    public void enterArrayLengthExpression(javaMinusMinusParser.ArrayLengthExpressionContext ctx) {

    }

    @Override
    public void exitArrayLengthExpression(javaMinusMinusParser.ArrayLengthExpressionContext ctx) {

    }

    @Override
    public void enterIntArrayInstantiationExpression(javaMinusMinusParser.IntArrayInstantiationExpressionContext ctx) {

    }

    @Override
    public void exitIntArrayInstantiationExpression(javaMinusMinusParser.IntArrayInstantiationExpressionContext ctx) {

    }

    @Override
    public void enterSubExpression(javaMinusMinusParser.SubExpressionContext ctx) {

    }

    @Override
    public void exitSubExpression(javaMinusMinusParser.SubExpressionContext ctx) {

    }

    @Override
    public void enterMulExpression(javaMinusMinusParser.MulExpressionContext ctx) {

    }

    @Override
    public void exitMulExpression(javaMinusMinusParser.MulExpressionContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}



