package com.prakhar.parwal.aop;

import java.util.List;

public class PersonDAO {

	private List<Person> persons = new PersonRepository().getPersons();
	
	public void addPerson(Person p) {
		persons.add(p);
	}
	
}
