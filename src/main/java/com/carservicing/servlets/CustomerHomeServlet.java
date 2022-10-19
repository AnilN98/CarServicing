package com.carservicing.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carservicing.dao.CustomerValidateDao;
import com.carservicing.model.Customer;

@WebServlet("/customerHome")
public class CustomerHomeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside CustomerHome Class"); 
		String custLoginId = request.getParameter("userLoginId");
		String custPwd = request.getParameter("userpwd");
		
		CustomerValidateDao dao= new CustomerValidateDao();
		
		List<Customer> cust = dao.customer(custLoginId, custPwd);
		
		if(dao.validate(custLoginId, custPwd))
		{
			HttpSession session = request.getSession();
			session.setAttribute("custUserId", custLoginId);
			session.setAttribute("custPwd", custPwd);
			session.setAttribute("customerDetails", cust);
			RequestDispatcher rd = request.getRequestDispatcher("customerHomePg.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("Details Not Found");
			RequestDispatcher rd = request.getRequestDispatcher("userIdNotFound.jsp");
			rd.forward(request, response);
		}
	}

}


