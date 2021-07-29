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
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String fid  = request.getParameter("fid");
		 String fname  = request.getParameter("fname");
		 String femail = request.getParameter("femail");
		 String fphn = request.getParameter("fphn");
		 String email = request.getParameter("email key");
		 
		 int closefriend = Integer.parseInt(request.getParameter("closefriend"));
		 int bestfriend = Integer.parseInt(request.getParameter("bestfriend"));
		 int schoolfriend = Integer.parseInt(request.getParameter("schoolfriend"));
		 int collegefriend = Integer.parseInt(request.getParameter("collegefriend"));
		 int familyfriend = Integer.parseInt(request.getParameter("familyfriend"));
		 int businessfriend = Integer.parseInt(request.getParameter("businessfriend"));
		 		//System.out.println(fid+" === update ");
		 		//System.out.println(femail+" === update ");
		try { 
		 Connection con=DBcon.getConnection();  
		 //String SQL ="DELETE from friendsbookdb where 'email id'='"+fid+"'";	
		 String SQL = "UPDATE `friendsbookdb` SET `Fname`=?,`Close Friend`=?,`Business Friend`=?,`Family Friend`=?,`Best Friend`=?,`School Friend`=?,`College Friend`=?,`Ph number`=?,`email id`=? WHERE Fid=? AND `email id`=?";
		  PreparedStatement ps= con.prepareStatement(SQL);		
		 	ps.setString(1,fname);
			ps.setInt(2,closefriend);
			ps.setInt(3,businessfriend);
			ps.setInt(4,familyfriend);
			ps.setInt(5,bestfriend);
			ps.setInt(6,schoolfriend);
			ps.setInt(7,collegefriend);
			ps.setString(8,fphn);
			ps.setString(9,femail);
			ps.setString(10,fid);
			ps.setString(11,email);
			
			//String SQL = "UPDATE `friendsbookdb` SET fname='booom g' WHERE Fid='shiv123@gmail.com' AND `email id`='"+femail+"'";
			//PreparedStatement ps= con.prepareStatement(SQL);		 
			ps.executeUpdate();
			      
			      //  System.out.println("update Successfully");
		
			con.close();	
		 
		 } catch (SQLException e) {
				e.printStackTrace();
				System.out.println("not insert "+e);
			}
		finally {
			   response.sendRedirect("Message.jsp?msg=Update Successfuly !!");
		   }

		 
		}	 
	}
