package com.carservicing.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carservicing.dao.CustomerValidateDao;

/**
 * Servlet implementation class CustomerRegisteration
 */
@WebServlet("/custRegisteration")
public class CustomerRegisteration extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String custName = request.getParameter("custName");
		String custUserName = request.getParameter("userName");
		String custPwd = request.getParameter("userPwd");
		String conPwd = request.getParameter("conPwd");
		String custEmail = request.getParameter("custEmail");
		
		CustomerValidateDao dao= new CustomerValidateDao();
		HttpSession session = request.getSession();
		session.setAttribute("custName", custName);
		
		if(custPwd.equals(conPwd))
		{
			
			if(dao.insert(custName, custUserName, custPwd, custEmail))
			{
				System.out.println("Customer Details Successfully Registered");
				response.sendRedirect("RegisterationSuccessful.jsp");
			}
			else
			{
				System.out.println("User Name Alredy Exists");
				response.sendRedirect("userNameAlreadyExists.jsp");
			}
		}
		 
		else
		{
			System.out.println("Password & Confirm Password Doesnt Match");
			response.sendRedirect("PasswordNotMatch.jsp");
		}
		
		
	}

}
