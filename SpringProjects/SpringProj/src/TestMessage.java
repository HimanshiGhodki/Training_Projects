import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Message msg1=(Message) context.getBean("msgBean");
		
		System.out.println(msg1.getStr());
		msg1.setStr("notadded");
		msg1.displayStr();
		
		Message msg2=(Message) context.getBean("msgBean");
		System.out.println(msg2.getStr());
		msg1.setStr("hello");
		System.out.println(msg1.getStr());
		System.out.println(msg2.getStr());

	}

}
