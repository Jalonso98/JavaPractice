/**
 * 
 */
package com.alonso.files;

import java.io.Serializable;

/**
 * @author Jalonso98
 *
 */
public class Programmer implements Serializable {

	private static final long serialVersionUID = -6257962812150168301L;
	private String name;
	private String favoriteLanguage;

	public Programmer(String name, String favoriteLanguage) {
		this.name = name;
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

}
