package com.JavaReview;

import java.util.Scanner;

public class JavaReview3 {
	/*
	 * Write program to find out what to do for the folowing temp
	 *  //Temp is >100 print out Stay inside it's too hot
	 *  //temp  >50  and <99 - Wear summer clothes
	 *  //Temp  >30 and  <49 -wear winter clothes
	 *  //temp  >10 and  <29 -Stay inside it's too cold
	 *   // lastly if temp is lower than that print out - Call for help it's too cold outside
	 */
public static void main(String[] args) {
	int temp =76;
	String output;
	
	
	if (temp>=100) {
		output="Stay inside it's too hot";
	}else if (temp>=50 && temp<=99) {
		output= "Wear summer clothes";
	}else if (temp>=30 && temp<=49) {
		output="Wear winter clothes";
	}else if (temp>=10 && temp<=29) {
		output="Stay inside it's too cold";
	}else {
		output="Call for help it's too cold outside";
	}
			System.out.println(output);
			
	System.out.println("------------------------------------");
//	
	

    //Write a program that allows a user to input age to find out if the user is either Too Young, 
	//Young Person, Middle Age Person, or  too Old
    // Age should NOT be greater than 18  print out  Too Young
    // Age should be between 18 and 35 inclusive  print out Young Person
    // Age should equal 36 or less than or equal to 99 inclusive print out  
	//You are Middle Age Person
    // If the age is greater than 100  print print out  You are too Old
    // Create an int variable named age
    // Must use a Scanner
		
//	
//	Scanner sc= new Scanner(System.in);
//	System.out.println("How old are you");
//	int age= sc.nextInt();
//	String outcome;
//	
//	 if(!(age>=18)) {
//		 outcome="Too young";
//	 }else if(age>=18 && age<=35) {
//		 outcome="Young person";
//	 }else if(age>=36 || age<=99) {
//		 outcome="You are Middle Age Person";
//	 }else {
//		 outcome="You are too old";
//	 }
//	 System.out.println(outcome);
	
	//Write the program that will use switch statement to display what day of the week
	 
//	 int day=6;
//		String dayName;
//		
//		switch (day) {
//		case 1:
//			dayName="Monday";
//			break;
//		case 2:
//			dayName="Tuesday";
//		    break;
//	    case 3:  
//	    	dayName="Wednesday";
//	    	break;
//	    case 4:
//	    	dayName="Thursday";
//	    	break;
//	    case 5:
//	    	dayName="Friday";
//	    	break;
//        default:
//        	dayName="Weekend";
//		}
//		System.out.println("Today is "+dayName);
	 
	 
	 
	 
	 //Write a program that will use switch statement to display what  month
	
	
		
		
		
	// Write a program to found out the user level of experience
    // Must use a switch statement with  a String variable named levelString 
	//and a int variable named level
        
    // Beginner level should be 1
    // Intermediate level should be 2
    // Expert level should be 3
	
	
	
	
	
	


	   
	
	
}}
	
	

