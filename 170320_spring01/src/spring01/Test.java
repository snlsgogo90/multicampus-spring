package spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		// 컨테이너 빌드
		ApplicationContext ctxt = new GenericXmlApplicationContext("spring01/applicationContext.xml");
		
		System.out.println("???");
		
		// Greeting gr = (Greeting) ctxt.getBean("gr");
		// gr.greeting();
		
		Greeting gr1 = ctxt.getBean("gr", Greeting.class);
		gr1.greeting();
		Greeting gr2 = ctxt.getBean("gr", Greeting.class);
		gr2.greeting();
		
		System.out.println(gr1);
		System.out.println(gr2);
		
		// 빈 설정에 scope="prototype" 설정되어 있으면 소멸 동작 실행되지 않는다.
		((GenericXmlApplicationContext) ctxt).close();
		
	}
	
}
