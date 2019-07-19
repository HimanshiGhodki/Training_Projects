package com.cts.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new AnnotationConfigApplicationContext(BookBeanConfigure.class);
		Book b1=(Book) con.getBean(Book.class);
		//System.out.println("Name : "+b1.getBname()+"\nPrice : "+b1.getPrice()+"\ncode : "+b1.getBcode());
		Book b2=(Book)con.getBean(Book.class);
		b2.setBname("nagas");
		b2.setBcode(121);
		//System.out.println("Name : "+b2.getBname()+"\nPrice : "+b2.getPrice()+"\ncode : "+b2.getBcode());
		//System.out.println("Name : "+b1.getBname()+"\nPrice : "+b1.getPrice()+"\ncode : "+b1.getBcode());
		System.out.println("Name : "+b2.getPub().getPname()+"\nadd : "+b2.getPub().getPadd());
		b1.getPub().setPname("himanshi");;
		System.out.println("Name : "+b1.getPub().getPname()+"\nadd : "+b1.getPub().getPadd());

	}

}
