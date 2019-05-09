package com.class23;

public class Addition {

	// OVERLOADING methods by changing number of parameters

	public void add(int a, int b) {
		System.out.println("Method to add 2 int");
		System.out.println(a + b);
	}

	public void add(int a) {
		System.out.println("Method to add 100 to int");
		System.out.println(a * 100);
	}

	public void add(int a, int b, int c) {
		System.out.println("Method to add 3 int");
		System.out.println(a + b + c);
	}

	// OVERLOADING methods by changing the data of the parameters
	public void add(double a, String b) {
		System.out.println("Method to add double and String");
		System.out.println(a + b);
	}

	public void add(double a, double b) {
		System.out.println("Method to add 2 double");
		System.out.println(a + b);
	}

	public void add(double a, int b) {
		System.out.println("Method to add double and int");
		System.out.println(a + b);
	}

	public void add(double a) {
		System.out.println("Method to add 100 to double");
		System.out.println(a + 100);
	}

	public void add(double a, double b, double c) {
		System.out.println("Method to add 3 doubles");
		System.out.println(a + b + c);
	}

}
