<%@include  file="/header.html" %>
<%@include  file="/navbar.jsp" %>
<table class="table table-striped table-hover">
<tr>
<th><h1>Welcome to the Friends BOOK</h1></th>
</tr>
        <%
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		if(session.getAttribute("username")==null){
			%> 
            
<tr>
<td>
   <a class="btn btn-success col-md-4" href="login.jsp">Login</a> 
   <a class="btn btn-primary col-md-6" href="SignUp.jsp">Create New Account</a>
</td>
</tr>
      	<%
			}else{
			    %>
			    <tr>
<td>
   <h1> <%= session.getAttribute("username")  %> g !!	 </h1>
			    
</td>
</tr>
		<% } %>
			    
<tr>
<td>
   <h3>Here you can make your friend list and share your post to the friends</h3>
</td>
</tr>
</table>

<%@include  file="/footer.html" %>