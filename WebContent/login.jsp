<%@include  file="header.html" %>
<%@include  file="navbar.jsp" %>

<div class="container-fluid">
<form action="Login" method="post">


  <div class="col">
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
     <input class="btn btn-primary col-md-4" type="submit" value="Login">
     <a class="btn btn-dark col-md-6" href="SignUp.jsp"> Create New Account</a> 
    </div>
</div>

</form>
</div>


<%@include  file="footer.html" %>
