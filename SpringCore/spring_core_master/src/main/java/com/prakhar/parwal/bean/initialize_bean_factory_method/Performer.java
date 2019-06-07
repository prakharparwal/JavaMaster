package com.prakhar.parwal.bean.initialize_bean_factory_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Performer {
	
	public static void main(String... q)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/prakhar/parwal/bean/initialize_bean_factory_method/spring-bean-config-intialize_bean_factory_method.xml");
		Employee e1 = (Employee)context.getBean("employeeBean");
		System.out.println(e1);
		Employee e2 = (Employee)context.getBean("employeeBean");
		System.out.println(e2);
	}
}
