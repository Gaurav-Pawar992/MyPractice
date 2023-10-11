import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   String dbURL = "jdbc:postgresql://localhost:5433/SPB";
		   String username = "postgres";
		   String password = "root";
		   
		   String QUERY = "SELECT count(*) as Total FROM swimmer_application";
	      
		   
		  Connection con = null;
	      Statement stmt = null;
	     
	          
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 try {
			 con = DriverManager.getConnection(dbURL,username,password);
	         
	         stmt = con.createStatement();
	         
	         ResultSet rs=stmt.executeQuery(QUERY);
	         
	         
	         while (rs.next()) {
	        	 System.out.println("Swimming Pool Local Database feature1 5432");
	             System.out.print("Total Count : " + rs.getLong("Total"));
	         }
	      } catch (SQLException e) {
	          e.printStackTrace();
	      }

	}

}
