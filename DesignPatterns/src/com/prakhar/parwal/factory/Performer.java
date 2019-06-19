package com.prakhar.parwal.factory;

public class Performer {

	public static void main(String... q) {
		
		Bike twiser = (Bike) VehicleFactory.getInstance("Bike");
	}
}
