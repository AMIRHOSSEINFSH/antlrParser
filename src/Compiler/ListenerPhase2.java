import gen.javaMinusMinusListener;
import gen.javaMinusMinusParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import phase2.SymbolNode.AntlrListenerHelper;
import phase2.SymbolNode.enumeration.AccessModifier;
import phase2.SymbolNode.enumeration.NodeType;
import phase2.SymbolNode.nodes.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static phase2.SymbolNode.nodes.TypeSubNode.primitiveTypes;

public class ListenerPhase2 implements AntlrListenerHelper {

    //region definitions
    public ProgramNode programNode;

    private Stack<SymbolNode> parentScopeNode = new Stack<>();

    private boolean isMainClassVisited = false;
    //endregion

    //region Helper Methods
    private SymbolNode pop() {
        SymbolNode pop = null;
        if (parentScopeNode.stream().anyMatch(node -> node instanceof EmptyNode)) {

            while (!parentScopeNode.isEmpty()) {
                SymbolNode top = parentScopeNode.pop();
                if (top instanceof EmptyNode) {
                    pop = parentScopeNode.pop();
                    break;
                }
            }
        } else {
            pop = parentScopeNode.pop();
        }

        return pop;
    }
    private SymbolNode push(SymbolNode symbolNode) {
        System.out.println("Stack: Pushed: "+symbolNode);
        return parentScopeNode.push(symbolNode);
    }
    //endregion

    @Override
    public void showPrettyConsole() {
        SymbolNode rootNode = programNode;

        SymbolNode parentNode = rootNode;
        System.out.println("-------------- program:"+rootNode.getLineNumber()+"----------------");
        rootNode.getChildren().stream().filter(item->item.getNodeType() != NodeType.Empty).forEach(item-> System.out.println(item.toString()));
        List<SymbolNode> nodeList =  rootNode.getChildren();
        for (SymbolNode item : nodeList) {
            Queue<SymbolNode> queue = new LinkedList<>(item.getChildren());

            while (!queue.isEmpty()) {
                SymbolNode currentNode = queue.remove();

                var wasEmptyChange = parentNode != currentNode.getParentNode() && currentNode.getParentNode().getChildren().size() == 1 && currentNode instanceof EmptyNode;
                if (parentNode != currentNode.getParentNode()) {
                    parentNode = currentNode.getParentNode();
                    System.out.println("---------- " + parentNode.getName() + ": " + parentNode.getLineNumber() + "--------------");
                }
                if (wasEmptyChange)
                    System.out.println("!No KEY FOUND");
                else if(!(currentNode instanceof EmptyNode))
                    System.out.println(currentNode);

                queue.addAll(currentNode.getChildren());
            }

        }
    }

    private boolean isTypeExists(String type) {
        //dfs
        Queue<SymbolNode> typeSubNodes = new LinkedList<>(programNode.getChildren());
        while (!typeSubNodes.isEmpty()) {
            SymbolNode node = typeSubNodes.remove();
            if (node.getNodeType() == NodeType.Class && Objects.equals(type, ((ClassNode) node).getClassName()))
                return true;
        }

        return false;
    }

    private boolean isPrimitive(String type) {
        return Arrays.stream(primitiveTypes).toList().contains(type);
    }

    @Override
    public void enterProgram(javaMinusMinusParser.ProgramContext ctx) {
        programNode = new ProgramNode();
        programNode.setLineNumber(ctx.getStart().getLine());
    }

    @Override
    public void exitProgram(javaMinusMinusParser.ProgramContext ctx) {
        //we will check for isDefined types

        Queue<SymbolNode> queue = new LinkedList<>(programNode.getChildren());
        while (!queue.isEmpty()) {
            SymbolNode currentNode = queue.remove();
            var typeList = new ArrayList<TypeSubNode>();
            if (currentNode instanceof LocalVarNode) {
                typeList.addAll(((LocalVarNode) currentNode).getTypeList());
            }else if (currentNode instanceof MethodNode) {
                typeList.addAll(((MethodNode) currentNode).getTypeSubNode());
            }else if(currentNode instanceof ParamNode) {
                typeList.addAll(((ParamNode) currentNode).getTypeList());
            }

            typeList.forEach(item->{
                if (!item.isClassIsDefined() && isTypeExists(item.getClassType())){
                    item.setClassIsDefined(true);
                }
                if (!item.isObjectIsDefined() && isTypeExists(item.getObjectType())){
                    item.setObjectIsDefined(true);
                }
            });
            queue.addAll(currentNode.getChildren());
        }
    }

    @Override
    public void enterImportClass(javaMinusMinusParser.ImportClassContext ctx) {

    }

    @Override
    public void exitImportClass(javaMinusMinusParser.ImportClassContext ctx) {

    }

    @Override
    public void enterMainClass(javaMinusMinusParser.MainClassContext ctx) {
        ClassNode classNode = new ClassNode(ctx.Identifier().getFirst().getText(),null,false,true);

        System.out.println("Entering Main class "+classNode.getClassName());
        classNode.setParentNode(programNode);
        classNode.setLineNumber(ctx.getStart().getLine());

        ArrayList<TypeSubNode> definitions = new ArrayList<>();
        var typeNode = new TypeSubNode("String",true);
        typeNode.setArray(true);
        definitions.add(typeNode);
        MethodNode methodNode = new MethodNode("main","void", AccessModifier.ACCESS_MODIFIER_PUBLIC,definitions,false);
        methodNode.setLineNumber(ctx.getStart().getLine()+1);
        methodNode.setParentNode(classNode);

        ParamNode paramNode = new ParamNode("args",definitions);
        paramNode.setParentNode(methodNode);

        var list= ctx.children.stream().map(ParseTree::getText).toList();

        String mainClassRawLine = null;
        String mainMethodRawLine = null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("{")) {
                if (mainClassRawLine == null) {
                    mainClassRawLine = sb.toString().trim();
                }else {
                    mainMethodRawLine = sb.toString().trim();
                }
                sb.setLength(0);
                continue;
            }
            sb.append(list.get(i)).append(" ");
        }

        classNode.setRawLine(mainClassRawLine);
        methodNode.setRawLine(mainMethodRawLine);
        isMainClassVisited = true;
        push(classNode);
        push(methodNode);
    }

    @Override
    public void exitMainClass(javaMinusMinusParser.MainClassContext ctx) {
        //as Main class and main method are in same grammar , when we are exiting MainClass should pop twice
        pop();
        pop();
    }

    @Override
    public void enterClassDeclaration(javaMinusMinusParser.ClassDeclarationContext ctx) {
        boolean isAbstract = ctx.children.getFirst().getText().equals("abstract");
        String className= ctx.Identifier().getFirst().getText();
        var index= ctx.children.stream().map(ParseTree::getText).toList().indexOf("{");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append(ctx.getChild(i)).append(" ");
        }

//        int startNameIdx = ctx.children
        String extendName = null;
        if (!(ctx.Identifier(1) == null || ctx.Identifier(1).getText().equals("implement"))) {
            extendName = ctx.Identifier(1).getText();
        }


        ClassNode classNode = new ClassNode(className,extendName,isAbstract,false);
        System.out.println("Entering class: "+classNode.getClassName());

        classNode.setRawLine(sb.toString().trim());
        classNode.setLineNumber(ctx.getStart().getLine());
        classNode.setParentNode(programNode);

        push(classNode);
    }

    @Override
    public void exitClassDeclaration(javaMinusMinusParser.ClassDeclarationContext ctx) {
//        ctx.getText();parentScopeNode
        pop();
    }

    @Override
    public void enterInterfaceDeclaration(javaMinusMinusParser.InterfaceDeclarationContext ctx) {

    }

    @Override
    public void exitInterfaceDeclaration(javaMinusMinusParser.InterfaceDeclarationContext ctx) {

    }

    @Override
    public void enterInterfaceMethodDeclaration(javaMinusMinusParser.InterfaceMethodDeclarationContext ctx) {

    }

    @Override
    public void exitInterfaceMethodDeclaration(javaMinusMinusParser.InterfaceMethodDeclarationContext ctx) {

    }

    @Override
    public void enterInterfaceFieldDeclaration(javaMinusMinusParser.InterfaceFieldDeclarationContext ctx) {

    }

    @Override
    public void exitInterfaceFieldDeclaration(javaMinusMinusParser.InterfaceFieldDeclarationContext ctx) {

    }

    @Override
    public void enterFieldDeclaration(javaMinusMinusParser.FieldDeclarationContext ctx) {

        String varName= ctx.varDeclaration().Identifier().getText();
        String type = ctx.varDeclaration().type().getText();
        AccessModifier accessModifier=  AccessModifier.getModifierBy(ctx.varDeclaration().accessModifier() == null ? null : ctx.varDeclaration().accessModifier().getText());
        ArrayList<TypeSubNode> list = new ArrayList<>();
        list.add(new TypeSubNode(type,isPrimitive(type) || isTypeExists(type)));
        LocalVarNode localVarNode = new LocalVarNode(varName,list);
        localVarNode.setAccessModifier(accessModifier);

        localVarNode.setParentNode(parentScopeNode.peek());
        System.out.println("entering field "+ctx.getText());
    }

    @Override
    public void exitFieldDeclaration(javaMinusMinusParser.FieldDeclarationContext ctx) {
        System.out.println("exit field "+ctx.getText());
    }

    @Override
    public void enterLocalDeclaration(javaMinusMinusParser.LocalDeclarationContext ctx) {
        ArrayList<TypeSubNode> definitions = new ArrayList<>();
        String objectType = null;
        if (ctx.EQ() != null) {
            try {ctx.getText();
                try {
                    Integer.parseInt(ctx.expression().getText());
                    objectType = "int";
                }catch (NumberFormatException _) {
                    Double.parseDouble(ctx.expression().getText());
                    objectType = "decimal";
                }
            }catch (NumberFormatException _) {
                if (ctx.expression().getText().contains("new")) {
                    String regex = "\\bnew([A-Z][a-zA-Z0-9_]*)\\(";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(ctx.expression().getText());
                    if (matcher.find()) {
                        objectType = matcher.group(1);
                    }
                }else {
                    objectType = "UNKNOWN";
                }
            }
        }
        definitions.add(new TypeSubNode(ctx.type().getText(), isPrimitive(ctx.type().getText()) || isTypeExists(ctx.type().getText()),objectType,isPrimitive(objectType) || isTypeExists(objectType)));
        LocalVarNode localVarNode = new LocalVarNode(ctx.Identifier().toString(),definitions);
        localVarNode.setParentNode(parentScopeNode.peek());
        System.out.println("entering localdec "+ctx.Identifier().toString());
    }


    @Override
    public void exitLocalDeclaration(javaMinusMinusParser.LocalDeclarationContext ctx) {
        System.out.println("exit localdec "+ctx.getText());
    }

    @Override
    public void enterVarDeclaration(javaMinusMinusParser.VarDeclarationContext ctx) {
        System.out.println("entering variable dec : "+ctx.getText());
    }

    @Override
    public void exitVarDeclaration(javaMinusMinusParser.VarDeclarationContext ctx) {
        System.out.println("exit variable dec : "+ctx.getText());
    }

    @Override
    public void enterMethodDeclaration(javaMinusMinusParser.MethodDeclarationContext ctx) {
        ArrayList<TypeSubNode> typeSubNodes = new ArrayList<>();
        if (!ctx.parameterList().isEmpty())
            ctx.parameterList().getFirst().parameter().forEach(item->typeSubNodes.add(new TypeSubNode(item.type().getText(),isPrimitive(ctx.type().getText()) || isTypeExists(ctx.type().getText()))));
        MethodNode mn = new MethodNode(ctx.Identifier().getText(),ctx.type().getText(),ctx.accessModifier().getText() == null ? AccessModifier.ACCESS_MODIFIER_PACKAGE: AccessModifier.getModifierBy(ctx.accessModifier().getText()),typeSubNodes,false);
        mn.setOverried(ctx.getText().contains("@Override"));

        var index= ctx.children.stream().map(ParseTree::getText).toList().indexOf("{");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append(ctx.getChild(i).getText()).append(" ");
        }

        mn.setRawLine(sb.toString().trim());
        mn.setParentNode(parentScopeNode.peek());
        push(mn);
        var emptyNode= new EmptyNode();

        emptyNode.setParentNode(parentScopeNode.peek());
        emptyNode.setLineNumber(ctx.getStart().getLine());
        push(emptyNode);

        System.out.println("entering method "+ctx.getText());
    }

    @Override
    public void exitMethodDeclaration(javaMinusMinusParser.MethodDeclarationContext ctx) {
        System.out.println("exit method "+ctx.getText());

        pop();
    }

    @Override
    public void enterConstructorDeclaration(javaMinusMinusParser.ConstructorDeclarationContext ctx) {

        ArrayList<TypeSubNode> typeSubNodes = new ArrayList<>();
        if (!ctx.parameterList().isEmpty())
            ctx.parameterList().getFirst().parameter().forEach(item->typeSubNodes.add(new TypeSubNode(item.type().getText(),isPrimitive(item.type().getText()) || isTypeExists(item.type().getText()))));
        ConstructorNode cn = new ConstructorNode(ctx.Identifier().getText(),ctx.accessModifier().getText() == null ? AccessModifier.ACCESS_MODIFIER_PACKAGE: AccessModifier.getModifierBy(ctx.accessModifier().getText()),typeSubNodes);
        cn.setOverride(ctx.getText().contains("@Override"));
        cn.setParentNode(parentScopeNode.peek());
        //todo what to do for constructor
//        ctx.getText()
        cn.setRawLine(ctx.methodBody().getText());
//        ConstructorNode methodNode = new ConstructorNode(className,defections);
        System.out.println("entering constructor: "+ ctx.getText());
    }

    @Override
    public void exitConstructorDeclaration(javaMinusMinusParser.ConstructorDeclarationContext ctx) {
        System.out.println("exit constructor: "+ ctx.getText());
    }

    @Override
    public void enterAbstractMethodDeclaration(javaMinusMinusParser.AbstractMethodDeclarationContext ctx) {
        System.out.println("enterAbstractMethodDeclaration "+ ctx.getText());

        ArrayList<TypeSubNode> typeSubNodes = new ArrayList<>();
        if (!ctx.parameterList().isEmpty())
            ctx.parameterList().getFirst().parameter().forEach(item->typeSubNodes.add(new TypeSubNode(item.type().getText(),isPrimitive(ctx.type().getText()) || isTypeExists(ctx.type().getText()))));
        MethodNode mn = new MethodNode(ctx.Identifier().getText(),ctx.type().getText(),ctx.accessModifier().getText() == null ? AccessModifier.ACCESS_MODIFIER_PACKAGE: AccessModifier.getModifierBy(ctx.accessModifier().getText()),typeSubNodes,true);
        mn.setOverried(ctx.getText().contains("@Override"));
        mn.setParentNode(parentScopeNode.peek());
        push(mn);
        var emptyNode= new EmptyNode();

        emptyNode.setParentNode(parentScopeNode.peek());
        emptyNode.setLineNumber(ctx.getStart().getLine());

    }

    @Override
    public void exitAbstractMethodDeclaration(javaMinusMinusParser.AbstractMethodDeclarationContext ctx) {
        System.out.println("exitAbstractMethodDeclaration "+ ctx.getText());
//        parentScopeNode.pop();
        pop();
    }

    @Override
    public void enterParameterList(javaMinusMinusParser.ParameterListContext ctx) {
        System.out.println("enterParameterList "+ctx.getText());
    }

    @Override
    public void exitParameterList(javaMinusMinusParser.ParameterListContext ctx) {
        System.out.println("exitParameterList "+ctx.getText());
    }

    @Override
    public void enterParameter(javaMinusMinusParser.ParameterContext ctx) {
        System.out.println("entering Parameter:" + ctx.getText());

    }

    @Override
    public void exitParameter(javaMinusMinusParser.ParameterContext ctx) {
        System.out.println("exit Parameter:" + ctx.getText());
    }

    @Override
    public void enterMethodBody(javaMinusMinusParser.MethodBodyContext ctx) {
        System.out.println("entering method body: "+ctx.getText());

    }

    @Override
    public void exitMethodBody(javaMinusMinusParser.MethodBodyContext ctx) {
        System.out.println("exit method body: "+ctx.getText());
    }

    @Override
    public void enterType(javaMinusMinusParser.TypeContext ctx) {
        System.out.println("entering type : "+ctx.getText());

    }

    @Override
    public void exitType(javaMinusMinusParser.TypeContext ctx) {
        System.out.println("exit type : "+ctx.getText());
    }

    @Override
    public void enterJavaType(javaMinusMinusParser.JavaTypeContext ctx) {
        System.out.println("entering java type: "+ ctx.getText());

    }

    @Override
    public void exitJavaType(javaMinusMinusParser.JavaTypeContext ctx) {
        System.out.println("exit java type: "+ ctx.getText());
    }

    @Override
    public void enterAccessModifier(javaMinusMinusParser.AccessModifierContext ctx) {
        System.out.println("enterAccessModifier "+ ctx.getText());
    }

    @Override
    public void exitAccessModifier(javaMinusMinusParser.AccessModifierContext ctx) {
        System.out.println("exitAccessModifier "+ ctx.getText());
    }

    @Override
    public void enterNestedStatement(javaMinusMinusParser.NestedStatementContext ctx) {
        System.out.println("enterNestedStatement "+ctx.getText());
    }

    @Override
    public void exitNestedStatement(javaMinusMinusParser.NestedStatementContext ctx) {
        System.out.println("exitNestedStatement "+ctx.getText());
    }

    @Override
    public void enterIfElseStatement(javaMinusMinusParser.IfElseStatementContext ctx) {
        System.out.println("enterIfElseStatement "+ctx.getText());
    }

    @Override
    public void exitIfElseStatement(javaMinusMinusParser.IfElseStatementContext ctx) {
        System.out.println("exitIfElseStatement "+ctx.getText());
    }

    @Override
    public void enterWhileStatement(javaMinusMinusParser.WhileStatementContext ctx) {
        System.out.println("enterWhileStatement "+ctx.getText());
    }

    @Override
    public void exitWhileStatement(javaMinusMinusParser.WhileStatementContext ctx) {
        System.out.println("exitWhileStatement "+ctx.getText());
//        parentScopeNode.pop();
        pop();
    }

    @Override
    public void enterForStatement(javaMinusMinusParser.ForStatementContext ctx) {
        System.out.println("enterForStatement "+ctx.getText());
        LoopNode loopNode = new LoopNode();
        loopNode.setLineNumber(ctx.getStart().getLine());
        loopNode.setParentNode(parentScopeNode.peek());
        push(loopNode);
//        parentScopeNode.push(loopNode);
    }

    @Override
    public void exitForStatement(javaMinusMinusParser.ForStatementContext ctx) {
        System.out.println("exitForStatement "+ctx.getText());
//        parentScopeNode.pop();
        pop();
    }

    @Override
    public void enterPrintStatement(javaMinusMinusParser.PrintStatementContext ctx) {
        System.out.println("enterPrintStatement "+ctx.getText());
    }

    @Override
    public void exitPrintStatement(javaMinusMinusParser.PrintStatementContext ctx) {
        System.out.println("exitPrintStatement "+ctx.getText());
    }

    @Override
    public void enterVariableAssignmentStatement(javaMinusMinusParser.VariableAssignmentStatementContext ctx) {
        System.out.println("enterVariableAssignmentStatement "+ctx.getText());
    }

    @Override
    public void exitVariableAssignmentStatement(javaMinusMinusParser.VariableAssignmentStatementContext ctx) {
        System.out.println("exitVariableAssignmentStatement "+ctx.getText());
    }

    @Override
    public void enterArrayAssignmentStatement(javaMinusMinusParser.ArrayAssignmentStatementContext ctx) {
        System.out.println("enterArrayAssignmentStatement "+ ctx.getText());
    }

    @Override
    public void exitArrayAssignmentStatement(javaMinusMinusParser.ArrayAssignmentStatementContext ctx) {
        System.out.println("exitArrayAssignmentStatement "+ctx.getText());
    }

    @Override
    public void enterLocalDeclarationStatement(javaMinusMinusParser.LocalDeclarationStatementContext ctx) {
        System.out.println("entering LocalDeclaration Statement "+ctx.getText());

    }

    @Override
    public void exitLocalDeclarationStatement(javaMinusMinusParser.LocalDeclarationStatementContext ctx) {
        System.out.println("exiting LocalDeclaration "+ctx.getText());
    }

    @Override
    public void enterIfBlock(javaMinusMinusParser.IfBlockContext ctx) {
        System.out.println("enterIfBlock "+ctx.getText());
    }

    @Override
    public void exitIfBlock(javaMinusMinusParser.IfBlockContext ctx) {
        System.out.println("exitIfBlock "+ctx.getText());
    }

    @Override
    public void enterElseBlock(javaMinusMinusParser.ElseBlockContext ctx) {
        System.out.println("enterElseBlock "+ctx.getText());
    }

    @Override
    public void exitElseBlock(javaMinusMinusParser.ElseBlockContext ctx) {
        System.out.println("exitElseBlock "+ctx.getText());
    }

    @Override
    public void enterWhileBlock(javaMinusMinusParser.WhileBlockContext ctx) {
        System.out.println("enterWhileBlock "+ctx.getText());
    }

    @Override
    public void exitWhileBlock(javaMinusMinusParser.WhileBlockContext ctx) {
        System.out.println("exitWhileBlock "+ctx.getText());
    }

    @Override
    public void enterExpressionOrString(javaMinusMinusParser.ExpressionOrStringContext ctx) {
        System.out.println("enterExpressionOrString "+ctx.getText());
    }

    @Override
    public void exitExpressionOrString(javaMinusMinusParser.ExpressionOrStringContext ctx) {
        System.out.println("exitExpressionOrString "+ctx.getText());
    }

    @Override
    public void enterLtExpression(javaMinusMinusParser.LtExpressionContext ctx) {
        System.out.println("enterLtExpression "+ctx.getText());
    }

    @Override
    public void exitLtExpression(javaMinusMinusParser.LtExpressionContext ctx) {
        System.out.println("exitLtExpression "+ctx.getText());
    }

    @Override
    public void enterObjectInstantiationExpression(javaMinusMinusParser.ObjectInstantiationExpressionContext ctx) {
        System.out.println("enterObjectInstantiationExpression "+ctx.getText());
    }

    @Override
    public void exitObjectInstantiationExpression(javaMinusMinusParser.ObjectInstantiationExpressionContext ctx) {
        System.out.println("exitObjectInstantiationExpression "+ctx.getText());
    }

    @Override
    public void enterArrayInstantiationExpression(javaMinusMinusParser.ArrayInstantiationExpressionContext ctx) {
        System.out.println("enterArrayInstantiationExpression "+ctx.getText());
    }

    @Override
    public void exitArrayInstantiationExpression(javaMinusMinusParser.ArrayInstantiationExpressionContext ctx) {
        System.out.println("exitArrayInstantiationExpression "+ctx.getText());
    }

    @Override
    public void enterPowExpression(javaMinusMinusParser.PowExpressionContext ctx) {
        System.out.println("enterPowExpression "+ctx.getText());
    }

    @Override
    public void exitPowExpression(javaMinusMinusParser.PowExpressionContext ctx) {
        System.out.println("exitPowExpression "+ctx.getText());
    }

    @Override
    public void enterSet_type(javaMinusMinusParser.Set_typeContext ctx) {
        System.out.println("enterSet_type "+ctx.getText());
    }

    @Override
    public void exitSet_type(javaMinusMinusParser.Set_typeContext ctx) {
        System.out.println("exitSet_type "+ctx.getText());
    }

    @Override
    public void enterIdentifierExpression(javaMinusMinusParser.IdentifierExpressionContext ctx) {
        System.out.println("enterIdentifierExpression "+ctx.getText());
    }

    @Override
    public void exitIdentifierExpression(javaMinusMinusParser.IdentifierExpressionContext ctx) {
        System.out.println("exitIdentifierExpression "+ctx.getText());
    }

    @Override
    public void enterMethodCallExpression(javaMinusMinusParser.MethodCallExpressionContext ctx) {
        System.out.println("enterMethodCallExpression "+ctx.getText());
    }

    @Override
    public void exitMethodCallExpression(javaMinusMinusParser.MethodCallExpressionContext ctx) {
        System.out.println("exitMethodCallExpression "+ctx.getText());
    }

    @Override
    public void enterNotExpression(javaMinusMinusParser.NotExpressionContext ctx) {
        System.out.println("enterNotExpression "+ctx.getText());
    }

    @Override
    public void exitNotExpression(javaMinusMinusParser.NotExpressionContext ctx) {
        System.out.println("exitNotExpression "+ctx.getText());
    }

    @Override
    public void enterBooleanLitExpression(javaMinusMinusParser.BooleanLitExpressionContext ctx) {
        System.out.println("enterBooleanLitExpression "+ctx.getText());
    }

    @Override
    public void exitBooleanLitExpression(javaMinusMinusParser.BooleanLitExpressionContext ctx) {
        System.out.println("exitBooleanLitExpression "+ctx.getText());
    }

    @Override
    public void enterParenExpression(javaMinusMinusParser.ParenExpressionContext ctx) {
        System.out.println("enterParenExpression "+ctx.getText());
    }

    @Override
    public void exitParenExpression(javaMinusMinusParser.ParenExpressionContext ctx) {
        System.out.println("exitParenExpression "+ctx.getText());
    }

    @Override
    public void enterIntLitExpression(javaMinusMinusParser.IntLitExpressionContext ctx) {
        System.out.println("enterIntLitExpression "+ctx.getText());
    }

    @Override
    public void exitIntLitExpression(javaMinusMinusParser.IntLitExpressionContext ctx) {
        System.out.println("exitIntLitExpression "+ctx.getText());
    }

    @Override
    public void enterVariableDeclaration(javaMinusMinusParser.VariableDeclarationContext ctx) {
        System.out.println("enterVariableDeclaration "+ctx.getText());
    }

    @Override
    public void exitVariableDeclaration(javaMinusMinusParser.VariableDeclarationContext ctx) {
        System.out.println("exitVariableDeclaration "+ctx.getText());
    }

    @Override
    public void enterNullLitExpression(javaMinusMinusParser.NullLitExpressionContext ctx) {
        System.out.println("enterNullLitExpression "+ctx.getText());
    }

    @Override
    public void exitNullLitExpression(javaMinusMinusParser.NullLitExpressionContext ctx) {
        System.out.println("exitNullLitExpression "+ctx.getText());
    }

    @Override
    public void enterAndExpression(javaMinusMinusParser.AndExpressionContext ctx) {
        System.out.println("enterAndExpression "+ctx.getText());
    }

    @Override
    public void exitAndExpression(javaMinusMinusParser.AndExpressionContext ctx) {
        System.out.println("exitAndExpression "+ctx.getText());
    }

    @Override
    public void enterArrayAccessExpression(javaMinusMinusParser.ArrayAccessExpressionContext ctx) {
        System.out.println("enterArrayAccessExpression "+ctx.getText());
    }

    @Override
    public void exitArrayAccessExpression(javaMinusMinusParser.ArrayAccessExpressionContext ctx) {
        System.out.println("exitArrayAccessExpression "+ctx.getText());
    }

    @Override
    public void enterAddExpression(javaMinusMinusParser.AddExpressionContext ctx) {
        System.out.println("enterAddExpression "+ctx.getText());
    }

    @Override
    public void exitAddExpression(javaMinusMinusParser.AddExpressionContext ctx) {
        System.out.println("exitAddExpression "+ctx.getText());
    }

    @Override
    public void enterThisExpression(javaMinusMinusParser.ThisExpressionContext ctx) {
        System.out.println("enterThisExpression "+ctx.getText());
    }

    @Override
    public void exitThisExpression(javaMinusMinusParser.ThisExpressionContext ctx) {
        System.out.println("exitThisExpression "+ctx.getText());
    }

    @Override
    public void enterArrayLengthExpression(javaMinusMinusParser.ArrayLengthExpressionContext ctx) {
        System.out.println("enterArrayLengthExpression "+ctx.getText());
    }

    @Override
    public void exitArrayLengthExpression(javaMinusMinusParser.ArrayLengthExpressionContext ctx) {
        System.out.println("exitArrayLengthExpression "+ctx.getText());
    }

    @Override
    public void enterIntArrayInstantiationExpression(javaMinusMinusParser.IntArrayInstantiationExpressionContext ctx) {
        System.out.println("enterIntArrayInstantiationExpression "+ctx.getText());
    }

    @Override
    public void exitIntArrayInstantiationExpression(javaMinusMinusParser.IntArrayInstantiationExpressionContext ctx) {
        System.out.println("exitIntArrayInstantiationExpression "+ctx.getText());
    }

    @Override
    public void enterSubExpression(javaMinusMinusParser.SubExpressionContext ctx) {
        System.out.println("enterSubExpression "+ctx.getText());
    }

    @Override
    public void exitSubExpression(javaMinusMinusParser.SubExpressionContext ctx) {
        System.out.println("exitSubExpression "+ctx.getText());
    }

    @Override
    public void enterMulExpression(javaMinusMinusParser.MulExpressionContext ctx) {
        System.out.println("enterMulExpression "+ctx.getText());
    }

    @Override
    public void exitMulExpression(javaMinusMinusParser.MulExpressionContext ctx) {
        System.out.println("exitMulExpression "+ctx.getText());
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        System.out.println("visitTerminal "+terminalNode.getText());
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
        System.out.println("visitErrorNode "+errorNode.getText());
    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

        if (!isMainClassVisited) return;

        String regex = "\\{.*?\\}.*?\\{.*?\\}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(parserRuleContext.getText());

//        if (matcher.find())
//            parentScopeNode.push();

        System.out.println("enterEveryRule "+parserRuleContext.getText());
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
//
        System.out.println("exitEveryRule "+parserRuleContext.getText());
    }
}
