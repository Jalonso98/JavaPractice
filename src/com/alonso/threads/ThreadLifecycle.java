package com.alonso.threads;

class CounterStates implements Runnable {
	
	private int value;
	
	public CounterStates(int value) {
		this.value = value;
	}



	@Override
	public void run() {
		System.out.printf("State %s\n",Thread.currentThread().getState());
		for (int i = value; i >= 0 ; i--) {
			System.out.printf("State %s --",Thread.currentThread().getState());
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
public class ThreadLifecycle {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new CounterStates(10), "Thread 1");
		System.out.printf("State %s\n",thread.getState());
		thread.start();	
		thread.join();
		System.out.printf("State %s\n",thread.getState());
	}
}
