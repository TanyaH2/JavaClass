package com.class9;

public class NestedLoopsDemo {
	
	public static void main(String[] args) {
		
		NestedLoopsDemo demo= new NestedLoopsDemo();
		
		demo.printNumber();
	}
	
	void printNumber() {
		for (int i = 1; i <= 2; i++) {

			for (int y = 0; y <= 3; y++) {

				System.out.println(i + " " + y);// 10;11;12;13 //20;21;22;23

			}
		}
	}
}
