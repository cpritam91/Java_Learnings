package com.practice.multithreading;

public class Consumer implements Runnable {

	@Override
	public void run() {
		try {
			consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void consume() throws InterruptedException {

		while (true) {
			synchronized (SharedUtils.tray) {
				if (SharedUtils.tray.isEmpty()) {
					System.out.println("Tray is empty. Consumer going to sleep.");
					SharedUtils.tray.wait();
				}
				System.out.println("Consumer is consuming item.");
				Item item = SharedUtils.tray.removeFirst();
				System.out.println(item.getName() + " consumed.");
				SharedUtils.tray.notify();
				Thread.sleep(1000);
			}
		}
	}
}
