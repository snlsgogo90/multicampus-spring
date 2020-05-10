package aop02;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class TargetObjectImpl1 implements TargetObject {

	@Override
	public void printGreeting() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public String getGreeting() {
		return "Hello";
	}
	
}