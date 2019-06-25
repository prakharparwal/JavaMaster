package com.prakhar.parwal.method_chaining;

public class Performer {
	
	public static void main(String... q) {
		
		Television tv = new Television();
		Person person = new Person();
		
		//Method Chaining
		person.getRemote().startTV(tv);
	}

}
