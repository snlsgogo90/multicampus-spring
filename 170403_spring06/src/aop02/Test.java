package aop02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import aop02.TargetObject;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("aop02/applicationContext.xml");
		TargetObject obj = context.getBean("targetObjectImpl1", TargetObject.class);
		obj.getGreeting();
	}
}
