package com.class17;

public class NoMainMethod {

	// methods and variables are member of the class

	// variables;
	// method();
	// void hello() { hello - is a method name
	// }
	// public static void main() {
	//
	// }

	String str;  //data members
	int num;

	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
		System.out.println("Hello");
		System.out.println("Hello friends");
	}

	void bye() {
		System.out.println("Bye");
	}

	public static void main(String[] args) {// method signature with {method body}
		NoMainMethod obj = new NoMainMethod();// created the instants of the object being creater, objectinated
		obj.hello();// we are calling a method hello {method body}
		obj.bye();
		obj.howAreYou();
	}

	void howAreYou() {
		System.out.println("How are you?");
	}
}
