<%@include  file="/LoginChecker.jsp" %>

<%@include  file="/header.html" %>
<%@include  file="/navbar.jsp" %>

<div class="container">
 <form action="insert">
  
  <table class="table table-striped table-hover">
  <tr><td>
      <label>Name</label>
      <input type="text" class="form-control" name="fname" placeholder="Your name">
    </div>
    <div>
      <label>Ph Number</label>
      <input type="text" class="form-control" name="fphn" placeholder="9811****">
    </div>
  </div>
  <div class="col">
    <label class="col-md-6">Email Address</label>
    <input type="email" class="form-control" name="femail" placeholder="xyz@gmail.com">
  </div>
  <tr><td>
  <div class="row center">
  <div class="col-md-2">
  		<input type="checkbox" name="closefriend" value="1">
        <input type="hidden" name="closefriend" value="0">
        <label for="closefriend"> Close Friend </label><br>
        
        <input type="checkbox" name="bestfriend" value="1">
        <input type="hidden" name="bestfriend" value="0">
        <label for="bestfriend"> Best Friend </label><br>  
  </div>
  
  <div class="col-md-2">
       <input type="checkbox" name="schoolfriend" value="1">
       <input type="hidden" name="schoolfriend" value="0">
        <label for="schoolfriend"> School Friend </label><br>
        
        <input type="checkbox" name="collegefriend" value="1">
        <input type="hidden" name="collegefriend" value="0">
        <label for="collegefriend"> College Friend </label><br>
  </div>
  
  <div class="col-md-2">
  		<input type="checkbox" name="familyfriend" value="1">
 		<input type="hidden" name="familyfriend" value="0">
        <label for="familyfriend"> Family Friend </label><br>
 		
 		<input type="checkbox" name="businessfriend" value="1">
        <input type="hidden" name="businessfriend" value="0">
        <label for="businessfriend"> Business Friend </label><br>
  </div>
  </div>
  </td></tr>
  <tr><td>
  <input type="hidden" value="<%=session.getAttribute("fid") %>" name="fid">
  <button type="submit" class="btn btn-success col-md-8">Add New Friend</button>
  </td></tr></table>
</form>
 </div>
 
 <%@include  file="footer.html" %>
 
 