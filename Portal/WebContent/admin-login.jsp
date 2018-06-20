<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
.class1
{
color:white;
position:relative;
left:450px;
font-size:45px;

}
.class2
{
color:white;
font-size:25px;
font-family:Georgia;
position :relative;
left:450px;}
.class3
{
color:white;
font-size:20px;
font-family:Georgia;
position :relative;
left:450px;}
</style>
</head>

<body style="background-color:rgb(155,144,142);">
<h1 class="class1">Admin Login Page</h1><br><br>

<form action="alogin" method="post">
  	<p class="class2">Admin Id:<input type="text" name="id"><br><br>
    <p class="class2">Password:<input type="password" name="password"><br> 
  	<p class="class2">  <input type="submit" value="Login">&emsp;
  	  <input type="Reset" >
</form>
<h3 class="class3">If not Registered,then Register First</h3>
<h2 class="class2"><a href="admin-register.jsp">Registration Page</a></h2>
</body>
</html>
