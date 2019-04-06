package com.class17;

public class Greetings1 {
	public static void main(String[] args) {
		Greetings1 obj = new Greetings1();
		             // Argument
		obj.askHowAreYou("Bob");// Argument
		obj.askHowAreYou1("Yaro");
		obj.askHowAreYou2("Koda");
		obj.askHowAreYou3("Roxy");
	}
	                 // Parameter
	void askHowAreYou(String name) {// Parameter
		System.out.println("How are you " + name + "?");
	}
// void is a return type, askHowAreYou-method name
	void askHowAreYou1(String name) {
		System.out.println("How are you " + name + "?");
	}

	void askHowAreYou2(String name) {
		System.out.println("How are you " + name + "?");
	}

	void askHowAreYou3(String name) {
		System.out.println("How are you " + name + "?");
	}
}
