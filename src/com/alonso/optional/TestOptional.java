/**
 * 
 */
package com.alonso.optional;

import java.util.Optional;

/**
 * @author Jalonso98
 *
 */
public class TestOptional {
	
	private static String[] names = {"Pepe","Jorge","David"};
	
	public static Optional<String>  searchByName (String name) {
		for (String n : names) {
			if(name.equalsIgnoreCase(n)) {
				return Optional.of(name);
			}
		}
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		Optional<String> result = searchByName("Pedro");
		if(result.isPresent()) {
			System.out.println(result.get().toUpperCase());
		}else {
			System.out.println("Name not found");
		}
		
		String result2 = searchByName("Juan").orElse("Perenganito");
		
		System.out.println(result2);
		
		String result3 = searchByName("Luis").orElseThrow(() -> new IllegalArgumentException("Name was not found"));
		
		System.out.println(result3);
		
	}
	

}
