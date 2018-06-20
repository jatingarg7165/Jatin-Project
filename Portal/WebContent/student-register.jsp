<html>
<head>
<title>Student Registration</title>
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
<h1 class="class1">Student Registration Page</h1>
<hr >

<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="register" align="center">
<s:textfield  name="name" class="class2" label="Name" placeholder="ex. abc"></s:textfield>
<s:textfield name="id" label="Student Id" placeholder="ex. 123"></s:textfield>
<s:textfield name="fname" label="Father's Name" placeholder="ex. xyz" ></s:textfield>
<s:textfield name="mname" label="Mother's Name" placeholder="ex def"></s:textfield>
<s:select list="{'Select','Civil','Computer Science','Electrical','Electronics','Mechanical','Information tech'}" name="branch" label="Branch"></s:select> 
<s:textfield name="email" label="Email" placeholder="ex abc@xyz.com"></s:textfield>
<s:textfield name="number" label="Mobile Number" placeholder="Enter No. without zero"></s:textfield>
<s:radio list="{'male','female'}" name="gender" label="Gender"></s:radio>
<s:textarea name="address" label="Address" ></s:textarea>
<s:password name="password" label="Password"></s:password>
<s:password name="con_password" label="Confirm Password"></s:password>

<s:submit value="Register" align="center"></s:submit><br>
<br>
<s:reset value="Reset" align="center"></s:reset>
</s:form>

<h3>Already a user, Click Here &nbsp;<a href="student-login.jsp">Student Login</a></h3><br>
</body>
</html>