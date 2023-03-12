/**
 * 
 */
package com.alonso.collections;

import java.util.PriorityQueue;

/**
 * @author Jalonso98
 *
 */
public class EjemploPriorityQueue {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		queue.add(1000);
		queue.add(200);
		queue.add(5);
		queue.add(100);
		//Los ordena de acuerdo al orden natural
		
		System.out.println(queue);
		System.out.println(queue.peek()); //obtiene el primero
		System.out.println(queue.poll()); //obtiene el primero y lo quita de la queue
		System.out.println(queue);
	}

}
