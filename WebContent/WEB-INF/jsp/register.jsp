<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src='js/ext/jquery-3.3.1.min.js'></script>
<script src='js/register.js'></script>
</head>
<body>
	<div id='container'>
		<%@ include file="include/headerLoggedIn.jsp" %>
		<a href='main' id='logout'>Logout</a>
		<div id="content">
					Add new user:<p/>
					<form id='registerFormId' action='register' method='post'>
						User ID <input type='text' id='userId' name='userId' value=''/><br/>
						Password <input type='text' id='passwordId' name='password' value=''/><br/>
						First Name <input type='text' id='firstNameId' name='firstName' value=''/><br/>
						Last Name <input type='text' id='lastNameId' name='lastName' value=''/><br/>
						<input type='button' id='saveBtnId' value='Save'/>
						<input type='button' id='cancelBtnId' value='Cancel'/>
					</form>
		</div>
	</div>
</body>
</html>