<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Attendance Panel</title>
<style>
.class1
{
color:white;
position:relative;
left:470px;
font-size:50px;
}
.class2
{

position:relative;
left:470px;
font-size:25px;
}
.class3
{
color:white;
position:relative;
left:470px;
font-size:18px;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    text-align: center;
}
</style>

</head>

<body style="background-color:rgb(155,144,142);">
<h2 class="class1">Student Attendance Panel</h2>
<%@ taglib uri="/struts-tags" prefix="s" %>  

<s:iterator  value="list">  
<fieldset>  
Student Id: &emsp;<s:property value="id"/><br/>  
Number of Presents: &emsp;<s:property value="present"/><br/>
Number of Absents: &emsp;<s:property value="absent"/><br/>

<form action="attend-present-edit" method="post" >
<input type="hidden" name="id" value="${id}">
<input type="hidden" name="present" value="${present}">
<input type="hidden" name="absent" value="${absent}">
<s:submit value="Present" align="center" ></s:submit>
</form>

<form action="attend-absent-edit" method="post" >
<input type="hidden" name="id" value="${id}">
<input type="hidden" name="present" value="${present}">
<input type="hidden" name="absent" value="${absent}">
<s:submit value="Absent" align="center" ></s:submit>
</form>
</fieldset>  
</s:iterator>
<h2>To Back To Admin Profile&nbsp;<a href="admin-profile.jsp">Click Here</a></h2>
</body>
</html>