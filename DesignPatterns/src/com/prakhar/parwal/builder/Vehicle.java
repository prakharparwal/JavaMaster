package com.prakhar.parwal.builder;

public class Vehicle {

	//Required
	private Engine engine;
	private int wheels;
	
	//Optional 
	private int mirrors;
	
	public Vehicle(VehicleBuilder vehicleBuilder)
	{
		this.engine = vehicleBuilder.engine;
		this.wheels = vehicleBuilder.wheels;
		this.mirrors = vehicleBuilder.mirrors;
	}
	
	public static class VehicleBuilder
	{
		
		//Required
		private Engine engine;
		private int wheels;
		
		//Optional 
		private int mirrors;
		
		public VehicleBuilder(Engine engine, int wheels)
		{
			this.engine = engine;
			this.wheels = wheels;
		}
		
		public VehicleBuilder setMirrors(int mirrors) {
			 this.setMirrors(mirrors);
			 return this;
		}
		
		public Vehicle build()
		{
			return new Vehicle(this);
		}
		
	}

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", wheels=" + wheels + ", mirrors=" + mirrors + "]";
	}
	
	
	
}
