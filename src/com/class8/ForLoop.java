package com.class8;

public class ForLoop {
/*
 * int a=1;
 * while (a<10) {
 * System.out.println("Good Morning");
 * a++;
 * }
 *	
 * 
 * 
 *  for (int i=0; i<=5; i++){
 * System.out.println("Good Morning");
 *  }
 */
public static void main(String[] args) {
	
	
	//initialize condition/test Condition increment/decrement
	
	//steps   1              2,5,8          4,7,10
	  //initialization     condition      increment/decrement
	for (int i=1;          i<=10;         i++) {
	//	     3,6,9
		System.out.println("Good Morning "+i);
	}
	System.out.println("-------------------------");
	//I want to print numbers 10 to 1
	for (int i=10;          i>=1;         i--) {
		System.out.println(i);
	}
	//what is the output
	
	System.out.println("-------------------------");
	
	for (int a=3; a<=70; a+=2) {
		System.out.println(a);
	}
	System.out.println("-------------------------");
	
	
	
	
	
  }		
}
