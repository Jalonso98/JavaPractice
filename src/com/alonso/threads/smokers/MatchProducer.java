/**
 * 
 */
package com.alonso.threads.smokers;

import java.util.Random;
/**
 * @author Jalonso98
 *
 */
public class MatchProducer extends Thread {

	private Cigars cigars;
	
	public MatchProducer(Cigars cigars) {
		super("Match producer");
		this.cigars = cigars;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Match value = new Match();
				cigars.produceMatch(value);
				System.out.printf("%s produced a match\n", getName());
				Thread.sleep(new Random().nextInt(500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
