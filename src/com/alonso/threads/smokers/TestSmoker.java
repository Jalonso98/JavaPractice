/**
 * 
 */
package com.alonso.threads.smokers;

/**
 * @author Jalonso98
 *
 */
public class TestSmoker {
	public static void main(String[] args) throws InterruptedException {
		Cigars cigars = new Cigars();
		
		Smoker smoker = new Smoker(cigars);
		
		PaperProducer paperProducer  = new PaperProducer(cigars);
		TobacoProducer tobacoProducer = new TobacoProducer(cigars);
		MatchProducer matchProducer = new MatchProducer(cigars);
		
		paperProducer.start();
		tobacoProducer.start();
		matchProducer.start();

		smoker.start();
		
	}
}
