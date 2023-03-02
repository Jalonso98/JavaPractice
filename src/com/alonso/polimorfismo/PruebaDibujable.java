/**
 * 
 */
package com.alonso.polimorfismo;

/**
 * @author Jalonso98
 *
 */
public class PruebaDibujable {

	static void dibujar(Dibujable dibujable) {
		dibujable.dibujar();
	}
	
	public static void main(String[] args) {
		dibujar(new Circulo("Rojo", 5.0));
		dibujar(new Rectangulo("Verde", 5.0, 4.0));
		dibujar(new Imagen());
	}
}
