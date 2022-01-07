package execute;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SelectExcute {
    private ParseTree parseTree;
    private String path = "src/main/resources/db";
    public SelectExcute(ParseTree parseTree){
        this.parseTree = parseTree;
    }

    public SelectExcute(ParseTree parseTree,String path){
        this.parseTree = parseTree;
        this.path = path;
    }
    public void execute(){
        // data directory
        String directoryFName = path + "/dir/tableName.txt";
        File file = new File(directoryFName);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(file));
            //table_name table_column
            pw.println(parseTree.getChild(2).getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // data
    }
}
