package project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		Product pr1=(Product) con.getBean("prosBean"); 
		System.out.println("pcode = "+pr1.getPcode());
		System.out.println("pname = "+pr1.getPname());
		System.out.println("price = "+pr1.getPrice());
		System.out.println("sname = "+pr1.getSob().getSname());
		System.out.println("sadd = "+pr1.getSob().getSadd());
		System.out.println("mobile = "+pr1.getSob().getMobile());

	}

}
