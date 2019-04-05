package com.class17;

public class Task {

	/*
	 * 1. Create a method that will take 2 parameters as a numbers and prints which
	 * number is larger.
	 * 
	 * 2. Create a method that will take a number and prints whether the number is
	 * even or odd.
	 * 
	 * 3. Create a method that will print whether given String is palindrome or not.
	 */

	// 2.
	public static void main(String[] args) {
		Task twoThree = new Task();
		twoThree.taskTwo(23);
		twoThree.taskThree("ma d am");
	}

	void taskTwo(int a) {
		if (a % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}
	
	void taskThree(String a) {
		
		String new1 = a.replace(" ", "");
		System.out.println(new1);

		String rev1 = "";

		for (int i = new1.length(); i > 0; i--) {
			rev1 = rev1 + new1.substring(i - 1, i);
		}
		System.out.println(rev1);

		if (new1.equals(rev1)) {
			System.out.println("This is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}
	

	
}
