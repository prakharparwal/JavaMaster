package com.prakhar.parwal.lamda;

public class Prac1 
{
	public static void main(String...strings)
	{
		Practice1 p = (name)-> {return name.toUpperCase();};
		p.doSomething("prakhar");
		
		System.out.print(p.doSomething("nikhil"));
		
	}
}
