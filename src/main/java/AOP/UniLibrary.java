package AOP;

import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")

public class UniLibrary extends AbstractLibrary {
//	@Override
	public void getBook() {
		System.out.println("!!!!We get book UniLibrary  =   ");
		System.out.println("-----------------------------------");
	}

	public void getMagzine() {
		System.out.println("!!!!We get book getMagzine");
		System.out.println("-----------------------------------");
	}

	public String returnBook() {
		System.out.println("!!!!We returnBook UniLibrary");
		return "War and World";
	}

	public void returnMagazine() {
		System.out.println("!!!!We returnMagazine UniLibrary");
		System.out.println("-----------------------------------");
	}

	public void addBook(String author_name, Book book) {
		System.out.println("!!!!We addBook UniLibrary");
		System.out.println("-----------------------------------");
	}

	public void addMagazine() {
		System.out.println("!!!!We addMagazine UniLibrary");
		System.out.println("-----------------------------------");
	}
}
