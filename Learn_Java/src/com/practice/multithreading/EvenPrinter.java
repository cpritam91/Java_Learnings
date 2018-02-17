package com.practice.multithreading;

public class EvenPrinter implements Runnable {

	private Object sharedLock;
	
	public EvenPrinter(Object sharedLock) {
		this.sharedLock = sharedLock;
	}
	@Override
	public void run() {
		printEven();
	}
	
	private void printEven() {
		synchronized(sharedLock) {
			for(int i=2; i<=10; i+=2) {
				System.out.println(i);
				try {
					sharedLock.notify();
					sharedLock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}System.out.println("EvenPrinter Complete");
		}
	}

}
