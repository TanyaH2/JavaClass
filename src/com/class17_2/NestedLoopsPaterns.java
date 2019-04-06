package com.class17_2;

import java.util.Scanner;



public class NestedLoopsPaterns {

	public static void main(String[] args) {
//1
		NestedLoopsPaterns one = new NestedLoopsPaterns();
		one.rowsCol();
//2
		NestedLoopsPaterns one1 = new NestedLoopsPaterns();
		one.rowsCol1();
//3
		NestedLoopsPaterns one2 = new NestedLoopsPaterns();
		one2.stars();
////4
//		NestedLPaterns one3 = new NestedLPaterns();
//		one2.stars1();
//5
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you Start and End point");
		int start = sc.nextInt();
		int end = sc.nextInt();
		//int sum1 = 0, sum2 = 0;

		NestedLoopsPaterns one4 = new NestedLoopsPaterns();
		one4.evenOdd(start,end);
//6		
		System.out.println("What do you  want to buy?");
		String prod = sc.nextLine();
		System.out.println("What is the price?");
		int price = sc.nextInt();
		int paid, sum = 0;
		int rem=0;
		System.out.println("Please pay for your " + prod);
        paid = sc.nextInt();
        
        
		NestedLoopsPaterns one5 = new NestedLoopsPaterns();
		one5.sale(prod, paid, rem, price);

//7 
		NestedLoopsPaterns one6 = new NestedLoopsPaterns();
		one6.rowColumn();
		
	}
	void sale(String prod, int paid, int rem, int price) {
		int sum=0;
			do {
				System.out.println("Please pay for your " + prod);
//			    paid = sc.nextInt();
				sum = sum + paid;
				rem = price - sum;
				System.out.println("You need to pay " + rem + " more if you want your " + prod);
			} while (sum != price);

			System.out.println("Thank you for shopping enjoy  your " + prod);
	}
	
	
	     //1
	/*
	 * 
	 * I want to print pattern 12345 ---> 4 rows& 6 COLUMS 123456 123456 123456
	 * 
	 */

	void rowsCol() {
		for (int a1 = 0; a1 <= 5; a1++) {

			for (int b1 = 0; b1 <= 6; b1++) {
				System.out.print(b1);
			}
			System.out.println();

		}
		System.out.println("------2-----");

	}

	// System.out.println("---------------");
//	
	
	//2
	void rowsCol1() {
		for (int a = 0; a <= 5; a++) {

			for (int b = 0; b <= a; b++) {

				System.out.print("*");

			}
			System.out.println();
		}
		System.out.println("------3-----");

	}
	// System.out.println("--------------------");
	
    //3
	void stars() {
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 6; b++) {
				if (a == 1 || a == 4 || b == 1 || b == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println("------4-----");
	}

	// System.out.println("------------------------");

	//4
	void stars1() {
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				if (a == 1 && b == 1 || a == 1 && b == 5 || a == 2 && b == 2 || a == 2 && b == 4 || a == 3 && b == 3
						|| a == 4 && b == 2 || a == 4 && b == 4 || a == 5 && b == 1 || a == 5 && b == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println("------5-----");
	}

//		System.out.println("----------------------");
//
//		/*
//		 * 1. Write a program that reads a range of integers (Start and End point) ,
//		 * provided by a user and then from that range prints the sum of the even and
//		 * odd integers.
//		 */
//

	 //5
	void evenOdd(int start, int end) {
		int sum1 = 0, sum2 = 0;

		if (start < end) {
			for (int a = start; a <= end; a++) {
				if (a % 2 == 0) {//
					sum1 = sum1 + a; // sum1+=a

				} else if (a % 2 == 1) { // }else{
					sum2 = sum2 + a; // sum2+=a
				}
			}
			System.out.println("Sum of even is " + sum1);
			System.out.println("Sum of odd is " + sum2);
			
		}
	}
//		System.out.println("---------------------------");
//
//		/*
//		 * 2. Ask user to enter the item they want to buy and the price for the item.
//		 * Then ask user to pay for it. Every time user enters money accumulate the
//		 * amount and tell user how much is left to pay off the amount. Whenever user
//		 * done with payments tell them "Thank you for shopping!"
//		 */
//
		
	
	//6

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//
//System.out.println("---------------------------------");		


        //7


////3. Print the following pattern:
////1
////12
////123
////1234
////12345
////
//
	

		void rowColumn() {
		for (int z = 1; z <= 5; z++) { // Row
			for (int b = 1; b <=z; b++) { // Column
				System.out.print(b);
			}
			System.out.println(" ");
		}
		System.out.println();
		}
////4. Print the following pattern:
////*
////**
////***
////****
////*****
////****
////***
////**
////*
//
//		for (int q = 1; q <= 5; q++) {
//			for (int w = 1; w <= q; w++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int q = 1; q <= 4; q++) {
//			for (int w = 4; w >= q; w--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
////5.
////
////Write a guessing game where the user has to guess a secret number between 1 and 20.
////After every guess input, the program tells the user whether their number was too large 
////or too small. The program will keep asking the user to enter the number until he finds the 
////correct number. When the correct answer is found the system should display "Congratulations!!. You got it!".
////
//
//		
//		Scanner scan;
//		int secret, userNumber;
//		
//		secret=13;
//		scan=new Scanner(System.in);
//		
//		
//		do {
//			System.out.println("Please  enter your number between 1 and 20");
//            userNumber=scan.nextInt();
//            if (userNumber > secret) {
//				System.out.println(" Your number is larger then number X." + "\r" + "Please Try again");
//			} else if (userNumber < secret) {
//				System.out.println("Your number is smaller then number X." + "\r" + "Please Try again");
//			}
//				//			} else {
////				System.out.println("Congratulations! You are correct!");
////				break;
//			}while(secret!=userNumber);
//			System.out.println("Congratulations! You are correct!");
//		}
//
//		
//	
//		
//	
//	//WRONG
//		
////		int num, x = 9;
////
////		for (int n = 1; n <= 20; n++) {
////			System.out.println("Please  enter your number between 1 and 20");
////			num = sc1.nextInt();
////			if (num > x) {
////				System.out.println(" Your number is larger then number X." + "\r" + "Please Try again");
////			} else if (num < x) {
////				System.out.println("Your number is smaller then number X." + "\r" + "Please Try again");
////			} else {
////				System.out.println("Congratulations! You are correct!");
////				break;
////			}
////		}
////		
//		
//		
//		
//		
//
////6. Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year. 
////As soon as the user enters the correct leap year exit the loop.
//	Scanner sc1 = new Scanner(System.in);{
//		for (int d = 1; d <= 10; d++) {
//			System.out.println("Please enter a leap year");
//			int year = sc1.nextInt();
//			if (year % 4 == 0) {
//				System.out.println("You are correct" + year + " is a leap year");
//				break;
//			} else {
//				System.out.println("You are wrong " + year + " is not a leap year");
//			}
//		}
//
//		System.out.println("-----------------------");
//		
//		
//		// if year is divisible by 400--->leap year
//		// if year is divisible by 100--->not a leap year
//		// if year is divisible by 4--->leap year
//		//((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));- the same
//		for (int d = 1; d <= 10; d++) {
//			System.out.println("Please enter a leap year");
//			int year = sc1.nextInt();
//			if (year % 400 == 0) {
//				System.out.println("You are correct" + year + " is a leap year");
//				break;
//			} else if(year%4==0 && year%100!=0) {
//				System.out.println("You are correct " + year + " is a leap year");
//				break;
//			}else {
//				System.out.println("You are wrong " + year + " is NOT a leap year");
//			}
//		}
//	
}

