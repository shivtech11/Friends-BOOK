<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(session.getAttribute("username")==null){
	response.sendRedirect("Message.jsp?msg=Please Login !!");
}
%>