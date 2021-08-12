<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home Page</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="course.css">
 
</head>
<body>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="AdminHome.jsp">ADMIN</a>
    </div>
    <ul class="nav navbar-nav navbar-right">
      <li class="active"><a href="addCourse.jsp">ADD COURSE</a></li>
      <li><a href="Home.jsp">LOGOUT</a></li>
    </ul>
  </div>
</nav>

 <form action="AdminOptions">
	 
		    <input type="radio"  name="adminoptions" value="ViewUsers">
			<label>View Users</label><br><br>
			<input type="radio" name="adminoptions" value="ViewFeedbacks">
			<label>View Feedbacks</label><br><br>
			<input type="radio" name="adminoptions" value="ViewContacts">
			<label >View contacts</label><br><br>
			<div align="center">
			<input type="submit" value="Proceed">
            </div><br><br>
          
	   </form>
</body>
</html>