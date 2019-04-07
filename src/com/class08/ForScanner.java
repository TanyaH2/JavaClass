package com.class08;

import java.util.Scanner;

public class ForScanner {
public static void main(String[] args) {
	
	// promt user to enter 2 int and compare
	//at the end print largest
	
	Scanner myScan;
	int num1, num2, largest=0;
	myScan= new Scanner(System.in);
	
	
	for (int i=1; i<=5; i++) {
		
		
	System.out.println("First Num");
	num1=myScan.nextInt();
	
	System.out.println("Second Num");
	num2=myScan.nextInt();
	
	
	if (num1>num2) {
		largest=num1;
		
	}else if (num2>num1) {
		largest=num2;
	}else {
		
		System.out.println(num1+" equal "+num2);
		
	}
	System.out.println(largest+" is the largest");
	}
}
}
