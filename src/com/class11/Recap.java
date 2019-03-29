package com.class11;

public class Recap {
	public static void main(String[] args) {

		// let's create and array of names that will hold 5 elements and retrieve all
		// values from it
		// 1. create an array using new keyword
		String[] names = new String[5];

		names[0] = "John";
		names[1] = "Jane";
		names[2] = "Josh";
		names[3] = "Jane";
		names[4] = "Jess";
		// names[5]="Jack"; will get an runtime exception when trying access it
		// "java.lang.ArrayIndexOutOfBoundExeption"

		for (int a = 0; a < names.length; a++) {

			System.out.println(names[a]);

		}
		System.out.println("----------------------------------");
		// //2. create an array using array literal
		// 2 6 10 14
		String[] studentNames = { "Sam", "Sally", "Sarra", "Stan" };

		// --------------For Loop------------------
		for (int a = 0; a <= studentNames.length - 1; a++) {
			System.out.println(studentNames[a]);
		}

	   	// Retrieve values using: advanced for loop, for each loop, enhanced for loop

		// -----------Advanced For Loop------------
        //                          2       6       10       14
        //String[] studentNames= {"Sam", "Sally", "Sarra", "Stan"};
		       // 3 7 11 15 : 1 5 9 13
		for (String student : studentNames) {
			               // 4 8 12 16
		
		System.out.println(student);
		}
	}
}
