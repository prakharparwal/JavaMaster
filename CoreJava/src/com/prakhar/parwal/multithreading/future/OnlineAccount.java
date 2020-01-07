package com.prakhar.parwal.multithreading.future;

public class OnlineAccount {

	private int id;
	private String platformName;
	
	public OnlineAccount() {
		super();
	}

	public OnlineAccount(int id, String platformName) {
		super();
		this.id = id;
		this.platformName = platformName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

}
