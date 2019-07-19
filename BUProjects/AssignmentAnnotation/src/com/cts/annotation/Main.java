package com.cts.annotation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new AnnotationConfigApplicationContext(BillBeanConfigure.class);
		Bill b1=(Bill)con.getBean(Bill.class);
		//System.out.println(b1.getCust().getCust_name());
		PurchaseDetails p1=(PurchaseDetails)con.getBean(PurchaseDetails.class);
		Customer c1=(Customer)con.getBean(Customer.class);
		List<PurchaseDetails> purchase=b1.getPdet();
		/*
		for(PurchaseDetails p:purchase) 
		{
			System.out.println(p.getItem_code()+" "+p.getQuantity()+" "+p.getCal_bill());
		}
		*/
		c1.setCust_name("himanshi");
		c1.setCust_code(555);
		b1.setBill_no(1);
		purchase.add(p1);
		p1.setItem_code(101);
		p1.setQuantity(2);
		p1.setCal_bill((p1.getItem_code())*(p1.getQuantity()));
		System.out.println("\nBill_no : "+b1.getBill_no()+"\nCustomer name : "+c1.getCust_name()+"\nCust_details : "+c1.getCust_code()+
							"Item code : "+p1.getItem_code()+"\nQuantity : "+p1.getQuantity()+"\nCal_bill : "+p1.getCal_bill());
		
	}

}
