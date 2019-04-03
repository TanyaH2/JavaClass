package com.class15;

import java.util.Scanner;

public class IQ7Review {
	public static void main(String[] args) {

//	7. Write a java program to check whether a given number is prime or not?
//Prime number should meet two conditions: divisible by 1 and by itself ONLY
		// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
		// 73, 79, 83, 89, 97,

		// num 1 - omposite number

		System.out.println("-------Prime-----------");

		String primeN = "";

		for (int i = 2; i <= 100; i++) { // starting from 2 because every num is divisible by 1
			int count = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					count = count + 1;
				}

			}
			if (count == 2) {
				System.out.print(i + ", ");

			}
		}

		System.out.println("\n----------------------");

		Scanner input = new Scanner(System.in);

		int number = 97;
		boolean prime = false;
		if (number == 1 || number == 2 || number == 3) {
			prime = true;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i != 0) {
					prime = true;
				} else {
					prime = false;
					break;
				}
			}
		}
		System.out.println("Number " + number + " is prime: " + prime);

		
System.out.println("----------------------");
		
		
			int number1;
			Scanner input1 = new Scanner(System.in);
			System.out.println("Please enter a number to check if it is prime");
			number1 = input1.nextInt();
			boolean prime1 = true;
			for (int i = 2; i < number1; i++) {
				if (number1 % i != 0) {

				}else {
					prime1 = false;
					break;
				}
			}
			System.out.println(prime1);
		
		
	}
}
