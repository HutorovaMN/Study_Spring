package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("MAIN STARTS");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
		String bookName = library.returnBook();
		System.out.println("RETURND = " + bookName);
		context.close();
		System.out.println("MAIN ENDS");

		
	}

}
