package SignUp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Database.DBcon;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String yname = request.getParameter("name");
		 String ymail  = request.getParameter("email");
		 String ypsw = request.getParameter("psw");
		 
		// System.out.println(ypsw);
		 try { 
			 Connection con=DBcon.getConnection();  
			 String SQL ="INSERT INTO friendlogindb(name,email,password) VALUES (?,?,?)";	
			 PreparedStatement ps= con.prepareStatement(SQL);		
				ps.setString(1,yname);
				ps.setString(2,ymail);
				ps.setString(3,ypsw);
			    ps.executeUpdate();
			    
			    HttpSession session = request.getSession();
				session.setAttribute("username", yname);
				session.setAttribute("fid", ymail);
			    response.sendRedirect("MainPage.jsp");
			}
			catch(Exception e) {
				System.out.println(e);
				response.sendRedirect("Message.jsp?msg=No any account created !! "+e);
			}
        }
}
		 
