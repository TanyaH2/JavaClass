package com.class02;

public class ArithmeticOperators {
	public static void main(String[] args) {
		//declare 2 int variables and then we perform:
		//addition, substruction, multiplication,  division
		
		int a=30;
		int b=15;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		int div=a/b;
		
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		//print: the ___ of 2 numbers is ____
		
		System.out.println("The addition of 2 numbers is "+sum+".");
		System.out.println("The substraction of 2 numbers is "+sub+".");
		System.out.println("The multiplication of 2 numbers is "+mult+".");
		System.out.println("The division of 2 numbers is "+div+".");
	}

}
