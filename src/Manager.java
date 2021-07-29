import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.Read;


/**
 * Servlet implementation class me
 */
@WebServlet("/Manager")
public class Manager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String choice = request.getParameter("Access");
		String key = request.getParameter("key");
		
		Read q = new Read();
	try {
		
		if(choice.equals("All Friends")) {
			String list[][] = q.Friends(key,choice);
			request.setAttribute("arr",list);
			
		}
		else if(choice.equals("Close Friends")) {
			String list[][] = q.Friends(key,choice);
			  request.setAttribute("arr",list);
			
		}
		else if(choice.equals("Family Friends")) {
			String list[][] = q.Friends(key,choice);
			  request.setAttribute("arr",list);
			
		}
		else if(choice.equals("Business Friends")) {
			String list[][] = q.Friends(key,choice);
			  request.setAttribute("arr",list);
			
		}
		else if(choice.equals("Best Friends")) {
			String list[][] = q.Friends(key,choice);
			  request.setAttribute("arr",list);
			
		}
		else if(choice.equals("School Friends")) {
			String list[][] = q.Friends(key,choice);
			  request.setAttribute("arr",list);
		}
		else if(choice.equals("College Friends")) {
			String list[][] = q.Friends(key,choice);
			  request.setAttribute("arr",list);	  
		}
		else if(choice.equals("Delete Friend")) {
			String list[][] = q.Friends(key,choice);
			  request.setAttribute("arr",list);	
		}
		else {
			response.sendRedirect("MainPage.jsp");
		}
		
		 request.setAttribute("row",q.size);
		 request.getRequestDispatcher("Display.jsp").forward(request, response);
	
     //try is close
	} catch (SQLException e) {
		 request.setAttribute("msg",e);
		request.getRequestDispatcher("Failure.jsp").forward(request, response);
	}
				
	}

}
