package com.class15;

public class IQ1Review {
public static void main(String[] args) {
	
     //	1. Write a program to swap 2 numbers without a temporary variable? 
	 //Swap 2 strings without a temporary variable?
	
	int  a=10;
	int  b=20;
	
	a=a+b; //30
	b=a-b; //30-20=10
	a=a-b; //30-10=20

			System.out.println("The value of a="+a+" value of b="+b);
	System.out.println("--------------------------");
	
	String  str1="Hello";
	String  str2="World";
	str1=str1+str2; //HelloWorld-->10
	str2=str1.substring(0,str1.length()-str2.length()); //Hello
	str1= str1.substring(str2.length());
	System.out.println("The value of str1= "+str1+ "  the value of str2= "+str2);
	
	
	  System.out.println("-----------------------");
	  String  str10="Hello";
		String  str20="World";
	str10=str10+str20;
    str20=str10.replaceAll(str20,"");
    str10=str10.replaceAll(str20, "");
    System.out.println("str10= "+str10+" str20= "+str20);
    
    System.out.println("-----------------------");
    String str11 = "Best";
    String str22 = "Group";

    System.out.println("After swap str11 is: " + str11.replace("Best", "Group"));
    System.out.println("After swap str22 is: " + str11.replace("Group", "Best"));
    
    System.out.println("==========================");
    
    

    
}
}
