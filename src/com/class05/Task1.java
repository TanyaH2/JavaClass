package com.class05;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	

//	Prompt the user to enter two people's heights in inches. 
//Each person should be classified as one of the following:
//	• short (under 60 feet)
//	• medium(60 to 72 feet)
//	• tall (72 feet and over)
	
	Scanner sc;
	int height1;
	
	
	sc=new Scanner(System.in);
	System.out.println("Please enter your height");
	height1=sc.nextInt();
	

	
	if(height1<60 ){
	  System.out.println("short");
	}else if(height1==60 && height1<72 ){ 
		System.out.println("medium");
	}else if (height1>=72){
		System.out.println("tall");
	}else {
		System.out.println("Please enter valid information ");
	}
	
	
}
}
