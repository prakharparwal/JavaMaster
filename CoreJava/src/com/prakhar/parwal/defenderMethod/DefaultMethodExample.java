package com.prakhar.parwal.defenderMethod;

public class DefaultMethodExample 
{
	public static void main(String... q)
	{
		Person adultPerson = new AdultPerson();
		adultPerson.brushTeeth();
		adultPerson.knowDriving();
		
		Person child = new Infant();
		child.brushTeeth();
		child.knowDriving();
	}
}
