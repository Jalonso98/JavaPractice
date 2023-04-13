package com.alonso.innerclasses;

interface Playable {
	abstract void play();
}

/**
 * @author Jalonso98
 *
 */
public class AnonymousInterfaceClass {
	public static void main(String[] args) {
		Playable playable = new Playable() {
			
			@Override
			public void play() {
				System.out.println("Im playing");
			}
		};
		playable.play();
	}
}
