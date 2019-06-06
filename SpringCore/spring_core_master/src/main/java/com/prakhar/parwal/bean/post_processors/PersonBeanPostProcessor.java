package com.prakhar.parwal.bean.post_processors;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class PersonBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName)
	{
		System.out.println("PersonBeanPostProcessor.postProcessBeforeInitialization: "+beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName)
	{
		System.out.println("PersonBeanPostProcessor.postProcessAfterInitialization: "+beanName);
		return bean;
	}
}
