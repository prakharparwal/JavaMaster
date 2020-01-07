package com.prakhar.parwal.multithreading.future;

public class BankAccount {

	private int id;
	private String bankName;
	private String accountNumber;
	
	public BankAccount() {
		super();
	}
	
	public BankAccount(int id, String bankName, String accountNumber) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
}
