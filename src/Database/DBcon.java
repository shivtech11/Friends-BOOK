package Database;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon{
	
	//make conncetion
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
        	Class.forName("com.mysql.jdbc.Driver");
	        con = DriverManager.getConnection("jdbc:mysql://localhost/shiv","root","");
	        }
        catch(Exception e){System.out.println(e);}  
        return con;  
    }  
	 
	
   }
		

