package com.class22;

public class Child2 extends Parent{
	String hight="Tall";
	
	public static void main(String[] args) {
		Child2 childObject= new Child2();
		System.out.println(childObject.eyeColor);
		System.out.println(childObject.hairColor);
		System.out.println(childObject.nose);
		System.out.println(childObject.hight);
		childObject.superPower();
		
		Parent parentObject=new Parent();
		//parentObject.hairType --> not accessible in Parent Class
		//parentObject.playTennis()--> not accessible in Parent Class
		Child2 child1Object= new Child2();
		//child1Object.hairType--> not accessible in Child1 Class
		
	}
	public void superPower() {
	System.out.println("Master of Java Coding");
	}
}
