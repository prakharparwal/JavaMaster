package com.prakhar.parwal.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterExample 
{
	public static void main(String... q)
	{
		ArrayList<String> names =   new ArrayList<String>(Arrays.asList("Prakhar", "Sudeep", "Nikhil"));
		
		//Conventional way
		for (String name : names) 
		{
			if(name.equals("Prakhar"))
			{
				System.out.println("Prakhar is present");
				System.out.println(name.toUpperCase());
				names.add("Parwal");
			}
				
		}
		
		//Predicate way 
		names.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String name) {
				// TODO Auto-generated method stub
				return name.equals("Prakhar");
			}
		}).forEach(name -> System.out.println(name));
		
		//
		ArrayList<Integer> ids = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		ids.stream().filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer id) {
				// TODO Auto-generated method stub
				return id != 2;
			}	
		}).forEach(new Consumer<Integer>() {

			public void accept(Integer id) {
				id = id*10;
				System.out.println(id);
			}
			
		});
	
		
		ArrayList<Person> persons = new ArrayList<Person>();
		Person prakhar = new Person(1, "Prakhar", 25);
		Person sudeep = new Person(2, "Sudeep", 24);
		Person nikhil = new Person(1, "Nikhil", 24);
		persons.add(prakhar);
		persons.add(sudeep);
		persons.add(nikhil);
		
		//
		persons.stream().filter(new Predicate<Person>(){

			@Override
			public boolean test(Person p) 
			{
				return p.getAge() == 24;
			}
			
		}).forEach( new Consumer<Person>() {

			@Override
			public void accept(Person p) {
				System.out.println(p.getName());
			}
			
		});
		
		//
		persons.stream().filter(new Predicate<Person>() {
			@Override
			public boolean test(Person p) 
			{
				return p.getAge() == 24;
			}
		}).collect(Collectors.toList()).forEach(p -> System.out.println(p.getName()));
		
		
		//
		persons.stream().filter(new Predicate<Person>() {
			@Override
			public boolean test(Person per) {
				return per.getAge() == 24;
			}
		}).forEach(p -> System.out.println(p.getName()));
		
		//
		persons.stream().forEach(p -> System.out.println(p.getName()));

		//
		persons.forEach(p -> System.out.println(p.getName()));
		
		//
		ArrayList<Person> personAbove24 = (ArrayList<Person>) persons.stream().filter(new Predicate<Person>() {

											@Override
											public boolean test(Person p) {
												return p.getAge() > 24;
											}
												
											}).collect(Collectors.toList());
		
		
		for(Person per: personAbove24)
		{
			System.out.println(per.getName());
			
		}
		
		
		
		
		
		
		
		
		
	}
}
