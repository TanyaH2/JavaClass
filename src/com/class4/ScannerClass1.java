package com.class4;

import java.util.Scanner;

public class ScannerClass1 {
public static void main(String[] args) {
	
	//ask user for the name and print Good morning __
	
//	Scanner bb8= new Scanner (System.in);
//	System.out.println("What is  your name?");
//	
//        String day=bb8.nextLine();
//        System.out.println("Nice to meet you "+day+".");
//
//    Scanner num= new Scanner(System.in);
//    System.out.println("How old  are you?");
// 
//        int age=num.nextInt();
//        System.out.println("Oh WOW you're old!");
//        
//    Scanner score=new Scanner(System.in);
//    System.out.println("What is your initial?");
//    
//       char grade=score.next().charAt(0);
//       System.out.println("Go back to the moon "+day+" "+grade+".");
        
     //IMPORTANT: Must use a Scanner class

       //Write a java program that prints out true if ( x * y ) return a positive value. Else prints out false if  (x * y) return a negative value.

       //Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number"-for the 2nd number

       //Step 2: Create the if condition to check the X and Y value validation for the sign value

       //Step 3: If it is positive value user would get True if it negative value user would get false
       
       Scanner scan= new Scanner(System.in);
       System.out.println("Please enter the first number");
       int num1=scan.nextInt();
       System.out.println("Please enter second number");
       int num2=scan.nextInt();
       
       
      
      int z=num1*num2;
      
       if(z>0) {
    	   System.out.println("true");
    	   
       }else {
    	   System.out.println("false");
       }
       
       
       
       
}
}
