package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class MyPointcuts {
	@Pointcut("execution(* add1*(..))")
	public void allAddMethods() {
	}
}
 