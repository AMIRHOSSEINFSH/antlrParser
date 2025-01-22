import gen.javaMinusMinusListener;
import gen.javaMinusMinusLexer;
import gen.javaMinusMinusParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import phase1.ListenerPhase1;
import phase2.SymbolNode.AntlrListenerHelper;
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

        AntlrListenerHelper listener = getListenerBy(HelperType.PHASE2);

        walker.walk(listener, tree);

        listener.showPrettyConsole();


    }

    private static AntlrListenerHelper getListenerBy(HelperType type) {
        switch (type) {
            case PHASE1 -> {
                return new ListenerPhase1();
            }
            case PHASE2 -> {
                return new ListenerPhase2();
            }
            case PHASE3 -> {
                //todo will be implemented soon...
                return null;
            }
        }
        return null;
    }

    private enum HelperType {
        PHASE1,PHASE2,PHASE3
    }
}
