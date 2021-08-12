<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Course</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 
 <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    
    <link rel="stylesheet" href="course.css">
</head>
<body>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="AdminHome.jsp">ADMIN</a>
    </div>
    
   <ul class="nav navbar-nav navbar-right">
      <li><a href="#">LOGOUT</a></li>
    </ul>
  </div>
</nav>

<div class="main-block">
      <div class="left-part">
       
       
       
        <div class="btn-group">
          
        </div>
      </div>
      <form action="AddCourseServlet">
        <div class="title">
          <i class="fas fa-pencil-alt"></i> 
          <h2>ADD COURSE</h2>
        </div>
        <div class="info">
          <input class="fname" type="number" name="courseId" placeholder="Course Id">
          <input type="text" name="courseName" placeholder="Course Name">
          <input type="text" name="courseDesc" placeholder="Course Description">
          <input type="number" name="courseFees" placeholder="course fees">
          
          
        
        <button type="submit" href="#">ADD</button>
      </form>
    </div>

</body>
</html>