package com.class17;

public class Calculator {
	
	// No NEED for main method and calling can be done only in other folder
	
	
//	public static void main(String[] args) {
//
//		
//		
//      Calculator obj1 = new Calculator();
//      int a=obj1.sum();
//		obj1.sub();
//		obj1.div(9766,45);
//		obj1.mult(34,89);
//		System.out.println(a);
//		System.out.println(obj1.sub());
//		System.out.println(obj1.div(9766,45));
//		System.out.println(obj1.mult(34,89));
//	}

	public int sum() {
		int a = 10, b = 12;

		return (a + b);
	}

 	public int sub() {
		int a = 65, b = 12;

		return (a - b);
	}

	public int div(int a, int b) {
		//int a = 10, b = 12;

		return (a / b);
	}

	 int mult(int a, int b) {
		//int a = 10, b = 12;

		return (a * b);
	}

}
