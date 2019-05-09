package com.class32;

import java.util.Arrays;

//Also MUST look over Map interface and HashMap class.
/*
* For Saturday please complete the following tasks:
1. Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.

2. Create an array of Strings and using Arrays class  class sort the values of that array of Strings.

3. Create an HashSet of cities and add duplicates into it.
  Retrieve all values from hashset in 2 different ways.
  Retrieve all values in alphabetical order.

*/
public class Task2 {

	public static void main(String[] args) {
		
		System.out.println("------2nd task---------");
		String[] strA = { "Hello", "Bye","Morning","Night"};
		
		Arrays.sort(strA);
		for (String str: strA) {
		System.out.println(str);
		}
		
		
	}
}
