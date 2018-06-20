<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Marks</title>
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
<p class="class1">Edit Marks</p>
  
<%@ taglib uri="/struts-tags" prefix="s" %>
<form action="student-marks" method="post" >
Student Id: &emsp;&emsp;&emsp;<input type="text" name="id" value="<%= request.getParameter("id")%>" readonly><br>
Physics Marks: &emsp;&nbsp;<input name="physics" value="<%= request.getParameter("physics")%>"><br>
Chemistry Marks: &nbsp;<input name="chemistry" value="<%= request.getParameter("chemistry")%>"><br>
Maths Marks: &ensp;&emsp;&ensp;<input name="maths" value="<%= request.getParameter("maths")%>"><br>
English Marks:&emsp;&ensp;&nbsp;<input name="english" value="<%= request.getParameter("english")%>"><br> 
Hindi Marks:&emsp;&emsp;&ensp;<input name="hindi" value="<%= request.getParameter("hindi")%>"><br>
<input type=submit value="Save" >&emsp;
<input type=reset value="Reset" ><br>

</form>
</body>
</html>