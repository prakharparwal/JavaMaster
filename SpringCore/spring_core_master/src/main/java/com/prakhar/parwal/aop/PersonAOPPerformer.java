package com.prakhar.parwal.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class PersonAOPPerformer {

	public static void main(String... q) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/prakhar/parwal/aop/spring-bean-config-aop.xml");
		Person person = (Person) appContext.getBean("personBean");
		
		new PersonDAO().addPerson(person);
		
	}
}
