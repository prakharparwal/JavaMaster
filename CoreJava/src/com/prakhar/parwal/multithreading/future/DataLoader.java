package com.prakhar.parwal.multithreading.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DataLoader {

	public Person loadDataOfPerson(Person person) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		int personID = person.getId();
		
		Future<List<BankAccount>> bankAccountsFuture = executorService.submit(new Callable<List<BankAccount>>() {

			public List<BankAccount> call() throws Exception {
				System.out.println(personID);
				Thread.currentThread().sleep(3000);
				List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
				bankAccounts.add(new BankAccount(1, "AXIS", "12345"));
				bankAccounts.add(new BankAccount(2, "SBI", "2345"));
				bankAccounts.add(new BankAccount(3, "HDFC", "6543"));
				
				return bankAccounts;
			}
		});
		
		Future<List<OnlineAccount>> onlineAccountsFuture = executorService.submit(new Callable<List<OnlineAccount>>() {

			
			@Override
			public List<OnlineAccount> call() throws Exception {
				Thread.currentThread().sleep(10000);
				System.out.println(personID);
				List<OnlineAccount> onlineAccounts = new ArrayList<OnlineAccount>();
				onlineAccounts.add(new OnlineAccount(1, "Facebook"));
				onlineAccounts.add(new OnlineAccount(2, "Twitter"));
				onlineAccounts.add(new OnlineAccount(3, "Google"));
				
				return onlineAccounts;
			}
			
		});
		
		try {
			person.setBankAccounts(bankAccountsFuture.get());
			System.out.println("Bank account loaded");
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			person.setOnlineAccounts(onlineAccountsFuture.get());
			System.out.println("Online account loaded");
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return person;
	}
	
	public Person loadBankDetails(Person person) {
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Bank details loaded");
		
		return person;
	}
	
	public Person loadOnlineAccountsDetails(Person person) {
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Online account details loaded");
		
		return person;
	}
	
}
