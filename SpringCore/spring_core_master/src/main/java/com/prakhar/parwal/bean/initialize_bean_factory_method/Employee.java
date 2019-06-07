package com.prakhar.parwal.bean.initialize_bean_factory_method;

public class Employee {

	
	public static Employee getEmployee() {
		
		System.out.println("Factory method is called to instantiate object");
		return new Employee();
	}
	
}
