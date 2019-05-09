package com.class22;

/*3.
* Write a program that will have a private default constructor class and create
* 2 objects of this class: 1 - inside same class; 2 - from outside the class.
public class Task3 {
*/

public class Task3 {
	private Task3() {
		System.out.println("I am a constructor with no parameters");
	}

	private Task3(String str) {// str- local variable to a constructor
		System.out.println("I am a constructor with 1 parameter " + str);
	}

	Task3(int a, String str) {// str- local variable to a constructor
		System.out.println("I am a constructor with 2 parameters " + a + " and " + str);
	}

	public static void main(String[] args) {
		Task3 obj = new Task3();
		Task3 obj1 = new Task3("String");
		Task3 obj2 = new Task3(123, "String");
	}
}
