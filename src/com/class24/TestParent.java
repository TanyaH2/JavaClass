package com.class24;

public class TestParent {

	public static void main(String[] args) {
		
	
	String a;
	a="10";
	
//	Parent parent=new Parent();
//	parent.love();
//	parent.work();
//	
//	
//	
//	Child child=new Child();
//	child.love();
//	child.work();
//	child.cry();
//	
	
	// Type Casting
	Parent obj=new Child();
	
	obj.love();//Child Love
	obj.work();//Parents Work
	
	//Child obj1-new Parent(); not possible
	
	
	}
	
}
