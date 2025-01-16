import gen.javaMinusMinusListener;
import gen.javaMinusMinusLexer;
import gen.javaMinusMinusParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

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

        System.out.println(((ListenerPhase2) listener).rootNode.getChildren());

    }


}
