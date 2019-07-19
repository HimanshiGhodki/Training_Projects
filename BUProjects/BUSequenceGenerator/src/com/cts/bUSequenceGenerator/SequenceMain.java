package com.cts.bUSequenceGenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SequenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		Sequence sq=(Sequence)con.getBean("seqBean");
		for(int i=0;i<10;i++) 
		{
			System.out.println(sq.getSequence());
		}
	}

}
