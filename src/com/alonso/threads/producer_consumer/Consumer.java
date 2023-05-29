/**
 * 
 */
package com.alonso.threads.producer_consumer;

import java.util.Random;

/**
 * @author Jalonso98
 *
 */
public class Consumer extends Thread {

	private Resource resource;
	
	public Consumer(Resource resource,String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while(true) {
			int value;
			try {
				value = resource.consume();
				System.out.printf("%s consumed %d\n",getName(),value);
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
