package com.class4;

import java.util.Scanner;

//Write a program to ask user to enter numbers of worked years and annual salary. 
//If user worked for more or equals to 5 years than user is eligible for the bonus, 
//otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, 
//otherwise bonus=3000.

public class Task5 {
public static void main(String[] args) {
	
	Scanner job= new Scanner(System.in);
	
 System.out.println("What is your experience in years?");
   int exp=job.nextInt();
   
   
  if (exp>=5){
	  System.out.println("You  are eligible for bonus!");
	  System.out.println("What is your salary?");
	   int salary=job.nextInt();
	  
	  if (salary>50000) {
		  System.out.println("You are  eligible for the bonus of  5000!");
	  }else {
		  System.out.println("You  are eligible for  bonus of  3000!");
	  }
  }else {
	  System.out.println("You are not eligible for bonus.");
  }
}
}
