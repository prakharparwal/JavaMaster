package com.prakhar.parwal.multithreading.future;

import java.util.List;

public class Person {

	private int id;
	private String name;
	private List<BankAccount> bankAccounts;
	private List<OnlineAccount> onlineAccounts;
	
	public Person() {
		super();
	}
	
	public Person(int id, String name, List<BankAccount> bankAccounts, List<OnlineAccount> onlineAccounts) {
		super();
		this.id = id;
		this.name = name;
		this.bankAccounts = bankAccounts;
		this.onlineAccounts = onlineAccounts;
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

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
	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	public List<OnlineAccount> getOnlineAccounts() {
		return onlineAccounts;
	}
	public void setOnlineAccounts(List<OnlineAccount> onlineAccounts) {
		this.onlineAccounts = onlineAccounts;
	}
	
	
}
