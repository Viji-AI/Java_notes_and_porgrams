package JDBC1;
import java.sql.*;
public class Delete {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "Viji@2005";
        Connection con = DriverManager.getConnection(url, username, password); 
        String query = "delete from student where std_name='Viji'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        System.out.println("Record Deleted Successfully"); 
        con.close();

	}

}
