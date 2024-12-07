package AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientController3 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context  =  new ClassPathXmlApplicationContext("applicationContext.xml");
		 System.out.println("****Auto Wiring Concept using SetterDI*****");
		 Person p = context.getBean(Person.class, "personbean");
		 System.out.println(p.toString());
		 context.close();

	}

}
