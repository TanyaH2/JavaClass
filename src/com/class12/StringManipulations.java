package com.class12;

public class StringManipulations {
public static void main(String[] args) {
	
	//                 STRINGS
	
	//// .length()) Function/ Method - returns number of characters
	String str="Syntax";
	
	int lengthOfString=str.length();
	System.out.println(lengthOfString);
	
	
	String str11="Syntax Technologies";
	int len=str11.length();
	System.out.println(len);
	
	String str12="Welcome, Students!";
	System.out.println(str12.length());
	
	String  str13="Hello";
	
	
	////String Case converter to Upper or to Lower
	
	// .toUpperCase() -->convert all characters to UpperCase()
	String  newString= str13.toUpperCase();
	System.out.println(newString);
	// .toLowerCase() -->convert all characters to LowerCase()
	String newString1=str13.toLowerCase();
	System.out.println(newString1);
	
	
	//// equals Compare two strings--> if strings are equal-true, if strings  are NOT equal-->false
	// .equals()  -->case sensitive
	String str14="Hello";
	String str15="hello";
	
	boolean equality=str14.equals(str15);
	System.out.println(equality);
	
	// .equalsIgnoreCase() -->ignoring the case
	String expect="Chrome";
	String actual="chrome";
	
	boolean equal= expect.equalsIgnoreCase(actual);
	System.out.println(equal);
	
	
	
	
	
	
	
	
	
}
}
