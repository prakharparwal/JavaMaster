package com.prakhar.parwal.creational.prototype;

public class Employee implements Cloneable {

	@Override
	public Employee clone() {
		
		Employee clonedEmployee = null;
		
		try {
			clonedEmployee = (Employee)super.clone();

		} catch(CloneNotSupportedException ce) {
			System.out.println("Exception occoured while clonning");
		
		}
		
		return clonedEmployee;
	}
}
