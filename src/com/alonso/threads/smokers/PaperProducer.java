/**
 * 
 */
package com.alonso.threads.smokers;

import java.util.Random;

/**
 * @author Jalonso98
 *
 */
public class PaperProducer extends Thread {
	
	private Cigars cigars;
	
	public PaperProducer(Cigars cigars) {
		super("Paper producer");
		this.cigars = cigars;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Paper value = new Paper();
				cigars.producePaper(value);
				System.out.printf("%s produced a paper\n", getName());
				Thread.sleep(new Random().nextInt(3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
