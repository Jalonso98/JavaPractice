package com.alonso.collections;

import java.util.Vector;

/**
 * @author Jalonso98
 *
 */
public class EjemploVector {
	
	/*
	 *  su comportamiento es similar al de un ArrayList a
diferencia que Vector es thread safe. Es decir, se comporta mejor cuando varios
hilos acceden al mismo recurso.

	 */
	
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		
		vector.add(1);
		vector.add(8);
		vector.add(13);
		vector.add(5);
		
		System.out.println(vector);
	}

}
