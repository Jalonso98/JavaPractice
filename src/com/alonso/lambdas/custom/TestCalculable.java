/**
 * 
 */
package com.alonso.lambdas.custom;

/**
 * @author Jalonso98
 *
 */
public class TestCalculable {

	public static void main(String[] args) {

		//Anonymous class code
//		Calculable calculable = new Calculable() {
//
//			@Override
//			public double avg(double... numbers) {
//				double sum = 0.0;
//				for (int i = 0; i < numbers.length; i++) {
//					sum += numbers[i];
//				}
//				return sum / numbers.length;
//
//			}
//		};
		
		//Lambdas code
		Calculable calculable = (double ...numbers) -> {
			double sum = 0.0;
			for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
			return sum / numbers.length;
		};
		
		System.out.println(calculable.avg(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

}
