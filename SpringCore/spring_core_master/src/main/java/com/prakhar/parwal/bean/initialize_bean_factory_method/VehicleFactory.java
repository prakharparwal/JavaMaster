package com.prakhar.parwal.bean.initialize_bean_factory_method;

public class VehicleFactory {

	public static Vehicle getInstance()
	{
		System.out.println("Vehicle.getInstace()");
		return new Car();
	}
	
	public Vehicle getVehicle() {
		
		System.out.println("Vehicle.getVehicle()");
		return new Car();
	}
	
}
