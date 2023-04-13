package com.alonso.innerclasses;

class ExternalStatic {
	public void foo() {
		System.out.println("Foo external static");
	}
	
	static class InternalStatic {
		void bar() {
			System.out.println("Bar internal static");
		}
	}
	
}

/**
 * @author Jalonso98
 *
 */
public class StaticInnerClasses {
	
	public static void main(String[] args) {
		ExternalStatic.InternalStatic obj = new ExternalStatic.InternalStatic();	
		obj.bar();
	}

}
