package com.prakhar.parwal.functionalInterface;

public class AnonymousInnerClass 
{
	public static void main(String... q)
	{
		new Thread(new Runnable(){

			public void run() 
			{
				System.out.println("New Thread run using functional interface");
			}
			
		}).start();
	}
}
