/**
 * 
 */
package com.alonso.collections;

import java.util.ArrayList;

/**
 * @author Jalonso98
 *
 */
public class EjemploArrayList {
	
	/*
	 * ArrayList tiene una velocidad constante al
agregar y al obtener elementos.
ArrayList no es muy eficiente cuando se tiene
que agregar en una posición específica o remover
un elemento.

	 */
	
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
//		array.add(1);
		array.add("Alonso");
//		array.add(new Object());
		
		System.out.println(array);
	}

}
