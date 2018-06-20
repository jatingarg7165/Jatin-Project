<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
left:450px;
font-size:50px;
}
</style>
</head>
<body style="background-color:rgb(155,144,142);">
<p class="class1">Personal Details</p>


<%@ taglib uri="/struts-tags" prefix="s" %>  

<s:iterator  value="list">  
<fieldset>  
Id: &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<s:property value="id"/><br/>  
Name: &emsp;&emsp;&emsp;&emsp;&nbsp;<s:property value="name"/><br/>
Father's Name: &emsp;<s:property value="fname"/><br/>
Mother's Name: &emsp;<s:property value="mname"/><br/>
Branch: &emsp;&emsp;&emsp;&emsp;<s:property value="branch"/><br/>
Address: &emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;<s:property value="add"/><br/>
Mobile Number: &emsp;<s:property value="number"/><br/>
Email: &emsp;&emsp;&emsp;&emsp;&emsp;<s:property value="email"/><br/>    
Gender: &emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;<s:property value="gender"/><br/>
Password: &emsp;&emsp;&emsp;&emsp;<s:property value="password"/><br/>  

</fieldset>  
</s:iterator>

<form action="edit" method="post" >
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
<s:submit value="Edit" align="center" ></s:submit>
</form>
<h2>TO GO Back To Student Profile,<a href="student-profile.jsp?id=${id}">Click Here</a></h2>
</body>
</html>