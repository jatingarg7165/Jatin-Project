<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Marks</title>
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
<h2 class="class1">All Student Marks Details</h2>
<hr>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<table >
	<tr class="class2">
		 <th>Student Id &ensp;</th>
		 <th>Physics Marks&ensp;</th>
		 <th>Chemistry Marks&ensp;</th>
		 <th>Maths Marks&ensp;</th>
		 <th>English Marks&ensp;</th>
		 <th>Hindi Marks&ensp;</th> 
	</tr>
	  
	
	<s:iterator  value="list">  
	<tr class="class3">  
		<td><s:property value="id"/></td>  
		<td><s:property value="physics"/></td>
		<td><s:property value="chemistry"/></td>
		<td><s:property value="maths"/></td>
		<td><s:property value="english"/></td>
		<td><s:property value="hindi"/></td>
		
		<form action="student-marks-edit" method="post" >
		<input type="hidden" name="id" value="${id}">
		<input type="hidden" name="physics" value="${physics}">
		<input type="hidden" name="chemistry" value="${chemistry}">
		<input type="hidden" name="maths" value="${maths}">
		<input type="hidden" name="english" value="${english}">
		<input type="hidden" name="hindi" value="${hindi}">
	<td><s:submit value="Edit" align="center" ></s:submit></td>
		</form>
	</tr>


	</s:iterator>
</table>
<h2>To Add Student, <a href="add-student-marks">Click Here</a></h2>
</body>
</html>