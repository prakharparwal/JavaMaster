package com.prakhar.parwal.predicate; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample 
{
	public static void main(String... q)
	{
		ArrayList<Person> persons = new ArrayList<Person>(){{
			
			add(new Person(1, "Prakhar", 25));
			add(new Person(2, "Sudeep", 24));
			add(new Person(3, "Nikhil", 24));
			
		}};
		
		//persons.stream().filter(true/false).collect 
		System.out.println("Persons with age 24 :"+persons.stream().filter(new Predicate<Person>() {

			@Override
			public boolean test(Person p) 
			{
				return p.getAge() == 24;
			}
		
		}).collect(Collectors.toList()));
		
		
		persons.stream().filter(new Predicate<Person>() {
			@Override
			public boolean test(Person p) {
				return p.getAge() == 24;
			}
		}).forEach(new Consumer<Person>() {
			@Override
			public void accept(Person p) 
			{
				System.out.println("Persons [name in upper case] with age equals to 24 are:"+p.getName().toUpperCase());
			}
		});
		
		
		
		
		
		
		
		
		
		//PersonFilters
		
		persons.stream().filter(PersonFilters.personsAbove24()).collect(Collectors.toList());
		persons.stream().filter(PersonFilters.personsEquals25()).collect(Collectors.toList());
		
	
		PersonFilters.filterEmployee(persons, PersonFilters.personsAbove24());
		
		
		
		
		
	}
}
