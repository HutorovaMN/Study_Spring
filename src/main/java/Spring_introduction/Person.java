package Spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Component("personBean")
//@Scope("prototype")
public class Person {
//	@Autowired
//	@Qualifier("catBean")
	private Pet pet;
	
	@Value("${person.surname}")
	private String surname;
	
	@Value("${person.age}")
	private int age;
	

//	public Person(Pet pet, String surname, int age) {
//		super();
//		this.pet = pet;
//		this.surname = surname;
//		this.age = age;
//	}

//	@Autowired
//	public Person(@Qualifier("catBean") Pet pet) {
//		this.pet = pet;
//		System.out.println("Person bean is created");
//	}
	
	public Person( Pet pet) {
		this.pet = pet;
		System.out.println("Person bean is created");
	}
	
//	@Autowired
//	@Qualifier("catBean")
	public void setPet(Pet pet) {
		System.out.println("Set Pet");
		this.pet = pet;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		System.out.println("PersonBean is created");
	}


	public void callYourPet() {
		System.out.println("Hello my lovelly Pet!");
		pet.say();
	}
}
