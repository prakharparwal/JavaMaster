package com.prakhar.parwal.bean.post_processors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Performer {
	
	public static void main(String... q)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/prakhar/parwal/bean/post_processors/spring-bean-config-post_processors.xml");
		Employee e1 = (Employee)context.getBean("employeeBean");
		System.out.println(e1);
	}
}
