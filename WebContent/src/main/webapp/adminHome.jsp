<%@page import="com.carservicing.model.Customer"%>
<%@page import="com.carservicing.dao.AdminDao" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body>
<center>
Welcome <b>Admin</b>
<br>
<br>
<%
List<Customer> customerList = AdminDao.getAllCustomers();
List<Customer> customerRegisteredList = AdminDao.getAllRegisteredCustomers();
		
		%>
	<h3>Registered Customers :</h3>
<br>
<br>
<table>
	<tr><th>Customer Name </th><th>&nbsp;&nbsp;&nbsp;User ID :</th><th>&nbsp;&nbsp;&nbsp;Email ID :</th><th></tr>
	
	<%for(Customer cust : customerRegisteredList) { 
		
	%>
	
		<tr><td>
		<b><%out.println(cust.getCustName()); %></td></b>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustUserName()); %></b></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustEmail());%></b></td>
		
	</b></td></tr>
		
	<%} %>
	
	</table>
	
	<br>
	<br>
		<h3>Pending Requests :</h3>
	<table>
	<tr><th>Customer Name </th><th>&nbsp;&nbsp;&nbsp;User ID :</th><th>&nbsp;&nbsp;&nbsp;Email ID :</th><th>&nbsp;&nbsp;&nbsp;Car Register Number :</th>
	<th>&nbsp;&nbsp;&nbsp;Car Model :</th><th>&nbsp;&nbsp;&nbsp;Car Type :</th><th>&nbsp;&nbsp;&nbsp;Service Request :</th>
	<th>&nbsp;&nbsp;&nbsp;Customer Request Status :</th><th>&nbsp;&nbsp;&nbsp;Action :</th></tr>
	
	<%for(Customer cust : customerList) { 
		if(cust.getRequestStatus().equals("Yet to be validated by ADMIN")){
	%>
	
		<tr><td>
		<b><%out.println(cust.getCustName()); %></td></b>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustUserName()); %></b></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustEmail());%></b></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarRegisterNumber()); %></b></td>
		<td>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarModel()); %></td>
		<td>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarType()); %></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarRequest()); %></b></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getRequestStatus());
		%></b></td>
		<td><button onclick="location.href='changeStatusToAccept?userLoginID=<%=cust.getCustUserName()%>&regNum=<%=cust.getCustCarRegisterNumber()%>'">Accept</button></td>
		<td><button onclick="location.href='changeStatusToReject?userLoginID=<%=cust.getCustUserName()%>&regNum=<%=cust.getCustCarRegisterNumber()%>'">Reject</button></td></tr>
		
	<%}} %>
	
	</table>
	<br>
	<br>
<h3>Accepted Requests :</h3>
<br>
<br>
<table>
	<tr><th>Customer Name </th><th>&nbsp;&nbsp;&nbsp;User ID :</th><th>&nbsp;&nbsp;&nbsp;Email ID :</th><th>&nbsp;&nbsp;&nbsp;Car Register Number :</th>
	<th>&nbsp;&nbsp;&nbsp;Car Model :</th><th>&nbsp;&nbsp;&nbsp;Car Type :</th><th>&nbsp;&nbsp;&nbsp;Service Request :</th>
	<th>&nbsp;&nbsp;&nbsp;Customer Request Status :</th></tr>
	
	<%for(Customer cust : customerList) { 
		if(cust.getRequestStatus().equals("Your Request Accepted")){
	%>
	
		<tr><td>
		<b><%out.println(cust.getCustName()); %></td></b>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustUserName()); %></b></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustEmail());%></b></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarRegisterNumber()); %></b></td>
		<td>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarModel()); %></td>
		<td>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarType()); %></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarRequest()); %></b></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getRequestStatus());
		%></b></td></tr>
		
	<%}} %>
	
	</table>
	
	<br>
	<br>
	<h3>Rejected Requests :</h3>
<br>
<br>
<table>
	<tr><th>Customer Name </th><th>&nbsp;&nbsp;&nbsp;User ID :</th><th>&nbsp;&nbsp;&nbsp;Email ID :</th><th>&nbsp;&nbsp;&nbsp;Car Register Number :</th>
	<th>&nbsp;&nbsp;&nbsp;Car Model :</th><th>&nbsp;&nbsp;&nbsp;Car Type :</th><th>&nbsp;&nbsp;&nbsp;Service Request :</th>
	<th>&nbsp;&nbsp;&nbsp;Customer Request Status :</th></tr>
	
	<%for(Customer cust : customerList) { 
		if(cust.getRequestStatus().equals("Your Request Rejected")){
	%>
	
		<tr><td>
		<b><%out.println(cust.getCustName()); %></td></b>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustUserName()); %></b></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustEmail());%></b></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarRegisterNumber()); %></b></td>
		<td>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarModel()); %></td>
		<td>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarType()); %></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getCustCarRequest()); %></b></td>
		<td><b>&nbsp;&nbsp;&nbsp;<%out.println(cust.getRequestStatus());
		%></b></td></tr>
		
	<%}} %>
	
	</table>
	
	<br>
	<br>
Click <a href="Logout"> here </a> to Logout
</center>
</body>
</html>