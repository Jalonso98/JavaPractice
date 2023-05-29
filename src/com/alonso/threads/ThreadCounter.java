package com.alonso.threads;

class Counter implements Runnable {
	
	private int value;
	
	public Counter(int value) {
		this.value = value;
	}



	@Override
	public void run() {
		for (int i = value; i >= 0 ; i--) {
			System.out.printf("%s Value %d\n",Thread.currentThread().getName(), i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

/**
 * @author Jalonso98
 *
 */
public class ThreadCounter {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Counter(10), "Thread 1");
		Thread thread2 = new Thread(new Counter(20), "Thread 2");
		
		System.out.println("Begin");
		
		thread.start();
		thread2.start();
		thread.join();
		thread2.join();
		
		System.out.println("End");
	}
}
