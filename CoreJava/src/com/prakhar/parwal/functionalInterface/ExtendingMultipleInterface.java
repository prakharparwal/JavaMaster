package com.prakhar.parwal.functionalInterface;


/*
 * 1. One abstract method 
 * 2. n no. of default methods
 * */

@FunctionalInterface
public interface ExtendingMultipleInterface extends FirstFunctionalInterface
{
	//1.
	//public void doPrint(String message);
	
	//2.
	default public void printGreeting(String greeting)
	{
		System.out.println(greeting);
	}
	
	public default void doAbuse()
	{
		System.out.println("********");
	}
	
}
