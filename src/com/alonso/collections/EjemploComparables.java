/**
 * 
 */
package com.alonso.collections;

import java.util.TreeSet;

class Perro implements Comparable<Perro> {
	private String nombre;

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Perro [nombre = "+ nombre +"]";
	}

	@Override
	public int compareTo(Perro p) {
// 		return p.getNombre().compareTo(nombre); //orden inverso
 		return nombre.compareTo(p.getNombre());
	}
	
	
	
}

/**
 * @author Jalonso98
 *
 */
public class EjemploComparables {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Perro> set = new TreeSet<>();
		
		set.add(new Perro("Firulais"));
		set.add(new Perro("Oliver"));
		set.add(new Perro("Doggy"));
		
		System.out.println(set);
		
		System.out.println(new Perro("Chabelita"));
		
	}

}
