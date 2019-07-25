package com.prakhar.parwal.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePerson {

	public Person deserializePerson() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//Deserializing object 
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("person.ser"))); 
		Person p = (Person) ois.readObject(); 
		System.out.println(p);
		return p;
	}
}
