import gen.javaMinusMinusListener;
import gen.javaMinusMinusLexer;
import gen.javaMinusMinusParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import phase2.SymbolNode.enumeration.NodeType;
import phase2.SymbolNode.nodes.EmptyNode;
import phase2.SymbolNode.nodes.SymbolNode;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainExecutor {
    public static void main(String[] args) throws IOException {

        var filePath = "sample.txt";

        CharStream stream = CharStreams.fromFileName(filePath);
        javaMinusMinusLexer lexer = new javaMinusMinusLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        javaMinusMinusParser parser = new javaMinusMinusParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();

//        javaMinusMinusListener listener = new ListenerPhase1();
        javaMinusMinusListener listener = new ListenerPhase2();

        walker.walk(listener, tree);

        SymbolNode rootNode = ((ListenerPhase2) listener).programNode;

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


}
