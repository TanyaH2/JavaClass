package com.class14;

public class ReverseString {
public static void main(String[] args) {

	// INTERVIEW QUESTION
	// how do you reverse string without using a reverse function
	//1. 
	// .toCharArray();
	
	
	
	String orig="Today is Java Class";
	String reverse="";
	
	char[] array=orig.toCharArray();
	for(int  i=array.length-1; i>=0; i--) {
		
		reverse=reverse+array[i];
	}
	System.out.println(reverse);
	
 	
	//2. 
	// .charAt()
	String rev="";
	
	for(int  i=orig.length()-1; i>=0; i--) {
		rev=rev+orig.charAt(i);
	}
	System.out.println(rev);
	
	//2.
	// .substring
	String rev1="";
	for(int i=orig.length();i>0;i--) {
	rev1=rev1+orig.substring(i-1,i);
	
	}
	System.out.println(rev1);

	
}
}
