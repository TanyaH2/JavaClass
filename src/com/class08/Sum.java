package com.class08;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	
	int sum=0;
	
	for (int i=1; i<=5; i++) {
		sum=sum+i;
		
	}
	System.out.println(sum);
	
	
	System.out.println("-------------------------");
	/*
	 * find sum of all even number from 1 to 100
	 */
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter you Start and End point");
	int start = sc.nextInt();
	int end = sc.nextInt();
	//int sum1 = 0, sum2 = 0;
	int sum1=0;
	for (int a=start; a<=end; a+=2) {
		sum1=sum1+a;
	}
	System.out.println(sum1);
}
}
