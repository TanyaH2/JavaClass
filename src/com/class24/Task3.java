package com.class24;

/*
 * 3. Create 1 class with a private method that has 3 overloaded forms. 
Then call each overloaded method with specific arguments and observe result
 * 
 */
public class Task3 {
	private void clas1() {
		System.out.println("first  one");
	}

	private void clas1(String a) {
		System.out.println("second "+a);
	}

	private void clas1(int z) {
		System.out.println("third "+z);
	}

	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		
		obj.clas1();
		obj.clas1("Hello");
		obj.clas1(1);
	}
}
