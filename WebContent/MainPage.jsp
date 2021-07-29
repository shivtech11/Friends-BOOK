<%@include  file="/LoginChecker.jsp" %>

<%@include  file="/header.html" %>
<%@include  file="/navbar.jsp" %>

 <h1>Hi <%= session.getAttribute("username")   %> !! </h1>
 
  
 <%@include  file="options.jsp" %>
 <h1> Select Your Friends Group </h1>
 
<%@include  file="footer.html" %>
