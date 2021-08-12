<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html SYSTEM "about:legacy-compat">

<Html>  
<head>   
<title>  
Registration Page  
</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 
 <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    
    <link rel="stylesheet" href="course.css">  
</head>  
<body bgcolor="white">  
    <h1 align="center"> User Registration Page </h1>
<br>  
<br>  
<form action="RegisterUser" >  
<table width="50%" bgcolor="grey" align="center">

<tr>
<td width="50%">
<label> Name: </label>         
</td>
<td width="50%">
<input type="text" name="name" size="15"/> <br> <br>
</td>
</tr>
<tr> 
<td width="50%">
<label> Phone Number: </label> 
</td>
<td width="50%">    
<input type="number" name="phoneno" size="15"/> <br> <br>  
</td>
</tr> 
<tr> 
<td>
<label> email: </label>     
</td>
<td>    
<input type="text" name="email" size="15" placeholder="abc@gmail.com" /> <br> <br>
</td>  
</tr> 
<tr> 
<td>
<label> Address: </label>
</td>
<td>         
<input type="text" name="address" size="15"/> <br> <br>
</td> 
</tr> 
<tr>
<td>
<label> Registration Date: </label> 
</td>
<td>        
<input type="text" name="regdate" size="15" placeholder="dd/mm/yyyy" /> <br> <br>
</td> 
</tr> 
<tr>
<td>
<label> Password: </label>         
</td>
<td>
<input type="password" name="password" size="15"/> <br> <br>
</td>
</tr> 
<tr>
<td>
<input type="submit" value="Submit"/>
</td>
</tr>  
</table>

</form>  
</body>  
</html>  