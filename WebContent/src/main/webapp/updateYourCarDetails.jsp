<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Your Car Service Request</title>
</head>
<body>
<form action="carServiceRequestUpdate" method="post">
<center>
Dear <%out.println(session.getAttribute("custUserId")); %> Kindly Enter the Registered Number of which Car's Service Request you wanted to Update
<br>
<br>
<table>
<tr><th>Enter Car Registeration Number :</th><td><input type="text" name="carRegisterNum" required/></td></tr> 
<tr><th>Your Request :</th><td><input type="text" name="custRequest" required></td></tr>
<tr><th><input type="submit" value="SUBMIT"></th><td>Click <a href="customerHomePg.jsp"> here</a> to return to your Home Page</td></tr>
</table> 
</form>
</center>
</body>
</html>