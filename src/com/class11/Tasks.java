package com.class11;

public class Tasks {
	public static void main(String[] args) {

		// 1 Asel Umurzakova (Instructor) [11:09 AM]
		// Create an array of cars and store 6 elements into it. Using 2 different loops
		// print all values from the array.
		String[] cars = { "Nissan", "BMW", "Toyota", "Ram", "Tesla", "Honda" };
		for (int a = 0; a < cars.length; a++) {
			System.out.println(cars[a]);
		}
		System.out.println("---------------------");
		for (String monkey : cars) {
			System.out.println(monkey);
		}

		System.out.println("--------------------------");
		// 2
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.
		// (use 2 different loops).

//	String[] country= {"Ukraine", "USA","Russia,"Canada"}{"Kiev", "Washington DC", "Moscow","Ottawa"};
//	for int

		
		
		String[] country = { "Ukraine", "USA", "Russia", "Canada" };
		for (int z = 0; z < country.length; z++) {
			if (z == 0) {
				System.out.println("Kiev is the capital of " + country[z]);
			} else if (z == 1) {
				System.out.println("Washington DC is the capital of the  " + country[z]);
			} else if (z == 2) {
				System.out.println("Moscow is the Capital of " + country[z]);
			} else {
				System.out.println("Ottawa is the Capital of " + country[z]);
			}
		}
		System.out.println("------------");
//		 String[] country= {"Ukraine", "USA","Russia","Canada"};
		for (int z = 0; z < country.length; z++) {
			if (country[z].equals("Ukraine")) {
				System.out.println("Kiev is the capital of " + country[z]);
			} else if (country[z].equals("USA")) {
				System.out.println("Washington DC is the capital of the " + country[z]);
			} else if (country[z].equals("Russia")) {
				System.out.println("Moscow is the Capital of " + country[z]);
			} else {
				System.out.println("Ottawa is the Capital of " + country[z]);
			}
		}
		
		
		System.out.println("---------------------");
//	String[] country= {"Ukraine", "USA","Russia","Canada"};
		for (String cc : country) {
			switch (cc) {
			case "Ukraine":
				System.out.println("Kiev is the capital of " + cc);
				break;
			case "USA":
				System.out.println("Washington DC is the capital of the" + cc);
				break;
			case "Russia":
				System.out.println("Moscow is the capital of " + cc);
				break;
			case "Canada":
				System.out.println("Ottawa is the capital of " + cc);
				break;
			}

		}
		System.out.println("=============================");
		String[][] countries= {{"Ukraine", "USA","Russia","Canada"},
				               {"Kiev","Washington DC",  "Moscow","Ottawa"}};
		for(int a=0; a<countries.length-1;  a++) {
			for (int d=0; d<countries[a].length; d++)
			System.out.println(countries[0][d]+ " - " +countries[1][d]);
		}
		
	

		System.out.println("----------------------");
		// 3
		// Create an array on integers and calculate the sum of all elements in an
		// array.

		int[] num = { 23, 45, 1, 34, 78, 2 };
		int sum = 0;
		for (int w = 0; w < num.length; w++) {
			sum = sum + num[w];
		}
		System.out.println(sum);

	}
}
