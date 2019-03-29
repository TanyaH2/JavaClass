package com.class7;

public class WhileLoop {
public static void main(String[] args) {
	

	
//	Loops in Java
//	while
//	do  while
//  for
//  enhanced for loop(for  each loop)  //collections or arrays
//	
	
	boolean morning=true;
	if (morning) {
		System.out.println("Good morning");  //print only once
 	}
	
	System.out.println("-----------------------------------");
	
//	while (morning) {
//		System.out.println("Good morning");  //infinite times
//	}
	
	System.out.println("-----------------------------------");
	
	int a=1;
	while (a<5) {
	System.out.println("Good Morning");
	a++;
	}
	
	System.out.println("-----------------------------------");
	
	int b=1;
	while (b<5) {
		System.out.println("I am inside while loop"+b);
		b++;
	}
	System.out.println("\nI am outside while loop\n");
	
	/*
	 * I want to print values from 10 to 20 inclusive
	 */
	
	int z=10;
	while (z<=20) {
		System.out.println(z);
		z++;
	}
	
	/*
	 * I want to print values from 1 to 20 inclusive but all in 1 line with space
	 */
	
	int q=1;
	
	while(q<=20) {
		System.out.print(q+" ");
		q++;
	}
	
	
	System.out.println("\n-------------------------------");
	
	
	/*
	 * I want to print values from 10 to 1
	 */
	
	int e=10;
	while (e>=1) {
		System.out.println(e);
		e--;
	}
	
	System.out.println("-----------------------------------");
	
	int a1=1;
	while (a1<10) {
	System.out.println("Good Morning");
	a1++;
	}
	
	
	System.out.println("-----------------------------------");
	//print only odd numbers from 1 to 20

	int l = 1;
	while (l <= 20) {
		if (l % 2 != 0) {
			System.out.println("in the loop");
			System.out.println(l);
		}

		l++;
	}

System.out.println("--------------------------------");	
	//print only even numbers from 10 to 100
	
	int z1=10;
	while (z1<=100) {
		if (z1%2==0) {
//			System.out.println("loop2");
			System.out.print("||"+z1);
		}
		z1++; //z+=2
	}
}
}