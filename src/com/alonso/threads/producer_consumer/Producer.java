/**
 * 
 */
package com.alonso.threads.producer_consumer;

import java.util.Random;

/**
 * @author Jalonso98
 *
 */
public class Producer extends Thread {
	
	private Resource resource;
	
	public Producer(Resource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int value = new Random().nextInt(1000);
				resource.produce(value);
				System.out.printf("%s produced %d\n", getName(),value);
				Thread.sleep(new Random().nextInt(300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
