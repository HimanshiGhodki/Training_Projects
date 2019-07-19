package com.cts.Collections;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.Collections.College;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		College c=(College) con.getBean("colBean");
		List<Teacher> teach=c.getTeach();
		for(Teacher t:teach) 
		{
			System.out.println(t.getTname()+" "+t.getTadd()+" "+t.getTphone_no());
		}
		
	}

}
