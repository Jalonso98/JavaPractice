/**
 * 
 */
package com.alonso.herencia;

/**
 * @author Jalonso98
 *
 */
public class EjemploPersonas {
	
	public static void main(String[] args) {
		Estudiante e = new Estudiante("Alonso","10-10",123);
		
		/*
		 * Cuando la instancia de una clase (objeto) se declara como final
		 * quiere decir que el objeto no podra modificarse,
		 * aunque eso no afecta directamente a sus atributos
		 */
//		final Estudiante e = new Estudiante("Alonso","10-10",123);
//		e.nombre = "Javier"; //Sí es posible
//		e = null; //No es posible
		
		e.dormir();
		e.aprobar();
		e.reprobar();
		
	}

}
