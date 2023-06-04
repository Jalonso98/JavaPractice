/**
 * 
 */
package com.alonso.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jalonso98
 *
 */
public class MapFunction {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Lili",4), 
				new Person("Juan",23), 
				new Person("Pepe", 56), 
				new Person("Mary",43),
				new Person("Oscar",11),
				new Person("Ana",74));
		
		List<String> mapOutput = people.stream()
				.map(p -> p.getName())
				.collect(Collectors.toList());
		
		System.out.println(mapOutput);
		
	}

}
