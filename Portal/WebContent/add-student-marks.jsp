<html>
<head>
<title>Add Student</title>
<style>
.class1
{
color:white;
position:relative;
left:450px;
font-size:45px;

}
</style>
</head>
<body style="background-color:rgb(155,144,142);">
<h1 class="class1">Add Student Marks</h1>
<hr >

<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="add-student">
<s:textfield name="id" label="Student Id" ></s:textfield>
<s:textfield name="physics" label="Physics Marks" ></s:textfield>
<s:textfield name="chemistry" label="Chemistry Marks" ></s:textfield>
<s:textfield name="maths" label="Maths Marks" ></s:textfield>
<s:textfield name="english" label="English Marks" ></s:textfield>
<s:textfield name="hindi" label="Hindi Marks" ></s:textfield>

<s:submit value="Add" align="center"></s:submit>
<s:reset value="Reset" align="center"></s:reset>
</s:form>

</body>
</html>