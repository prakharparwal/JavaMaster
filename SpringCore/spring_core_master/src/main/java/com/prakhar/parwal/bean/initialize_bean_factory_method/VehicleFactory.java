package com.prakhar.parwal.bean.initialize_bean_factory_method;

public class VehicleFactory {

	public static Vehicle getInstance()
	{
		return new Car();
	}
}
