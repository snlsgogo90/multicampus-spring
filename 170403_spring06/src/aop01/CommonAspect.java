package aop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class CommonAspect {
	
	TargetObject targetObject = null;
	
	public void doBefore(JoinPoint joinPoint) {
		// JoinPount -> 포인트컷 발생한 객체
		Object obj = joinPoint.getTarget();
		if(obj instanceof TargetObject) {
			targetObject = (TargetObject) obj;
			System.out.println(targetObject.getGreeting());
			System.out.println(joinPoint.getSignature());
		}
		System.out.println("메소드 실행 전");
	}
	
	public void doAfterReturning(String arg) {
		System.out.println("리턴 값 : " + arg);
		System.out.println("리턴 값 반환 후");
	}
		
	public void doAfterThrowing() {
		System.out.println("예외 발생 후");
	}

	public void doAfter() {
		System.out.println("메소드 실행 후");
	}
	
	public void doAround(ProceedingJoinPoint joinPoint) {
		doBefore(joinPoint);
		try {
			Object result = joinPoint.proceed();
			// doAfterReturning();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			doAfterThrowing();
		} finally {
			doAfter();
		}	
	}
	
}
