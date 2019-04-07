package com.class05;

import java.util.Scanner;

public class HomeWork {

//	1.Write a program to find largest of three double values using if-else..
//	if provided by a user (numbers must be distinct)
//	
//	2.Program to find largest number among three numbers using nested if 
//	provided by a user (numbers must be distinct)
	public static void main(String[] args) {

//		
//		 double x, y, z;
//		    
//		    Scanner sc = new Scanner(System.in);
//		    System.out.println("Enter your first number");
//		    x = sc.nextDouble();
//		    System.out.println("Enter your second number");
//		    y = sc.nextDouble();
//		    System.out.println("Enter your three number"); 
//		    z = sc.nextDouble();
//		 
//		    if (x > y && x > z)
//		      System.out.println(x+" is the gratest.");
//		    else if (y > x && y > z)
//		      System.out.println(y+" is the gratest.");
//		    else if (z > x && z > y)
//		      System.out.println(z+ " is the gratest.");
//		    else
//		      System.out.println("The numbers are equal.");

		System.out.println("-------------------------------");

		int num1, num2, num3;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your first number");
		num1 = sc1.nextInt();
		System.out.println("Enter your second number");
		num2 = sc1.nextInt();
		System.out.println("Enter your three number");
		num3 = sc1.nextInt();

		if (!(num1 == num2 && num1 == num3 && num2 == num3)) {

			if (num1 > num2) {
				if (num1 > num3) {
					System.out.println(num1 + " is the greatest");
				}else {
					System.out.println(num3 + " is the greatest");
				}
			}else {
				if (num2 > num3) {

					System.out.println(num2 + " is the gratest");
				}else {
					System.out.println(num3 + " is the gratest");
				}

			}

		}else {
			System.out.println("Numbers are equal");
		}
	}

}
