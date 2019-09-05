package com.prakhar.parwal.multithreading;

public class Performer_CreatingThread_ImplementingRunnable {

	public static void main(String... q) {
		
		Thread t = new Thread(new MyThread());
		t.start();
		
		for(int i =0; i<=10; i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
