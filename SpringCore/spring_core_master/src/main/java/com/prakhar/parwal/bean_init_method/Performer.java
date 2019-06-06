package com.prakhar.parwal.bean_init_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Performer {
	
	public static void main(String... q)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/prakhar/parwal/bean_init_method/spring-bean-config-init_method.xml");
		Employee e1 = (Employee)context.getBean("employeeBean");
		System.out.println(e1);
	}
}
