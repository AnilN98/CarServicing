<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration Successful</title>
</head>
<body>
<center>
	Dear <%out.println(session.getAttribute("custName").toString());%> Your Details are Successfully Registered
	<br>
	<br>
	<%session.invalidate(); %>
	Click <a href="customerLoginPg.jsp">here </a> to goto Login Page
	<br>
	<br>
	Click <a href="custWelcomePg.jsp">here </a> to goto Home Page
</center>
</body>
</html>