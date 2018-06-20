
<html>
<head>
<title>Student Profile</title>
<style>
.class3
{position:relative;

font-size:25px;
left:460px;
top:50px;
font-family:Georgia;
	padding:10px 12px 10px 12px;
	display:inline-block;
	border-radius: 15px;
	text-align: center;
	background-color: rgb( 84,73,71 ) ;
	color:white;

text-decoration: none;
}
.class4
{position:relative;

font-size:20px;
left:1100px;
top:-360px;
font-family:Georgia;
	padding:10px 12px 10px 12px;
	display:inline-block;
	border-radius: 15px;
	text-align: center;
	background-color: rgb( 84,73,71 ) ;
	color:white;

text-decoration: none;
}

a
{
color:white;}
.class1
{
color:white;
position:relative;
left:470px;
font-size:50px;

}
</style>
</head>
<body style="background-color:rgb(155,144,142);">

<h1 class="class1">Welcome <%= request.getParameter("id") %></h1>
<hr >


<h2 class="class3"><a href="details?id=<%= request.getParameter("id") %>">Your Personal Details</a></h2><br>
<h2 class="class3"><a href="marks?id=<%= request.getParameter("id") %>">Your Marks Details</a></h2><br>
<h2 class="class3"><a href="attend?id=<%= request.getParameter("id") %>">Your Attendance Details</a></h2><br>
<h2 class="class4"><a href="logout.action">Logout</a></h2>

</body>
</html>