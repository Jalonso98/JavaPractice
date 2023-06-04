/**
 * 
 */
package com.alonso.lambdas.threads;

/**
 * @author Jalonso98
 *
 */
public class TestThreadCounter {
	
	public static void main(String[] args) {
		
		//Code without lambdas
//		Thread thread = new Thread(new ThreadCounter());
//		thread.start();
		
		//Lambdas code
		Runnable runnableCounter = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread threadCounter = new Thread(runnableCounter);
		threadCounter.start();
		
	}

}
