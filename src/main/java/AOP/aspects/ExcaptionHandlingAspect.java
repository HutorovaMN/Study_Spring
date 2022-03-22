package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Aspect
@Order(3)
public class ExcaptionHandlingAspect {
	@Before("AOP.aspects.MyPointcuts.allAddMethods ()")
	public void ExcaptionHandlingAspect() {
		System.out.println("ExcaptionHandlingAspect :   EXCAPTION");
		System.out.println("--------------------------------------");
	}
}
