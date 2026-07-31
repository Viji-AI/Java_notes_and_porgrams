package JDBC;
import java.sql.*;

public class Main {

	public static void main(String[] args) throws Exception {
		 readRecords();        
		 insertRecords();       
		 insertVar();        
		 insertUsingPst();        
		 update();        
		 commitdemo(); 
	}

	public static void readRecords() throws Exception { 
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "Viji@2005";
		String query = "select * from emp";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection to DataBase Successfully!!!");
		Statement st = con.createStatement();        
		ResultSet rs = st.executeQuery(query);          
		while (rs.next()) {              
			System.out.println("Name is " + rs.getString(1));            
			System.out.println("ID is " + rs.getInt(2));          
			System.out.println("Age is " + rs.getInt(3));  
		}
		con.close();
	}

	public static void insertRecords() throws Exception {
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "Viji@2005";
		String query = "insert into emp values('Siva',10,20)";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("Number of Rows affected:" +rows);
		st.close();
		con.close();
	}

	public static void insertVar() throws Exception { 
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "Viji@2005";
		int id = 9; 
		String name = "Kavya"; 
		int age = 20;   
		String query = "insert into emp values ('" 
						+ name + "', " 
						+ id + ", " 
						+ age + ")"; 
		Connection con = DriverManager.getConnection(url, username, password); 
		Statement st = con.createStatement(); 
		int rows = st.executeUpdate(query); 
		System.out.println("Number of rows affected: " + rows); 
		con.close(); 
	} 

	public static void insertUsingPst() throws Exception { 
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "Viji@2005";
		int id = 7;      // changed to avoid duplicate primary key with insertVar()'s id = 5
		String name = "PorSelvi"; 
		int age = 28; 
		String query = "insert into emp values (?,?,?)"; 
		Connection con = DriverManager.getConnection(url, username, password); 
		PreparedStatement pst = con.prepareStatement(query); 
		pst.setString(1, name); 
		pst.setInt(2, id); 
		pst.setInt(3, age); 
		int rows = pst.executeUpdate(); 
		System.out.println("Number of rows affected: " + rows); 
		con.close(); 
	} 

	public static void update() throws Exception { 
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "Viji@2005";
		String query = "update emp set emp_age = 24 where emp_id = 5"; 
		Connection con = DriverManager.getConnection(url, username, password); 
		Statement st = con.createStatement(); 
		int rows = st.executeUpdate(query); 
		System.out.println("Number of rows affected: " + rows); 
		con.close(); 
	} 

	public static void commitdemo() throws Exception { 
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "Viji@2005";
		String query1 = "update emp set emp_age = 20 where emp_id = 5"; 
		String query2 = "update emp set emp_age = 22 where emp_id = 6"; 
		Connection con = DriverManager.getConnection(url, username, password); 
		con.setAutoCommit(false); 
		Statement st = con.createStatement(); 
		int rows1 = st.executeUpdate(query1); 
		System.out.println("Rows affected: " + rows1); 
		int rows2 = st.executeUpdate(query2); 
		System.out.println("Rows affected: " + rows2); 
		con.commit(); 
		con.close(); 
	} 
}