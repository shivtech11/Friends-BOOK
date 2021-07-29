package login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDao
{
  public String check(String email,String pass) 
  {
	  
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/shiv","root","");
		
		String sql ="select * from friendlogindb where email=? and password=?";
		PreparedStatement ps =con.prepareStatement(sql);
		//System.out.println("email "+email+" ps "+pass);
		ps.setString(1,email);
		ps.setString(2,pass);
		ResultSet rs =ps.executeQuery();
		
		//System.out.println(rs.next());
		if(rs.next())
		{
			
			return rs.getString(1);
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return  null;
  }
}
