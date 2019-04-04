package com.JavaReview;

import java.util.Scanner;

import com.class16.Dog;

public class JavaReview7 {

	String eyes, hair, nose, shirt;// atributes- outside the method calls GLOBAL
	String ReverseString;

	public static void main(String[] args) {
		// z- object or variable
		JavaReview7 z = new JavaReview7();

		z.eyes="blue";
		z.hair="blue";
		z.nose="brown";
		z.shirt="gray";
		z.noReturn();
		z.humanEyes();
		z.scannerFirstName();
		z.scannerInt();

		z.vowals();
		z.vowals1();
		System.out.println(z.eyes);
		JavaReview7 z1 = new JavaReview7();
		z1.eyes = "blue";
		System.out.println(z1.eyes);

		JavaReview7 q= new JavaReview7();
		q.ReverseString="seigolonhceT xatnyS";
		 for (int a=q.ReverseString.length(); a>0; a--) {
				 System.out.print(q.ReverseString.substring(a-1,a));
		 }
		

	}

	void humanEyes() {
		JavaReview7 z1 = new JavaReview7();

		z1.eyes = "red";
		System.out.println(z1.eyes);
	}

	void noReturn() {
		System.out.println("I do not have a return type");

	}

	void scannerFirstName() {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}

	void scannerInt() {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}

//	   Create a String method called ReverseString
//     method return the string you hard coded
//     in reverse order(This is the static way)
//     have the string you will create will say
//     "seigolonhceT xatnyS"

	void reverseString() {
		String str = "seigolonhceT xatnyS";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
			System.out.println(reverse);
		}
		// System.out.println(reverse);

	}

	void vowals() {
			String str1="hello world my name Is wEqas";
			char[] ar=str1.toCharArray();
			char empty;
			for(int a=0; a<ar.length; a++) {
			  
			 if (ar[a]=='a' || ar[a]=='A' ||ar[a]=='e' ||ar[a]=='E' 
					 || ar[a]=='i' ||ar[a]=='I' ||ar[a]=='o' ||ar[a]=='O' ||
					 ar[a]=='u' ||ar[a]=='U'||ar[a]=='y' ||ar[a]=='Y') {
				 empty=ar[a];
				 System.out.print(empty+", ");
			
			 }} 
			
		
			}	 

	

		    void vowals1() {
		        String z="hello world my name Is wEqas";
		        String replace =z.replaceAll("[^aA,eE,iI,oO,uU,yY]", "");
		        //String replace =string.replaceAll("[^aA,eE,iI,oO,uU]", "");
		        System.out.println();
		        System.out.println(replace);
		
			
		}

}
