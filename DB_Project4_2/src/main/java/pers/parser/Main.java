package pers.parser;

import java_cup.runtime.Symbol;
import javacup.*;
import javaflex.*;

import java.io.FileReader;

public class Main {
    public static void main(String argv[]) throws Exception {

        FileReader fr = new FileReader(argv[0]);
        JavaFlexScanner scanner = new JavaFlexScanner(fr);

        JavaCUPParser parser = new JavaCUPParser(scanner);

        Symbol parse_tree = parser.parse();
        System.out.println(parse_tree);
    }
}
