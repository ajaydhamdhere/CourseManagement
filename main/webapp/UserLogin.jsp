<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
<form action="UserLoginServlet" >
<div class="login-page">
      <div class="form">
        <div class="login">
          <div class="login-header">
            <h3>LOGIN</h3>
            <p>Please enter your credentials to login.</p>
          </div>
        </div>
        <form class="login-form" >
          <input type="text" name="email" placeholder="Email"/>
          <input type="password"  name="password" placeholder="password"/>
          <button>login</button>
          <p class="message">Not registered? <a href="RegisterUser.jsp">Create an account</a></p>
        </form>
      </div>
    </div>
    </form>
</body>
</html>