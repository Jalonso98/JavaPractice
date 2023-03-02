/**
 * 
 */
package com.alonso.polimorfismo;

/**
 * @author Jalonso98
 *
 */
public class Cuadrado extends Figura {
	
	private double lado;

	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public double calcularPerimetro() {
		return lado * 4;
	}

}
