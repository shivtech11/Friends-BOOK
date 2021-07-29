package login;
import login.dao.loginDao;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession();
//		
//		String userName = request.getParameter("uname");
//		session.setAttribute("loginKey", userName);
//		
//		RequestDispatcher rd= request.getRequestDispatcher("DB-Manager.jsp");
//		rd.forward(request, response);
		String email=request.getParameter("email");
		String pass=request.getParameter("psw");
		
		loginDao ld=new loginDao();
		//System.out.println(ld.check(uname,pass));
		String uname =ld.check(email,pass);
		//System.out.println("return value"+uname);
		if(uname!=null) 
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			session.setAttribute("fid", email);
			response.sendRedirect("index.jsp");
		}
		else {
			String msg="Try Again Please!!";
			response.sendRedirect("Message.jsp?msg="+msg);
		}
	}

}
