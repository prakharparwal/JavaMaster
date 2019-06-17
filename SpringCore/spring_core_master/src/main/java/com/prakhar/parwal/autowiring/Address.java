package com.prakhar.parwal.autowiring;

public class Address {

	private int id;
	private String fullAddress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", fullAddress=" + fullAddress + "]";
	}
	
}
