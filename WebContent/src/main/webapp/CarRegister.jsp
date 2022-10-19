<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Register</title>
</head>
<body>
<center>
<form action="customerCarRegisterDetails" method="post">
<table>
<tr><th>Enter Your Car Registered Number :</th><td><input type="text" name="custCarRegisterNum" required></td></tr>
<tr><th>Enter Your Car Type :</th><td><input type="text" name="custCarType" required></td></tr>
<tr><th>Enter Your Car Model :</th><td><input type="text" name="custCarModel" required></td></tr>
<tr><th>Your Request :</th><td><input type="text" name="custRequest" required></td></tr>
<tr><th><input type="submit" value="SUBMIT"></th><td>Click <a href="customerHomePg.jsp"> here</a> to return to your Home Page</td></tr>
</table>
</form>
</center>
</body>
</html>