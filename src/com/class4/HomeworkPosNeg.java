package com.class4;

public class HomeworkPosNeg {
	public static void main(String [] args) {
		//4.3
		//The variable "num" holds an integer user input
		//Write a conditional statement starting on line 9 that does the following:
		//If num is positive, print "__ is positive"
		//If num is negative, print "__ is negative"
		//
		//Examples:
		//In: 5
		//5 is positive
		//In: -2
		//-2 is negative
		//In: 0
		//(no output for zero) 
		
		int num1=-77;
			 if (num1>0) {
				 System.out.println("Positive");		 
			 } else  {
				
				 if (num1<0) {
				 System.out.println("Neg");
			    }else{
			    System.out.println(); //("Equals 0"); OR ();
			    }
			    }
System.out.println("--------------------------------------");

		int num2=9;
		 if (num2>0) {
			 System.out.println("Positive");		 
		 } else if (num2<0) {
			 System.out.println("Neg");
		 } else {
			 System.out.println("0");
		 }

	}
}
