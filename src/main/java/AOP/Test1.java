package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Book book = context.getBean("book", Book.class);
		UniLibrary library1 = context.getBean("uniLibrary", UniLibrary.class);
		library1.getBook();
		library1.returnBook();
		library1.getMagzine();
		library1.returnBook();
		library1.addBook("Zaur", book);
		library1.addMagazine();

//		SchoolLibrary library2 = context.getBean("schoolLibrary", SchoolLibrary.class);
//		library2.getBook();

		context.close();
	}

}
