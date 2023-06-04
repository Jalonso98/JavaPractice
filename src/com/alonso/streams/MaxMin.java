package com.alonso.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Jalonso98
 *
 */
public class MaxMin {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(6,89,109,90,88,5,56,100);
		int min = numbers.get(0);
		for (Integer number : numbers) {
			if(number < min) {
				min = number;
			}
		}
		System.out.println("Imperative: " + min);
		
		Integer streamMin = numbers.stream()
				.min(Comparator.naturalOrder())
				.get();
		System.out.println("Stream min: " + streamMin);
		
		Integer streamMax = numbers.stream()
				//Referencing the method instead invoking it
//				.max(Comparator.comparingInt(Integer::intValue))
				.max(Comparator.comparingInt(n -> n.intValue()))
				.get();
		System.out.println("Stream max: " + streamMax);
	}

}
