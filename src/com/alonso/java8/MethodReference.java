/**
 * 
 */
package com.alonso.java8;

import resources.Person;
import java.util.Arrays;
import java.util.List;

class StringUtils{
	static boolean isUpperCase(String word) {
		return word.toUpperCase().equals(word);
	}
}

/**
 * @author Jalonso98
 *
 */
public class MethodReference {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Juan","Luis","Pepe","PANCHO");
		
		System.out.println("Imperative");
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("\nStream 1\n");
		names.stream().forEach(n->System.out.println(n));
		System.out.println("\nStream 2\n");
		names.stream().forEach(System.out::println);
		
		System.out.println("\nStream with filter (static method)\n");
		names.stream()
		.filter(StringUtils::isUpperCase)
		.forEach(System.out::println);
		
		System.out.println("\nStream with constructors\n");
		names.stream().map(Person::new).forEach(System.out::println);
	}
}
