package com.prakhar.parwal.builder;

public class Vehicle {

	//Required
	private Engine engine;
	private int wheels;
	
	//Optional 
	private int mirrors;
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getMirrors() {
		return mirrors;
	}

	public void setMirrors(int mirrors) {
		this.mirrors = mirrors;
	}

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
			 this.mirrors = mirrors;
			 return this;
		}
		
		public Vehicle build()
		{
			Vehicle vehicle = new Vehicle(this);
			return vehicle;
		}
		
	}

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", wheels=" + wheels + ", mirrors=" + mirrors + "]";
	}
	
	
	
}
