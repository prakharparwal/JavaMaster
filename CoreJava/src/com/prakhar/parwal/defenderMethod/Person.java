package com.prakhar.parwal.defenderMethod;

public interface Person 
{
	public void knowDriving();
	
	default public void brushTeeth()
	{
		System.out.println("Brush Brush");
	}
}
