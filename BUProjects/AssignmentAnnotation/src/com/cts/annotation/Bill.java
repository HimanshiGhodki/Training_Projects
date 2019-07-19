package com.cts.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Bill {
	
	private int bill_no;
	
	@Autowired
	private List<PurchaseDetails> pdet;
	
	@Autowired
	private Customer cust;

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(int bill_no, List<PurchaseDetails> pdet, Customer cust) {
		super();
		this.bill_no = bill_no;
		this.pdet = pdet;
		this.cust = cust;
	}

	public int getBill_no() {
		return bill_no;
	}

	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}

	public List<PurchaseDetails> getPdet() {
		return pdet;
	}

	public void setPdet(List<PurchaseDetails> pdet) {
		this.pdet = pdet;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	

}
