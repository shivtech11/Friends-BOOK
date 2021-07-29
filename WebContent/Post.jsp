<%@include  file="/LoginChecker.jsp" %>

<%@include  file="/header.html" %>
<%@include  file="/navbar.jsp" %>

<%@include  file="/packages.jsp" %>
<%@include  file="/options.jsp" %>
 
 
<table>
               
                 <%
                try{
	                Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shiv","root","");
					Statement  st  = con.createStatement();
					
					 String id  = request.getParameter("email");
 				     String SQL = "SELECT * FROM `friendsbookPost`";
					ResultSet s= st.executeQuery(SQL);
 					while(s.next()){
 				%>                
				 			 <tr>
				 			 <td><h1 name="postTitle"><%= s.getString(3)%></h1></td>
				 			 <td><h1 name="postDate"><%= s.getString(2)%></h1></td>
				 			 </tr>
				 			 <tr><td><h1 name="postDesc"><%= s.getString(4)%></h1></td></tr>
				 			 <tr>
 							 <td> <form action="PostUpdate.jsp"> 
				 							    <input type="hidden" name="postEmail" value=<%= s.getString(1)%>>                                                
				 							    <input type="hidden" name="postTitle" value=<%= s.getString(3)%>>
				 							    <input type="submit" value="Update">
				 							    </form> </td>
				 							    <td> <form action="PostDelete"> 
				 							    <input type="hidden" name="postEmail" value=<%= s.getString(1)%>>
				 							    <input type="hidden" name="postTitle" value=<%= s.getString(3)%>>
                                                <input type="submit" value="Delete">
				 							    </form> </td>
 							 </tr>
 							 
 							 		  
 							  
 				 <%
 					}
				 						con.close();
				 					}
				 				catch(Exception e)
				 		   			{
				 		   			   System.out.println(e);
				 		   	
				 		   			}
                %> 
 </table> 

 
 
  
<%@include  file="/footer.html" %>