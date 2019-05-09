package com.class26;

public class Shape {
/*
 * Write program: Shape class has a constructor that takes the radius and extend circle class. 
 * Print area of circle while creating and Object of a child class.
 */
	int radius;

	Shape(int radius){
	this.radius=radius;
	
	}
	
	public static void main(String[] args) {
		Circle obj=new Circle(3);
		
	}
}	

class Circle extends Shape{

	Circle(int radius) {
		super(radius);
		System.out.println(3.14*(radius*radius));
	}}

