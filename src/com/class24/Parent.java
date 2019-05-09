package com.class24;

public class Parent {

	public static void love() {
		System.out.println("Parents Love");
	}
	public void work() {
		System.out.println("Parents Work");
	}
}


class Child extends Parent{
	public static void love() {
		System.out.println("Child Love");
	}
	public void cry() {
		System.out.println("Child Cry");
	}
}













