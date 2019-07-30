package com.prakhar.parwal.serializable;

import java.io.Serializable;

public class Person implements Serializable {

	private int id;
	private String name;
	private String age;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	
}
