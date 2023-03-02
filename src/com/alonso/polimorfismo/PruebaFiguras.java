/**
 * 
 */
package com.alonso.polimorfismo;

/**
 * @author Jalonso98
 *
 */
public class PruebaFiguras {
	
	//No se pueden crear instancias de clases abstractas
	//Figura f = new Figura();
	
	void imprimirArea(Figura figura) {
		System.out.println("El color de la figura es " + figura.getColor() + " y su área es " + figura.calcularArea());
	
		if(figura instanceof Circulo) {
			Circulo c = (Circulo) figura;
			c.rodar();
		}
	}
	
	public static void main(String[] args) {
		PruebaFiguras p = new PruebaFiguras();
		
		p.imprimirArea(new Circulo("Rojo", 10.0));
		p.imprimirArea(new Cuadrado("Verde", 125.2));
		p.imprimirArea(new Rectangulo("Azul", 20, 10));
	}

}
