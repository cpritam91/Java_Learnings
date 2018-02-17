package com.practice.multithreading;

public class Application2 {

	public static void main(String[] args) {
		Object lock = new Object();
		Thread t1 = new Thread(new EvenPrinter(lock));
		Thread t2 = new Thread(new OddPrinter(lock));
		

		t2.start();
		t1.start();
	}

}
