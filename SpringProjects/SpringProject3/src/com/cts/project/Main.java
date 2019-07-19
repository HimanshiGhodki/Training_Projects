package com.cts.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String []args) {
		
	ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
	College c=(College) con.getBean("colBean");
	
	System.out.println("TeacherDetails");
	System.out.println(c.getRegno());
	System.out.println(c.getCname());
	System.out.println(c.getAdd());
	System.out.println(c.getCphone_no());
	System.out.println(c.getTeach().getTname());
	System.out.println(c.getTeach().getTadd());
	System.out.println(c.getTeach().getTphone_no());
	System.out.println();
	System.out.println("Student Details");
	System.out.println(c.getRegno());
	System.out.println(c.getCname());
	System.out.println(c.getAdd());
	System.out.println(c.getCphone_no());
	System.out.println(c.getStud().getSname());
	System.out.println(c.getStud().getSadd());
	System.out.println(c.getStud().getSphone_no());


}
	}
