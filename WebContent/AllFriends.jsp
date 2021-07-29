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
					
					String fid = (String)session.getAttribute("fid");
 				      String SQL = "SELECT * FROM `friendsbook` WHERE fid='"+fid+"'";
					ResultSet s= st.executeQuery(SQL);
 						while(s.next()) {
 				%>           
 				               <tr><td>
 							        <%= s.getString(1)%>
 							  </td><td>
 							        <%= s.getString(2)%>
 							  </td>
 							  <td>
 							        <%= s.getString(9)%>
 							  </td></tr>
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