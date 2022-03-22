package Spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfAnnot {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
		{
			Person person = context.getBean("personBean", Person.class);
			System.out.println(person.getSurname());
			System.out.println(person.getAge());
			person.callYourPet();
//			Cat myCat = context.getBean("catBean", Cat.class);
//			myCat.say();
//			
//			Dog dog = context.getBean("dog", Dog.class);
//			dog.say();

			context.close();
		}

	}

}
