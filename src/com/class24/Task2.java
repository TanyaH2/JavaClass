package com.class24;

/*
 * 2. Create 1 class with a static method that has 3 overloaded forms. 
Then call each overloaded method with specific arguments and observe result.
 */
public class Task2 {

	
	static  void clas() {
		System.out.println("first");	
	}
	static  void clas(String a) {
		System.out.println("second");	
	}
	static  void clas(int z) {
		System.out.println("third");	
	}
	public static void main(String[] args) {
//		Task2 obj=new Task2();
//		
//		obj.clas();
//		Task2.clas("Hello");
//		obj.clas(1);
		
		clas();
		clas(2);
		clas("hi");
		
	}
}
