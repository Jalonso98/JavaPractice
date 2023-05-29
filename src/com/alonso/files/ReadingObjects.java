/**
 * 
 */
package com.alonso.files;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Jalonso98
 *
 */
public class ReadingObjects {
	
	public static final String BASEPATH = new File(".").getAbsolutePath() + "\\src\\resources\\programmers.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File(BASEPATH);
		if (!file.exists()) {
			System.out.println("File does not exist, please create it!");
		}else {
			try (FileInputStream fis = new FileInputStream(file);
					ObjectInputStream ois = new ObjectInputStream(fis)){
				while(true) {
					try {
						Programmer[] programmers = (Programmer []) ois.readObject();
						for (Programmer programmer : programmers) {
							if(programmer != null) {
								System.out.println("Name: " + programmer.getName());
								System.out.println("Favorite language: " + programmer.getFavoriteLanguage());
								System.out.println();
							}else {
								System.out.println("Programmer without any info!");
								System.out.println();
							}
						}
					}catch(EOFException e) {
						break;
					}
				}
			}
			finally {
				System.out.println("Program has finished!");
			}
		}
	}
	
}
