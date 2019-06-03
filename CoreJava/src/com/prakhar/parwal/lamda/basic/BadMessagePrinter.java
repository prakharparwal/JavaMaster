package com.prakhar.parwal.lamda.basic;

public class BadMessagePrinter 
{
	public static void main(String...strings)
	{
		print(() -> System.out.println("**********"));
	}
	
	public static void print(ConsolePrinter consolePrinter)
	{
		consolePrinter.printOnConsole();
	}
}
