/**
 * 
 */
package com.alonso.threads.smokers;

import java.util.Random;

/**
 * @author Jalonso98
 *
 */
public class Smoker extends Thread {
	
	private Cigars cigars;
	
	public Smoker(Cigars cigars) {
		super("Smoker");
		this.cigars = cigars;
	}

	@Override
	public void run() {
		while(true) {
			@SuppressWarnings("unused")
			Cigar value;
			try {
				cigars.createCigar();
				value = cigars.consume();
				System.out.printf("%s consumed a cigar\n",getName());
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
