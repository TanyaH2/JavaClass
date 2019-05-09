package com.class28;

public interface TakesScreenshot {

	String fileExtension=".png"; //CONSTANT- by default this is public static final variable and it MUST to be INITIALIZED
	
	void takesScreenshot();
	
	// from java 8 we can have defined methods in interface and they can either be static or default
	 static void m1() {
		 System.out.println("Static m1 method");
	 }
	
	 static void m2() {
		 System.out.println("Static m2 method");
	 }
	 
}
