package com.class22;

public class Car {

	public static String make="Toyota";
	String color; //declaring the variable
	String model;
	int doors;
	boolean  engine;
	
	Car(){ // Constructor  // can use with any access modifiers BUT not STATIC // With NO parameters
		System.out.println("I am a constructor");
		System.out.println("Hello from constructor");
	}
	
	public static void main(String[] args) {
		Car obj= new Car();
		System.out.println(obj.color);//constructor will initialize object and it will give
		                              //default value to all uninitialized variables 0/null
		                              //String=null; int=0; boolean=false; 
		
		System.out.println(obj.doors);
		System.out.println(obj.engine);
		hello();
		}
	
	
	public static void hello() {
		// before using local veriable we HAVE TO initialize it
		String name;
		//System.out.println(name); - compiler  will give you an error
		
		System.out.println("I am a static hello method");
		
	}
	
}
