package com.prakhar.parwal.serializable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePerson {

	public void serializePerson(Person p) throws FileNotFoundException, IOException {
		
		//Serializing object and storing it in person.set file
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("person.ser")));
		oos.writeObject(p); 
		oos.close();

		
	}
}
