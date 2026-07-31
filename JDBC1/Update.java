package JDBC1;
import java.sql.*;
public class Update {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "Viji@2005";
        Connection con = DriverManager.getConnection(url, username, password); 
        String query = "update student set std_age = 20 where std_name = 'Viji'";       
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        System.out.println("Record Updated Successfully"); 
        con.close();

	}

}
