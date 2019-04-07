package com.class06;

public class OperatorNot {
public static void main(String[] args) {
	
//	Logical NOT  ! - reverses the statement
	
	boolean a=!true;
	
	System.out.println("The value of Boolean is "+a);
	
	boolean snow=true;
	
//	if it's not snowing I'll come to the class otherwise I'll stay home
	
	if (snow) {
		System.out.println("I will stay home");
	}
	
	int x=10;
	int y=20;
	
	if(!(x>y)) {
		System.out.println("X is larger then Y");
	}
} 

}
