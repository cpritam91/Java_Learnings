package com.practice.multithreading;

public class OddPrinter implements Runnable {

private Object sharedLock;
	
	public OddPrinter(Object sharedLock) {
		this.sharedLock = sharedLock;
	}
	@Override
	public void run() {
		printOdd();
	}
	
	private void printOdd() {
		synchronized(sharedLock) {
			for(int i=1; i<10; i+=2) {
				System.out.println(i);
				try {
					sharedLock.notify();
					sharedLock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}System.out.println("OddPrinter Complete");
		}
	}

}
