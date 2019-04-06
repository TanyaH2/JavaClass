package com.class7;

import java.util.Scanner;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		int num4;

		num1 = 100;
		num2 = ++num1;// in Preincrement we are incrementing first and then assigning num2=(++num1);
		num3 = 200;
		num4 = num3++;// in Postincrement we are assigning (num2=num1)++; and then incrementing

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);

		
		
		
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

	

		
		
		
	}
}
