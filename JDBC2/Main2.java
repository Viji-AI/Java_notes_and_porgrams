package JDBC2;
import java.sql.*; 
import java.util.Scanner; 
public class Main2 { 
   public static void main(String[] args) throws SQLException { 
	   String url = "jdbc:mysql://localhost:3306/entrybook";
	   String username = "root";
	   String password = "Viji@2005";
       Connection con = DriverManager.getConnection(url, username, password); 
       con.setAutoCommit(false);  
       System.out.println("Connection Success"); 
       Statement stmt = con.createStatement(); 
       Scanner sc = new Scanner(System.in); 

       String createTable =  "CREATE TABLE details (" + "name VARCHAR(30), " + "address VARCHAR(50), " + "city VARCHAR(30), " + "state VARCHAR(30), " + "country VARCHAR(30))"; 
       stmt.executeUpdate(createTable); 
       System.out.println("Table Created"); 
       String insertFixed =  "INSERT INTO details VALUES " + "('John', 'Main Street', 'New York', 'NY', 'USA')"; 
       stmt.executeUpdate(insertFixed); 
       System.out.println("Hardcoded Data Inserted"); 
       System.out.println("Enter Name:"); 
       String name = sc.nextLine(); 
       System.out.println("Enter Address:"); 
       String address = sc.nextLine(); 
       System.out.println("Enter City:"); 
       String city = sc.nextLine(); 
       System.out.println("Enter State:"); 
       String state = sc.nextLine(); 
       System.out.println("Enter Country:"); 
       String country = sc.nextLine(); 
       String insertUser = "INSERT INTO details VALUES (?, ?, ?, ?, ?)"; 
       PreparedStatement ps = con.prepareStatement(insertUser); 
       ps.setString(1, name); 
       ps.setString(2, address); 
       ps.setString(3, city); 
       ps.setString(4, state); 
       ps.setString(5, country); 
       ps.executeUpdate(); 
       System.out.println("User Data Inserted"); 
       String updateQuery =  "UPDATE details SET city = 'Chennai' WHERE name = 'John'"; 
       stmt.executeUpdate(updateQuery); 
       System.out.println("Data Updated"); 
       String alterQuery =  "ALTER TABLE details ADD email VARCHAR(40)"; 
       stmt.executeUpdate(alterQuery); 
       System.out.println("New Column Added"); 
       con.commit(); 
       System.out.println("Transaction Committed");  
       String deleteQuery =  "DELETE FROM details WHERE name = 'John'"; 
       stmt.executeUpdate(deleteQuery); 
       System.out.println("One Row Deleted"); 
       ResultSet rs = stmt.executeQuery("SELECT * FROM details"); 
       System.out.println("\nFinal Table Data:"); 
       while (rs.next()) { 
           System.out.println( 
                   rs.getString(1) + " " + 
                   rs.getString(2) + " " + 
                   rs.getString(3) + " " + 
                   rs.getString(4) + " " + 
                   rs.getString(5) ); 
       } 
       rs.close(); 
       ps.close(); 
       stmt.close(); 
       sc.close(); 
       con.close(); 
   } 
} 

