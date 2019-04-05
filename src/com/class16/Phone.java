package com.class16;

public class Phone {
	
	String brand, color;
	int camera;
	boolean keyboard, TouchScreen;
	
	public static void main(String[] args) {
		
/*
 * Create a Class "Phone".
 * Create  3 objects of it: 
 * Iphone 
 * Android
 * Nokia 
 * with specific  attributes and behaviors.
 * Features/atributes:
 * Camera, keyboard, TouchScreen, color, brand
 * 
 * actions/behavior:
 * Call, pictures, messaging
 * 
 */
	
		
		
		Phone ph1= new Phone();
		ph1.brand="Iphone";
		ph1.color="Red";
		ph1.camera=2;
		ph1.keyboard=false;
		ph1.TouchScreen=true;
		
		ph1.call();
		ph1.pics();
		ph1.message();
		
		Phone ph2= new Phone();
		ph2.brand="Andriod";
		ph2.color="Gray";
		ph2.camera=2;
		ph2.keyboard=false;
		ph2.TouchScreen=true;
		ph2.call();
		ph2.pics();
		ph2.message();
		
		Phone ph3= new Phone();
		ph3.brand="Nokia";
		ph3.color="Blue";
		ph3.camera=2;
		ph3.keyboard=true;
		ph3.TouchScreen=false;
		ph3.call();
		ph3.pics();
		ph3.message();
		
	}
	void call() {
	System.out.println("My "+brand+" can accept calls");
	}
	void pics() {
	System.out.println("My "+brand+" can take pics");
	}
	void message() {
	System.out.println("My "+brand+" can send messages");
	}
}
