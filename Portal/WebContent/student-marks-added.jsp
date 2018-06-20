<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Marks Added</title>
<style>
.class1
{
color:white;
position:relative;
left:450px;
font-size:50px;
}
</style>

</head>
<body style="background-color:rgb(155,144,142);">
<h3 class="class1">Student Marks Added!</h3>
<%@ taglib uri="/struts-tags" prefix="s" %>
<fieldset>  
Id: &emsp;<s:property value="id"/><br/>  
Physics Marks: &emsp;<s:property value="physics"/><br/>
Chemistry Marks: &emsp;<s:property value="chemistry"/><br/>
Maths Marks: &emsp;<s:property value="maths"/><br/>
English Marks: &emsp;<s:property value="english"/><br/>
Hindi Marks: &emsp;<s:property value="hindi"/><br/>
</fieldset>  

<h2>TO GO Back To Admin Profile,<a href="admin-profile.jsp">Click Here</a></h2>
</body>
</html>