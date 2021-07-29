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
 * Servlet implementation class insert
 */
@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 String fid = request.getParameter("fid");
	 String fname  = request.getParameter("fname");
	 String femail = request.getParameter("femail");
	 String fphn = request.getParameter("fphn");
	 
	 int closefriend = Integer.parseInt(request.getParameter("closefriend"));
	 int bestfriend = Integer.parseInt(request.getParameter("bestfriend"));
	 int schoolfriend = Integer.parseInt(request.getParameter("schoolfriend"));
	 int collegefriend = Integer.parseInt(request.getParameter("collegefriend"));
	 int familyfriend = Integer.parseInt(request.getParameter("familyfriend"));
	 int businessfriend = Integer.parseInt(request.getParameter("businessfriend"));
	// System.out.println("fname - "+fname);
	
	try { 
	 Connection con=DBcon.getConnection();  
	 String SQL ="INSERT INTO `friendsbookdb`(`Fid`, `Fname`, `Close Friend`, `Business Friend`, `Family Friend`, `Best Friend`, `School Friend`, `College Friend`, `Ph number`, `email id`) VALUES (?,?,?,?,?,?,?,?,?,?)";	
	 PreparedStatement ps= con.prepareStatement(SQL);		
		ps.setString(1,fid);
		ps.setString(2,fname);
		ps.setInt(3,closefriend);
		ps.setInt(4,businessfriend);
		ps.setInt(5,familyfriend);
		ps.setInt(6,bestfriend);
		ps.setInt(7,schoolfriend);
		ps.setInt(8,collegefriend);
		ps.setString(9,fphn);
		ps.setString(10,femail);
		
		
		ps.executeUpdate();
		//System.out.println("inserted Successfully");
	
		con.close();	
	 
	 } catch (SQLException e) {
			e.printStackTrace();
			System.out.println("not insert "+e);
		}
	finally {
		   response.sendRedirect("MainPage.jsp");
	   }

	 
	}	 
}
