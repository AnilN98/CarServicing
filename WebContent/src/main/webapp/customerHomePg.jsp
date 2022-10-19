<%@page import="com.carservicing.model.Customer"%>
<%@page import="com.carservicing.dao.CustomerValidateDao" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Home Page</title>
</head>
<body>
<center>
	Welcome <b><big><%out.println(session.getAttribute("custUserId").toString()); %></big></b>
	<br>
	<br>
	<% 
		String custUserId = session.getAttribute("custUserId").toString();
		String custPwd = session.getAttribute("custPwd").toString();
		List<Customer> customerList = CustomerValidateDao.customer(custUserId, custPwd);
		int i=0;
		for(Customer cust : customerList) {
		while(i<1){
			%>
			Your Name : <b><%	out.println(cust.getCustName()); %></b>
			Your User ID : <b><%out.println(cust.getCustUserName()); %></b>
			Your Email ID : <b><%out.println(cust.getCustEmail());
			i++;
			}}
			%>
			<br>
			<br>
	<table>
	<tr><th>Your Car Register Number :  </th><th>Your Car Model :  </th><th>Your Car Type :  </th><th>Your Service Request :  </th><th>Request Status :  </th></tr>
	
	<%
		for(Customer custs : customerList) 
		{
		%>
		<tr><td><b><%out.println(custs.getCustCarRegisterNumber()); %></b></td>
	<td><%out.println(custs.getCustCarModel()); %></td>
	<td><%out.println(custs.getCustCarType()); %></td>
	<td><b><%out.println(custs.getCustCarRequest());%></b></td>
	<td><%out.println(custs.getRequestStatus()); }%></td></tr>
	</table>
	<br>
	<br>
	Click <a href="CarRegister.jsp">here </a> to Register Your Car Details
	<br>
	<br>
	Click <a href="updateYourCarDetails.jsp">here </a> to Update Your Car Service Request
	<br>
	<br>
	Click <a href="Logout"> here </a> to Logout
	</center>
</body>
</html>