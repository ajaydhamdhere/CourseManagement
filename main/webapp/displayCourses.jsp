<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.learning.model.AddCourse" %>
<!DOCTYPE html PUBLIC >
<html>
<head>
	<title>Course Display</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 
 <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    
    <link rel="stylesheet" href="course.css">
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="HomeUser.jsp">USER</a>
    </div>
    
   <ul class="nav navbar-nav navbar-right">
      <li><a href="Home.jsp">LOGOUT</a></li>
    </ul>
  </div>
</nav>
    <div style="padding-left: 45px;">
    <div  style="background-color: #CEC1BE;width: 96%;">
    <h1 align="center">View courses</h1>
    
     <% 
	     HttpSession s=request.getSession();
	     ArrayList<AddCourse> courses=(ArrayList)session.getAttribute("courses");
	  %>
<div align="center">
    <table width="50%">
	   <tr>
	     <td>
	       <h5>Course Id</h5>
	     </td>
	     <td>
	       <h5> Course Name</h5>
	     </td>
	     <td>
	       <h5>Course Description </h5>
	     </td>
	     <td>
	       <h5> Course Fees</h5>
	     </td>
	   </tr>
	  <% 
	     for(int i=0;i<courses.size();i++)
	     {%>
	     <tr>
	      <td>
	         <% out.println(courses.get(i).getCourseId());%>
	      </td>
	      <td>
	    	<%  out.println(courses.get(i).getCourseName());%>
	      </td>
	      <td>
	    	<%  out.println(courses.get(i).getCourseDesc());%>
	      </td>
	      <td>
	    	<%  out.println(courses.get(i).getCourseFees());%>
	      </td>
	     <tr>
	   
	   <%
	     }
	   %>
	  </table>
	  </div>
   </div>
   </div>
</body>
</html>