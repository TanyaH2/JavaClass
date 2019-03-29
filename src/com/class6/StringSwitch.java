package com.class6;

import java.util.Scanner;

public class StringSwitch {
	public static void main(String[] args) {

		/*
		 * Prompt user to enter their country Based on the country ---> specify favorite
		 * food
		 */
		Scanner scan;
		String country;
		String favFood;

		scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();

		switch (country) {
		case "USA":
			favFood = "Burger";
			break;
		case "Afghanistan":
			favFood = "Palau";
			break;
		case "Russia":
			favFood = "Pelmeni";
			break;
		case "Italy":
			favFood = "Pasta";
			break;
		case "Turkey":
			favFood = "Backlava";
			break;
		case "Morocco":
			favFood = "Couscous";
			break;
		case "Kazakhstan":
			favFood = "Beshparmak";
			break;
		case "Pakistan":
			favFood = "Biryani";
			break;
		default:
			favFood = "Unknown";

		}
		System.out.println("Your food is "+favFood);
	}
}
