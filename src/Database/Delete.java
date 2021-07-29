package Database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 String fid = request.getParameter("fid");
	 
     //System.out.println("fid - "+fid);
	
	try { 
	 Connection con=DBcon.getConnection();  
	 //String SQL ="DELETE from friendsbookdb where 'email id'='"+fid+"'";	
	  String SQL = "DELETE FROM `friendsbookdb` WHERE `email id`=?";
	 PreparedStatement ps= con.prepareStatement(SQL);		
	 ps.setString(1,fid);
		
		ps.executeUpdate();
		//System.out.println("delete Successfully");
	
		con.close();	
	 
	 } catch (SQLException e) {
			e.printStackTrace();
			System.out.println("not insert "+e);
		}
	finally {
		   response.sendRedirect("Message.jsp?msg=Delete Successfully !!");
	   }

	 
	}	 
}

