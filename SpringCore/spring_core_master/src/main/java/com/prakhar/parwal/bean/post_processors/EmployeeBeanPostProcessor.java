package com.prakhar.parwal.bean.post_processors;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class EmployeeBeanPostProcessor implements BeanPostProcessor {
	
	public Object postProcessBeforeInitailization(Object bean, String beanName)
	{
		System.out.println("EmployeeBeanPostProcessor.postProcessBeforeInitialization: "+beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName)
	{
		System.out.println("EmployeeBeanPostProcessor.postProcessAfterInitialization: "+beanName);
		return bean;
	}
}
