<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details Successfully Updated</title>
</head>
<body>
<center>
	Dear <%out.println(session.getAttribute("custUserId")); %> Your Car Details are Successfully Inserted :)
	<br>
	<br>
	Click <a href="customerHomePg.jsp">here </a> to return to Home Page
	<br>
	<br>

	<br>
	<br>
	Click <a href="Logout"> here </a> to Logout
</center>
</body>
</html>