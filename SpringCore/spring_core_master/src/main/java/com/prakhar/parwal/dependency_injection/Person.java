package com.prakhar.parwal.dependency_injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private int id;
	private String name;
	private Address address;
	private List<Vehicle> vehicles;
	private Set<BankAccount> bankAccounts;
	
	//Custom object
	private Map<Integer, CustomObject> customObjects;
	
	private Properties properties;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	
	public Set<BankAccount> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(Set<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	
	public Map<Integer, CustomObject> getCustomObjects() {
		return customObjects;
	}
	public void setCustomObjects(Map<Integer, CustomObject> customObjects) {
		this.customObjects = customObjects;
	}
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", vehicles=" + vehicles
				+ ", bankAccounts=" + bankAccounts + ", customObjects=" + customObjects + ", properties=" + properties
				+ "]";
	}
	
}
