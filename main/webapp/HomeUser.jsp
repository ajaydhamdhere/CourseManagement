<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

   <link rel="stylesheet" href="course.css">
</head>
<body>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="HomeUser.jsp">USER</a>
    </div>
    <ul class="nav navbar-nav navbar-right">
       <li class="active"><a href="Contact.jsp">CONTACT</a></li>
      <li><a href="feedBack.jsp">FEEDBACK</a></li>
      <li><a href="Home.jsp">LOGOUT</a></li>
      
    </ul>
  </div>
</nav>


<form action="UserOptions" >
	 
			<input type="radio" name="useroptions" value="ViewCourses">
			<label >VIEW COURSES</label><br><br>
			<div align="center">
			<input type="submit" value="Proceed">
            </div>
          
	   </form>
</body>
</html>














