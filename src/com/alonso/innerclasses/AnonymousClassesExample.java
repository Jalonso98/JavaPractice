package com.alonso.innerclasses;

class AnonymousExample{
	void foo () {
		System.out.println("Foo Anonymous example");
	}
}


/**
 * @author Jalonso98
 *
 */
public class AnonymousClassesExample {
	
	public static void main(String[] args) {
		AnonymousExample example = new AnonymousExample(){
			@Override
			void foo() {
				System.out.println("Bar Anonymous example");
			}
		};
		example.foo();
	}
	
}
