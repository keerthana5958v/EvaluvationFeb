package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class ReadFromDB {
    public static void main(String[] args) {
        ReadFromDB readFromDB = new ReadFromDB();
        readFromDB.writeToFile(readFromDB.contentFromDB());
    }
    String contentFromDB(){
        String str="";
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ReadContent", "username", "password")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query = "select * from userDescription;";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                str += rs.getString(1)+": "+ rs.getString(2)+"\n";
            }
//            ReadFromDB readFromDB = new ReadFromDB();
            writeToFile(str);
            System.out.println("content from database successfully copied to file ");

        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("unable to copy file");
        }
        return str;
    }
    void writeToFile(String str) {
        FileWriter fw = null;
        try {
            File file = new File("/home/keerthanas/IdeaProjects/Eval/src/main/java/org/example/file.txt");
            file.createNewFile();
            fw = new FileWriter(file);
            fw.append(str);
            fw.flush();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try{
                fw.close();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}