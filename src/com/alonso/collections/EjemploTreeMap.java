/**
 * 
 */
package com.alonso.collections;

import java.util.TreeMap;

/**
 * @author Jalonso98
 *
 */
public class EjemploTreeMap {
	
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		
		map.put("Zi zu", "Futbolista");
		map.put("Jalonso98", "Dev");
		map.put("Elon","CEO");
		
		System.out.println(map);
	}

}
