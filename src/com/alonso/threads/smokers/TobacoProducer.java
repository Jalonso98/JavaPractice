/**
 * 
 */
package com.alonso.threads.smokers;

import java.util.Random;

/**
 * @author Jalonso98
 *
 */
public class TobacoProducer extends Thread {
	
	private Cigars cigars;
	
	public TobacoProducer(Cigars cigars) {
		super("Tobaco producer");
		this.cigars = cigars;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Tobaco value = new Tobaco();
				cigars.produceTobaco(value);
				System.out.printf("%s produced a tobaco\n", getName());
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
