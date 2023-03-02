/**
 * 
 */
package com.alonso;

class Person {
	public Person() {
		System.out.println("\nConstructor Person");
	}
}

class Usuario extends Person {
	static int numeroUsuarios = 0;
	String nombre;
	
	public Usuario() {
		System.out.println("Constructor");
	}
	
	public Usuario(String nombre) {
		System.out.println("Constructor sobrecargado");
		this.nombre = nombre;
	}
	{
		System.out.println("Bloque anónimo");
		numeroUsuarios++;
	}{
		System.out.println("Bloque anónimo 2");
	}
}

/**
 * @author Jalonso98
 *
 */
public class BloquesAnonimos {
	
	public static void main(String[] args) {
		System.out.println(Usuario.numeroUsuarios);
		new Usuario();
		new Usuario();
		new Usuario("Alonso");
		new Usuario();
		System.out.println(Usuario.numeroUsuarios);
	}

}
