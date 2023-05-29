package com.alonso.threads;

class SyncCounter {
	static int counter = 10;
	
	public synchronized static void decrement() { //Only one thread can use this method at once
		counter --;
		System.out.println(counter);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Decreaser extends Thread {
	@Override
	public void run() {
		System.out.println("Decreasing SyncCounter");
		SyncCounter.decrement();
	}
}

/**
 * @author Jalonso98
 *
 */
public class SynchronizedThread {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Decreaser().start();
		}
	}
}
