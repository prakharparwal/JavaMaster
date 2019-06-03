package com.prakhar.parwal.defenderMethod.multipleInheritanceAmbiguity;

public class Impl implements InterfaceA, InterfaceB
{

	@Override
	public void myMethod() 
	{
		System.out.println(InterfaceB.super.toString());
		InterfaceB.super.myMethod();
	}
	
	public static void main(String...strings)
	{
		Impl i = new Impl();
		i.myMethod();
		
		i.doPrint("Prakhar");
		i.doPrint("Prakhar", 25);
	}
}
