/**
 * 
 */
package com.alonso.collections;

class Transporte{}
class Coche extends Transporte{}
class Deportivo extends Coche{}

class BeanGenerico<T extends Transporte>{
	private T valor;

	
	public BeanGenerico(T valor) {
		super();
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
}

/**
 * @author Jalonso98
 *
 */
public class EjemploGenerico {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		BeanGenerico<Transporte> bean = new BeanGenerico<>(new Coche());
		
	}
	
}
