package com.JavaReview;

import java.util.Scanner;

public class JavaReview4 {
public static void main(String[] args) {
	double discount;
	char code = 'C' ;

	switch ( code )
	{
	case 'A':
	discount = 0.0;

	case 'B':
	discount = 0.1;

	case 'C':
	discount = 0.2;

	default:
	discount = 0.3;
	}
	
	/*
	 * Write the program that prints "I am feeling happy today" 10 times using for loop and 
	 * 
	 * Write the program that prints starting at 18 decreasing in multiples of 3
	 */
	  if( 1 > 2 )
	  {
	  System.out.println(" 1 is greater than 2");
	  }
	  else

	  {
	  System.out.println(" 2 is greater than 1");
	  }
	
	
	
	
	boolean happy =true;
	while (happy) {
		System.out.println("I am happy today");
		happy =false; 
		
	}
	System.out.println("-----------------------");
	boolean happy1 =true;
	int num=0 ;
	
	while (happy1) {
		System.out.println("I am happy today1");
		num++;
		//happy1 =false; 
		if (num==9) {
			break;
		}}
		
	System.out.println("---------------------");
	
	
	
	for (int i=0; i<10; i++) {
		System.out.println("I am happy today"+i);
	}
	
	
	
	
	System.out.println("------------------------");
	
	for(int a=18; a>0; a--) {
		if(a%3==0){
			System.out.println(a);
		}
	}
	
//	System.out.println("---------------------");
//	
//	for(int z=0; z<=30; z++) {
//		if(z<10) {
//			break;
//			System.out.println("the time is 07:0"+z);
//		}else {
//		System.out.println("the time is 07:"+z);
//		}
//	}
//	
//	System.out.println("----------------------");
	
//	int min
	 int number;
     
     Scanner userInput = new Scanner(System.in);
     
     System.out.println("Enter a positive number: ");
     number = userInput.nextInt();
     
     for(int i = 1; i <= 10; i++) {
         System.out.println(number+" * "+i+" = "+number*i);
     }
 }


}

