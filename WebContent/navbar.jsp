 <nav class="navbar navbar-expand-lg navbar-dark bg-danger">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
      <a class="navbar-brand" href="About.jsp">Friends BOOK</a>
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Post</a>
        </li>
        
       <li class="nav-item">
          <a class="nav-link" href="AddFriend.jsp">Add Friend</a>
        </li>
       
       <li class="nav-item">
          <a class="nav-link" href="MainPage.jsp">Friend List</a>
        </li>
       
       <%
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		if(session.getAttribute("username")==null){
			%> 
                 <li class="nav-item">
			     <a id="dp" class="nav-link" onclick=login()>Profile</a>
			     </li>
			     </ul>
      <form class="d-flex" action="Login" method="post">
        <input class="form-control me-2" type="text" name="email" placeholder="Email">
        <input class="form-control me-2" type="password" name="psw" placeholder="Password">
        <button class="btn btn-outline-dark" type="submit">Login</button>
      </form>
      
      	<%
			}else{
			    %>
			    <li class="nav-item">
			    <a id="dp" class="nav-link" onclick=profile()><%= session.getAttribute("username")  %></a>
			     </li>
			     </ul>
			    <form class="d-flex" action="Logout">
			        <button class="btn btn-dark" type="submit">Logout</button>
			    </form>
		          
			<% } %>
    </div>
  </div>
</nav>
 
 <script> function profile(){ alert("Good Name : <%= session.getAttribute("username")  %>\n"+
		                             "Your Email : <%= session.getAttribute("fid")  %>") }
  
 		function login(){
 			alert("Sorry You Are not logged in !!\n Please login.");
 		}
 </script>