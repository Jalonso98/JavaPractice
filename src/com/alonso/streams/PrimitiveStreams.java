package com.alonso.streams;

import java.util.stream.IntStream;

/**
 * @author Jalonso98
 *
 */
public class PrimitiveStreams {
	
	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(i -> System.out.println(i));
	}

}
