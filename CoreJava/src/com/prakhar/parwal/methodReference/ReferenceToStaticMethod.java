package com.prakhar.parwal.methodReference;

import com.prakhar.parwal.methodReference.Operation;

//1. Return type void

public class ReferenceToStaticMethod 
{
	public static void main(String...strings)
	{
		print(()-> System.out.println("Prakhar"));
	}
	
	public static void print(Operation operation)
	{
		operation.doprint();
	}
}
