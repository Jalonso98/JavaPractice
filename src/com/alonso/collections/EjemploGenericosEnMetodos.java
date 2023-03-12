/**
 * 
 */
package com.alonso.collections;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jalonso98 
 *
 */
public class EjemploGenericosEnMetodos {
	
	/*
	 * una wildcard es un tipo especial de argumento de tipo que controla la 
	 * seguridad de tipo del uso de tipos genéricos.
	 */
	
	static double sumarValores(List<? extends Number> valores) {
		double suma = 0.0;
		for (Number v : valores) {
			suma += v.doubleValue();
		}
		return suma;
	}
	
	public static void main(String[] args) {
		
		double suma = sumarValores(Arrays.asList(10.45, 89.34, 62.23, 14, new Float(10.5f)));
		System.out.println("Suma -> " + suma);
	}

}
