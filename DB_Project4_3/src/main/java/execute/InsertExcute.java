package execute;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class InsertExcute {
    private ParseTree parseTree;
    private String path = "src/main/resources/db";
    private String dbPath;

    private String table_name;
    private String dataFilePath;
    private Map<String, String> constraint;

    private ArrayList<String> cols = new ArrayList<>();
//    private ArrayList<String> types ;

    public InsertExcute(ParseTree parseTree){
        this.parseTree = parseTree;
    }
    public InsertExcute(ParseTree parseTree, String path){
        this.parseTree = parseTree;
        this.path = path;
    }

    public void execute(){
        if(!getDbPath()){
            System.out.println("Database not exist");
            return;
        }
        if(!tableExist()){
            System.out.println("Table not exist");
            return;
        }



    }

    private boolean getDbPath(){
        dbPath = path;
        boolean hasDb = false;
        if(parseTree.getChild(2).getText().equals(parseTree.getChild(2).getChild(0).getText())){
            dbPath += "/db0";
            table_name = parseTree.getChild(2).getText();
        }else {
            dbPath += "/" + parseTree.getChild(2).getChild(0).getText();
            table_name = parseTree.getChild(2).getChild(2).getText();
        }
        File file = new File(dbPath);
        if(file.exists()){
            hasDb = true;
        } else {
            hasDb = false;
        }
        return hasDb;
    }


    private boolean tableExist(){
        boolean tableExist = false;
        String tableNameDirPath = dbPath +  "/dir/tableNames.txt";
        File file = new File(tableNameDirPath);
        BufferedReader bin = null;
        String tmpLine ;

        try {
            bin = new BufferedReader(new FileReader(file));
            while((tmpLine = bin.readLine())!= null){
                if(tmpLine.equals(table_name)){
                    tableExist = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bin != null){
                try {
                    bin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return tableExist;
    }

    private void getConstraint(){
        String dataColFilePath = dbPath + "/dir" + table_name + ".txt";
        File tableConFile = new File(dataColFilePath);
        BufferedReader bin = null;
        String tmpLine;
        String[] buf;
        constraint = new HashMap<>();
        try {
            bin = new BufferedReader(new FileReader(tableConFile));
            while ((tmpLine = bin.readLine())!= null){
                buf = tmpLine.split("\\s+");
                constraint.put(buf[0], buf[1]);
                cols.add(buf[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bin != null){
                try {
                    bin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void insert(){
        String dataFilePath = dbPath + "/data" + table_name + ".txt";
        File file = new File(dataFilePath);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        PrintWriter pw1 = null;
        ParseTree subTree;
        String col_name;
        String col_val;
        boolean isLegal = true;
        String writeStr = "";

//        ArrayList<String> checks = new ArrayList<>();
        if(parseTree.getChild(3).getText().equals("(")){
            //有列名
            int i = 0;
//            while((subTree = parseTree.getChild(5).))
        }else if (parseTree.getChild(3).getText().equals("values")){
            //无列名
            int i = 0;
            while((subTree = parseTree.getChild(5).getChild(i)) != null){
                col_val = subTree.getText();
                if(col_val.length() > 0){
                    if(col_val.charAt(0) == '"'){
                        //是varchar
                        writeStr += col_val;
                    } else{
                        //是number
                        if(isInteger(col_val)){
                            writeStr += col_val;
                        }else {
                            isLegal = false;
                        }
                    }
                }
                i+=2;
            }
        }
        if(isLegal){

        }else {

        }
        try {
            pw1 = new PrintWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    private boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
}
