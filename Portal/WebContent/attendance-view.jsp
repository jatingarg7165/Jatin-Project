<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Attendance</title>
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
<p class="class1">Attendance Details</p>

<%@ taglib uri="/struts-tags" prefix="s" %>  
  
<s:iterator  value="list">  
<fieldset>  
Id: &emsp;<s:property value="id"/><br/>  
Number of Present: &emsp;<s:property value="present"/><br/>
Number of Absent: &emsp;<s:property value="absent"/><br/>

</fieldset>  
</s:iterator>
<h2>To Back To Profile Page<a href="student-profile.jsp?id=${id}">Click Here</a></h2>

</body>
</html>