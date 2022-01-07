//import hello.HelloLexer;
//import hello.HelloParser;
import execute.CreateExcute;
import execute.InsertExcute;
import sql.MysqlQueryLexer;
import sql.MysqlQueryParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void run(String expr) throws Exception{
        // 对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream input = new ANTLRInputStream(expr);
//        CharStream charinput = CharStreams.fromFileName(expr);
        // 用 in 构造词法分析器 lexer，词法分析的作用是将字符聚集成单词或者符号
        MysqlQueryLexer lexer = new MysqlQueryLexer(input);
        // 用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        MysqlQueryParser parser = new sql.MysqlQueryParser(tokens);
        String head = parser.getCurrentToken().getText();
        ParseTree parseTree;
        switch (head){
            case "insert":
                System.out.println("insert sql");

                parseTree = parser.insertStatement();
//                System.out.println(parseTree.getChild(5).getText());
//                InsertExcute insertExcute = new InsertExcute(parseTree);
//                insertExcute.execute();
                break;
            case "create":
                System.out.println("create sql");
                parseTree = parser.createStatement();
                CreateExcute createExcute = new CreateExcute(parseTree);
                createExcute.execute();
                break;
            case "select":
                System.out.println("select sql");
                parseTree = parser.selectStatement();
                break;
            default:
                System.out.println("Error");
                break;
        }

    }


    public static void TestFile(String fileName, ArrayList<String> lines){
        File file1 = new File(fileName);
        Reader reader = null;
        String s = "";
        try {
            reader = new InputStreamReader(new FileInputStream(file1));
            int tmpChar;
            while ((tmpChar = reader.read()) != -1){
                s += String.valueOf((char)tmpChar);
                if(tmpChar == ';'){
                    //一个式子结束
                    lines.add(s);
                    s = "";
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
        }

    }
    public static void main(String[] args) throws Exception{ ;
        String filename = "src/main/resources/test/mytest.sql";
        ArrayList<String> arrayList = new ArrayList<>();
        TestFile(filename, arrayList);
        for(String s:arrayList){
            run(s);
        }
//        run(s);
    }
}