package di01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctxt = new GenericXmlApplicationContext("di01/applicationContext.xml");
		
		System.out.println("???");
		
		Car car = ctxt.getBean("car", Car.class);
		car.drive();
	}
	
}
