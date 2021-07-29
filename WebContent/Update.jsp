<%@include  file="/LoginChecker.jsp" %>

<%@include  file="/header.html" %>
<%@include  file="/navbar.jsp" %>

<%@include  file="/packages.jsp" %>

<form action="Update">
<table class="table table-striped table-hover">
               
                 <%
                try{
	                Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shiv","root","");
					Statement  st  = con.createStatement();
					
					//String fid = "sarvesh@gmail.com";
					String fid  = request.getParameter("fid");
 				     String SQL = "SELECT * FROM `friendsbookdb` WHERE `email id`='"+fid+"'";
					ResultSet s= st.executeQuery(SQL);
 					while(s.next()){
 				%>                
				 			 <tr>
				 			 <td><input type="text" value="<%= s.getString(2)%>" name="fname"></td>
 							 <td><input type="email" value="<%= s.getString(10)%>" name="femail"></td>
    						 <td><input type="number" value="<%= s.getString(9)%>" name="fphn"></td> 
    						 <td><input type="hidden" value="<%= s.getString(10)%>" name="email key"></td>
 							 </tr>
 							 
 							 <tr>
							 <td>
							 <input type="checkbox" name="closefriend" value="1">
							 <input type="hidden" name="closefriend" value="0">
							        <label for="closefriend"> Close Friend </label><br>
							 <input type="checkbox" name="bestfriend" value="1">
							 <input type="hidden" name="bestfriend" value="0">
							        <label for="bestfriend"> Best Friend </label><br>
							 </td>
							 
							 <td>
							 <input type="checkbox" name="schoolfriend" value="1">
							 <input type="hidden" name="schoolfriend" value="0">
							        <label for="schoolfriend"> School Friend </label><br>
							 <input type="checkbox" name="collegefriend" value="1">
							 <input type="hidden" name="collegefriend" value="0">
							        <label for="collegefriend"> College Friend </label><br>
							 </td>
							 
							 <td>
							 <input type="checkbox" name="familyfriend" value="1">
							 <input type="hidden" name="familyfriend" value="0">
							        <label for="familyfriend"> Family Friend </label><br>
							 <input type="checkbox" name="businessfriend" value="1">
							 <input type="hidden" name="businessfriend" value="0">
							        <label for="businessfriend"> Business Friend </label><br>
							 </td>
							 
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
 <input type="hidden" value="<%=session.getAttribute("fid") %>" name="fid">
 <input class="btn btn-primary col-md-6" type="submit" value="Update" name="action">
 </form>
 
 
  
<%@include  file="/footer.html" %>