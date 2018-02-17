package com.practice.multithreading;

public class Producer implements Runnable {

	@Override
	public void run() {
		try {
			produce();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private synchronized void produce() throws InterruptedException {
		while (true) {
			synchronized (SharedUtils.tray) {
				if (SharedUtils.tray.size() == SharedUtils.capacity) {
					System.out.println("Tray is full. Producer going to sleep.");
					SharedUtils.tray.wait();
				}
				System.out.println("Producer is producing item.");
				Item item = new Item("Item " + SharedUtils.tray.size());
				SharedUtils.tray.add(item);
				System.out.println(item.getName() + " produced.");
				SharedUtils.tray.notify();
				Thread.sleep(1000);
			}
		}
	}
}
