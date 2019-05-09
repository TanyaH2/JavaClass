package com.class23;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("I am a constructore with no parameters");
	}
	
	ConstructorOverloading(String str){
		System.out.println("I am a constructore with 1 String parameter");
	}
	
	ConstructorOverloading(String str, String str2){
		System.out.println("I am a constructore with 2 Strings parameters");
	}
	
	ConstructorOverloading(int str){
		System.out.println("I am a constructore with 1 int parameter");
	}
	
	
}
