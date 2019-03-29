package com.class4;

import java.util.Scanner;

public class CityAndTemperature {

	/*Ask user to enter city and temperature in F
	 *Your program should convert F-->C
	 *Your Program should say "The temperature in the city __ is ___C. 
	 */
	public static void main(String[] args) {
		
		String city;
		int temp;
		
		Scanner aSc= new Scanner(System.in);
		System.out.println("Please enter your city");
		city=aSc.nextLine();
		
		
		
		System.out.println("Please enter temperature in F");
		temp=aSc.nextInt();
		// Formula (F-32)*5/9;
		
		
		
		int conTemp=(temp-32)*5/9;
		
		System.out.println("The temperature in the city "+city+" is "+conTemp+"C.");
		
	
		
				
		
	}
	
}
