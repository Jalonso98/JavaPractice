package com.alonso.innerclasses;

class External {
	
	void foo() {
		System.out.println("Foo external");
	}
	
	class Internal {
		void bar() {
			System.out.println("Bar internal");
		}
	}
	
}

/**
 * @author Jalonso98
 *
 */
public class RegularInnerClasses {
	
	public static void main(String[] args) {
		
		External ex = new External();
		ex.foo();
		External.Internal internal = ex.new Internal();
		internal.bar();
	}

}
