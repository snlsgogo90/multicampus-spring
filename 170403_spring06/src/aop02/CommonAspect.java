package aop02;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CommonAspect {
	
	@Pointcut("execution(public * aop02.*.*(..))")
	public void pt() {
		
	}
	
	@Before("pt()")
	public void doBefore() {
		System.out.println("메소드 호출 전");
	}
	
	@AfterReturning(pointcut = "pt()", returning = "rt")
	public void doAfterReturning(String rt) {
		System.out.println("리턴 값 반환 후");
		System.out.println("리턴 값 : " + rt);
	}
		
	@AfterThrowing("pt()")
	public void doAfterThrowing() {
		System.out.println("예외 발생 후");
	}
	
	@After("pt()")
	public void doAfter() {
		System.out.println("메소드 실행 후");
	}
	
}
