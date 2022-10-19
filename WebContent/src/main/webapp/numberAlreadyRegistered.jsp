<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Number Already Registered</title>
</head>
<body>
<center>
Dear <b><big><%out.println(session.getAttribute("custUserId").toString());%></big></b> , 
	<b><big><%out.println(session.getAttribute("carRegNum").toString()); %></big></b> is already Registered, Kindly Register with Another Number
	<br>
	<br>
	Click <a href="CarRegister.jsp">here </a> to goto Car Register Page
	
	<br>
	<br>
	
	Click <a href="customerHomePg.jsp">here </a> to goto Home Page
	</center>
</body>
</html>