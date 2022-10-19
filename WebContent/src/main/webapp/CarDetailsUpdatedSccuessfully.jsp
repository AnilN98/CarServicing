<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Details Updated Sccuessfully</title>
</head>
<body>
<center>
	Dear <%out.println(session.getAttribute("custUserId").toString());%> Your Car Details for <%out.println(session.getAttribute("carRegNum").toString()); %> are Updated Successfully
	<br>
	<br>
	
	Click <a href="customerHomePg.jsp">here </a> to goto Home Page
</center>
</body>
</html>