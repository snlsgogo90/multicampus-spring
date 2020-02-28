package di01;

public class Car {

	/* 
	 * Tire 참조변수에 객체 주입하는 방법
	 * 1. 싱글턴 스타일 > 직접 new 생성
	 * 2. 생성자에서 new 생성
	 * 3. 생성자 파라미터로 전달 받기 > 생성자 주입
	 * 4. 설정자 파라미터로 전달 받기 > 설정자 주입
	 */
	private Tire tire;
	
	public Car() {
		
	}
	
	/*
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("생성자를 통한 주입");
	}
	*/
	
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("설정자를 통한 주입");
	}
	
	public void drive() {
		System.out.println(tire.getTire() + "로 주행합니다.");
	}
}
