/**
 * 
 */
package com.alonso.polimorfismo;

/**
 * @author Jalonso98
 *
 */
public class Rectangulo extends Figura implements Dibujable{

	private double base;
	private double altura;
	
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return (altura * 2) + (base * 2);
	}

	@Override
	public void dibujar() {
		System.out.println("Estoy dibujando un rectángulo " + getColor());
	}
	
}
