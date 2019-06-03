package com.prakhar.parwal.lamda.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class LamdaComparator 
{
	public static void main(String...strings)
	{
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Prakhar"));
		persons.add(new Person("Sudeep"));
		persons.add(new Person("Nikhil"));
		
		
		Collections.sort(persons,(p1, p2)->{
			return p1.getName().compareTo(p2.getName());
		});
		
		for (Person person : persons) {
			System.out.println(person.getName());
		}
		
	}
}
