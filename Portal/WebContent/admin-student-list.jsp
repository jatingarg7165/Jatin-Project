<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student List</title>
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
font-size:40px;
}
.class3
{
color:white;
position:relative;
left:470px;
font-size:30px;
}
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body style="background-color:rgb(155,144,142);">
<h1 class="class1">All Registered Students</h1>
<hr >

<%@ taglib uri="/struts-tags" prefix="s" %>  
<table >
<tr class="class2">
 <th>Student Id &emsp;</th>
 <th>Name</th> 
</tr>
  
  <s:iterator  value="list">  
  
  <tr class="class3">
	  <td><s:property value="id"/></td>  
	  <td><s:property value="name"/></td>
  </tr>  
    
  </s:iterator>
</table>
<h2>TO GO Back To Admin Profile,&nbsp;<a href="admin-profile.jsp">Click Here</a></h2>  
</body>
</html>