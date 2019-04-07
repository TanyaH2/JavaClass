package com.class19;

public class Application {
public static void main(String[] args) {
	
	Human person1 = new Human(); //creating an object of Class Human
	
	person1.print();
	
	person1.eyeColor="Pink";
	
	System.out.println(person1.eyeColor);
	System.out.println(person1.height);
	System.out.println(person1.weight);
	System.out.println(person1.gender);
	
	person1.print();
	System.out.println("--------------------");
Human person2 = new Human(); //creating an object of Class Human
	

	//person2.eyeColor="Orange";
	//person2.
	
	System.out.println(person2.eyeColor);
	System.out.println(person2.height);
	System.out.println(person2.weight);
	System.out.println(person2.gender);
	
	person2.print();
	
}
}
