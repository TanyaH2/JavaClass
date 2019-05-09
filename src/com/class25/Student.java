package com.class25;

public class Student {
    // PARENT CLASS
	public void study() {
		System.out.println("Students must study");
	}
	protected void doHomeWork() {
		System.out.println("Students must do Homework");
	}
	void attendClasses() {
		System.out.println("Student must attend classes");
	}
	
	// private methods cannot be overriden
	private void doResearch() {
		System.out.println("Students must do  research");
	}
	
}
