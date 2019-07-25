package com.prakhar.parwal.serializable;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Performer {

	public static void main(String... q) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		DeserializePerson dp = new DeserializePerson();
		dp.deserializePerson();
		
	}
}
