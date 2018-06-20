<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
left:450px;
font-size:50px;
}
</style>

</head>
<body style="background-color:rgb(155,144,142);">
<p class="class1">Marks Details</p>


<%@ taglib uri="/struts-tags" prefix="s" %>  
  
<s:iterator  value="list">  
<fieldset>  
Id: &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<s:property value="id"/><br/>  
Physics Marks: &ensp;&ensp;<s:property value="physics"/><br/>
Chemistry Marks: &nbsp;<s:property value="chemistry"/><br/>
Maths Marks: &ensp;&emsp;<s:property value="maths"/><br/>
English Marks: &ensp;&ensp;<s:property value="english"/><br/>
Hindi Marks: &emsp;&ensp;&nbsp;<s:property value="hindi"/><br/>

</fieldset>  
</s:iterator>
<h2>To Back To Profile Page<a href="student-profile.jsp?id=${id}">Click Here</a></h2>

</body>
</html>