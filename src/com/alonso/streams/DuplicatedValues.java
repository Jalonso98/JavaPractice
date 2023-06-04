package com.alonso.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jalonso98
 *
 */
public class DuplicatedValues {
	
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(6,89,109,90,88,5,56,100,6,89,109,90,88,5,56,100,6,89,109,90,88,5,56,100);
		
		//By using distinct() function we get an ordered list
		System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
		
		//By converting from list to set we get a unordered list
		System.out.println(numbers.stream().collect(Collectors.toSet()));
		
	}
	
}
