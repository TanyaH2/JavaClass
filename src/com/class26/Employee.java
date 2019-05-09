package com.class26;

public class Employee {
	String name, lastName;
	
	Employee(){
		System.out.println(" I am a parent class constuctor");
	}
	Employee(String name, String lastName){
		this.name=name;
		this.lastName=lastName;
		//System.out.println();
	}
	
	
}

class Tester extends Employee{
	int salary;
	
//	Tester(){
//		System.out.println("I am a parent class constructor");
//	}
	Tester(String name, String lastName,int salary){
		super(name, lastName);
		
		this.salary=salary;
	}
	public void displayDetails() {
		System.out.println("Employee "+ name + " "+lastName+" has a salary of "+ salary);
	}
	
}
