package com.prakhar.parwal.defenderMethod;

public class Infant implements Person 
{

	@Override
	public void knowDriving() 
	{
		System.out.println("Don't know driving");
	}
	
	@Override
	public void brushTeeth()
	{
		System.out.println("Don't know how to brush");
	}

}
