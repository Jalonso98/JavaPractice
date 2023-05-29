/**
 * 
 */
package com.alonso.files;

import java.io.File;

/**
 * @author Jalonso98
 *
 */
public class TreeComand {
	
	private static void print(File [] files, String tabs) {
		String spaces =  tabs.concat("-");
		if(files != null) {
			for (File file : files) {
				if(file.isFile()) {
					System.out.printf("%s %s \n",spaces,file.getName());
				}else {
					System.out.printf("%s %s \n",spaces,file.getName());
					print(file.listFiles(), spaces);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String dir = new File(".\\").getAbsolutePath();
		File f = new File(dir);
//		System.out.println(f.getPath());
		System.out.println(f.getName());
		print(f.listFiles(), "-");
	}
}
