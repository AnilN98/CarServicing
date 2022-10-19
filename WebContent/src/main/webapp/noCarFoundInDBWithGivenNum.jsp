<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details Not Updated</title>
</head>
<body>
<center>
	Dear <%out.println(session.getAttribute("custUserId")); %> No CAR is FOUND with <%out.println(session.getAttribute("carRegNum")); %> Please Try Again :(
	<br>
	<br>
	Click <a href="customerHomePg.jsp">here </a> to return to Home Page
	<br>
	<br>
	Click <a href="CarRegister.jsp">here </a> to update your car Details
	<br>
	<br>
	Click <a href="Logout"> here </a> to Logout
</center>
</body>
</html>