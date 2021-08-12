<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="main.css">
</head>
<body>


<div class="background background_image background_blur"></div>
		<div class="overlay overlay_dark">
			<main class="project">
				<h1 id="fit" class="project__name project__name_shadow">Course Management System</h1>

				<ul class="project__list">
					<li class="project__item">
						<a class="project__link project__link_empty">Admin</a> 
						<ul class="project__list">
							<li class="project__item">
								<a href="AdminLogin.jsp" class="project__link">Login</a>
							</li>
						</ul>
					</li>
					 <li class="project__item">
						<a class="project__link project__link_empty">User</a> 
						<ul class="project__list">
							<li class="project__item">
								<a href="RegisterUser.jsp" class="project__link">Sign up</a>
							</li>
							<li class="project__item">
								<a href="UserLogin.jsp" class="project__link">Login</a>
							</li>
							
						</ul>
					</li>
				</ul>
			</main>
		</div>



</body>
</html>