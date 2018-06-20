<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
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
<h1 class="class1">All Students Details</h1>
<hr >
<%@ taglib uri="/struts-tags" prefix="s" %>  
<table >
	<tr class="class2">
	 <th>Student Id&nbsp;</th>
	 <th>Name&nbsp;</th>
	 <th>Father's Name&nbsp;</th>
	 <th>Mother's Name&nbsp;</th>
	 <th>Branch&nbsp;</th>
	 <th>Address&nbsp;</th>
	 <th>Mobile Number&nbsp;</th>
	 <th>Email&nbsp;</th>
	 <th>Gender&nbsp;</th>
	 <th>Password&nbsp;</th> 
	 
	</tr>

	<s:iterator  value="list">  
	<tr class="class3">  
		<td><s:property value="id"/></td> 
		<td><s:property value="name"/></td>
		<td><s:property value="fname"/></td>
		<td><s:property value="mname"/></td>
		<td><s:property value="branch"/></td>
		<td><s:property value="add"/></td>
		<td><s:property value="number"/></td>
		<td><s:property value="email"/></td>    
		<td><s:property value="gender"/></td>
		<td><s:property value="password"/></td>
		  
			<form action="student-edit" method="post" >
			<input type="hidden" name="id" value="${id}">
			<input type="hidden" name="name" value="${name}">
			<input type="hidden" name="fname" value="${fname}">
			<input type="hidden" name="mname" value="${mname}">
			<input type="hidden" name="branch" value="${branch}">
			<input type="hidden" name="add" value="${add}">
			<input type="hidden" name="number" value="${number}">
			<input type="hidden" name="email" value="${email}">
			<input type="hidden" name="gender" value="${gender}">
			<input type="hidden" name="password" value="${password}">
		<td><s:submit value="Edit" align="center" ></s:submit></td>
			</form>
	</tr>

  
</s:iterator>

</table>
<h2>TO GO Back To Admin Profile,&nbsp;<a href="admin-profile.jsp">Click Here</a></h2>
</body>
</html>