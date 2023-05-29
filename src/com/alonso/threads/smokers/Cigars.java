/**
 * 
 */
package com.alonso.threads.smokers;

import java.util.LinkedList;

/**
 * @author Jalonso98
 *
 */
public class Cigars {
	
	LinkedList<Paper> papers = new LinkedList<>();
	LinkedList<Tobaco> tobacos = new LinkedList<>();
	LinkedList<Match> matches = new LinkedList<>();

	LinkedList<Cigar> cigars = new LinkedList<>();
	
	public synchronized void createCigar() throws InterruptedException {
		while(papers.size() <= 0 && tobacos.size() <= 0 && matches.size() <= 0) {
			wait();
		}
		cigars.offer(new Cigar(papers.poll(),tobacos.poll(),matches.poll()));
		System.out.println("Cigar created");
	}
	
	public synchronized Cigar consume() throws InterruptedException {
		while(cigars.size() <= 0) {
			wait();
		}
		return cigars.poll();
	}
	
	public synchronized void producePaper(Paper paper) {
		papers.offer(paper);
		notifyAll();
	}
	
	public synchronized void produceTobaco(Tobaco tobaco) {
		tobacos.offer(tobaco);
		notifyAll();
	}
	
	public synchronized void produceMatch(Match match) {
		matches.offer(match);
		notifyAll();
	}

}
