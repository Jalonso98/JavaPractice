/**
 * 
 */
package com.alonso;

import java.util.Random;

/**
 * @author Jalonso98
 *
 */
public class Arreglos {
	
	static void imprimirArreglos(String [] arreglo) {
		System.out.println("\nImprimiendo arreglo unidimensional: \n");
		for (String valor : arreglo) {
			System.out.println(valor);
		}
	}
	
	static void imprimirMultidimensional(int[][] arreglo) {
		System.out.println("\nImprimiendo arreglo multidimensional: \n");
		for (int[] fila : arreglo) {
			for (int num : fila) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		//Explícita
		String nombres [] = new String[2];
		nombres[0] = "javier";
		nombres[1] = "alonso";
		imprimirArreglos(nombres);
		
		//Implícita
		String nombres2 [] = {"javier","alonso"};
		imprimirArreglos(nombres2);
		
		//Anónima
		imprimirArreglos(new String[] {"javier","alonso"});
		
		//Creando un arreglo irregular con 4 filas
		int size = 5;
		int limite = 5;
		int limiteNum = 20;
		int [][] arregloIrregular = new int[size][];
		Random random = new Random();
		
		for(int i = 0; i < size; i++) {
			int randomSize = random.nextInt(limite+1);
			arregloIrregular[i] = new int[randomSize];
			for (int j = 0; j < randomSize; j++) {
				arregloIrregular[i][j] = random.nextInt(limiteNum);
			}
		}
		
		imprimirMultidimensional(arregloIrregular);
		
	}

}
