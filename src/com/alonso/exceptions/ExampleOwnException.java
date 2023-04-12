/**
 * 
 */
package com.alonso.exceptions;

class OwnUncheckedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2367993252835308434L;
	
	public OwnUncheckedException (String error) {
		super(error);
	}
	
}

class OwnChekedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4928369865752882939L;
	
	public OwnChekedException(String error) {
		super(error);
	}
	
}

/**
 * @author Jalonso98
 *
 */
public class ExampleOwnException {
	
	static void checkLength(String title) throws OwnChekedException {
		if(title.length() <= 0) {
			throw new OwnChekedException("Title lenght is not valid");
		}
	}
	
	static void createCourse(String title) {
		if(!title.toUpperCase().equals(title)) {
			throw new OwnUncheckedException("Title is not upper case");		
		}
		
		try {
			checkLength(title);
			System.out.println("Course created with title: " + title);
		} catch (OwnChekedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		createCourse("Java Crash Course");
//		createCourse("");
		createCourse("JAVA CRASH COURSE");
	}

}
