package com.prakhar.parwal.multithreading.future;

public class Performer {

	public static void main(String... q) {
		
		Person person = new Person(1, "Test Person");
		
		DataLoader dl = new DataLoader();
		dl.loadDataOfPerson(person);
		
		System.out.println("Data loading completed");
	}
}
