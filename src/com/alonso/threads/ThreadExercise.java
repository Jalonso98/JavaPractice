/**
 * 
 */
package com.alonso.threads;

class Reductor extends Thread {
	private int counter;
	private int goal = 0;
	private int milisenconds;
	
	public Reductor (String name, int start, int seconds) {
		super(name);
		this.counter = start;
		this.milisenconds = (seconds*1000);
	}
	
	@Override
	public synchronized void run() {
		try {
			do {
				Thread.sleep(milisenconds);
				System.out.println(this.getName() + " -> " +(counter--));
			} while(counter != goal);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getName() + " has finished");
	}
	
	
	
}

/**
 * @author Jalonso98
 *
 */
public class ThreadExercise {
	public static void main(String[] args) {
		Reductor reductor1 = new Reductor("Reductor 1", 10, 3);
		Reductor reductor2 = new Reductor("Reductor 2", 5, 5);
		
		reductor1.start();
		reductor2.start();
		
	}
}
