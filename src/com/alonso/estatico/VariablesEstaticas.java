/**
 * 
 */
package com.alonso.estatico;

class Humano {
	static int numeroHumanos = 0;
	String nombre;
	
	public Humano() {
		numeroHumanos++;
	}
}

/**
 * @author Jalonso98
 *
 */
public class VariablesEstaticas {
	
	public static void main(String[] args) {
		System.out.println(Humano.numeroHumanos);
		new Humano();
		new Humano();
		new Humano();
		new Humano();
		System.out.println(Humano.numeroHumanos);
	}

}
