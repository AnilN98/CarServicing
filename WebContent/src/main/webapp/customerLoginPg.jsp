<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login Page</title>
</head>
<body>
<center>
<form action="customerHome" method="post">
<table>
<tr><th>User LOGIN ID</th><td><input type="text" name="userLoginId" required></td></tr>
<tr><th>User Password</th><td><input type="password" name="userpwd" required></td></tr>
<tr><th><input type="submit" value="SUBMIT"></th><td>Click <a href="Register.jsp"> here</a> for Registeration</td></tr>
<tr><th colspan="2"><button type="button" onclick="location.href='customerWelcomePg.jsp';">HOME</button></th></tr>
</table>
</form>
</center>
</body>
</html>