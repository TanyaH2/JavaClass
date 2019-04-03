package com.class14;

public class StringManipulations {
public static void main(String[] args) {
	
	//1. Replace
	//  .replace()- will replace old char/value with new char/value
	
	
	String str="I am good tester!";
	String newStr=str.replace("a", "e");
	System.out.println(newStr);
	//what are we looking for to replace, new  value
	String newStr1=str.replace("good",    "great");
	System.out.println(newStr1);
	
	String newStr2=str.replace("good", "great");
	System.out.println(newStr2);
	
	String newStr3=str.replace("Tester", "programmer");// case sensitive, won't print
	System.out.println(newStr3);
	
	str=str.replace("!", "?");
	System.out.println(str);
	
	str=str.replace("tester", "#1");
	System.out.println(str);
	
	//2. Replace All
	//  .replaceAll()- will replace all that matches specified pattern [regex];
	

	String str1="12Hello -3234 World 465%^%";
	String replaceNoNumb=str1.replaceAll("[0-9]","");
	System.out.println(replaceNoNumb);
	
	String newstr=replaceNoNumb.replaceAll("[^A-Z a-z]","");  // " ^ " -means NOT or EXCEPT
	System.out.println(newstr);
	
	
	String replaceNoChar=replaceNoNumb.replaceAll("[A-Za-z]","");
	System.out.println(replaceNoChar);
	
	String str2="1Hello123";
	System.out.println(str2.replaceAll("[^0-9]",""));
	
	
	
	
	
	
}
}
