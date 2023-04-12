/**
 * 
 */
package com.alonso.exceptions;

class Recurso implements AutoCloseable {
	
	void foo() {
		System.out.println("foo");
	}

	@Override
	public void close() {
		System.out.println("Liberando recursos");
	}
	
}

/**
 * @author Jalonso98
 *
 */
public class EjemploTryWithResources {
	
	public static void main(String[] args) {
		try (Recurso recurso = new Recurso();) {
			recurso.foo();
		}
	}

}
