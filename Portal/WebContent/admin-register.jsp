<html>
<head>
<title>Admin Registration Page</title>
<style>
.class1
{
color:white;
position:relative;
left:450px;
font-size:45px;
}
.class2
{
color:white;
font-size:25px;
font-family:Georgia;
position :relative;
left:300px;}
</style>

</head>
<body style="background-color:rgb(155,144,142);">
<h1 class="class1">Admin Registration Page</h1>
<hr >
<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="aregister">
<s:textfield name="name" label="Name" ></s:textfield>
<s:textfield name="id" label="Admin Id" ></s:textfield>
<s:textfield name="fname" label="Father's Name" ></s:textfield>
<s:textfield name="mname" label="Mother's Name" ></s:textfield> 
<s:textfield name="email" label="Email"></s:textfield>
<s:textfield name="number" label="Mobile Number" placeholder="Enter No. without zero"></s:textfield>
<s:radio list="{'male','female'}" name="gender" label="Gender"></s:radio>
<s:textarea name="address" label="Address"></s:textarea>
<s:password name="password" label="Password"></s:password>
<s:password name="con_password" label="Confirm Password"></s:password>

<s:submit value="Register" align="center"></s:submit>
<s:reset value="Reset" align="center"></s:reset>
</s:form>

<h3>Already a user, Click Here &nbsp;<a href="admin-login.jsp">Admin Login</a></h3><br>
</body>
</html>




