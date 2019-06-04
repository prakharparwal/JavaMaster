package com.prakhar.parwal.ways_to_create_object;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Performer {

	public static void main(String... q)
	{
		// 1
		//Using new keyword 
		Employee e1 = new Employee();
		
		// 2
		//Using newInstance() of class Class
		try {
			Employee e2 = (Employee)Class.forName("Employee").newInstance();
			Employee e3 = Employee.class.newInstance();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 3 
		//Using newInstance() of constructor class 
		
		try {
			
			Constructor<Employee>employeeConstructor = Employee.class.getDeclaredConstructor();
			Employee e4 = employeeConstructor.newInstance();
		
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {

			e.printStackTrace();
		}
		
		// 4
		// Using cloning
		
		
		
	}
	
}
