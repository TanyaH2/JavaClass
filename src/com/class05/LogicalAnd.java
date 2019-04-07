package com.class05;

import java.util.Scanner;

public class LogicalAnd {
public static void main(String[] args) {
	
//	Logical AND &&
//	
//	True AND True = True
//	True AND False = False
//	False AND False = False
//	False AND False = False
	
	
//	Ask user to enter age and based on agre we will print;
//	 If the age is older than 1 but less then 3--> baby
//	 If the age is older than 3 but less then 5--> todler
//	 If the age is older than 5 but less then 13--> kid
//	 If the age is older than 13 but less then 20--> teenager
//	 If the age is older than 20 but less then 64--> adult
//	 If the age is older or equal  to 64--> senior
	
	Scanner  myScanner;
	int age;
	
	myScanner=new Scanner(System.in);
	System.out.println("Please   enter your age");
	age=myScanner.nextInt();
	
	if (age>=1 && age<3) {
		System.out.println("baby");
	}else if (age>=3 && age<3){
		System.out.println("todler");
	}else if (age>=5 && age<13) {
		System.out.println("kid");
	}else if(age>=13 && age<20) {
		System.out.println("teenager");
	}else if(age>=20 && age<64) {
		System.out.println("adult");
	}else {
		System.out.println("You are a senior");
	}
	
}
}
