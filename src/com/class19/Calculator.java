package com.class19;

public class Calculator {
	/*
	 * Lets create a class called Calculator +
	 * have methods that take  three inputs and return the  result
	 * and  return  the  sum, average, min and max 
	 */
	static int sum(int a, int b, int c) {
	// int result =0;
//		for (int a1=1; a1<=3; a1++) {
			return (a+b+c);
		}

	static int average(int a, int b, int c) {
		return(a+b+c)/3;
	
	}
	
	static int min( int a, int b, int c) {
		int min=a;
		if (b<a) {
			min=b;
		}if(c<min) {
			min=c;
		}
		return min;
	}
	
	static int max( int a, int b, int c) {
		int max=a;
		if (b>a) {
			max=b;
		}if(c>max) {
			max=c;
		}
		return max;
	}
	
	
	
	
	
}
