package com.class06;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		/*
		Write the program that prints out if it is good weather to go for any activity or not.
		If the weather is between 40 degrees and 80 degrees inclusive and no rain----> we will go for hiking 
		otherwise ---> we will not go hiking
		If temperature is between 25 and 40 inclusive & snowing ---> going snowboarding otherwise
		we are not going snow boarding
		if it temperature is more then 80 & sunny---> go to the beach
		otherwise ----> not going to the beach
		*/
		
		Scanner scan;
		boolean snow, raining, sunny;
		int temp;
		String activity;
		
		scan= new Scanner(System.in);
		System.out.println("What is the temperature outside?");
		temp=scan.nextInt();
		

		
//	    if(temp>40 &&temp<=80) {
//	    	System.out.println("Is it raining");
//			raining=scan.nextBoolean();
//	    	   if (raining) {
//	    	     System.out.println("Stay and watch TV");
//	    	   }else {
//	    		   System.out.println("Go Hiking");
//	    	   }
//	    }else if(temp>=25 && temp<=40) {
//	    	System.out.println("Is it snowing");
//			snow=scan.nextBoolean();
//	    	  if (snow) {
//	    	      System.out.println("We're going snowboarding");
//	    	  }else {
//	    	      System.out.println("Stay and code");
//	    	  } 
//	    } else if (temp>80) {
//	    	System.out.println("Is it sunny");
//			sunny=scan.nextBoolean();
//	    	  if(sunny) {
//	    		  System.out.println("Go get some tan and chase a shark");
//	         }else {
//	    	      System.out.println("Go shopping");
//	    }
//	}else{
//	    	System.out.println("Temp Not valid");
//	    }
		if  (temp>=40 && temp<=80){
			System.out.println("Is it raining");
			raining=scan.nextBoolean();
	        if (raining){
	            activity ="watch movie";            
	        }else {
	            activity ="go hiking";
	        }
	}else if (temp >=25 && temp <40){
		System.out.println("Is it snowing");
		snow=scan.nextBoolean();
	    if (snow) {
	        activity ="snowboarding";
	    }else {
	        activity ="do coding";
	    }
	}else if( temp >80){
		System.out.println("Is it sunny");
		sunny=scan.nextBoolean();
	    if (sunny) {
	        activity="go to the beach";
	    }else {
	        activity="more coding";
	    }
	}else {
		System.out.println("Temp Not valid");
		activity="unknown";
	}
		
	    System.out.println("The activity for to day is "+ activity);
	    //activity=Unknown;
	}
	}
	


