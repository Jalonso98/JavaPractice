/**
 * 
 */
package com.alonso.innerclasses;

/**
 * @author Jalonso98
 *
 */
public class MethodLevelClasses {
	
	static void foo() {
		class InternalMethodClass {
			void bar() {
				System.out.println("Bar internal method class");
			}
		}
		
		InternalMethodClass internalVoidClass = new InternalMethodClass();
		internalVoidClass.bar();
	}
	
	public static void main(String[] args) {
		foo();
	}

}
