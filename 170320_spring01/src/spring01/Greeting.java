package spring01;

public class Greeting {
	
	public Greeting() {
		System.out.println("생성자 호출됨");
	}
	
	public void greeting() {
		System.out.println("Hello World");
	}
	
	public void initObj() {
		System.out.println("객체 생성됨");
	}
	
	public void destObj() {
		System.out.println("객체 소멸됨");
	}
}
