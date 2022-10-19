<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
<form action="adminController" method="post">
<center>
<table border: 1px solid black;>
<tr><th>Admin LOGIN ID</th><td><input type="text" name="adminLoginId" required></td></tr>
<tr><th>Admin Password</th><td><input type="password" name="adminpwd" required></td></tr>
<tr><th><input type="submit" value="SUBMIT"></th><td><button type="button" onclick="location.href='custWelcomePg.jsp';">HOME</button></td></tr>
</table>
</form>
</center>
</body>
</html>