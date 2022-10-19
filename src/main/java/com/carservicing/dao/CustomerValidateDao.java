package com.carservicing.dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import com.carservicing.model.Customer;
public class CustomerValidateDao 
{
	
	
	public boolean validate(String custUserName, String custPwd)
	{
		System.out.println("Inside CustomerValidateDao Class");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicing","root","system");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customers where userName = '" + custUserName +"' and userPwd = '" + custPwd + "'");
			if(rs.next())
			{
				return true;
			}
			else
			{
				System.out.println("Customer User ID and Password Not Found");
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean insert(String custName, String custUserName, String custPwd, String custEmail)
	{
		try
		{
			System.out.println("Inside CustomerRegisteration Dao Class");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicing","root","system");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customers where userName = '" + custUserName +"'");
			if(rs.next())
			{
				System.out.println("User Name Already Exists");
				return false;
			}
			else
			{
				try
				{
					Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicing","root","system");
					Statement st1 = con1.createStatement();
					int rs1 = st1.executeUpdate("insert into customers values('" + custName + "','" + custUserName + "','" + custPwd +"','" + custEmail + "')");
					if(rs1==0)
					{
						System.out.println("Error in Sql Statment while Inserting Customer Details intp Register Table");
						return false;
					}
					else
					{
						
						System.out.println("Customer Details Entered Successfully into Register Table");
						return true;
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public static List<Customer> customer(String custUserName, String custPwd)
	{
		System.out.println("inside CustomerValidateDao class, Customer Method");
		
		List<Customer> customerlist = new ArrayList<Customer>();
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicing","root","system");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customers , customerCars where customers.userName = customerCars.custUserName and customers.userName='"
			+ custUserName + "' and customers.userPwd = '" + custPwd +"'");
			
			while(rs.next())
			{
				Customer cust = new Customer(rs.getString("customerName"), rs.getNString("userName"), rs.getString("custEmail"), rs.getString("custCarRegisterNum"),
						rs.getString("custCarModel"), rs.getString("custCarType"), rs.getString("custRequest"), rs.getString("requestStatus"));
				
				System.out.println("USer Name : " + rs.getNString("userName"));
				
				System.out.println("Email :" + rs.getString("custEmail"));
				
				System.out.println("Register Number :" + rs.getString("custCarRegisterNum"));
				
				System.out.println("Car Type : " + rs.getString("custCarType"));
				
				System.out.println("Car Model : " + rs.getString("custCarModel"));
				
				System.out.println("Customer Request : " + rs.getString("custRequest"));
				
				System.out.println("Request Status : " + rs.getString("requestStatus"));
				
				customerlist.add(cust);
				
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return customerlist;
	}
	
	public static List<Customer> getCustomerDetails(String custUserName, String regNum)
	{
		System.out.println("inside CustomerValidateDao class, Customer Method");
		
		List<Customer> customerlist = new ArrayList<Customer>();
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicing","root","system");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customers , customerCars where customers.userName = customerCars.custUserName and customers.userName='"
			+ custUserName + "' and customerCars.custCarRegisterNum = '" + regNum +"'");
			
			while(rs.next())
			{
				Customer cust = new Customer(rs.getString("customerName"), rs.getNString("userName"), rs.getString("custEmail"), rs.getString("custCarRegisterNum"),
						rs.getString("custCarModel"), rs.getString("custCarType"), rs.getString("custRequest"), rs.getString("requestStatus"));
				
				System.out.println("USer Name : " + rs.getNString("userName"));
				
				System.out.println("Email :" + rs.getString("custEmail"));
				
				System.out.println("Register Number :" + rs.getString("custCarRegisterNum"));
				
				System.out.println("Car Type : " + rs.getString("custCarType"));
				
				System.out.println("Car Model : " + rs.getString("custCarModel"));
				
				System.out.println("Customer Request : " + rs.getString("custRequest"));
				
				System.out.println("Request Status : " + rs.getString("requestStatus"));
				
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
