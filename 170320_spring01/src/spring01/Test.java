package spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctxt = new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("???");
		
		// Greeting gr = (Greeting) ctxt.getBean("gr");
		Greeting gr1 = ctxt.getBean("gr", Greeting.class);
		gr1.greeting();
		Greeting gr2 = ctxt.getBean("gr", Greeting.class);
		gr2.greeting();
		
		System.out.println(gr1);
		System.out.println(gr2);
		
		if(gr1 == gr2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		// 빈 설정에 scope="prototype" 설정되어 있으면 소멸 동작 실행되지 않는다.
		((GenericXmlApplicationContext) ctxt).close();
		
	}
	
}