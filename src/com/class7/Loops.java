package com.class7;

public class Loops {
public static void main(String[] args) {
	

	
//	Loops in Java
//	while
//	do  while
//  for
//  enhanced for loop(for  each loop)  //collections or arrays
//	
	
//	boolean morning=true;
//	if (morning) {
//		System.out.println("Good morning");  //print only once
// 	}
//	
	System.out.println("---------------------------");
	
//	while (morning) {
//		System.out.println("Good morning");  //infinite times
//	}
	
	System.out.println("-----------------------------------");
	
	int a=1;
	while (a<10) {
	System.out.println("Good Morning");
	a++;
	}
	
	
//	System.out.println("-----------------------------------");
//	//print only odd numbers from 1 to 20
//
//	int l = 1;
//	while (l <= 20) {
//		if (l % 2 != 0) {
//			System.out.println("in the loop");
//			System.out.println(l);
//		}
//
//		l++;
//	}
//
//System.out.println("--------------------------------");	
//	//print only even numbers from 10 to 100
//	
	int z=10;
	while (z<=100) {
		if (z%2==0) {
//			System.out.println("loop2");
			System.out.print("||"+z);
		}
		z++; //z+=2
	}
	
}
}
