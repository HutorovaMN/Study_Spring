package Spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component ("catBean")
//@Scope("prototype")
public class Cat implements Pet{
	public Cat(){
		System.out.println("CatBean is created");
	}
	public void say() {
		System.out.println("Mjay-Mjay");
	}
	
}
