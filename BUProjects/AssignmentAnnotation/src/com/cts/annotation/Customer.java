package com.cts.annotation;

import org.springframework.beans.factory.annotation.Value;

public class Customer {
	@Value("himanshi")
	private String cust_name;
	
	private int cust_code;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cust_name, int cust_code) {
		super();
		this.cust_name = cust_name;
		this.cust_code = cust_code;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public int getCust_code() {
		return cust_code;
	}
	public void setCust_code(int cust_code) {
		this.cust_code = cust_code;
	}
	

}
