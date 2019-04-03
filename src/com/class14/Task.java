package com.class14;

public class Task {
public static void main(String[] args) {
	
	
	
	//1. Create a String that will hold a sentence. Write a program to get a new String without any spaces.

	String str="Create a String? that will hold a sentence.";
	String newstr=str.replaceAll("[ ]", "");
	System.out.println(newstr);
	
	
    //2. Create a String that should be combination of letters, numbers and special characters. 
    //Find out how many alpha characters are there in the String.
	String str1="35%&^*Create 643a %%$#( String3246$#%";
	String newstr1=str1.replaceAll("[A-Za-z]", "");
	System.out.println(newstr1.length());

    //3.  You have a String a=“Is it saturday! Is it raining! Do we have a Java Class today?” 
    //How would you find out how many sentences are in that String?

	String a="Is it saturday? Is it raining? Do we have a Java Class today?";
	
	String[] array= a.split("[?]");      //Use ("\\?") or ("[?]")
	System.out.println(array.length);
	

	
	
}
}
