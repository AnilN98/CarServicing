package com.carservicing.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carservicing.dao.CarDetailsDao;

/**
 * Servlet implementation class CarServiceRequestUpdate
 */
@WebServlet("/carServiceRequestUpdate")
public class CarServiceRequestUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		
		String carRegNum = request.getParameter("carRegisterNum");
		String custCarRequest = request.getParameter("custRequest");
		
		CarDetailsDao dao = new CarDetailsDao();
		HttpSession session = request.getSession();
		session.setAttribute("carRegNum", carRegNum);
		String userId = session.getAttribute("custUserId").toString();
		if(dao.check(carRegNum))
		{
			
			if(dao.update(carRegNum, custCarRequest,userId))
			{
				System.out.println("Details Updated Akg in CarUpdateDetailsServlet");
				 RequestDispatcher rd =
				 request.getRequestDispatcher("CarDetailsUpdatedSccuessfully.jsp");
				 rd.forward(request, response);
				 
			}
			else
			{
				System.out.println("Details Not Updated Akg in CarUpdateDetailsServlet");
				RequestDispatcher rd = request.getRequestDispatcher("CarDetailsNotUpdatedSccuessfully.jsp");
				rd.forward(request, response);
			}
			RequestDispatcher rd = request.getRequestDispatcher("updateServiceRequest.jsp");

		}
		else
		{
			System.out.println("No Details found Akg in CarUpdateDetailsDao Servlet " + carRegNum);
			RequestDispatcher rd = request.getRequestDispatcher("noCarFoundInDBWithGivenNum.jsp");
		}
	}

}
