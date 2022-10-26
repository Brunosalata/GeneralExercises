import java.sql.*; 

public class mySQLCon {

	public static void main(String[] args) {
 
		try {  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sonoo","root","root");  
		
			//here sonoo is database name, root is username and password  
		
			Statement stmt=con.createStatement();  
		
			ResultSet rs=stmt.executeQuery("select * from emp");  
	
			while(rs.next()) { 
		
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
			} 
		
			con.close();  
		}
		
		catch(Exception e){ 
			System.out.println(e); 		
		}  
	} 
}

/*
	In this example we are using MySql as the database. So we need to know following informations for the mysql database:

	1- Driver class: The driver class for the mysql database is com.mysql.jdbc.Driver.
	
	2- Connection URL: The connection URL for the mysql database is jdbc:mysql://localhost:3306/sonoo where jdbc is the API, 
	mysql is the database, localhost is the server name on which mysql is running, we may also use IP address, 3306 is the 
	port number and sonoo is the database name. We may use any database, in such case, we need to replace the sonoo with our database name.
	
	3- Username: The default username for the mysql database is root.
	
	4- Password: It is the password given by the user at the time of installing the mysql database. In this example, we are going to use 
	root as the password.

*/