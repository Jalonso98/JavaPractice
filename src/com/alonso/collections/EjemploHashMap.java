/**
 * 
 */
package com.alonso.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jalonso98
 *
 */
public class EjemploHashMap {
	
	/*
	 * Utiliza HashMap cuando requieras una
colección que contenga pares,
llave-valor, las llaves pueden conteneer
null pero solo un elemento. HashMap no
permite llaves duplicadas.
El acceso a los datos se basa en el
hashCode, entre mejor sea la
implementación de hashCode, mejor será el
performance.
	 */
	
	public static void main(String[] args) {
		
		Map<String, String> diccionario = new HashMap<>();
		
		diccionario.put("twitter", "Es una red social");
		diccionario.put("java", "Es un lenguaje de programación");
		diccionario.put(null, "Ausencia de objeto");
		
		System.out.println(diccionario);
		
//		for (String llave : diccionario.keySet()) {
//			System.out.println(llave + " = " + diccionario.get(llave));
//		}
		
		
		for (Map.Entry<String, String> entry : diccionario.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
		System.out.println("Jalonso98".hashCode() % 16);
		
	}

}
