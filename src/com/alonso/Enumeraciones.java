/**
 * 
 */
package com.alonso;

enum SaborPalomitas {
	CHILE("Chile",10),MANTEQUILLA("Mantequilla",15),QUESO("Quesito",15),CARAMELO("Caramelo",20);
	private String nombreDeVenta;
	private float precio;

	private SaborPalomitas(String nombreDeVenta, float precio) {
		this.nombreDeVenta = nombreDeVenta;
		this.precio = precio;
	}

	public String getNombreDeVenta() {
		return nombreDeVenta;
	}

	public void setNombreDeVenta(String nombreDeVenta) {
		this.nombreDeVenta = nombreDeVenta;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}	
	
}

/**
 * @author Jalonso98
 *
 */
public class Enumeraciones {
	
	public static void main(String[] args) {
		SaborPalomitas caramelo = SaborPalomitas.CARAMELO;
		System.out.println(caramelo.name());
		System.out.println(caramelo.getNombreDeVenta());
		System.out.println(caramelo.getPrecio());
	}

}
