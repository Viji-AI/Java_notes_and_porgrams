package JDBC1; 
import java.sql.*;
public class Main1 { 
    public static void main(String[] args) throws Exception { 
    	String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "Viji@2005";
        Connection con = DriverManager.getConnection(url, username, password); 
        System.out.println("Connected to DataBase Successfully"); 
 
        con.close(); 
    } 
} 