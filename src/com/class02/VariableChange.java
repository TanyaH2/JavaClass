package com.class02;

public class VariableChange {
	public static void main(String[] args) {

		String lastName = "Smith";
		System.out.println(lastName);

		lastName = "Johnson";
		System.out.println(lastName);

		char grade = 'B';

		// char grade='A'; do not work
		grade = 'A';

		// creating a variable& assigning the value
		String city = "Fairfax";

		// printing value of the city
		System.out.println(city);
		
		// changing value of the city from Fairfax to NY
		city = "New York"; 
		// value of variables is changed

		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);

	}
}
