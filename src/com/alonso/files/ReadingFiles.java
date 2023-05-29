/**
 * 
 */
package com.alonso.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jalonso98
 *
 */
public class ReadingFiles {
	
	public static void main(String[] args) throws FileNotFoundException,IOException {
		File f = new File(new File(".").getAbsolutePath() + "\\src\\resources\\writing-text.txt");
		if(f.exists()) {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String out = null;
			do {
				out = br.readLine();
				System.out.println(out);
			}while(out != null);
			//when we do not use try with resources, we need to implement explicitly the void close()
			br.close();
		}else {
			System.out.println("File does not exist :(");
		}
	}

}
