package com.alonso.threads;

class InheritanceThread extends Thread {

	public InheritanceThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("Thread %s index %d \n", getName(),i);
			try {
				Thread.sleep(100);
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
public class ThreadBuilder {
	public static void main(String[] args) {
		InheritanceThread inheritanceThread1 = new InheritanceThread("Thread 1");
		InheritanceThread inheritanceThread2 = new InheritanceThread("Thread 2");
		inheritanceThread1.run(); //run executes in sequential order
		inheritanceThread2.run();
//		inheritanceThread1.start(); //start executes in parallel order
//		inheritanceThread2.start();
	}
}
