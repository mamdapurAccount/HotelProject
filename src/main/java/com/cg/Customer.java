package com.cg;

import java.io.Serializable;
import java.util.Arrays;

// POJO class

public class Customer  {
	
	private int custid;
	private String custName;
	
	private String address;

	
	
	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer(int custid, String custName, String address) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.address = address;
	}
// Rajashree
	// Rajashree
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.custName.length();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	 Customer c=(Customer)obj;
	 if( this.custName.equals(c.getCustName()))
		 return true;
	 return false;
	 
	 
	}
	
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", address=" + address + "]";
	}

	
	

	
	

}
