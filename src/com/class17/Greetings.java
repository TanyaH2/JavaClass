package com.class17;

public class Greetings {
public static void main(String[] args) {
	
	Greetings obj= new Greetings();
	obj.hello();
	
	obj.helloToInstructor("Asel");
	obj.helloToInstructor("Arif");
	obj.helloToInstructor("Weqas");
	
	//how do you find largest number
		obj.findLargest(20,10);//calling method FindLargest and passing values as 20&10
		obj.findLargest(15,37);//calling method FindLargest and passing values as 15&37
}
void hello() {// method signature,  we HAVE to specify the name
	System.out.println("Hello");//method body
}
                      //parameter/s 
void helloToInstructor(String name) {//method with one parameter
	System.out.println("Hello teacher "+name);
}

void findLargest(int a,int b) {  //method with two parameters
//	int a=10;// harcoded
//	int b=20;
	
	if(a>b) {
		System.out.println("A is larger then B");
	}else {
		System.out.println("B is larger then A");
	}
}

}
