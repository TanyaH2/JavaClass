package com.class25;

public class SyntaxStudent extends Student{
   // CHILD CLASS
	public void study() {
		System.out.println("Syntax Students must study HARD");
	}
	protected void doHomeWork() {
		System.out.println("Syntax Students must do REPL");
	}
	void attendClasses() {
		System.out.println("Syntax Student must attend ALL classes and take notes");
	}
	
	//creating child specific private method doResearch
	private void doResearch() {
		System.out.println("Syntax Students must make uncle Google their best friend");
	}
	
	
	
}
