/**
 * 
 */
package com.alonso.collections;

import java.util.HashSet;

/**
 * @author Jalonso98
 *
 */
public class EjemploHashSet {
	
	/*
	 * Colección utilizada cuando necesitas un
conjunto de datos sin elementos
duplicados y no te importe el orden de los datos.

	 */
	
	public static void main(String[] args) {
		HashSet<String> nombres = new HashSet<>();
		
		System.out.println(nombres.add("Pedro"));
		System.out.println(nombres.add("Pablo"));
		System.out.println(nombres.add("Pablo"));//Solo puede agregar un mismo elemento al set
		nombres.add(null);
		System.out.println(nombres);
	}

}
