package com.prakhar.parwal.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Performer_Person {

	public static void main(String... q) {
		
		Person prakhar = new Person(1, "Prakhar", Gender.MALE);
		Person sudeep = new Person(2, "Sudeep", Gender.MALE);
		Person manveen = new Person(3, "Manveen", Gender.FEMALE);
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(prakhar);
		persons.add(sudeep);
		persons.add(manveen);
	
		persons.stream().filter( (person)-> person.getGender() == Gender.MALE)
			.forEach((person)-> System.out.println("Male persons are: "+person.getName()));
	}
}
