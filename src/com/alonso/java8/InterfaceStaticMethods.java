package com.alonso.java8;

//Static methods now we can be used in interfaces
interface Follower {
	
	void unfollow();
	
	//The only two ways to add implementation into a interface is to use default and static methods
	default void follow() {
		System.out.println("General follow - This is a default method");
	}
	
	static void print() {
		System.out.println("Method print() -> This is a static method within a interface");
	}
	
}

class TwitterFollower implements Follower {
	//Static methods cannot be overwritten
//	@Override
	public static void print() {
		System.out.println("Twitter print() -> This is the static method from a class");
	}

	@Override
	public void unfollow() {
		System.out.println("Twitter unfollow -> This is an abstract method from a interface implemented in an interface");
	}

	@Override
	public void follow() {
		System.out.println("Twitter follow -> Default methods can be overwritten too");
	}
	
	
	
}

/**
 * @author Jalonso98
 *
 */
public class InterfaceStaticMethods {
	public static void main(String[] args) {
		Follower.print();
		TwitterFollower follower = new TwitterFollower();
		follower.follow();

		
	}
}
