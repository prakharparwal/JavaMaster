package com.prakhar.parwal.defenderMethod.multipleInheritanceAmbiguity;

public interface InterfaceA 
{
	default public void myMethod()
	{
		System.out.println("Default method of interface A");
	}
	
	default public void doPrint(String name)
	{
		System.out.println(name);
	}
}
