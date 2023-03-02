/**
 * 
 */
package com.alonso.herencia;

/**
 * @author Jalonso98
 *
 */
public class Persona {

	String nombre;
	String fechaDeNacimiento;

	public Persona(String nombre, String fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	//Los métodos finales no se pueden sobreescribir
//	final void dormir() {
	//No se puede reducir la accesibilidad
//	public void dormir() {
	void dormir() {
		System.out.println("Soy " + nombre + " y voy a dormir");
	}

	void respirar() {
		System.out.println("Soy " + nombre + " y voy a respirar");
	}

	void comer() {
		System.out.println("Soy " + nombre + " y voy a comer");
	}

}
