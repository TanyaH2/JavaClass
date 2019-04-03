package com.class14;

public class GroupTask {
	public static void main(String[] args) {

//	1. Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable?
		
	int	numb1=11;
	int	numb2=222;
	int numb3;

	for( int i=0; i<10; i++);
	numb3=numb1+numb2;
	numb2=numb3-numb2;
	numb1=numb3-numb1;
	
	System.out.println("numb1 is now= "+numb1+" numb2 is now= "+numb2);
	
	String first="Coffee";
	String second="Mug";
	
	System.out.println("first "+first.replace("Coffee","Mug"));
	System.out.println("second "+second.replace("Mug", "Coffee"));
	
	first=first+second;
	//first=second;
	
	second=first.substring(0,first.length()-second.length());
	first=first.substring(second.length());
	System.out.println(first+" "+second);
		
	System.out.println("--------------------------");
		
		int  a11=10;
		int  b11=20;
		
		a11=a11+b11; //30
		b11=a11-b11; //30-20=10
		a11=a11-b11; //30-10=20

				System.out.println("The value of a="+a11+" value of b="+b11);
				System.out.println("-------------------");
		
		String c = "Hello";
		String d = "World";

		System.out.println("String c is " + c + " and String d is " + d);

		c = c + d;

		d = c.substring(0, c.length() - d.length());
		c = c.substring(d.length());

		System.out.println("String c is now " + c + " and String d is now " + d);
		
		System.out.println("-----------------------------");

//	2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		int[] num = { 4, 760, 678, 34, 203 };

		int max = num[0];
		int min = num[0];
		int secMax = num[0];
		for (int a1 = 0; a1 < num.length; a1++) {
			if (num[a1] > max) {
				secMax = max;
				max = num[a1];
			} else if (num[a1] > secMax) {
				secMax = num[a1];
			} else if (num[a1] < min) {
				min = num[a1];
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The second largest is " + secMax);
		System.out.println("The smallest number is " + min);
		
		
		System.out.println("-----------------------------");


		// 3. Find out how many alpha characters present in a string?

		String str2 = "12Hello 3234 Aigera465%^%";
		String newString = str2.replaceAll("[^A-Z a-z]", "");
		System.out.println(newString.length());

		
		System.out.println("-----------------------------");

		// 4.How to find out the part of the string from a string? What is substring?
		// Find number of words in string?

		String four = "How to find out the part of the string from a string";
		// a.How to find out the part of the string from a string?
		String needed = "string";
		System.out.println(four.contains(needed));

		// b.What is substring?
		// Substring it's a String of a String
		//
		// c.Find number of words in string?
		String newstr1 = four.replaceAll("[A-Za-z]", "");
		System.out.println(newstr1.length());
		String[] words = four.split(" ");
		System.out.println(words.length);
		
		System.out.println("-----------------------------");


		// 5. Write a java program to reverse String? Reverse a string word by word?
		String str1 = "We are killing it!";
		String rev = "";

		for (int i = str1.length(); i > 0; i--) {
			rev = rev + str1.substring(i - 1, i);

		}
		System.out.println(rev);

		String[] a = str1.split(" ");
		String rev2 = "";
		String res = "";
		for (int z = 0; z < a.length; z++) {
			String q = a[z];
			String rev1 = "";
			for (int j = q.length() - 1; j >= 0; j--) {
				rev1 += q.charAt(j);
			}
			rev2 += rev1 + " ";
		}
		System.out.println(rev2 + " ");

//			String str="Today we are doing Group Task";
//
//		       int strLeng = str.length()-1;
//
//		       String reverse1="", temp = "";
//
//		         for(int i = 0; i <= strLeng; i++){
//		         temp += str.charAt(i);
//		          if((str.charAt(i) == ' ') || (i == strLeng)){
//		          for(int j = temp.length()-1; j >= 0; j--){
//		          reverse += temp.charAt(j);
//		          if((j == 0) && (i != strLeng))
//		          reverse += " ";
//		            }
//		           temp = "";
//		            
//		          }
//		          }
//		       System.out.println(reverse);

//			6. Write a Java Program to find whether a String is palindrome or not?
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
		
		System.out.println("-----------------------------");


//			7. Write a java program to check whether a given number is prime or not?
		//Prime number should meet two conditions: divisible by 1 and by itself ONLY
		System.out.println("-------Prime-----------");

		String primeN = "";

		for (int i = 1; i <= 100; i++) {
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
		System.out.println();
		
		System.out.println("-----------------------------");

		
//			8. Write a Java Program to print first 10 numbers of Fibonacci series.
		System.out.println("------Fibonacci--------");

		int maxNumber = 10;
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

		for (int i = 1; i <= maxNumber; ++i) {
			System.out.print(previousNumber + " ");
			/*
			 * On each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}

	}
}
