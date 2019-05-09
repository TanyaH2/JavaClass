package com.class25;

public class Parent {

	Parent(){
		System.out.println("I am a parent");
	}
}
class Child extends Parent{
          Child(){          //	Parent(){  ----- //CAN NOT override constructor/special method
		System.out.println("I am a parent");
	}
	
}
