package com.prakhar.parwal.lamda;

public class MyMultiplier 
{
	public static void main(String... q)
	{
		int valueAfterOperation = new NumericOperations() {
			public int getValuesAfterOperation(int firstNumber, int secondNumber) {
				return firstNumber+secondNumber;
			}
		}.getValuesAfterOperation(10, 20);
		
		System.out.println(valueAfterOperation);
		
		NumericOperations operation = (firstNumber, secondNumber) -> {
				return firstNumber * secondNumber;
		};
		
		valueAfterOperation = operation.getValuesAfterOperation(10,  20);
		
		
	}
}
