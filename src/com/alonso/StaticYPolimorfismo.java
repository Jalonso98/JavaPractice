/**
 * 
 */
package com.alonso;

class A {
	static void foo() {
		System.out.println("Foo");
	}
}

class B extends A {
	static void foo() {
		System.out.println("Foo2");
	}
}

/**
 * @author Jalonso98
 *
 */
public class StaticYPolimorfismo {
	//Sirve para quitar los warnings, en este caso, los de acceso estático
	@SuppressWarnings(value = "static-access")
	public static void main(String[] args) {
		A a = new B();
		/*
		 * Cuando accedemos al método estático dentro de polimorfismo
		 * se va a tomar el método de la instancia que tenemos, en este caso,
		 * se toma el método de A porque la instancia de a es de la clase A
		 */
		a.foo();
	}
}
