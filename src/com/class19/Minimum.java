package com.class19;

public class Minimum {
	/*
	 * Create a class Called Minimum
	 * 
	 * with in it crate a method called minOfValues
	 * 
	 * make it static
	 * 
	 * From your previous Applicaions class call the method and pass an array
	 * argument
	 * 
	 * and prin out the result
	 */

	// int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	static int minOfValues(int[] x) {
		int min =x[0]; //Integer.MAX_VALUE;
		
		//System.out.println(min);

		for (int y : x) {
			if (y < min) {
				min = y;
			}
		}
		return min;
}
	
	
	
	
	
	
	
}