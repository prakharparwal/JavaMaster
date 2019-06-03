package com.prakhar.parwal.functionalInterface;


/*
 * 1. Abstracts method with different return types
 * 2. Abstract methods with different parameters but same name and return type 
 * 3. Abstract methods with different parameters and return types but same name 
 * 
 * */

@FunctionalInterface
public interface MultipleAbstractMethod 
{

	public void printGreeting();
	
	//1.
	//public String getName();
	//public int getNumber();
	
	//2. 
	// public void printGreeting(String greeting);

	//3.
	//public String printGreeting(String greeting1, String greeting2);
	
}
