/**
 * 
 */
package com.alonso.herencia;

/**
 * @author Jalonso98
 *
 */
public class Estudiante extends Persona{
	
	int numeroDeCuenta;
	
	public Estudiante(String nombre, String fechaDeNacimiento, int numeroDeCuenta) {
		super(nombre, fechaDeNacimiento);
		this.numeroDeCuenta=numeroDeCuenta;
	}
	
	//El decorador indica que el método se está sobreescribiendo
	//Los métodos final no se pueden sobreescribir
	@Override
	void dormir() {
		//Se puede invocar métodos de la clase padre usando la palabra reservada "super"
		super.dormir();
		System.out.println("Soy " + nombre + " y yo no duermo");
	}

	public void aprobar() {
		System.out.println("Soy " + nombre + " y aprobé mi examen");
	}
	
	public void reprobar() {
		System.out.println("Soy " + nombre + " y reprobé mi examen");
	}

}
