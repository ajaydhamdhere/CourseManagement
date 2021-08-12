<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.learning.model.Feedback" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Feedback</title>
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
      <li><a href="Home.jsp">LOGOUT</a></li>
    </ul>
  </div>
</nav>

<div style="padding-left: 45px;">
    <div  style="background-color: #CEC1BE;width: 96%;">
 <h1 align="center">View Feedback</h1>
   
     <% 
	     HttpSession s=request.getSession();
	     ArrayList<Feedback> users=(ArrayList)session.getAttribute("users");
	  %>
<div align="center">
    <table width="50%">
	   <tr>
	     <td>
	       <h5>User Id</h5>
	     </td>
	     <td>
	       <h5> User Name</h5>
	     </td>
	     <td>
	       <h5> User Email</h5>
	     </td>
	     <td>
	       <h5> Feedback Id</h5>
	     </td>
	     <td>
	       <h5>Feedback</h5>
	     </td>
	   </tr>
	  <% 
	     for(int i=0;i<users.size();i++)
	     {%>
	     <tr>
	      <td>
	    	<%  out.println(users.get(i).getUserId());%>
	      </td>
	      <td>
	         <% out.println(users.get(i).getName());%>
	      </td>
	      <td>
	    	<%  out.println(users.get(i).getEmail());%>
	      </td>
	       <td>
	    	<%  out.println(users.get(i).getF_id());%>
	      </td>
	       <td>
	    	<%  out.println(users.get(i).getFeedback());%>
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



