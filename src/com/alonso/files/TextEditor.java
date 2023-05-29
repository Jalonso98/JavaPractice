/**
 * 
 */
package com.alonso.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * @author Jalonso98
 *
 */
public class TextEditor {
	
	public static final String BASEPATH = new File(".").getAbsolutePath() + "\\src\\resources\\";
	public static final String EXIT = "EXIT";
	
	public static String readMessage() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Write file's name:");
		String fileName = readMessage();
		File f = new File(BASEPATH + fileName);
		System.out.println("Please, start writing and type \"EXIT\" when you finish");
		String line = null;
		
		try(PrintWriter pw = new PrintWriter(f)){
			do {
				line = readMessage();
				if(!EXIT.equals(line)) {
					pw.println(line);
				}
			}while (!EXIT.equals(line));
		}
		finally {
			System.out.println("Program has ended");
		}
	}

}
