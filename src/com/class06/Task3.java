package com.class06;

import java.util.Scanner;

public class Task3 {
//	HomeWork: Using scanner class create calculator. 
//	Allow user to enter 2 numbers and operator(+,-,*,/). 
//	Based on operator provide the result to user.
	
	public static void main(String[] args) {
		
	Scanner sc;
	char calc;
	int num1, num2, answer;
	
	
	sc=new Scanner(System.in);
	System.out.println("Enter first number");
	num1=sc.nextInt();
	System.out.println("Enter first number");
	num2=sc.nextInt();
	System.out.println("Enter operation that you want to perform");
	calc=sc.next().charAt(0);
	
	
	switch (calc) {
	case ('+'):
		answer=num1+num2;
	break;
	case ('-'):
		answer= num1-num2;
	break;
	case ('*'):
		answer= num1*num2;
	break;
	case ('/'):
		answer=num1/num2;
		break;
	default:
		answer=0;
	}
	System.out.println(" Your answer is "+ answer);
	}
}
