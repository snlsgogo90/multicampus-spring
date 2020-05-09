package aop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class CommonAspect {
	
	TargetObject targetObject = null;
	
	public void doBefore() {
//		Object obj = joinPoint.getTarget();
//		if(obj instanceof TargetObject) {
//			targetObject = (TargetObject) obj;
//			System.out.println(targetObject.getGreeting());
//			System.out.println(joinPoint.getSignature());
//		}
		System.out.println("메소드 실행 전");
	}
	
	public void doAfterReturning(String rt) {
		System.out.println("리턴 값 : " + rt);
		System.out.println("리턴 값 반환 후");
	}
		
	public void doAfterThrowing(Throwable th) {
		System.out.println("에러 메시지 : " + th.getMessage());
		System.out.println("예외 발생 후");
	}

	public void doAfter() {
		System.out.println("메소드 실행 후");
	}
	
//	public void doAround(ProceedingJoinPoint joinPoint) {
//		doBefore();
//		try {
//			String rt = (String) joinPoint.proceed(); // 포인트컷 발생한 메소드의 리턴 값
//			doAfterReturning(rt);
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			doAfterThrowing(e);
//		} finally {
//			doAfter();
//		}	
//	}
	
}
