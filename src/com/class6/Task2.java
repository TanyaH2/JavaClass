package com.class6;

import java.util.Scanner;

public class Task2 {

//Allow user to enter grade and then provide explanation: 
//A-Excellent, B-Good, C-Average, D-Bad, any other grade --> 
//Not Acceptable. At the end your program should print 
//which grade was entered by a user with explanation.
public static void main(String[] args) {
	
	Scanner sc;
	char grade;
	String exp;
	
	 sc=new Scanner(System.in);
	 System.out.println("Please provide your grade");
	 grade=sc.next().charAt(0);
	 
		switch (grade) {
		case 'A':
			exp = "Excellent";
			break;
		case 'B':
			exp = "Good";
			break;
		case 'C':
			exp = "Average";
            break;
		case 'D':
			exp = "Bad";
			break;
			default:
				exp = "Not Acceptable";
		}
System.out.println("Your grade means "+exp);
		}
	
	
}

