package Spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties")
//@Scope("prototype")
//@ComponentScan("Spring_introduction")
public class MyConfig {

	@Bean
	public Pet catBean() {
//		System.out.println("!!!!!BeanCat");
		return new Cat();
	}

	@Bean
	public Person personBean() {
		return new Person(catBean());
	}

}
