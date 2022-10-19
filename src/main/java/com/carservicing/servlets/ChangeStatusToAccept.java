package com.carservicing.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carservicing.dao.CarDetailsDao;

/**
 * Servlet implementation class ChangeStatusToAccept
 */
@WebServlet("/changeStatusToReject")
public class ChangeStatusToAccept extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			String userLoginId = request.getParameter("userLoginID");
			String carRegNum = request.getParameter("regNum");
			
			System.out.println("\nInside Change Status to Reject Servlet");
			System.out.println("\nUser Login Id Selected by Admin : " + userLoginId);
			System.out.println("\nSelected Car Reg Number by Admin : " + carRegNum);
			
			String status = "Your Request Rejected";
			System.out.println("\nInside Change Status to Accept Servlet");
			System.out.println("\nUser Login Id Selected by Admin : " + userLoginId);
			System.out.println("\nSelected Car Reg Number by Admin : " + carRegNum);
			
			CarDetailsDao dao = new CarDetailsDao();
			
			if(dao.updateStatus(carRegNum, status))
			{
				System.out.println("\nStatus Changed to 'Rejected by Admin' for Car : " + carRegNum);
				 RequestDispatcher rd =
				 request.getRequestDispatcher("success.jsp");
				 rd.forward(request, response);
			}
			else
			{
				System.out.println("\nStatus Not Changed to 'Rejected by Admin' for Car : " + carRegNum);
				RequestDispatcher rd = request.getRequestDispatcher("notSuccess.jsp");
				rd.forward(request, response);
			}
		}
}


