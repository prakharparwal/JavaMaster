package com.prakhar.parwal.lamda;

public class Prac2 
{
	public static void main(String...strings)
	{
		Practice2 p = (firstNumber, sN)-> {
			System.out.println("First number is"+ firstNumber);
			System.out.println("Second number is"+sN);
			int valueAfterOperation = firstNumber*sN;
			System.out.println("Value after operation is"+valueAfterOperation);
			return valueAfterOperation;
		};
		System.out.println(p.perfomOperation(10, 20));
	}
}
