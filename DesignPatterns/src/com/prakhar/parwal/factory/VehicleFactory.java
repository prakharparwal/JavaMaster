package com.prakhar.parwal.factory;

public class VehicleFactory {

	public static Vehicle getInstance(String type) { 
		
		Vehicle vehicle = null;
		
		switch(type) {
		
			case "Bike": {
				vehicle = new Bike();
			}
			
			case "Car": {
				vehicle = new Car();
			}
			
		}
		
		return vehicle;
	}
}
