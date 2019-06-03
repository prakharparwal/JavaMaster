package com.prakhar.parwal.defenderMethod.multipleInheritanceAmbiguity;

public interface InterfaceB 
{
	default public void myMethod()
	{
		System.out.println("Default method of interface B");
	}
	
	default public void doPrint(String name, int age)
	{
		System.out.println(name+age);
	}
}
