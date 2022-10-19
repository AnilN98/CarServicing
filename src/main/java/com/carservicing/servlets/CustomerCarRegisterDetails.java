package com.carservicing.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carservicing.dao.CarDetailsDao;


@WebServlet("/customerCarRegisterDetails")
public class CustomerCarRegisterDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String custCarRegisterNum = request.getParameter("custCarRegisterNum");
		String custCarType = request.getParameter("custCarType");
		String custCarModel = request.getParameter("custCarModel");
		String custRequest = request.getParameter("custRequest");
		HttpSession session = request.getSession();
		String custName = (String)session.getAttribute("custUserId");
		
		
		CarDetailsDao cdao = new CarDetailsDao();
		
		if(!cdao.check(custCarRegisterNum))
		{
		
			if(cdao.insert(custCarRegisterNum, custCarType, custCarModel, custRequest, custName))
			{
				System.out.println("Customer Details Inserted Akg in Servlet Class");
				response.sendRedirect("custCarDetailsSuccessfullyInserted.jsp");
			}
			else
			{
				System.out.println("Customer Details NOT Inserted Akg in Servlet Class");
				response.sendRedirect("custCarDetailsNotInserted.jsp");
			}
		}
		else
		{
			session.setAttribute("carRegNum", custCarRegisterNum);
			System.out.println("Car Register Number Already Exists : " + custCarRegisterNum);
			response.sendRedirect("numberAlreadyRegistered.jsp");
		}
		
		
	}

}
