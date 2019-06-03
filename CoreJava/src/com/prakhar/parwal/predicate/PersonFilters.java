package com.prakhar.parwal.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonFilters 
{
	public static Predicate<Person> personsAbove24()
	{
		return p -> p.getAge() > 24;
	}
	
	public static Predicate<Person> personsEquals25()
	{
		return i -> i.getAge() == 25;
	}
	
	public static Predicate<Person> personsLessthan25()
	{
		return q -> q.getAge() < 25;
	}
	
	public static Predicate<Person> personsLessThan30()
	{
		return p -> p.getAge() < 30;
	}
	
	public static Predicate<Person> personGreaterThan20()
	{
		return p -> p.getAge() > 20;
	}
	
	public static Predicate<Person> personsLessThan30AndGreaterThan20()
	{
		return personGreaterThan20().and(personsLessThan30());
	}
	
	public static List<Person> filterEmployee(List<Person> persons, Predicate<Person> predicate)
	{
		return persons.stream().filter(predicate).collect(Collectors.toList());
	}
	
}
