/**
 * 
 */
package com.alonso.collections;

import java.util.LinkedList;

/**
 * @author Jalonso98
 *
 */
public class EjemploLinkedList {
	
	/*
	 * LinkedList es una implementación de una lista
doblemente ligada, su performance es mejor a un ArrayList cuando se tiene que agregar o remover
un el emento, pero es peor cuando se quiere obtener o modificar un elemento.
	 */
	
	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<>();
		lista.add("Alonso");
		lista.add("Practice");
		
		System.out.println(lista);
		System.out.println(lista.size());
	}
	
}
