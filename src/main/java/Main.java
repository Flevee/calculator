import cal.cal.CalLexer;
import cal.cal.CalParser;
import cal.cal.Visitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String x = "";
        CalLexer lexer;
        CalParser parser;
        CommonTokenStream tokens;
        ParseTree tree;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextLine()) {
                x = scanner.nextLine();
            }
            lexer = new CalLexer(new ANTLRInputStream(x));
            tokens = new CommonTokenStream(lexer);
            parser = new CalParser(tokens);
            tree = parser.stat();
            new Visitor().visit(tree);
        }
    }
}
