package com.prakhar.parwal.creational.factory;

public class Performer {

	public static void main(String... q) {
		
		Bike twiser = (Bike) VehicleFactory.getInstance("Bike");
		System.out.println(twiser);
	}
}
