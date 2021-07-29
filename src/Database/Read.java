package Database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Read {
	
	//make conncetion
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
        	Class.forName("com.mysql.jdbc.Driver");
	        con = DriverManager.getConnection("jdbc:mysql://localhost/shiv","root","");
	        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
	 //size of data store in array
 	 public int size=0;
 	  
	//all friends
	public String[][] Friends(String fid,String choice) throws SQLException {
					Connection con=Read.getConnection();  
					Statement st  = con.createStatement();
					
					String SQL = null;
					if(choice.equals("All Friends")) 
					   SQL = "SELECT * FROM `friendsbookdb` WHERE fid='"+fid+"'";
					
					else if(choice.equals("Close Friends")) 
				    	SQL = "SELECT * FROM `friendsbookdb` WHERE fid='"+fid+"' AND `Close Friend`=1"; 
					
					else if(choice.equals("Family Friends"))    
				    	SQL = "SELECT * FROM `friendsbookdb` WHERE fid='"+fid+"' AND `Family Friend`=1";
					
					else if(choice.equals("Business Friends"))    
				    	SQL = "SELECT * FROM `friendsbookdb` WHERE fid='"+fid+"' AND `Business Friend`=1";
					
					else if(choice.equals("Best Friends"))    
				    	SQL = "SELECT * FROM `friendsbookdb` WHERE fid='"+fid+"' AND `Best Friend`=1";
				    
					else if(choice.equals("School Friends"))    
				    	SQL = "SELECT * FROM `friendsbookdb` WHERE fid='"+fid+"' AND `School Friend`=1";
				    
					else if(choice.equals("College Friends"))    
				    	SQL = "SELECT * FROM `friendsbookdb` WHERE fid='"+fid+"' AND `College Friend`=1";
				    
					else  
				    	SQL = "SELECT * FROM `friendsbookdb` WHERE fid='"+fid+"'";
				    
					ResultSet s= st.executeQuery(SQL);
					
					String data[][] = new String[20][3];
					int i=0,j=0;
					while(s.next()) {
							data[i][j++] = s.getString(2);
							data[i][j++] = s.getString(9);
							data[i][j] = s.getString(10);
							i++;
							j=0;
							
							//length of data increasing = size growing
							size++;
						}	
					
					con.close(); 
					return data;
	     }
	
   }
		

