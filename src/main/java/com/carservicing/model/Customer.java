package com.carservicing.model;

public class Customer 
{
	
	private String custName;
	private String custUserName;
	private String custPwd;
	private String custEmail;
	private String custCarRegisterNumber;
	private String custCarModel;
	private String custCarType;
	private String custCarRequest;
	private String requestStatus;
	
	
	public Customer(String custName, String custUserName, String custEmail,
			String custCarRegisterNumber, String custCarModel, String custCarType, String custCarRequest, String requestStatus) 
	{
		super();
		this.custName = custName;
		this.custUserName = custUserName;
		this.custEmail = custEmail;
		this.custCarRegisterNumber = custCarRegisterNumber;
		this.custCarModel = custCarModel;
		this.custCarType = custCarType;
		this.custCarRequest = custCarRequest;
		this.requestStatus = requestStatus;
	}
	
	
	
	public String getRequestStatus() {
		return requestStatus;
	}



	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}



	public String getCustCarRegisterNumber() {
		return custCarRegisterNumber;
	}
	public void setCustCarRegisterNumber(String custCarRegisterNumber) {
		this.custCarRegisterNumber = custCarRegisterNumber;
	}
	public String getCustCarModel() {
		return custCarModel;
	}
	public void setCustCarModel(String custCarModel) {
		this.custCarModel = custCarModel;
	}
	public String getCustCarType() {
		return custCarType;
	}
	public void setCustCarType(String custCarType) {
		this.custCarType = custCarType;
	}
	public String getCustCarRequest() {
		return custCarRequest;
	}
	public void setCustCarRequest(String custCarRequest) {
		this.custCarRequest = custCarRequest;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustUserName() {
		return custUserName;
	}
	public void setCustUserName(String custUserName) {
		this.custUserName = custUserName;
	}
	public String getCustPwd() {
		return custPwd;
	}
	public void setCustPwd(String custPwd) {
		this.custPwd = custPwd;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	
	

}
