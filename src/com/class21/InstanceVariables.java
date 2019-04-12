package com.class21;

public class InstanceVariables {
	
	protected String name= "John";//  instance   variables can have access modifiers( private, public, default,
	
	public static void main(String[] args) {
		
	 String name="Anna";
	System.out.println(name);
	System.out.println("---Changing value of local variable---");
	 name="Olga";
	System.out.println(name);
	
	
	// Creating 1 object
	InstanceVariables obj= new InstanceVariables();
	System.out.println(obj.name);
	System.out.println("---Changing value of instance variable---");
	obj.name="Jack";
	System.out.println(obj.name);
	
	// Creating  second  object
	InstanceVariables obj1= new InstanceVariables();
	System.out.println(obj1.name);
	
	obj.hello("Michael");
	
}
	public void hello(String name) { //public void hello(String name) {
		System.out.println("Helllllllooooooo "+ name);
	}
	
}
