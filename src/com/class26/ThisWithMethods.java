package com.class26;

public class ThisWithMethods {

	public void m1() {
		System.out.println("I am a m1 method");
	}
	public void m2() {
		m1();  // by default compiler adds ---this. keyword
		System.out.println("I am a m2 method");
	}
	public static void main(String[] args) {
		ThisWithMethods obj=new ThisWithMethods();
				obj.m2();
	}
}
