package com.prakhar.parwal.multithreading;

public class Performer_CreatingThread_ExtendingThread extends Thread {

	public static void main(String... q) {
		
		MyThread2 mt = new MyThread2();
		mt.start();
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
