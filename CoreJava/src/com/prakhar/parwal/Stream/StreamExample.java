package com.prakhar.parwal.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class StreamExample
{
	public static void main(String... q)
	{
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Prakhar", "Sudeep", "Nikhil"));
		
		
	/*	names.stream().forEach((name)->{
			if(name.equals("Prakhar"))
				names.add("Krishan");
		});
		
		System.out.println(names);
		*/
		//Conventional way
		/*for (String name : names) 
		{
			if(name.equals("Prakhar"))
			{
				System.out.println("Prakhar is present");
				names.add("Parwal");
			}
		}*/
				
		//Streams
		names.stream().map(new Function<String, String>() {

			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
				return t.toUpperCase();
			}
		}).forEach( p -> System.out.println(p));
		
		names.forEach((p)-> System.out.println(p));
		
		//Example proving a new local collection is prepared 
	/*	names.stream().map(new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return 10;
			}
			
		}).forEach( p -> System.out.println(p));*/
		
		
/*		//Example of type of locally prepared collection
		ArrayList<Integer> numbers = (ArrayList<Integer>) names.stream().map(new Function<String, Integer>() 
										{
											@Override
											public Integer apply(String t) {
												return 10;
											}
											
										}).collect(Collectors.toList());
									
	for (Integer number : numbers) {
		System.out.println(number);
	}
*/
		
/*	System.out.println(names.stream().anyMatch(new Predicate<String>() {

			@Override
			public boolean test(String name) {
				// TODO Auto-generated method stub
				return name.equals("Nikhil");
			}
			
		}));*/
		
		/*names.add("Prakhar");
		names.stream().distinct().forEach(p -> System.out.println(p));*/
		
/*		names.stream().forEach(p -> System.out.println(p));*/
		
		//Creating a collection using stream 
		
		/*List<Integer> numbers = (List<Integer>)Stream.of(1, 2).collect(Collectors.toList());
		for (Integer number : numbers) {
			System.out.println(number);
		}*/
		
		
	}
}
