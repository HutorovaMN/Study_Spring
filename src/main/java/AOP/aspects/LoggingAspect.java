package AOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import AOP.Book;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

	@Before("AOP.aspects.MyPointcuts.allAddMethods()")
	public void beforGetLoggingAdvice(JoinPoint jointPoint) {
		MethodSignature methodSignture = (MethodSignature) jointPoint.getSignature();
		System.out.println("methodSignture == " + methodSignture);
		System.out.println("-----------------------------------");
		System.out.println("methodSignture.getMethod() == " + methodSignture.getMethod());
		System.out.println("-----------------------------------");
		System.out.println("methodSignture.getReturnType() == " + methodSignture.getReturnType());
		System.out.println("-----------------------------------");
		System.out.println("methodSignture.getName() == " + methodSignture.getName());
		System.out.println("-----------------------------------");
		System.out.println("beforGetLoggingAdvice : !!!!!ПОПЫТКА beforGetLoggingAdvice");
		System.out.println("-----------------------------------");

		if (methodSignture.getName().equals("addBook")) {
			Object[] arg = jointPoint.getArgs();
			for (Object obj : arg) {
				if (obj instanceof Book) {
					Book myBook = (Book) obj;
					System.out.println("INFORMTION ABAUT BOOK = " + myBook.getName() + " " + myBook.getAuthor() + " "
							+ myBook.getYersOfPublication());
					System.out.println("-----------------------------------");
				} else if (obj instanceof String) {
					System.out.println("BOOK ADD " + obj);
					System.out.println("-----------------------------------");

				}
			}
		}
	}

//	@Pointcut("execution(* AOP.UniLibrary.get*())")
//	private void allGetMethodsFromUniLibrary() {
//	}
//
//	@Pointcut("execution(* AOP.UniLibrary.return*())")
//	private void allReturnMethodsFromUniLibrary() {
//	}
//
//	@Pointcut("allGetMethodsFromUniLibrary()   allReturnMethodsFromUniLibrary()")
//	private void allGetAndReturnMethodsFromUniLibrary() {
//	}
//
//	
//	@Before("allGetMethodsFromUniLibrary()")
//	public void beforeGetLoggingdvice() {
//		System.out.println("beforeGetLoggingdvice : LOG#1");
//	}
//	
//	@Before("allReturnMethodsFromUniLibrary()")
//	public void beforeReturnLoggingdvice() {
//		System.out.println("beforeGetLoggingdvice : LOG#2");
//	}
//
//	@Before("allGetAndReturnMethodsFromUniLibrary()")
//	public void beforeallGetAndReturnMethodsFromUniLibrary() {
//		System.out.println("allGetAndReturnMethodsFromUniLibrary : LOG#3");
//	}

//	@Before("execution(public void AOP.UniLibrary.getBook())")
//	@Before("execution(public void get*())")
//	@Before("execution(public void get*(String))")
//	@Before("execution(public void get*(*))")
//	@Before("execution(public void *(..))")
//	@Before("execution(public void getBook(AOP.Book))")
//	@Before("execution(public void getBook(AOP.Book, ..))")

//	@Before("execution(* get*())")

//	@Before("execution(* get*())")

// 
//	@Before("execution(public * return*())")
//	public void beforReturnBookAdvice() {
//		System.out.println("beforReturnBookAdvice : !!!!!ПОПЫТКА beforReturnBookAdvice");
//
//	}
}
