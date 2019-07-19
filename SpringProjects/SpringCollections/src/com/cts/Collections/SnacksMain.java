package com.cts.Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SnacksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		SnacksBar snk=(SnacksBar)con.getBean("snkBean");
		List<String> chklst =snk.getChocolates();
		Set<String> hotdrk=snk.getHotdrinks();
		Map<Integer,String> bhel=snk.getBhel();
		System.out.println("Chocolates Available");
		for(String c:chklst) {
			System.out.println(c);
		}
		System.out.println("HotDrinks Available");
		for(String h:hotdrk) {
			System.out.println(h);
		}
		System.out.println("Bhel Available");
		for(Map.Entry m:bhel.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
