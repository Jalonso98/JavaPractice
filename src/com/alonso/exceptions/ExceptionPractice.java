/**
 * 
 */
package com.alonso.exceptions;

/**
 * @author Jalonso98
 *
 */
public class ExceptionPractice {
	
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 10/x;
			System.out.println("Division result: " + y);
			String name = "";
			System.out.println(name.toString());
			String [] arr = {"Jalonso", "98"};
			System.out.println(arr[3]);
		} catch (NullPointerException | ArithmeticException e) {
			e.printStackTrace();
			System.err.printf("NullPointer & Arithmetic exception %s \n", e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.err.printf("Exception %s \n", e.getMessage());
		} finally {
			System.out.println("Siempre se ejecuta");
		}
	}

}
