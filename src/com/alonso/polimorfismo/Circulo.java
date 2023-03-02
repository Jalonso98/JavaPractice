/**
 * 
 */
package com.alonso.polimorfismo;

/**
 * @author Jalonso98
 *
 */
public class Circulo extends Figura implements Dibujable{

	private double radio;
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	void rodar() {
		System.out.println("El círculo " + getColor() + " está rodando");
	}

	@Override
	public double calcularPerimetro() {
		return Math.PI + (radio * 2);
	}

	@Override
	public void dibujar() {
		System.out.println("Estoy dibujando un círculo " + getColor());
	}

}
