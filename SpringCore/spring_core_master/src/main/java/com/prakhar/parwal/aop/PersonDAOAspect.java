package com.prakhar.parwal.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PersonDAOAspect {

	@Before("execution (* com.prakhar.parwal.aop.PersonDAO.addPerson(..))")
	public void beforeSave() {
		System.out.println("Before Person save___ PersonAspect.beforeSave() ");
	}
	
}
