<%@include  file="header.html" %>
<%@include  file="navbar.jsp" %>

<div class="container-fluid">
<form action="SignUp" method="post">
  <div class="col">
    <div class="col-md-6">
Name : 
         <input class="form-control" name="name" type="text">
   
    </div>
     <div class="col-md-6">
Email Id : 
         <input class="form-control" name="email" type="email">
     </div>
     <div class="col-md-6">
Password : 
         <input class="form-control" name="psw" type="password">
     </div>
     <div class="col-md-6">
     <br>
     <input class="btn btn-primary col-md-6" type="submit" value="SignUp">
     <a class="btn btn-dark col-md-4" href="login.jsp"> Login</a> 
    </div>
</div>
</form>



</div>

<%@include  file="footer.html" %>
