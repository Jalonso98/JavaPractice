/**
 * 
 */
package com.alonso.herencia;

/**
 * @author Jalonso98
 *
 */
public class Empleado extends Persona{
	
	float sueldo;
	
	public Empleado(String nombre, String fechaDeNacimiento, float sueldo) {
		super(nombre, fechaDeNacimiento);
		this.sueldo=sueldo;
	}

	public void trabajar() {
		System.out.println("Soy " + nombre + " y estoy trabajando");
	}
	
	public void cobrar() {
		System.out.println("Soy " + nombre + " y estoy cobrando " + sueldo);
	}

}
