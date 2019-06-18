package com.prakhar.parwal.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringPerformer {

	public static void main(String... q) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/prakhar/parwal/autowiring/spring-bean-config-autowiring.xml");
		Employee emp = (Employee) context.getBean("employeeBean");
		System.out.println(emp);
	}
}
