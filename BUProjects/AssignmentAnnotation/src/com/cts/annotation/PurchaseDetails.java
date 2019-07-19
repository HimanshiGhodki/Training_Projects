package com.cts.annotation;

public class PurchaseDetails {
	
	private int item_code;
	
	private int quantity;	
	
	private int cal_bill;
	public PurchaseDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PurchaseDetails(int item_code, int quantity, int cal_bill) {
		super();
		this.item_code = item_code;
		this.quantity = quantity;
		this.cal_bill = cal_bill;
	}
	public int getItem_code() {
		return item_code;
	}
	public void setItem_code(int item_code) {
		this.item_code = item_code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCal_bill() {
		return cal_bill;
	}
	public void setCal_bill(int cal_bill) {
		this.cal_bill = cal_bill;
	}
	



}
