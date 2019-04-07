package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {
public static void main(String[] args) {
	
///*
// * Promt user to ask the name3 times and print "You are doing great  " 
// */
//	Scanner sc;
//	String name;
//	
//	
//	sc= new Scanner(System.in);
//	int a=1;
//	
//	while(a<=3) {
//		System.out.println("Please enter your name");
//	    name= sc.nextLine();
//	    System.out.println("You are doing great  "+name+"\n");
//	
//	a++;
//	}
//----------------------------------------------
	
	/*Ask user to pay for a soda
     *keep asking user to pay for soda until entered price is not equal to 1.99
     *after user got a right amount print "Please enjoy your soda"
	 */
	
	Scanner sc= new Scanner(System.in);
	double price;
	
	do {
	System.out.println("Please pay for your soda");
price=sc.nextDouble();
    }while (price!=1.99); 
		
    	System.out.println("Enjoy your soda");
	}
		//price++;

	}

