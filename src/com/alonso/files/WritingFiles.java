/**
 * 
 */
package com.alonso.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Jalonso98
 *
 */
public class WritingFiles {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File(new File(".").getAbsolutePath() + "\\src\\resources\\writing-text.txt");
		//try with resources
		try (PrintWriter pw = new PrintWriter(f)){
			pw.println("Hola");
			pw.println("Bonjour");
		}
	}

}
