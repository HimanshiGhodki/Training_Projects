package com.cts.UsingAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SequenceMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new AnnotationConfigApplicationContext(SequenceGeneratorConfigure.class);
		Sequence sq=(Sequence)con.getBean(Sequence.class);
		for(int i=0;i<10;i++) 
		{
			System.out.println(sq.getSequence());
		}
	}
}
