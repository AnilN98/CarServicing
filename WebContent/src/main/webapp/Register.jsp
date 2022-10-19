<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registeration Page</title>
</head>
<body>
<center>
<form action="custRegisteration" method="post">
	<table>
		<tr><th>YOUR Name : </th><td><input type="text" name="custName" minlength=3 required></td></tr>
		<tr><th>Your Email : </th><td><input type="email" name="custEmail" required></td></tr>
		<tr><th>USER Name : </th><td><input type="text" name="userName" minlength=3 required></td></tr>
		<tr><th>Password  : </th><td><input type="password" name="userPwd" minlength=3 required></td></tr>
		<tr><th>Confirm Password : </th><td><input type="password" name="conPwd" minlength=3 required></td></tr>
		<tr><th><input type="Submit" value="SUBMIT"></th><td><input type="reset" value="Clear"></td></tr>
	</table>
</form>
</center>
</body>
</html>