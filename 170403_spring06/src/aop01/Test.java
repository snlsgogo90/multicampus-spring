package aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("aop01/applicationContext.xml");
		TargetObject obj = context.getBean("targetObjectImpl1", TargetObject.class);
		obj.getGreeting();
	}
}
