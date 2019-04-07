package com.class05;

public class NestedIfPractice {
public static void main(String[] args) {
	
//	Check if the user has credit card-->
//	Check what the balance is, if the balalance more then 1000--?
//			pay off
//			else you are good
	
	boolean creditCard=true;
	int balance=100;
	
	if (creditCard){
		System.out.println("Check the balance");
		if(balance>=1000) {
			System.out.println("Pay it off NOW");
			
		}else {
			System.out.println("You are good");
		}
		
	}else {
		System.out.println("Do you want to apply for one");
}
}
}
