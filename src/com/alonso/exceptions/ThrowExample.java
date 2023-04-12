/**
 * 
 */
package com.alonso.exceptions;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Jalonso98
 *
 */
public class ThrowExample {
	
	static double divide(int a, int b) {
		if(b != 0) {
			return a/b;
		}
		else {
			throw new IllegalArgumentException("You cannot divide by zero");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Type a number:");
			int a = sc.nextInt();
			System.out.print("Type a number:");
			int b = sc.nextInt();
			System.out.println(divide(a,b));
		}catch (InputMismatchException e) {
			e.printStackTrace();
			throw new InputMismatchException("Input is not valid");
		}finally {
			System.out.println(LocalDateTime.now() + ": Closing program");
			sc.close();
		}
	}
	
}
