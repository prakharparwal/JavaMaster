package com.prakhar.parwal.creational.abstract_factory;

public class Performer {

	public static void main(String[] args) {

		TwoWheelerFactory twoWheelerFactory = (TwoWheelerFactory) VehicleFactoryProvider.getVehicleFactory(FactoryType.TWO_WHEELER_FACTORY);
		Vehicle twister = twoWheelerFactory.getVehicle(TwoWheelerVehicleType.BIKE);
		Vehicle activa = twoWheelerFactory.getVehicle(TwoWheelerVehicleType.MOPED);
	}

}
