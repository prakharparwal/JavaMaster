package com.prakhar.parwal.creational.abstract_factory;

public class VehicleFactoryProvider {

	public static VehicleFactory getVehicleFactory(FactoryType factoryType) {
		
		VehicleFactory vehicleFactory = null;
		
		switch(factoryType) {
			
			case TWO_WHEELER_FACTORY: {
				vehicleFactory = new TwoWheelerFactory();
			}
			case FOUR_WHEELER_FACTORY: {
				vehicleFactory = new FourWheelerFactory();
			}
				
		}
		
		return vehicleFactory;
	}
}
