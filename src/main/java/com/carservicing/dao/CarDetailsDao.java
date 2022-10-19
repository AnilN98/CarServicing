package com.carservicing.dao;

import java.sql.*;

public class CarDetailsDao 
{
	public boolean check(String carRegNum)
	{
		System.out.println("Inside CarDetailsDao Class");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicing","root","system");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from customerCars where custCarRegisterNum = '" + carRegNum + "'");
			if(rs.next())
			{
				System.out.println("Register Number Validated");
				return true;
			}
			else
			{
				System.out.println("No Details Found with " + carRegNum + "Number");
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean insert(String custCarRegisterNum, String custCarType, String custCarModel, String custRequest, String custUserName)
	{
		System.out.println("Inside CarDetailsDao");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicing","root","system");
			Statement st = con.createStatement();
			int rs = st.executeUpdate("insert into customerCars (custUserName, custCarRegisterNum, custCarType, custCarModel, custRequest) values ('" + custUserName + "', '" + custCarRegisterNum + "',' " + custCarType + "','" + custCarModel + "','" + custRequest +"')");
			if(rs==1)
			{
				System.out.println(custCarRegisterNum + " Details are inserted");
				return true;
			}
			else
			{
				System.out.println(custCarRegisterNum + " Details are NOT Inserted");
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean update(String carRegNum, String custRequest, String userId)
	{
		System.out.println("Inside update() CarDetailsDao Class");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicing","root","system");
			Statement st = con.createStatement();
			int rs = st.executeUpdate("update customerCars set custRequest = '" + custRequest+ "' where custCarRegisterNum = '" + carRegNum + "' and custUserName = '" + userId + "'");
			if(rs==1)
			{
				System.out.println("Details succesfully Updated for Regisster Number : " + carRegNum);
				return true;
			}
			else
			{
				System.out.println("Details are not updated for Register Number : " + carRegNum);
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updateStatus(String carRegNum, String status)
	{
		System.out.println("Inside update() CarDetailsDao Class");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicing","root","system");
			Statement st = con.createStatement();
			int rs = st.executeUpdate("update customerCars set requestStatus = '" + status + "' where custCarRegisterNum = '" + carRegNum + "'");
			if(rs==1)
			{
				System.out.println("Details succesfully Updated for Regisster Number : " + carRegNum);
				return true;
			}
			else
			{
				System.out.println("Details are not updated for Register Number : " + carRegNum);
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
