import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		Product pr1=(Product) con.getBean("proBean");
		Product pr2=(Product) con.getBean("proBean");
		pr2.setPrice(1532);
		System.out.println("code = "+ pr1.getCode()+" name = "+pr1.getName()+" price = "+pr1.getPrice());
		System.out.println("code = "+ pr2.getCode()+" name = "+pr2.getName()+" price = "+pr2.getPrice());
		
		

	}

}
