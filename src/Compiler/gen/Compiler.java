package gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;
import gen.javaMinusMinusListener ;
import gen.javaMinusMinusBaseListener ;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



import java.util.List;

public class Compiler {

    public static void main(String[] args) throws IOException {

//        System.out.println("Faze1");
        CharStream stream = CharStreams.fromFileName("test.txt");
        javaMinusMinusLexer lexer = new javaMinusMinusLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        javaMinusMinusParser parser = new javaMinusMinusParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
//        javaMinusMinusBaseListener listener = new javaMinusMinusBaseListener() ;
        Listener listener = new Listener();
        walker.walk(listener, tree);

    }
}

