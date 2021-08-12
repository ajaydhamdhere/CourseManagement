<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 
 <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    
    <link rel="stylesheet" href="course.css">
</head>
<body>

<div class="main-block">
      <div class="left-part">
       
       
       
        <div class="btn-group">
          
        </div>
      </div>
      <form action="ContactServlet">
        <div class="title">
          <i class="fas fa-pencil-alt"></i> 
          <h2>Contact Us</h2>
        </div>
        <div class="info">
          <input class="fname" type="number" name="userId" placeholder="User Id">
          <input type="text" name="name" placeholder="Name">
          <input type="text" name="email" placeholder="Email">
          <input type="number" name="phoneNo" placeholder="Phone No">
          <input type="text" name="message" placeholder="Meassage">
          
        
        <button type="submit" href="#">ADD</button>
      </form>
    </div>

</body>
</html>