package com.alonso.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Jalonso98
 *
 */
public class WritingObjects {

	public static final String BASEPATH = new File(".").getAbsolutePath() + "\\src\\resources\\programmers.txt";

	public static void main(String[] args) throws IOException, FileNotFoundException {

		Programmer[] programmers = { new Programmer("Alonso", "Java"), new Programmer("Javier", "Python"),
				new Programmer("Pepito", "Go"), null };
		File file = new File(BASEPATH);
		if (!file.exists()) {
			System.out.println("File does not exist, creating new file :)");
			file.createNewFile();
		}

		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(programmers);
		} finally {
			System.out.println("Program has finished!");
		}

	}

}
