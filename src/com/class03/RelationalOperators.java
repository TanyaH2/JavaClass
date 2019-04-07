package com.class03;

public class RelationalOperators {
	public static void main(String[] args) {
		int a=501;
		int b=501;
		
		boolean result=a>b;
		boolean result1=a==b;
		
		System.out.println(result);
		System.out.println(result1);
		
		//Compare 2 numbers and if a is larger then b--> print
		
	  if (a!=b)	{
		  System.out.println("Hello");  
		  
	  }else {
		  System.out.println("Bye");
	  }
	//Declare price and if price is higher then expected price--> I will NOT buy it
	  
	  double  puppyPrice=1500.99;
	  double  allowedPrice=1000.99;
	  if(puppyPrice<=allowedPrice) {
		  System.out.println("I'm gettting new puppy!");
	  } else {
		  System.out.println("I'm NOT buying it!");
	  }
	  
	  System.out.println("Looking for the right one");
	  
	  
	  
	  
	  
	  
	}
	

}
