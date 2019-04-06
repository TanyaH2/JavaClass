package com.class17_2;

import com.class17.Calculator;

public class Aplication {
	public static void main(String[] args) {

		Calculator obj1 = new Calculator();

//		int a = obj1.sum();
//		int b = obj1.sub();
//		int c = obj1.div(23, 5);
//		int d = obj1.mult(34, 89); // need to change to public  in a calculator folder
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);

		Aplication app = new Aplication();
		System.out.println(app.exmple7('A'));

	}

	void example() {
		System.out.println("No return value and NO Parameters");
	}

	void exmple2(String name) {
		System.out.println("No return value BUT with Parameter: " + name);
	}

	boolean example3() {
		System.out.println("Return value and NO Parameters");
		return true;
	}

	String exmple4(String name) {
		System.out.println("Return value and With Parameter: " + name);
		return name;
	}

	boolean exmple5(String name) {
		System.out.println("Return value and With Parameter: " + name);
		return true;
	}

	char exmple6(char name) {
		System.out.println("Return value and With Parameter: " + name);
		return name;
	}

	long exmple7(char name) {
		System.out.println("Return value and With Parameter: " + name);
		return name;
	}
}
