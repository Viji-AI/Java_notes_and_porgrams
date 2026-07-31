package JDBC1;
import java.sql.*;
public class Select {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "Viji@2005";
        Connection con = DriverManager.getConnection(url, username, password); 
        Statement stmt = con.createStatement();
        ResultSet rs= stmt.executeQuery("select * from student");
        while(rs.next()) {
        	System.out.println(rs.getString(1) + ""+rs.getInt(2)+""+rs.getInt(3)+""+rs.getString(4));
        }
        con.close();

	}

}
