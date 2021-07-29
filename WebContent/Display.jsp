<%@include  file="/LoginChecker.jsp" %>

<%@include  file="/header.html" %>
<%@include  file="/navbar.jsp" %>

<%@include  file="/packages.jsp" %>

<h1>Your Friends !!</h1>
<div class="container-fluid">
  
<div class="row">
<%@include  file="/options.jsp" %>

<div class="col-md-6">

 <table class="table table-striped table-hover">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Friend NAME</th>
      <th scope="col">Friend NUMBER</th>
      <th scope="col">Friend EMAIL</th>
     <th scope="col">UPDATE</th>
     <th scope="col">DELETE</th>
    </tr>
  </thead>
  <tbody>      
        
               <%
                String arr[][] = (String[][]) request.getAttribute("arr");
                int row = (int)request.getAttribute("row");
                int col = arr[0].length;
 				%>           
 				               <%for(int i=0;i<row;i++){ %>
			 				               <tr>
				 				               <%for(int j=0;j<col;j++){ %>
						 				               <td>
						 							       <p>  <%= arr[i][j] %> </p>
						 							   </td>
				 							   <%} %>
				 							   <td> <form action="Update.jsp"> 
				 							    <input type="hidden" name="fid" value=<%=arr[i][2] %>>                                                
				 							    <input class="btn btn-primary" type="submit" value="Update">
				 							    </form> </td>
				 							    <td> <form action="Delete"> 
				 							    <input type="hidden" name="fid" value=<%=arr[i][2] %>>
                                                <input class="btn btn-danger" type="submit" value="Delete">
				 							    </form> </td>
			 							  </tr>
 							   <%} %>
   
  </tbody>
</table> 
 </div>
 </div>
 ...
</div>
 <%@include  file="/footer.html" %>