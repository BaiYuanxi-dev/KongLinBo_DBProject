package pers;

import pers.ast.ASTNode;
import pers.ast.Evaluate;
import pers.ast.EvaluatorException;
import pers.exception.ParserException;
import pers.parse.Parser;

import java.io.*;

public class Main {

    public static void Test(String text)
    {

        Parser parser = new Parser(text + ";");
        try{
            ASTNode ast = parser.Parse();
            Evaluate eval = new Evaluate();
            try {
                double val = eval.Evaluate(ast);
                System.out.println(text + " res is " + val);
            } catch (EvaluatorException e) {
                e.printStackTrace();
            }
        } catch(ParserException e){
            System.out.println(text + " " + e.toString());
        }

//        try {
//            parser.Parse();
////            std::cout << """ << text << ""t OK" << std::endl;
//        } catch(ParserException e) {
////      std::cout << "" << text << t " << ex.what() << std::endl;
//        }
    }


    public static void TestFile(String fileName1, String fileName2){
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);
        Reader reader = null;
        PrintWriter pw = null;
        String s = "";
        try {
            reader = new InputStreamReader(new FileInputStream(file1));
            pw = new PrintWriter(new FileWriter(file2));
            int tmpChar;
            while ((tmpChar = reader.read()) != -1){
                s += String.valueOf((char)tmpChar);
                if(tmpChar == ';'){
                    //一个式子结束
                    Parser parser = new Parser(s + ";");
                    ASTNode ast = null;
                    try {
                        ast = parser.Parse();
                        Evaluate eval = new Evaluate();
                        double val = 0;
                        try {
                            val = eval.Evaluate(ast);
                            pw.println(s + " " + val);
//                        System.out.println(s + " res is " + val);
                        } catch (EvaluatorException e) {
                            e.printStackTrace();
                        }
                    } catch (ParserException e) {
                        pw.println(s + " " + e.toString());
                    } finally {
                        s = "";
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(pw != null){
                pw.close();;
            }
        }

    }
    public static void main(String[] args){
//        TestFile("src/resources/test.txt", "src/resources/res.txt");
        Test("sin90");

//        Test("sin(cos0+0.57) + 3");
//        Test("1*2*3*4");
//        Test("1-2-3-4");
//        Test("1/2/3/4");
//        Test("1*2+3*4");
//        Test("1+2*3+4");
//        Test("(1+2)*(3+4)");
//        Test("1+(2*3)*(4+5)");
//        Test("15+(2*3)/4-5.5");
//        Test("5/(4+3)/2");
//        Test("1 + 2.5");
//        Test("125");
//        Test("-1");
//        Test("-1+(-2)");
//        Test("-1+(-2.0)");
//
//        Test("   1*2,5");
//        Test("   1*2.5e2");
//        Test("M1 + 2.5");
//        Test("1 + 2&5");
//        Test("1 * 2.5.6");
//        Test("1 ** 2.5");
//        Test("*1 / 2.5");
//        System.out.println(new String("01234").charAt(5));
    }
}
