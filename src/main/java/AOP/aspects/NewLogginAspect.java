package AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLogginAspect {
	@Around("execution(public String returnBook())")
	public Object aroundReturBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("aroundReturBookLoggingAdvice : TRY RETURN BOOK");
		long begin = System.currentTimeMillis();
		Object target = proceedingJoinPoint.proceed();
		long end = System.currentTimeMillis();
		System.out.println("aroundReturBookLoggingAdvice : SUSSESFULL RETURN BOOK");
		System.out.println("TIMEWORK = " + (end - begin));
		return target;
	}
}
