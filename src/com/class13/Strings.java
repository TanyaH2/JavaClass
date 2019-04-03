package com.class13;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {

		// 1. Create a String and print it in reverse order (Sunday → yadnuS).

//		String day = "Sunday";
//		for (int a = day.length() - 1; a >= 0; a--) {
//			System.out.print(day.charAt(a));
//		}

		// 2. Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String

		String str = "I created new String!";

		if (!(str.isEmpty())) {
			if (str.length() % 2 != 0 && str.length() >= 3) {
				System.out.println(str.charAt(str.length() / 2));

			}
		}

//		Write a program that reads two people’s first names and if they expecting boy or girl? 
		//Based on the input suggests a name for a baby:
//			Example Output:
//			Mom’s first name? Mary
//			Dad’s first name? Daniel
//			Boy or Girl? boy
//			Suggested baby name: DANRY
//
//			Example Output:
//			Mom’s first name? Mary
//			Dad’s first name? Daniel
//			Boy or Girl? girl
//			Suggested baby name: MAIEL
		
		
	/*
	 * Scanner scan;
	 * String mom, dad, baby, babyN;
	 */
//		Scanner scan; 
//		String motherName,fatherName, gender, babyName;
//		
//		scan=new Scanner(System.in);
//		System.out.println("Please enter mothers name");
//		motherName=scan.nextLine();
//		
//		System.out.println("Please enter fathers name");
//		fatherName=scan.nextLine();
//		
//		System.out.println("Please enter expected gender");
//		gender=scan.nextLine();
//		
//		
//		if(gender.equalsIgnoreCase("boy")) {
//			babyName=fatherName.substring(0, fatherName.length()/2)+
//					motherName.substring(motherName.length()/2);
//		}else if(gender.equalsIgnoreCase("girl")){
//		babyName=motherName.substring(0, motherName.length()/2)+
//				fatherName.substring(fatherName.length()/2);
//		}else {
//			babyName="No suggestion";
//			
//		}
//		System.out.println(babyName.toUpperCase());
	
		
		String babyN=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please input mom's name");
		String mom=scan.nextLine();
		System.out.println("Please input dad's name");
		String dad=scan.nextLine();
		System.out.println("Expected baby's gender");
		String baby=scan.nextLine();
		
		if (baby.equalsIgnoreCase("boy")){
			//System.out.println((dad.substring(0,3))+(mom.substring(2)));
			babyN=dad.substring(0, dad.length()/2)+mom.substring(mom.length()/2);
		}else if(baby.equalsIgnoreCase("girl")){
			//System.out.println(mom.substring(0,2)+dad.substring(3));
			babyN=mom.substring(0, mom.length()/2)+dad.substring(dad.length()/2);

		}else{
			System.out.println("No suggestions");
		
		}
		System.out.println(babyN.toUpperCase());
		
	}
}
