package com.alonso.innerclasses;

abstract class AnonymousFigure {
	abstract void foo();
}

/**
 * @author Jalonso98
 *
 */
public class AbstractAnonymousClasses {

	public static void main(String[] args) {
		AnonymousFigure figure = new AnonymousFigure() {
			
			@Override
			void foo() {
				System.out.println("Foo internal anonymous class");				
			}
		};
		figure.foo();
	}
	
}
