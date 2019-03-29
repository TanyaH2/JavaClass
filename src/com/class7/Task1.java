package com.class7;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	
/*
 * create a boolean variable workDay and assign true
 * create int variable day and assign it to 1
 * as long as it is workDay print--> "I need a day off" and increment day
 * day once day is 6 --> your condition for your loop should become false
 * 
 */
		////////////
	boolean workDay2 = true;
	int day2 = 1;
	
	while(workDay2) {
		if (day2==6) {
			System.out.println("I don't need a day off");
			workDay2=false;
		}else {
			System.out.println("I need a day off");
		}
		day2++;
	}
	System.out.println("----------------------------");

//	boolean workDay1=true;
//	int day1;
//	Scanner sc= new Scanner(System.in);
//	System.out.println("enter the day");
//	day1= sc.nextInt();
//	while (day1<=7) {
//
//	  if(day1<=5) {
//		  System.out.println("I need a day off");
//		
//	  }else { 
//		  System.out.println("false");
//		  
//	  }
//	  day1++;
//	  }
	System.out.println("-------------------------------");
	
	
//	boolean workDay = true;
//	int day = 1;
//	
//	while(workDay) {
//			
//		}if (day==6) {
//			System.out.println("I don't need a day off");
//			workDay=false;
//		}else {
//			System.out.println("I need a day off");
//		}
//		day++;
//	
	}
}
