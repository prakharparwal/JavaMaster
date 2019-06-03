package com.prakhar.parwal.lamda;

import com.prakhar.parwal.functionalInterface.FirstFunctionalInterface;

public class LamdaExample 
{
	
	//Conventional way
	public static void main(String... q)
	{
		print(new FirstFunctionalInterface() {
			
			@Override
			public void printMessage(String message) {
				System.out.println("Message is"+message);
			}
		});
		
		
		print(
				
				(message)-> /*printMessage*/{
					System.out.println("X");
					System.out.println(message.toUpperCase());
					
			}
		
				);
		
	}
	
	public static void print(FirstFunctionalInterface ffi)
	{
		ffi.printMessage("the prakhar parwal");
	}
	
}
