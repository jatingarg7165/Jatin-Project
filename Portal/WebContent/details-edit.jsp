
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Details</title>
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
<p class="class1">Edit Your Details</p>
  
<%@ taglib uri="/struts-tags" prefix="s" %>
<form action="personal" method="post" >
Student Id: &emsp;&emsp;&ensp;<input type="text" name="id" value="<%= request.getParameter("id")%>" readonly><br>
Name: &emsp;&emsp;&emsp;&emsp;&nbsp;<input name="name" value="<%= request.getParameter("name")%>"><br>
Father's Name: &ensp;&nbsp;<input name="fname" value="<%= request.getParameter("fname")%>"><br>
Mother's Name: &ensp;<input name="mname" value="<%= request.getParameter("mname")%>"><br>
Branch:&emsp;&emsp;&emsp;&ensp;&nbsp;<s:select list="{'Select','Civil','Computer Science','Electrical','Electronics','Mechanical','Information tech'}" name="branch"  ></s:select><br> 
Email: &emsp;&emsp;&emsp;&emsp;&nbsp;<input name="email" value="<%= request.getParameter("email")%>"><br>
Mobile Number: &nbsp;<input name="mobile"  value="<%= request.getParameter("number")%>"><br>
<s:radio list="{'male','female'}" name="gender" label="Gender"></s:radio><br>
Address: &emsp;&emsp;&emsp;&nbsp;&nbsp;<input name="address" value="<%= request.getParameter("add")%>"><br>
Password: &emsp;&emsp;&emsp;<input name="password" value="<%= request.getParameter("password")%>"><br>

<input type=submit value="Save" >
<input type=reset value="Reset" ><br>

</form>
</body>
</html>