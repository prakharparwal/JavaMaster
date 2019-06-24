package com.prakhar.parwal.builder;

public class Performer {

	public static void main(String... q) {
		
		Vehicle bike = new Vehicle.VehicleBuilder(new Engine(), 2)
							.setMirrors(2)
								.build();
		
		System.out.println(bike);
	}
}
