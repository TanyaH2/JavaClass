package com.class30;

public class WrapperClass {

	public static void main(String[] args) {
		Integer integer1 = new Integer(10); // Boxing
		System.out.println(integer1);
		Integer integer2 = 15; // AutoBoxing
		System.out.println(integer2);

		int num = integer1.intValue(); // UnBoxing
		System.out.println(num);
		int num2 = integer2; // AutoUnboxing
		System.out.println(num2);

	}
}
