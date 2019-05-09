package com.class26;

public class SuperKeyWord {

	String name="John";
	
	public void sayName() {
		System.out.println("Parent name is "+name);
	}
}

class ChildOfSuperKeyword extends SuperKeyWord {
	String sayName="Michael";
	public void sayName() {
		//System.out.println("Parent name is "+super.name);
		System.out.println("Parent name is "+name);
		System.out.println("Child name is "+sayName);
	
}
	
	public void callingMethods() {
		sayName(); //this.sayName
		super.sayName(); 
	}
	
}
