package com.prakhar.parwal.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Performer {

	public static void main(String... q)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/prakhar/parwal/dependency_injection/spring-bean-configuration-dependency_injection.xml");
		Person p = (Person) ctx.getBean("personBean");
		System.out.println(p);
		System.out.print(p.getProperties().getProperty("propKey1"));
	}
}
