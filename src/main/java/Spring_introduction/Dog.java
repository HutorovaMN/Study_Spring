package Spring_introduction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Dog implements Pet {
	public Dog() {
		System.out.println("DogBean is created");
	}
	public void say() {
		System.out.println("Wau-Wau");
	}
	@PostConstruct
	public void init() {
		System.out.println("Class Dog INITTTT");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Class Dog DESTROYYY");
	}
}
