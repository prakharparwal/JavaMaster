package com.prakhar.parwal.creational.prototype;

public class Performer {

	public static void main(String... q) {
		
		Employee e1 = new Employee();
		Employee e2 = e1.clone();
		
		System.out.println(e1);
		System.out.println(e2);
		
	}
}
