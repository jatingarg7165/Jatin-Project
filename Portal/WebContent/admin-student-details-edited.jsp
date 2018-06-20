<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details Edited</title>
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
<h3 class="class1">Details Updated Successfully!</h3>
<%@ taglib uri="/struts-tags" prefix="s" %>
<fieldset>  
Id: &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<s:property value="id"/><br/>  
Name: &emsp;&emsp;&emsp;&emsp;&nbsp;<s:property value="name"/><br/>
Father's Name: &emsp;<s:property value="fname"/><br/>
Mother's Name: &emsp;<s:property value="mname"/><br/>
Branch: &emsp;&emsp;&emsp;&emsp;<s:property value="branch"/><br/>
Address: &emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;<s:property value="address"/><br/>
Mobile Number: &emsp;<s:property value="mobile"/><br/>
Email: &emsp;&emsp;&emsp;&emsp;&emsp;<s:property value="email"/><br/>    
Gender: &emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;<s:property value="gender"/><br/>
Password: &emsp;&emsp;&emsp;&emsp;<s:property value="password"/><br/>  
</fieldset>  


<h2>TO GO Back To Admin Profile,&nbsp;<a href="admin-profile.jsp">Click Here</a></h2>
</body>
</html>