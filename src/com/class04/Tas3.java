package com.class04;

import java.util.Scanner;

public class Tas3 {
public static void main(String[] args) {
	
	//You are DMV representative and you need to ask customer their age. 
	//If they are 18 and older you will issue a driver license to them, 
	//otherwise  you will offer them to get a learning permit
	
	int age;
	Scanner scan= new Scanner(System.in);
	System.out.println("How old are you?");
	
	age=scan.nextInt();
	
	
//	 
//	if (age>=18) {
//		System.out.println("Your Driver License application  is approved! Congratulations!");
//	} else if (age>=16){
//		System.out.println("You only can get learning permit, come back when you are 18");
//	}else {
//		System.out.println("Too young for any of those");
//	}
//	
	
	
	if (age>=18) {
		System.out.println("Congratulation on your DL");
	}else {
		if(age>16) {
		System.out.println("Congratulation on your LP");
	}else {
		System.out.println("Come bake in a few years");
	}
	}
}
}
