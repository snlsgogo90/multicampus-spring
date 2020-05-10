package aop02;

import org.springframework.stereotype.Component;

@Component
public class TargetObjectImpl2 implements TargetObject {

	@Override
	public void printGreeting() {
		// TODO Auto-generated method stub
		System.out.println("Annyeong");
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Annyeong";
	}

}
