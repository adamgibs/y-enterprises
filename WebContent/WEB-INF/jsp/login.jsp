<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src='js/ext/jquery-3.3.1.min.js'></script>
<script src='js/login.js'></script>
</head>
<body>
	<div id="content">
		<% %>
			<div id='errMessage' style="color: #FF0000;">${errorMessage}</div>
			<form id='loginFormId' action='login' method='post'>
				
				User Name: <input type='text' id='userNameId' name='username' value=''/><br/>
				Password: <input type='text' id='passwordId' name='password' value=''/><br/>
				
				<input type='submit' id='submitBtnId' value='Submit'/>
				<input type='button' id='cancelBtnId'  value='Cancel'/>
				
			</form>
	</div>
</body>
</html>