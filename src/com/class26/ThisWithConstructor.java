package com.class26;

public class ThisWithConstructor {

	//this calls curent class constructor---- constructor chaining
	public ThisWithConstructor() {
		System.out.println("I am inside constructor with no parameters");
		System.out.println("I have no Parameters \n");
	}
	
	public ThisWithConstructor(String str) {
		this();
		System.out.println("I am inside constructor with 1 parameter");
		System.out.println("I have one String Parameter "+str+"\n");
	}
	
	public ThisWithConstructor(String str1, String str2) {
		this(str2);
		System.out.println("I am inside constructor with 2 parameters");
		System.out.println("I have two String Parameter "+str1+" "+str2);
	}
	
	
	public static void main(String[] args) {
//		ThisWithConstructor obj= new ThisWithConstructor();
//		ThisWithConstructor obj2= new ThisWithConstructor("HELLO");
		ThisWithConstructor obj3= new ThisWithConstructor(" HELLO","BYE");
		/* 1. I am inside constructor with no parameters
		 * 2. I have no parameters
		 * 3. I am inside constructor with 1 parameter
		 * 4. I have 1 string parameter 
		 * 5. I am inside constructor with 2 parameters
		 * 6. I have 2 string parameters 
		 */
	}
	
}
