package com.prakhar.parwal.builder;

public class Performer {

	public static void main(String... q) {
		
		Engine engine = new Engine();
		Vehicle bike = new Vehicle.VehicleBuilder(engine, 2)
							.setMirrors(2)
								.build();
		
		System.out.println(bike);
	}
}
