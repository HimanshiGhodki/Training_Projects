package com.cts.DaoSequenceWithoutBean;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(JdbcConfig.class);
		SequenceDAOImpl sq=(SequenceDAOImpl) con.getBean(SequenceDAOImpl.class);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Do you want to store data or retreive data");
		String str=sc.next();
		if(str.equalsIgnoreCase("store")) 
		{
			sq.insertSequence();
		}
		else if(str.equalsIgnoreCase("retreive"))
		{
			System.out.println("for which prefix do you want the sequence");
			String prefix=sc.next();
			sq.display(prefix);
		}
		else
			System.out.println("Invalid input");
		
		sc.close();

	}

}
