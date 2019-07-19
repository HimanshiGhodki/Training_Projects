package com.cts.DaoSequence;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		SequenceService sq=(SequenceService) con.getBean("Bean");
		
		Scanner sc=new Scanner(System.in);
		//Sequence seq=new Sequence();
		
		/*for(int i=0;i<10;i++) 
		{
			System.out.println(seq.getSequence());
		}*/
		System.out.println("Do you want to store data or retreive data");
		String str=sc.next();
		if(str.equalsIgnoreCase("store")) 
		{
			sq.insertRow();
		}
		else if(str.equalsIgnoreCase("retreive"))
		{
			System.out.println("for which prefix do you want the sequence");
			String prefix=sc.next();
			sq.showSequence(prefix);
		}
		else
			System.out.println("Invalid input");
		
		
		
		
		sc.close();
	}

}
