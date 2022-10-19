package com.carservicing.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carservicing.dao.AdminDao;



@WebServlet("/adminController")
public class AdminController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String adminId = request.getParameter("adminLoginId");
		String adminPwd = request.getParameter("adminpwd");
		
		AdminDao dao = new AdminDao();
		
		if(adminId==null||adminId==""||adminId==" "||adminPwd==null||adminPwd==""||adminPwd==" ")
		{
			System.out.println("Admin didnt enter full details");
			RequestDispatcher rd = request.getRequestDispatcher("adminloginpg.jsp");
			rd.forward(request, response);
		}
		
		else if(dao.check(adminPwd, adminPwd))
		{
			HttpSession session = request.getSession();
			session.setAttribute("adminid", adminPwd);
			RequestDispatcher rd = request.getRequestDispatcher("adminHome.jsp");
			rd.forward(request, response);
		}
		
		else
		{
			System.out.println("Something Wrong in AdminController Class ");
			RequestDispatcher rd = request.getRequestDispatcher("adminLoginPg.jsp");
			rd.forward(request, response);
		}
	}

}
