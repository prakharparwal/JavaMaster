package com.prakhar.parwal.method_chaining;

public class Person {
	
	public Person getPerson() {
		return new Person();
	}
	
	public Remote getRemote() {
		System.out.println("Person got remote");
		return new Remote();
	}
}