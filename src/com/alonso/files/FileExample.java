/**
 * 
 */
package com.alonso.files;

import java.io.File;

/**
 * @author Jalonso98
 *
 */
public class FileExample {

	public static void main(String[] args) {
		String dir = new File(".").getAbsolutePath() + "\\src\\resources";
		File f = new File(dir);
		System.out.println("Is file -> " + f.isFile());
		System.out.println("Is directory -> " + f.isDirectory());
		System.out.println("Name -> " + f.getName());
		System.out.println("Can read -> " + f.canRead());
		System.out.println(f.getPath());
		System.out.println();
		File [] content = f.listFiles();
		for (File file : content) {
			System.out.println("Content Is file -> " + file.isFile());
			System.out.println("Content Is directory -> " + file.isDirectory());
			System.out.println("Content Name -> " + file.getName());
			System.out.println("Content Can read -> " + file.canRead());
			System.out.println();
		}
	}

}
