package com.prakhar.parwal.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class ConsumerExample 
{
	public static void main(String... q)
	{
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Prakhar", "Sudeep", "Nikhil"));
		
		names.stream().forEach(new Consumer<String>() {

			@Override
			public void accept(String name) 
			{
				System.out.println(name.substring(3).toUpperCase());
			}
			
		});
	}
	
}
