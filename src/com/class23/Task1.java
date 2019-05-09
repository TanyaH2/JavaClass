package com.class23;

public class Task1 {

//	public int calc(int w, int h) {
//		System.out.println("area of the rectangular");
//		System.out.println(w*h);		
//	}
	
	// Compiler will show mistake
	
	
	public void calc(int w, int h) {
		System.out.println("area of the rectangular");
		System.out.println(w*h);
		
	}
	public void calc(int s) {
		
		System.out.println("area of the square");
		System.out.println(s*2);
		System.out.println("area of the cube");
		System.out.println((6*s)*(6*s));
	}

	public void calc(double z) {
		System.out.println("area of the cube");
		System.out.println((6*z)*(6*z));
	}
	public void calc(double q, int w, float e) {
		System.out.println("area of the cube");
		System.out.println(q*w*e);
	}
	
}
