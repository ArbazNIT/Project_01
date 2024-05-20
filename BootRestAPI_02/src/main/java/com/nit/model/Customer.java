package com.nit.model;


public class Customer {
	private Integer custId;
	private String custName;
	private String custGmail;
	
	public Customer(Integer custId, String custName, String custGmail) {
	
		this.custId = custId;
		this.custName = custName;
		this.custGmail = custGmail;
	}

	
	public Customer() {
		
	}
	
	

	public Integer getCustId() {
		return custId;
	}


	public void setCustId(Integer custId) {
		this.custId = custId;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getCustGmail() {
		return custGmail;
	}


	public void setCustGmail(String custGmail) {
		this.custGmail = custGmail;
	}


	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custGmail=" + custGmail + "]";
	}

	
	
}
