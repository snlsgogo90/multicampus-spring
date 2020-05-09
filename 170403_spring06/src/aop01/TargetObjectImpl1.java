package aop01;

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
		// TODO Auto-generated method stub
		
		if(new Random().nextBoolean()) {
			throw new TargetObjectException("에러 발생");
		}
		
		return "Hello";
	}
	
}