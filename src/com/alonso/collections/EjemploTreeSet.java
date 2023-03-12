/**
 * 
 */
package com.alonso.collections;

import java.util.TreeSet;

/**
 * @author Jalonso98
 *
 */
public class EjemploTreeSet {
	
	/*
	 * TreeSet es una de las colecciones
ordenadas e implementa una estructura de
tipo árbol rojo-negro y garantiza que los
elementos serán únicos y estarán
ordenados de forma ascendente de acuerdo
a un orden natural .

	 */
	
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("A");
		set.add("X");
		set.add("G");
		set.add("X");
		
		System.out.println(set);
	}

}
