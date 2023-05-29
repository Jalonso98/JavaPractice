/**
 * 
 */
package com.alonso.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jalonso98
 *
 */
public class KeyboardInput {
	
	public static String readMessage(String prompt) throws IOException {
		System.out.println(prompt);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static int readInteger(String prompt) throws NumberFormatException, IOException {
		return Integer.parseInt(readMessage(prompt));
	}
	
	public static void main(String[] args) throws IOException {
		String name = readMessage("What is your name?");
		System.out.println("You are "+ name);
		int age = readInteger("How old are you?");
		System.out.println("You are " + age + " years old");
	}

}
