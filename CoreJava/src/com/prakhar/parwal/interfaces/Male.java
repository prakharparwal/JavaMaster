package com.prakhar.parwal.interfaces;

public class Male implements Human {

	public static final int numberOfEyes = 8;
	
	@Override
	public void eat() {
		System.out.println("Eats");
		System.out.println(numberOfEyes);
		
	}

	
}
