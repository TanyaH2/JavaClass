package com.class22;

public class StaticVsNonStatic {

	public String name = "John"; // Instance variable
	public static String lastName = "Snow"; // Static variable

	public static void main(String[] args) {
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.getInfo();
		getInfo1(); // Withing the same Class we can call it by using method/variable name
		System.out.println(lastName);
		System.out.println(obj.name);// instant has to be only through the object, it belong to an object


	}

	// Non Static
	// Non Static- can have access to BOTH Instance and Static variables
	public void getInfo() {
		System.out.println("My name is " + name + " and last name is " + lastName);
		//getInfo1(); we CAN access static methods within non static 
	}

	// Static Method
	// Static Method can have access ONLY to Static variables
	public static void getInfo1() {
		// System.out.println("My name is "+name+" and last name is "+lastName);
		// Will get an ERROR ;
		// "Cannot make a static reference to the non-static field"
		System.out.println("I am static method");
		//getInfo(); we CAN NOT access static methods within  static 
	}

}
