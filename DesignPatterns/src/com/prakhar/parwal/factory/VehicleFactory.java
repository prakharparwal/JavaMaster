package com.prakhar.parwal.factory;

public class VehicleFactory {

	public static Vehicle getInstance(String type) { 
		
		Vehicle vehicle = null;
		
		switch(type) {
		
			case "Bike": {
				vehicle = new Bike();
				break;
			}
			
			case "Car": {
				vehicle = new Car();
				break;
			}
			
		}
		
		return vehicle;
	}
}
