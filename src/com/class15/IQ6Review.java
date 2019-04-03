package com.class15;

import java.util.Scanner;

public class IQ6Review {
	public static void main(String[] args) {

//	6. Write a Java Program to find whether a String is palindrome or not?
		System.out.println("-----Palindrome--------");

		String str11 = "nurses run";
		String hey = str11.replace(" ", "");
		System.out.println(hey);

		String rev1 = "";

		for (int i = hey.length(); i > 0; i--) {
			rev1 = rev1 + hey.substring(i - 1, i);
		}
		System.out.println(rev1);

		if (hey.equals(rev1)) {
			System.out.println("This is a palindrome");
		} else {
			System.out.println("It isn't a palindrome");
		}
		
		System.out.println("--------------------");
		
		Scanner scan=new Scanner(System.in);
		System.out.println( "Plees  enter any sentence or word to  check if it is polidrome");
		String  word=scan.nextLine();
		
		String reverse="";
		
		for (int  i=word.length()-1; i>=0; i--) {
		reverse+=word.charAt(i);
	}
		
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("The word "+word+"  is a polidrome");
			
		}else {
			System.out.println("The word "+word+" is not a polydrome");
		}
		
		
		
		
		
		
		
		
		
		

	}
}
