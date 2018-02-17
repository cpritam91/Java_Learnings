package com.practice.multithreading;

@SuppressWarnings("restriction")
public abstract class Application extends javafx.application.Application{

	public static void main(String[] args) throws InterruptedException {
	//static {	
		Thread producer = new Thread(new Producer());
		Thread consumer = new Thread(new Consumer());
		
		producer.start();
		consumer.start();
		
		try {
			producer.join();consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//}

}
