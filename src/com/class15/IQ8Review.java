package com.class15;

public class IQ8Review {
public static void main(String[] args) {
	
//	8. Write a Java Program to print first 10 numbers of Fibonacci series.
	//this numbers used in a Sprint backlog stories 
	
	System.out.println("------Fibonacci--------");
     //    a
	int maxNumber = 10;
	//     b
	int previousNumber = 0;
	//     c
	int nextNumber = 1;

	System.out.print("Fibonacci Series of " + maxNumber + " numbers: \n");
   //                       c
	for (int i = 1; i <= maxNumber; ++i) {
		//                    b
		System.out.print(previousNumber + ", ");
		/*
		 * On each iteration, we are assigning second number to the first number and
		 * assigning the sum of last two numbers to the second number
		 */

		//   d          b               c
		int sum = previousNumber + nextNumber;
		//   b               c 
		previousNumber = nextNumber;
		//  c          d
		nextNumber = sum;
	}
	System.out.println("\n----------------");
	
	int a=1;
	int b=0;
	int c=0;
	
	for (int i=0; i<10; i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.print(a+", ");
	}
	
	
}
}
