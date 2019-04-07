package com.class06;

import java.util.Scanner;

//Ask user to enter their country and capture it. 
//Once values are captured print which language user speaks.

public class Task1 {
	public static void main(String[] args) {

		Scanner sc;
		String country;
		String lan;
		sc=new Scanner(System.in);
				
		System.out.println("Where are you from?");
		country=sc.nextLine();

		switch (country) {
		case "USA":
			lan = "English";
			break;
		case "Ukraine":
			lan ="Ukrainian";
			break;
		case "Mexico":
			lan="Spanish";
			break;
		case "Russia":
			lan="Russian";
			break;
		default:
			lan="Unlnown";
	
		}
System.out.println("Your language is "+ lan);
	}
}
