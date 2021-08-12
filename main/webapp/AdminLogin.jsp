<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
<form action="AdminServlet" >
<div class="login-page">
      <div class="form">
        <div class="login">
          <div class="login-header">
            <h3> ADMIN LOGIN</h3>
            <p>Please enter your credentials to login.</p>
          </div>
        </div>
        <form class="login-form" >
          <input type="number" name="adminId" placeholder="Admin Id"/>
          <input type="password"  name="password" placeholder="Password"/>
          <button>login</button>
         
        </form>
      </div>
    </div>
    </form>
</body>
</html>