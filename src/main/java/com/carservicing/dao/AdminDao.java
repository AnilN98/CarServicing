package com.carservicing.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.carservicing.model.Customer;

public class AdminDao 
{

	public boolean check(String adminId, String adminPwd)
	{
		try
		{
			System.out.println("Inside Admin Dao Class");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anil","root","system");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from adminDetails where loginid = '" + adminId +"' "
					+ "and password = '" + adminPwd + "'");
			if(rs.next())
			{
				System.out.println("Inside Admin Dao : \nAdminPass: "+ rs.getString("password"));
				return true;
			}
			else
			{
				System.out.println("No DETAILS FOUND WITH GIVEN LOGIN ID " + adminId + "\nPLEASE CHECK LOGIN ID");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public static List<Customer> getAllRegisteredCustomers()
	{
		System.out.println("inside CustomerValidateDao class, Customer Method");
		
		List<Customer> customerlist = new ArrayList<Customer>();
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicing","root","system");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customers;");
			
			while(rs.next())
			{
				Customer cust = new Customer(rs.getString("customerName"), rs.getNString("userName"), rs.getString("custEmail"),null,null,null,null,null);
				
				customerlist.add(cust);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return customerlist;
		}
	
	public static List<Customer> getAllCustomers()
	{
		System.out.println("inside CustomerValidateDao class, Customer Method");
		
		List<Customer> customerlist = new ArrayList<Customer>();
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicing","root","system");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customers inner join customerCars on customers.userName = customerCars.custUserName;");
			
			while(rs.next())
			{
				Customer cust = new Customer(rs.getString("customerName"), rs.getNString("userName"), rs.getString("custEmail"), rs.getString("custCarRegisterNum"),
						rs.getString("custCarModel"), rs.getString("custCarType"), rs.getString("custRequest"), rs.getString("requestStatus"));
				
				customerlist.add(cust);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return customerlist;
		}
				
}
