package com.class26;

public class A {

	final void method() {
		System.out.println("Final Method of class A");
	}
	
	void method(String a) {
		System.out.println("Final Method of class A overloading");

	}
}
// we can NOT override final method

//class B extends A{
//	void method() {
//		System.out.println("Final Method of class A overriding");
//
//	}
//}
