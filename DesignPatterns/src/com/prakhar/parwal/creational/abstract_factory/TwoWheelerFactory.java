package com.prakhar.parwal.creational.abstract_factory;

public class TwoWheelerFactory implements VehicleFactory {

	public Vehicle getVehicle(TwoWheelerVehicleType vehicleType) {
		
		Vehicle vehicle = null;
		
		switch(vehicleType) {
			case BIKE: {
				vehicle = new Bike();
				break;
			}
			
			case MOPED: {
				vehicle = new Moped();
				break;
			}
		}
		
		return vehicle;
	}
}
