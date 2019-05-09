package com.class24;

/*
 * Create a class ‘Degree’ having a method ‘getDegree’ that prints “I got a degree”.
 *  Class ‘Degree’ has two subclasses namely ‘Undergraduate’ and ‘Postgraduate’ 
 *  each having a method with the same name that prints “I am an Undergraduate” and “I am a Postgraduate” respectively. 
 *  Call the method by creating an object of each of the three classes.
 */
public class Degree {
 public boolean  getDegree() {
	 System.out.println("I got a degree");
	return true;
 }
}


 class Undergraduate1 extends Degree{
	 public boolean  getDegree() {
		 System.out.println("I am an Undergraduate");
		 return true;
	 }
}


 class Postgraduate1 extends Degree{
	 public boolean  getDegree() {
		 System.out.println("I am a Postgraduate");
		 return true;
	 }
}




