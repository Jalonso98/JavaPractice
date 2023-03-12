/**
 * 
 */
package com.alonso.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Jalonso98
 *
 */
public class EjemploCollections {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
	
		nombres.add("Rocky");
		nombres.add("Apollo");
		nombres.add("Mickey");
		
		System.out.println(nombres);
		
		Collections.sort(nombres);
		
		System.out.println(nombres);
		
		int index = Collections.binarySearch(nombres, "Rocky");
		System.out.println(index + " -> " + nombres.get(index));
		
		
	}
	
}
