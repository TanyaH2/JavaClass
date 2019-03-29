package com.class8;

public class Task {
public static void main(String[] args) {
	
/*  1. Print numbers from 1 to 100

	2. Print numbers from 100 to 1

	3. Print odd numbers from 1 to 20 (2 ways)

	4. Print even numbers from 20 to 1 (2 ways)

	5. Print even numbers between 20 and 50 (2 ways)

	6. Print odd numbers between 20 and 50 (2 ways)
*/	
	//1.
	for(int a=1; a<=100; a++) {
		System.out.println(a);
	}
	
	System.out.println("-------------------------");
	//2.
	for (int b=100; b>=1; b--) {
		System.out.println(b);
	}
	
	System.out.println("-------------------------");
	//3.
	for (int c=1; c<=20; c+=2) {
		System.out.println(c);
	}
	//3.1
	for (int c=1; c<=20; c++) {
		if (c%2==1) {
			System.out.println("Odd"+c);
		}
	}

	
	System.out.println("-------------------------");
	//4.
	for (int d=20; d>=1; d-=2) {
		System.out.println(d);
	}
	//4.1
	for (int d=20; d>=1; d--) {
	if (d%2==0) {
		System.out.println("Even"+d);
	}
	}
	
	System.out.println("-------------------------");
	//5.
	for(int e=20; e<=50; e+=2) {
		System.out.println(e);
	}
	//5.1
	for (int e=20; e<=50; e++) {
		if (e%2==0) {
			System.out.println("Even"+e);
		}
	}
			
	System.out.println("-------------------------");
	//6.
	for(int f=21; f<=50; f+=2) {
	System.out.println(f);
	}
	//6.1`
	for (int f=20; f<=50; f++) {
		if (f%2==1) {
			System.out.println("Odd"+f);
		}
	}
}
}
