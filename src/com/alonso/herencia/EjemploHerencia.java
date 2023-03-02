/**
 * 
 */
package com.alonso.herencia;

class Animal {
	public void respirar() {
		System.out.println("Soy un animal y estoy respirando");
	}
}

class Perro extends Animal{
//	public void respirar() {
//		System.out.println("Soy un perro y estoy respirando");
//	}
}

class Gato extends Animal{
//	public void respirar() {
//		System.out.println("Soy un gato y estoy respirando");
//	}
}

/**
 * @author Jalonso98
 *
 */
public class EjemploHerencia {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		Perro p = new Perro();
		p.respirar();
		
		System.out.println(p instanceof Animal);
		System.out.println(p instanceof Object);
		System.out.println(a instanceof Gato);
	}
}
