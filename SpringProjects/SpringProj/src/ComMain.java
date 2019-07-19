import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		Employee e1=(Employee) con.getBean("empBean");
		System.out.println("company name = "+e1.getCname());
		System.out.println("company address = "+e1.getCadd());
		System.out.println("Employee name = "+e1.getEname());
		System.out.println("Employee id = "+e1.getId());
		System.out.println("Employee salary = "+e1.getSal());

	}

}
