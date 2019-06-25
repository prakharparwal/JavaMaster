package com.prakhar.parwal.creational.singleton;

public class EarlyInitialization {

	private static EarlyInitialization instance = new EarlyInitialization();
	
	private EarlyInitialization() {
		
	}
	
	public static EarlyInitialization getInstance() {
		return instance;
	}
}
