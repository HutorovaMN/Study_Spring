package Spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext3.xml");
		Dog myDog = context.getBean("dog", Dog.class);
		Dog yourDog = context.getBean("dog", Dog.class);
		System.out.println("Ssilka!!!!!!!!!!!!!!!!   " + myDog.equals(yourDog));
		myDog.init();
		yourDog.destroy();
		context.close();
	}

}
