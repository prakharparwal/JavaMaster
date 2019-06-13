package com.prakhar.parwal.aop;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

	private List<Person> persons = new ArrayList<Person>();

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
}
