package com.Collections;

public class Customer {
	int cusId;
	String cusName;
	int cusAge;
	public Customer(int cusId, String cusName, int cusAge) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusAge = cusAge;
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusAge=" + cusAge + "]";
	}

}
