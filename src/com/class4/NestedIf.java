package com.class4;

public class NestedIf {
//   Write a  program to check   work eligibility
//   if user is younger then <16 --> not allowed to work
//   otherwise --> allow to work. 
//   If user is younger  then 64-->  go   to  work 
//   other wise --> enjoy your  life
public static void main(String[] args) {
	
	int age=65;
	int min=16;
	
	
 if (age<min) {
	 System.out.println("Not allowed to work"); 
 }else {
	 System.out.println("You are allowed to work");
	 if (age<64) {
		System.out.println("Go work"); 
	 }else {
		 System.out.println("Enjoy your life and code for fun");
	 }
 }
	 
	
	
}

}
