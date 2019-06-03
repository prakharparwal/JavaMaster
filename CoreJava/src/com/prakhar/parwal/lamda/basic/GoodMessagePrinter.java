package com.prakhar.parwal.lamda.basic;

public class GoodMessagePrinter 
{
	public static void main(String...strings)
	{
		new GoodMessagePrinter().print(new ConsolePrinter() {
			
			@Override
			public void printOnConsole() {
				System.out.print("Good Message Printer");
			}
		});
	}
	
	public void print(ConsolePrinter consolePrinter)
	{
		consolePrinter.printOnConsole();
	}
}
