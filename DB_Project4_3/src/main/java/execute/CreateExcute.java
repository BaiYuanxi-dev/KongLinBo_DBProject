package execute;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class CreateExcute {
    private ParseTree parseTree;
    private String path = "src/main/resources/db";
    public CreateExcute(ParseTree parseTree){
        this.parseTree = parseTree;
    }

    public CreateExcute(ParseTree parseTree,String path){
        this.parseTree = parseTree;
        this.path = path;
    }


    /**
     * 执行create语句
     */
    public void execute(){
        String dbPath = path;
        BufferedReader bin = null;
        PrintWriter pw = null;
        String tableNameFilePath;
        String tmpline;
        String table_name;

        boolean couldCreate;

        //文件路径字符串赋值
        dbPath = this.getDbPath();
        tableNameFilePath  = dbPath;
        table_name = this.getTableName(dbPath);
        tableNameFilePath += "/dir/tableNames.txt";
        //表名写到表名数据字典中
        couldCreate = this.writeTableName(tableNameFilePath, table_name);
        if(!couldCreate){
            System.out.println("create fail");
            return;
        }
        //建表.txt
        this.createTable(dbPath, table_name);
    }

    /**
     * 获得数据库文件路径，如果不存在就创建路径
     */
    private String getDbPath(){
        String dbPath = path;
        if(parseTree.getChild(2).getText().equals(parseTree.getChild(2).getChild(0).getText())){
            System.out.println("default db");
            dbPath += "/db0";
        }else {
            dbPath += "/" +parseTree.getChild(2).getChild(0).getText();
        }
        File file = new File(dbPath);
        if(!file.exists()){
            file.mkdir();
        }

        //如果数据库文件下没有dir
        String tableNameFilePath = dbPath;
        tableNameFilePath += "/dir";
        file = new File(tableNameFilePath);
        if(!file.exists()){
            file.mkdir();
        }


        tableNameFilePath +=  "/tableNames.txt";
        file = new File(tableNameFilePath);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return dbPath;
    }


    /**
     * 获得表名
     * @param dbPath 传入 数据库 目录 的路径
     * @return
     */
    private String getTableName(String dbPath){
//        String dbPath = path;
        String tableNameFilePath = dbPath;
        String table_name;
        File file;
        tableNameFilePath = dbPath +  "/dir/tableNames.txt";
        if(parseTree.getChild(2).getText().equals(parseTree.getChild(2).getChild(0).getText())){
            //only table name
            table_name = parseTree.getChild(2).getText();
        }else {
            //table name and db name
            table_name = parseTree.getChild(2).getChild(2).getText();
        }
        return table_name;
    }


    /**
     * 将表名写到数据库数据字典的 “表名” 表中
     * @param tableNameFilePath
     * @param table_name
     * @return
     */
    private boolean writeTableName(String tableNameFilePath,String table_name){
        BufferedReader bin = null;
        PrintWriter pw = null;
        String tmpline;
        boolean couldCreateTable = false;
        try {
            bin = new BufferedReader(new FileReader(tableNameFilePath));
            boolean hasTitle = false;
            while((tmpline = bin.readLine()) != null){
                if(tmpline.equals(table_name)){
                    hasTitle = true;
                }
            }
//            bin.close();
            if(hasTitle){
                System.out.println("This table has already existed");
            }else {
                //建表
                couldCreateTable = true;
                pw = new PrintWriter(new FileWriter(tableNameFilePath, true));
                pw.println(table_name);
                pw.flush();
//                pw.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bin!=null){
                try {
                    bin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(pw!=null){
                pw.close();
            }
        }
        return couldCreateTable;
    }


    /**
     * 将表的字段写到数据字典下 表名 对应的 源数据表中
     * 创建data表用于存储数据
     * @param dbPath
     * @param table_name
     */
    private void createTable(String dbPath, String table_name){
        String fileName = dbPath + "/dir";

        fileName += "/" + table_name + ".txt";
        File file = new File(fileName);
        PrintWriter pw = null;
        ParseTree parseTree = this.parseTree.getChild(4);
        ParseTree subTree = parseTree;
        int i = 0;

        String line;
        try {
            pw = new PrintWriter(new FileWriter(file));
            while( (subTree = parseTree.getChild(i)) != null ){
                line = subTree.getChild(0).getText() + " " +subTree.getChild(1).getText();
                pw.println(line);
                i+=2;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(pw!=null){
                pw.close();
            }
        }

        fileName = dbPath + "/data";
        file = new File(fileName);
        if(!file.exists()){
            file.mkdir();
        }
        fileName += "/" + table_name + ".txt";
        file = new File(fileName);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    private boolean existTable(){
        String tableListFile = path + "/dir/tableList";
        return true;
    }
}
