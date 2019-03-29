package com.class12;

public class ForEachIn2D {
	public static void main(String[] args) {

		/*
		 * Create grocery list: fruits{} veggies{} dairy{} drinks{}
		 */
        String[] listOf= {"Fruits","Vegetables","Dairy", "Drinks"};
		String[][] list = { { "Apples", "Oranges", "Grapes", "Plum" },
				{ "Cucumbers", "Tomatoes", "Onions", "Potato", "Carots" },
				{ "Milk", "Cheese", "Yougurt", "Coffee Creamer", "Butter" },
				{ "Orange Juice", "Gatorade", "Wine", "Hard Cider" } };

		
		for (String[] cat : list) {
			for (String products : cat) {

				System.out.print(products + "; ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");

		for (int a = 0; a < list.length; a++) {
			System.out.println("======="+listOf[a]+"=======");
			for (int q = 0; q < list[a].length; q++) {
				System.out.print(list[a][q] + "; ");
			}
			System.out.println();
		}
	}
}
